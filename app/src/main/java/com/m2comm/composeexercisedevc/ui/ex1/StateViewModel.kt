package com.m2comm.composeexercisedevc.ui.ex1

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class StateViewModel : ViewModel() {

    val state = mutableStateOf(MyScreenState())

    fun updateText(newText: String){
        state.value = state.value.copy(text = newText)
    }

    fun updateNamesList(){
        val current = state.value.namesList
        current.add(state.value.text)
        state.value = state.value.copy(namesList = current)
    }
}