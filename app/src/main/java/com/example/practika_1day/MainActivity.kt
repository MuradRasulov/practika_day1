package com.example.practika_1day

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.practika_1day.ui.theme.*
import androidx.core.content.ContextCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            Column(
                modifier = Modifier
                    .background(Green)
                    .fillMaxSize()
            )
            {
                Text(text = "Список дел", fontSize = 25.sp, color = White, fontWeight = FontWeight(800), modifier = Modifier.padding(30.dp))
                Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "arrow", modifier = Modifier
                    .size(50.dp)
                    .offset(x = 350.dp, y = -70.dp)
                    .clickable(onClick = {
                        context.startActivity(
                            Intent(context, ProfileActivity::class.java)
                        )
                    }))
                RoundedCornerShapeDemo()
                ButtonView(name = "Добавить задачу", color = Light_Green, textSize = 18, paddingTop = 0)
                Row {
                    BottomPanel("")
                }
            }
        }
    }
}
@Composable
fun RoundedCornerShapeDemo(){
    ExampleBox(shape = RoundedCornerShape(20.dp))
    Spacer(modifier = Modifier.height(20.dp))
    ExampleBox2(shape = RoundedCornerShape(20.dp))
    Spacer(modifier = Modifier.height(20.dp))
    ExampleBox3(shape = RoundedCornerShape(20.dp))
    Spacer(modifier = Modifier.height(20.dp))
}
@Composable
fun ExampleBox(shape: Shape){
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.TopCenter)
        .shadow(
            10.dp, RoundedCornerShape(
                topStart = 30.dp,
                topEnd = 0.dp,
                bottomEnd = 30.dp,
                bottomStart = 0.dp
            )
        )) {
        Box(
            modifier = Modifier
                .size(379.dp, 100.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp,
                    )
                )
                .background(Yellow)
                .clickable(onClick = {
                    context.startActivity(
                        Intent(
                            context,
                            EditTaskActivity::class.java
                        )
                    )
                })){
            Row(modifier = Modifier.padding(12.dp)) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(text = "Вечерний поход в кино", fontSize = 20.sp, color = White, fontWeight = FontWeight(400))
                    Text(text = "Идем в кино с коллегами", fontSize = 16.sp, color = Gray, fontWeight = FontWeight(300))
                }
                Column(modifier = Modifier.padding(18.dp)) {
                    Text(text = "10.02.2021", fontSize = 12.sp, color = Gray, modifier = Modifier.offset(x = 30.dp))
                    Text(text = "19:40", fontSize = 12.sp, color = Gray, modifier = Modifier.offset(x = 30.dp))
                }
            }
        }
    }
}
@Composable
fun ExampleBox2(shape: Shape){
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
        .shadow(
            10.dp, RoundedCornerShape(
                topStart = 30.dp,
                topEnd = 0.dp,
                bottomEnd = 30.dp,
                bottomStart = 0.dp
            )
        )) {
        Box(
            modifier = Modifier
                .size(379.dp, 100.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp,
                    )
                )
                .background(Yellow)
                .clickable(onClick = {
                    context.startActivity(
                        Intent(
                            context,
                            EditTaskActivity::class.java
                        )
                    )
                })){
            Row(modifier = Modifier.padding(12.dp)) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(text = "Забрать заказ Ozon", fontSize = 20.sp, color = White, fontWeight = FontWeight(400))
                    Text(text = "Пункт выдачи на ул. Ленин, 103", fontSize = 16.sp, color = Gray, fontWeight = FontWeight(300))
                }
                Column(modifier = Modifier.padding(1.dp)) {
                    Text(text = "10.02.2021", fontSize = 12.sp, color = Gray, modifier = Modifier.offset(x = 30.dp, y = 15.dp))
                    Text(text = "19:40", fontSize = 12.sp, color = Gray, modifier = Modifier.offset(x = 30.dp, y = 15.dp))
                }
            }
        }
    }
}
@Composable
fun ExampleBox3(shape: Shape){
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
        .shadow(
            10.dp, RoundedCornerShape(
                topStart = 30.dp,
                topEnd = 0.dp,
                bottomEnd = 30.dp,
                bottomStart = 0.dp
            )
        )) {
        Box(
            modifier = Modifier
                .size(379.dp, 112.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 30.dp,
                        topEnd = 0.dp,
                        bottomEnd = 30.dp,
                        bottomStart = 0.dp,
                    )
                )
                .background(Yellow)
                .clickable(onClick = {
                    context.startActivity(
                        Intent(
                            context,
                            EditTaskActivity::class.java
                        )
                    )
                })){
            Row(modifier = Modifier.padding(12.dp)) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(text = "Запись в автосервис", fontSize = 20.sp, color = White, fontWeight = FontWeight(400))
                    Text(text = "Сдать автомобиль в автосервис на ул.\nБисертская, д. 14. Замена масла", fontSize = 15.sp, color = Gray, fontWeight = FontWeight(300), modifier = Modifier
                        .padding(1.dp)
                        .offset(y = 10.dp))
                }
                Column(modifier = Modifier.padding(1.dp)) {
                    Text(text = "10.02.2021", fontSize = 12.sp, color = Gray, modifier = Modifier.offset(x = -10.dp, y = 15.dp))
                    Text(text = "19:40", fontSize = 12.sp, color = Gray, modifier = Modifier.offset(x = -10.dp, y = 15.dp))
                }
            }
        }
    }
}
@Composable
fun BottomPanel(name: String) {
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
        .offset(y = 0.dp)) {
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
                        painter = painterResource(R.drawable.green_list),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(30.dp).offset(y = -5.dp)
                    )
                    Text(
                        text = "List",
                        color = Green,
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
                        painter = painterResource(R.drawable.red_settings),
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
                        color = Red,
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
fun ButtonView(name: String, color: Color, textSize: Int, paddingTop: Int){
    val context = LocalContext.current
    Row(modifier = Modifier
        .padding(bottom = 0.dp, top = paddingTop.dp, start = 28.dp, end = 28.dp)
        .size(428.dp, 78.dp)){
        Button(onClick = {context.startActivity(Intent(context, AddTaskActivity::class.java))}, colors = ButtonDefaults.buttonColors(color), modifier = Modifier
            .fillMaxWidth()
            .size(438.dp, 48.dp)
            .clip(
                RoundedCornerShape(5.dp)
            ))
        {
            Text(text = name, style = TextStyle(color = White, fontSize = textSize.sp))
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column {
        Text(text = "Hello $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Practika_1dayTheme {
        Greeting("Android")
    }
}