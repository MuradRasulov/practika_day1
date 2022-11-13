package com.example.practika_1day

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.practika_1day.ui.theme.Green
import com.example.practika_1day.ui.theme.Light_Green
import com.example.practika_1day.ui.theme.Practika_1dayTheme
import com.example.practika_1day.ui.theme.Red

class SettingsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .background(Green)
                .fillMaxSize())
            {
                val context = LocalContext.current
                Text(text = "Настройки", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight(800), modifier = Modifier.padding(30.dp))
                Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "arrow", modifier = Modifier
                    .size(50.dp)
                    .offset(x = 350.dp, y = -70.dp)
                    .clickable(onClick = {
                        context.startActivity(
                            Intent(context, ProfileActivity::class.java)
                        )
                    }))
                Text(text = "Профиль пользователя", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight(400), modifier = Modifier
                    .padding(20.dp)
                    .offset(y = -40.dp).clickable (onClick = {context.startActivity(Intent(context, ProfileActivity::class.java))}))
                IconButton(onClick = {context.startActivity(Intent(context, ProfileActivity::class.java))}, modifier = Modifier.size(20.dp), enabled = true, interactionSource = remember { MutableInteractionSource() }, content = ({Image (painter = painterResource(
                    id = R.drawable.small_arrow
                ), modifier = Modifier
                    .size(40.dp)
                    .offset(x = 350.dp, y = -84.dp), contentDescription = "Image")}))
                Text(text = "Дата и время", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight(400), modifier = Modifier
                    .padding(20.dp)
                    .offset(y = -70.dp))
                IconButton(onClick = {}, modifier = Modifier.size(20.dp), enabled = true, interactionSource = remember { MutableInteractionSource() }, content = ({Image (painter = painterResource(
                    id = R.drawable.small_arrow
                ), modifier = Modifier
                    .size(40.dp)
                    .offset(x = 350.dp, y = -115.dp), contentDescription = "Image")}))
                Text(text = "Настройки звука", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight(400), modifier = Modifier
                    .padding(20.dp)
                    .offset(y = -105.dp))
                IconButton(onClick = {}, modifier = Modifier.size(20.dp), enabled = true, interactionSource = remember { MutableInteractionSource() }, content = ({Image (painter = painterResource(
                    id = R.drawable.small_arrow
                ), modifier = Modifier
                    .size(40.dp)
                    .offset(x = 350.dp, y = -148.dp), contentDescription = "Image")}))
                Text(text = "Проверить обновления", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight(400), modifier = Modifier
                    .padding(20.dp)
                    .offset(y = -140.dp))
                IconButton(onClick = {}, modifier = Modifier.size(20.dp), enabled = true, interactionSource = remember { MutableInteractionSource() }, content = ({Image (painter = painterResource(
                    id = R.drawable.small_arrow
                ), modifier = Modifier
                    .size(40.dp)
                    .offset(x = 350.dp, y = -185.dp), contentDescription = "Image")}))
                Spacer(modifier = Modifier.height(60.dp))
                Row {
                    BottomPanel4("")
                }
            }
        }
    }
}

@Composable
fun BottomPanel4(name: String) {
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
        .offset(y = 15.dp)) {
        Box(modifier = Modifier
            .size(320.dp, 80.dp)
            .shadow(
                20.dp,
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp,
                )
            )
            .clip(
                RoundedCornerShape(
                    topStart = 30.dp,
                    topEnd = 30.dp,
                    bottomEnd = 0.dp,
                    bottomStart = 0.dp,
                )
            )
            .background(Light_Green),
        ){
            Row(modifier = Modifier.padding(all = 8.dp)) {
                Column (modifier = Modifier.padding(start = 24.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.red_list),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(30.dp).offset(y = -5.dp).clickable(onClick =
                            {
                                val intent = Intent(context, MainActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
                            })
                    )
                    Text(
                        text = "List",
                        color = Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center).offset(x = -5.dp, y = -5.dp),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.red_alarm),
                        contentDescription = "Alarm",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, AlarmActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
                            }).offset(y = -5.dp)
                    )
                    Text(
                        text = "Alarm",
                        color = Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center).offset(x = -5.dp, y = -5.dp),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.red_calendar),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, CalendarActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
                            }).offset(y = -5.dp)
                    )
                    Text(
                        text = "Calendar",
                        color = Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center).offset(y = -5.dp, x = -5.dp),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.green_settings),
                        contentDescription = "Settings",
                        modifier = Modifier
                            .size(30.dp)
                            .clickable(onClick =
                            {
                                val intent = Intent(context, SettingsActivity::class.java)
                                ContextCompat.startActivity(context, intent, null)
                            }).offset(y = -5.dp)
                    )
                    Text(
                        text = "Settings",
                        color = Green,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center).offset(y = -5.dp, x = -5.dp),
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting4(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    Practika_1dayTheme {
        Greeting4("Android")
    }
}