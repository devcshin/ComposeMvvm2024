package com.m2comm.composeexercisedevc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.sp
import com.m2comm.composeexercisedevc.ui.theme.ComposeExerciseDevcTheme

//extends 'ComponentActivity//
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Compose용 setContentView
        setContent {
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
        }
    }
}

@Composable
fun Greeting(name:String) {
    Text(text = name, color = Color.Red, fontSize = 22.sp)
}