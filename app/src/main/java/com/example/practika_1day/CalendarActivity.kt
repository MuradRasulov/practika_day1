package com.example.practika_1day

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.remember
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.practika_1day.ui.theme.Green
import com.example.practika_1day.ui.theme.Light_Green
import com.example.practika_1day.ui.theme.Practika_1dayTheme
import com.example.practika_1day.ui.theme.Red
import java.time.LocalDate
import java.util.Calendar
import kotlin.time.Duration.Companion.seconds

class CalendarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            Column(modifier = Modifier
                .background(Green)
                .fillMaxSize())
            {
                Text(text = "Календарь", fontSize = 25.sp, color = Color.White, fontWeight = FontWeight(800), modifier = Modifier.padding(30.dp))
                Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "arrow", modifier = Modifier
                    .size(50.dp)
                    .offset(x = 350.dp, y = -70.dp)
                    .clickable(onClick = {
                        context.startActivity(
                            Intent(context, ProfileActivity::class.java)
                        )
                    }))
            }
            Row {
                BottomPanel3("")
            }
            Row {
                Calendarix()
            }
        }
    }
}

@Composable
fun Calendarix(){
    AndroidView({ CalendarView(it)},
        modifier = Modifier
            .wrapContentWidth()
            .offset(x = 25.dp, y = 100.dp),
        update = {
                views ->
            views.setOnDateChangeListener{calendarView, year, month, dayOfMonth ->

            }
        })
}
@Composable
fun BottomPanel3(name: String) {
    val context = LocalContext.current
    Column(modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
        .offset(y = 590.dp)) {
        Box(modifier = Modifier
            .size(320.dp, 70.dp)
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
                            .size(30.dp)
                            .clickable(onClick =
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
                            .wrapContentSize(Alignment.Center).offset(x = -5.dp, y = 0.dp),
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
                            })
                    )
                    Text(
                        text = "Alarm",
                        color = Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center).offset(x = -5.dp),
                        fontSize = 10.sp
                    )
                }
                Column (modifier = Modifier.padding(start = 32.dp, top = 8.dp)) {
                    Image(
                        painter = painterResource(R.drawable.green_calendar),
                        contentDescription = "List",
                        modifier = Modifier
                            .size(30.dp)
                    )
                    Text(
                        text = "Calendar",
                        color = Green,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center).offset(x = -5.dp),
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
                            })
                    )
                    Text(
                        text = "Settings",
                        color = Red,
                        modifier = Modifier
                            .width(40.dp)
                            .wrapContentSize(Alignment.Center).offset(x = -5.dp),
                        fontSize = 10.sp
                    )
                }
            }
        }
    }
}
@Composable
fun Greeting3(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
}