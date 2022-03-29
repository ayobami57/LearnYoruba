package com.example.learnyoruba.Colors

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.learnyoruba.user

class ColorsViewModel : ViewModel(){
    private val _colors = ArrayList<user>()
    val colors: ArrayList<user>
    get() = _colors


    init{
        Log.i("Colors", "Colors ViewModel created")
    }

    override fun onCleared() {
        super.onCleared()

        colors.add(user("Red", "Pupa"))
        colors.add(user("White", "Funfun"))
        colors.add(user("Green", "Awo-ewe"))
        colors.add(user("Black", "Dudu"))
        colors.add(user("Grey", "Awo resuresu"))
        colors.add(user("Yellow", "Yelo"))
        colors.add(user("Brown","Awo-igi"))

    }
}