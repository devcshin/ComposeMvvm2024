package com.m2comm.composeexercisedevc.ui.ex1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.m2comm.composeexercisedevc.ui.theme.ComposeExerciseDevcTheme
import com.m2comm.composeexercisedevc.ui.theme.MyTheme
import com.m2comm.composeexercisedevc.ui.theme.Purple40

//extends 'ComponentActivity//
class MainActivity : ComponentActivity() {
    @SuppressLint("UnrememberedMutableState")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Compose용 setContentView
        setContent {

            Box(modifier = Modifier
                .width(200.dp)
                .height(100.dp)
                .clip(RoundedCornerShape(13.dp))
                .background(color = Purple40).clickable { println("123123") }
                , contentAlignment = Alignment.Center
            ){
                Text(text = "Button", color = Color.White, modifier = Modifier.clickable {  })
            }

            /*Box(modifier = Modifier
                //.width(100.dp)
                //.height(200.dp)
                .size(100.dp)
                .padding(20.dp)
                .border(width = 3.dp, color = Color.Black, shape = CircleShape)
                .border(width = 5.dp, color = Color.Red, shape = CircleShape)
                ,contentAlignment = Alignment.Center
                //.background(color = Color.Red), contentAlignment = Alignment.Center
                ){
                Text(text = "jeello", color = Color.Blue)
            }*/

            //Text(text = "Welcome to Devc", color = Color.Red, fontSize = 22.sp)
            //Greeting("IYahaa!!")
            /*Button(onClick = { println("clicked") }, content = {
                Greeting(name = "btn")
            })*/
            //Icon(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null, tint = Color.Black)
            //Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
            /*TextField(value = "", onValueChange = {}, label = {
                Text(text = "hint")
            })*/
            /*FloatingActionButton(onClick = { *//*TODO*//* }) {
                Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null)
            }*/
            /*ExtendedFloatingActionButton(
                text = { Text(text = "text") },
                icon = { Icon(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = null ) },
                onClick = { *//*TODO*//* })*/

            /**
             * XML Gravity -> Alignment
             * Alignment.CenterStart
             * Alignment.Center
             * Alignment.Bottom etc
             */
            /*MyTheme {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    //Greeting(name = "Hello")
                    Text(text = "Hello", Modifier.align(Alignment.TopStart))
                    Text(text = "Hello", Modifier.align(Alignment.TopCenter))
                    Text(text = "Welcome", Modifier.align(Alignment.TopEnd))
                }

            }*/

            //A layout composable that places its children in a 'vertical sequence'
            //verticalArrangement = Arrangement.SpaceAround, SpaceEvenly etc
            /*Column(verticalArrangement = Arrangement.SpaceEvenly) {
                //길게쓰면 자동 줄바꿈
                Text(text = "hello1hello1hello1hello1hello1hello123412341234123412341234123123123123123123")
                Column(verticalArrangement = Arrangement.SpaceEvenly) {
                    //길게쓰면 자동 줄바꿈
                    Text(text = "hello1hello1hello1hello1hello1hello123412341234123412341234123123123123123123")
                    Text(text = "hello2")
                    Text(text = "hello3")
                    Text(text = "hello4")
                    Text(text = "hello5")
                    Text(text = "hello6")
                    Text(text = "hello7")
                    Text(text = "hello8")
                }
                Column(modifier = Modifier.height(100.dp), verticalArrangement = Arrangement.SpaceEvenly) {
                    //길게쓰면 자동 줄바꿈
                    Greeting("hello1hello1hello1hello1hello1hello123412341234123412341234123123123123123123")
                    Greeting("hello2")
                    Greeting("hello3")
                    Greeting("hello4")
                    Greeting("hello5")
                    Greeting("hello6")
                    Greeting("hello7")
                    Greeting("hello8")
                }

                //기본적으로 wrap content속성
                ////A layout composable that places its children in a horizontal sequence
                //fillMax etc -> match parent
                Row(modifier = Modifier.fillMaxWidth() ,horizontalArrangement = Arrangement.Absolute.SpaceEvenly) {
                    Text(text = "hello2")
                    Text(text = "hello3")
                }

                Row(modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(text = "hello1")
                    Text(text = "hello2")
                    Text(text = "hello3")
                    Text(text = "hello4")
                }

                Row(modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Greeting("hello1")
                    Greeting("hello2")
                    Greeting("hello3")
                    Greeting("hello4")
                }

                Box {

                }
            }
*/

        }
    }
}

@Composable
fun Greeting(name:String) {
    Text(text = name, color = Color.Red, fontSize = 22.sp)
}