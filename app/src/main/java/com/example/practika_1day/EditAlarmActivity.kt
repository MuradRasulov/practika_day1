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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.practika_1day.ui.theme.*

class EditAlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            Column(
                modifier = Modifier
                    .background(Green)
                    .fillMaxSize())
            {
                Text(
                    text = "Изменить будильник",
                    fontSize = 25.sp,
                    color = Color.White,
                    fontWeight = FontWeight(800),
                    modifier = Modifier.padding(30.dp)
                )
                Image(painter = painterResource(id = R.drawable.back_button),
                    contentDescription = "arrow",
                    modifier = Modifier
                        .size(50.dp)
                        .offset(x = 350.dp, y = -70.dp)
                        .clickable(onClick = {
                            context.startActivity(
                                Intent(context, AlarmActivity::class.java)
                            )
                        })
                )
                Row() {
                    Timeline()
                }
                Row() {
                    Text(text = "Повторять каждый", color = White, modifier = Modifier.offset(x =30.dp, y = -20.dp), fontSize = 18.sp, fontWeight = FontWeight(300))
                }
                Row() {
                    CheckView()
                }
                Row(modifier = Modifier.offset(y=230.dp)) {
                    ButtonAdd6("Создать будильник")
                }
                Row(modifier = Modifier.offset(y=115.dp)) {
                    ButtonDeleteAlarm("Удалить будильник")
                }
            }
        }
    }
}

@Composable
fun ButtonDeleteAlarm(name: String) {
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
    ) {
        Button(onClick = {context.startActivity(Intent(context, AlarmActivity::class.java))},
            colors = ButtonDefaults.buttonColors(backgroundColor = Red),
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
fun Greeting11(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview11() {
    Practika_1dayTheme {
        Greeting11("Android")
    }
}