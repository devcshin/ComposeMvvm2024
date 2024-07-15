package com.m2comm.composeexercisedevc.ui.ex1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.m2comm.composeexercisedevc.ui.theme.MyTheme

class StateActivity : ComponentActivity() {

    private val viewModel by lazy { ViewModelProvider(this).get(StateViewModel::class.java) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state = viewModel.state.value
            MyTheme {
                Column(modifier = Modifier.fillMaxSize()){
                    //이걸 하지 않으면 입력된 ui가 적용되지 않아서 입력되지 않음
                    //본래형
                    /*val textState = remember {
                        mutableStateOf("")
                    }*/

                    //by remember 로 var 선언 및 state.value 로 접근하지 않아도 바로 접근 간으
                    /*var textState by remember {
                        mutableStateOf("")
                    }
                    TextField(modifier = Modifier.fillMaxWidth(), value = textState,
                        onValueChange = {
                            textState = it
                        }
                    )*/
                    /*var textState by remember {
                        mutableStateOf("")
                    }*/
                    /*//화면 rotate 등으로 데이터 초기화 될때, 어떠헥 방지하는가?
                    var textState by rememberSaveable {
                        mutableStateOf("")
                    }

                    val namesListState = remember{
                        mutableStateListOf<String>()
                        //viewmodel 사용으로 이관
                    }*/

                    LazyColumn(modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)){
                        items(state.namesList.size){
                            Text(text = state.namesList[it])
                        }
                    }

                    MyTextField(
                        textValue = state.text,
                        onValueChanged = {viewModel.updateText(it)},
                        onAddClick = {
                            viewModel.updateNamesList()
                            viewModel.updateText("") //empty input text
                            /*namesListState.add(textState)
                            textState=""*/
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun MyTextField(
    textValue:String,
    onValueChanged:(String)->Unit,
    onAddClick:()->Unit){
    TextField(
        modifier = Modifier.fillMaxWidth(),
        value = textValue,
        onValueChange = {
            onValueChanged(it)
        },
        trailingIcon = {
            Icon(imageVector = Icons.Default.Add, contentDescription = null, modifier = Modifier.clickable { onAddClick() })
        }
    )
}