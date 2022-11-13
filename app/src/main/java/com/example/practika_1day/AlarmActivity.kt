package com.example.practika_1day

import android.content.Intent
import android.os.Bundle
import android.widget.Switch
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.practika_1day.ui.theme.Green
import com.example.practika_1day.ui.theme.Light_Green
import com.example.practika_1day.ui.theme.Practika_1dayTheme
import com.example.practika_1day.ui.theme.Red

class AlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            Column(
                modifier = Modifier
                    .background(Green)
                    .fillMaxSize()
            ){
                Text(text = "Будильник", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight(800), modifier = Modifier.padding(30.dp))
                Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "arrow", modifier = Modifier
                    .size(50.dp)
                    .offset(x = 350.dp, y = -70.dp)
                    .clickable(onClick = {
                        context.startActivity(
                            Intent(context, ProfileActivity::class.java)
                        )
                    }))
                Text(text = "07:30", fontSize = 48.sp, color = Color.White, fontWeight = FontWeight(350), modifier = Modifier
                    .padding(30.dp)
                    .offset(y = -60.dp).clickable(onClick = {context.startActivity(Intent(context, EditAlarmActivity::class.java))}))
                Text(text = "08:00", fontSize = 48.sp, color = Color.White, fontWeight = FontWeight(350), modifier = Modifier
                    .padding(30.dp)
                    .offset(y = -111.dp))
                ButtonAddAlarm(name = "Добавить будильник", color = Light_Green, textSize = 18, paddingTop = 116)
                Row {
                    BottomPanel2("")
                }
                SwitchDemo()
                SwitchDemo2()
            }
        }
    }
}
@Composable
fun SwitchDemo() {
    val checkedState = remember { mutableStateOf(false) }
    Switch(checked = checkedState.value, onCheckedChange = {checkedState.value = it}, colors = SwitchDefaults.colors(checkedThumbColor = Color(0xFFFFFFFF), checkedTrackColor = Color(0xFFAAF683), uncheckedThumbColor = Color(0xFFFFFFFFF), uncheckedTrackColor = Color(0xFFFF9885)), modifier = Modifier.offset(x=170.dp, y = -510.dp).size(90.dp, 45.dp).offset(x=125.dp, y = 5.dp).background(
        color = (if (checkedState.value){
        Color(0xFFAAF683)
    }else{
        Color(0xFFFF9885)
    }), shape = RoundedCornerShape(25.dp)))
}
@Composable
fun SwitchDemo2() {
    val checkedState = remember { mutableStateOf(false) }
    Switch(checked = checkedState.value, onCheckedChange = {checkedState.value = it}, colors = SwitchDefaults.colors(checkedThumbColor = Color(0xFFFFFFFF), checkedTrackColor = Color(0xFFAAF683), uncheckedThumbColor = Color(0xFFFFFFFFF), uncheckedTrackColor = Color(0xFFFF9885)), modifier = Modifier.offset(x=170.dp, y = -444.dp).size(90.dp, 45.dp).offset(x=125.dp, y = 5.dp).background(
        color = (if (checkedState.value){
            Color(0xFFAAF683)
        }else{
            Color(0xFFFF9885)
        }), shape = RoundedCornerShape(25.dp)))
}

@Composable
fun ButtonAddAlarm(name: String, color: Color, textSize: Int, paddingTop: Int){
    val context = LocalContext.current
    Row(modifier = Modifier
        .padding(bottom = 0.dp, top = paddingTop.dp, start = 28.dp, end = 28.dp)
        .size(428.dp, 78.dp)){
        Button(onClick = {context.startActivity(Intent(context, CreateAlarmActivity::class.java))}, colors = ButtonDefaults.buttonColors(color), modifier = Modifier
            .fillMaxWidth()
            .size(438.dp, 48.dp)
            .clip(
                RoundedCornerShape(5.dp)
            ))
        {
            Text(text = name, style = TextStyle(color = Color.White, fontSize = textSize.sp))
        }
    }
}

@Composable
fun BottomPanel2(name: String) {
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
        .offset(y = 10.dp)) {
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
                        painter = painterResource(R.drawable.green_alarm),
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
                        color = Green,
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
fun Greeting2(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Practika_1dayTheme {
        Greeting2("Android")
    }
}