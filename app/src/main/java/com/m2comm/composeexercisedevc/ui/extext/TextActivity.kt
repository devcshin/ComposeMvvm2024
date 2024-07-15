package com.m2comm.composeexercisedevc.ui.extext

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.m2comm.composeexercisedevc.R
import com.m2comm.composeexercisedevc.ui.theme.MyTheme

class TextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

                    Text(text = stringResource(id = R.string.new_string))

                }
            }

        }
    }
}