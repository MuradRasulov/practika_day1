package com.example.practika_1day

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.practika_1day.ui.theme.*

class CreateAlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Green)
                    .fillMaxSize())
            {
                Text(
                    text = "Добавить будильник",
                    fontSize = 25.sp,
                    color = Color.White,
                    fontWeight = FontWeight(800),
                    modifier = Modifier.padding(30.dp)
                )
                Row(modifier = Modifier.offset(x = 200.dp, y = -90.dp)) {
                    IconView2()
                }
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
            }
        }
    }
}

@Composable
fun IconView2(){
    val context = LocalContext.current
    Image(
        painter = painterResource(id = R.drawable.back_button),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .offset(x = 150.dp, y = 15.dp)
            .size(50.dp)
            .clickable(onClick = {
                val intent = Intent(context, AlarmActivity::class.java)
                startActivity(context, intent, null)
            })
    )
}

@Composable
fun ButtonAdd6(name: String) {
    val context = LocalContext.current
    Column (modifier = Modifier
        .fillMaxWidth()
        .wrapContentSize(Alignment.Center)
    ) {
        Button(onClick = {context.startActivity(Intent(context, AlarmActivity::class.java))},
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
fun Timeline(){
    val textState = remember { mutableStateOf(TextFieldValue()) }
    Row() {
        TextField(
            value = textState.value,
            onValueChange = {
                textState.value = it
            }, placeholder = { Text(text = "16:30",
                Modifier
                    .padding(start = 0.dp)
                    .offset(y = -3.dp))}, modifier = Modifier
                .offset(x = 30.dp, y = -30.dp)
                .clip((RoundedCornerShape(7)))
                .size(170.dp, 50.dp), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent), leadingIcon = { Icon(
                painter = painterResource(id = R.drawable.small_gray_alarm),
                contentDescription = "", modifier = Modifier.size(20.dp)
            )}
        )
        TextField(
            value = textState.value,
            onValueChange = {
                textState.value = it
            }, placeholder = { Text(text = "14.01.2021",
                Modifier
                    .padding(start = 0.dp)
                    .offset(y = -3.dp))},modifier = Modifier
                .offset(x = 50.dp, y = -30.dp)
                .clip((RoundedCornerShape(7)))
                .size(160.dp, 50.dp), colors = TextFieldDefaults.textFieldColors(backgroundColor = White, cursorColor = Color.Black, unfocusedIndicatorColor = Color.Transparent, focusedIndicatorColor = Color.Transparent), leadingIcon = { Icon(
                painter = painterResource(id = R.drawable.small_gray_calendar),
                contentDescription = "", modifier = Modifier.size(20.dp)
            )}
        )
    }
}

@Composable
fun CheckView(){
    Column(modifier = Modifier.offset(x = 30.dp, y = 0.dp)) {
        Row (){
            val isChecked = remember { mutableStateOf(false) }
            Checkbox(checked = isChecked.value, onCheckedChange = { isChecked.value = it },enabled = true, modifier = Modifier
                .border(3.dp, Yellow, RoundedCornerShape(0.dp))
                .background(White, RoundedCornerShape(0.dp))
                .size(21.dp, 21.dp))
            Text(text = "Понедельник", color = White,modifier = Modifier.offset(x = 10.dp))
        }
        Row (modifier = Modifier.offset(y = 10.dp)){
            val isChecked2 = remember { mutableStateOf(false) }
            Checkbox(checked = isChecked2.value, onCheckedChange = { isChecked2.value = it }, enabled = true
                , modifier = Modifier
                    .border(3.dp, Yellow, RoundedCornerShape(0.dp))
                    .background(White, RoundedCornerShape(0.dp))
                    .size(21.dp, 21.dp))
            Text(text = "Вторник", color = White,modifier = Modifier.offset(x = 10.dp))
        }
        Row(modifier = Modifier.offset(y = 20.dp)) {
            val isChecked3 = remember { mutableStateOf(false) }
            Checkbox(checked = isChecked3.value, onCheckedChange = { isChecked3.value = it }, enabled = true,modifier = Modifier
                .border(3.dp, Yellow, RoundedCornerShape(0.dp))
                .background(White, RoundedCornerShape(0.dp))
                .size(21.dp, 21.dp))
            Text(text = "Среда",  color = White,modifier = Modifier.offset(x = 10.dp))
        }
        Row (modifier = Modifier.offset(y = 30.dp)){
            val isChecked4 = remember { mutableStateOf(false) }
            Checkbox(checked = isChecked4.value, onCheckedChange = { isChecked4.value = it }, enabled = true,modifier = Modifier
                .border(3.dp, Yellow, RoundedCornerShape(0.dp))
                .background(White, RoundedCornerShape(0.dp))
                .size(21.dp, 21.dp))
            Text(text = "Четверг",  color = White,modifier = Modifier.offset(x = 10.dp))
        }
        Row (modifier = Modifier.offset(y = 40.dp)){
            val isChecked5 = remember { mutableStateOf(false) }
            Checkbox(checked = isChecked5.value, onCheckedChange = { isChecked5.value = it }, enabled = true,modifier = Modifier
                .border(3.dp, Yellow, RoundedCornerShape(0.dp))
                .background(White, RoundedCornerShape(0.dp))
                .size(21.dp, 21.dp))
            Text(text = "Пятница",  color = White,modifier = Modifier.offset(x = 10.dp))
        }
        Row(modifier = Modifier.offset(y = 50.dp)) {
            val isChecked6 = remember { mutableStateOf(false) }
            Checkbox(checked = isChecked6.value, onCheckedChange = { isChecked6.value = it }, enabled = true,modifier = Modifier
                .border(3.dp, Yellow, RoundedCornerShape(0.dp))
                .background(White, RoundedCornerShape(0.dp))
                .size(21.dp, 21.dp))
            Text(text = "Суббота",  color = White,modifier = Modifier.offset(x = 10.dp))
        }
        Row(modifier = Modifier.offset(y = 60.dp)) {
            val isChecked7 = remember { mutableStateOf(false) }
            Checkbox(checked = isChecked7.value, onCheckedChange = { isChecked7.value = it }, enabled = true,modifier = Modifier
                .border(3.dp, Yellow, RoundedCornerShape(0.dp))
                .background(White, RoundedCornerShape(0.dp))
                .size(21.dp, 21.dp))
            Text(text = "Воскресенье", color = White, modifier = Modifier.offset(x = 10.dp))
        }
    }
}

@Composable
fun Greeting10(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview10() {
    Practika_1dayTheme {
        Greeting10("Android")
    }
}