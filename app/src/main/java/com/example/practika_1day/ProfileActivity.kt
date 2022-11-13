package com.example.practika_1day

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.practika_1day.ui.theme.Green
import com.example.practika_1day.ui.theme.Light_Green
import com.example.practika_1day.ui.theme.Practika_1dayTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .background(Green)
                .fillMaxSize())
            {
                val context = LocalContext.current
                Text(text = "Профиль пользователя", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight(800), modifier = Modifier.padding(30.dp))
                Image(painter = painterResource(id = R.drawable.back_button), contentDescription = "avatar", modifier = Modifier
                    .size(50.dp)
                    .offset(x = 350.dp, y = -70.dp)
                    .clickable(onClick = {
                        context.startActivity(
                            Intent(context, SettingsActivity::class.java)
                        )
                    }))
                Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "avatar", modifier = Modifier
                    .size(280.dp)
                    .offset(x = 65.dp, y = 20.dp))
                Text(text = "Вход не выполнен", fontSize = 20.sp, color = Color.White, fontWeight = FontWeight(300), modifier = Modifier
                    .padding(50.dp)
                    .offset(x = 70.dp, y = -20.dp))
                Row (modifier = Modifier.offset(x = 0.dp, y = -20.dp)){
                    ButtonSignin("Войти")
                }
                Row (modifier = Modifier.offset(x = 0.dp, y = -10.dp)){
                    ButtonSignup("Регистрация")
                }
            }
        }
    }
}

@Composable
fun ButtonSignin(name: String) {
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
    ) {
        Button(onClick = {val intent = Intent(context,Sign_inActivity::class.java)
            startActivity(context,intent, null)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Light_Green),
            modifier = Modifier
                .size(340.dp, 50.dp)
                .clip(RoundedCornerShape(20))
        ) {
            Text(
                text = name,
                color = MaterialTheme.colors.background,
                fontSize = 18.sp, fontWeight = FontWeight(400)
            )
        }
    }
}

@Composable
fun ButtonSignup(name: String) {
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
    ) {
        Button(onClick = {val intent = Intent(context,Sign_upActivity::class.java)
            startActivity(context,intent, null)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Light_Green),
            modifier = Modifier
                .size(340.dp, 50.dp)
                .clip(RoundedCornerShape(20))
        ) {
            Text(
                text = name,
                color = MaterialTheme.colors.background,
                fontSize = 18.sp, fontWeight = FontWeight(400)
            )
        }
    }
}

@Composable
fun Greeting5(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    Practika_1dayTheme {
        Greeting5("Android")
    }
}