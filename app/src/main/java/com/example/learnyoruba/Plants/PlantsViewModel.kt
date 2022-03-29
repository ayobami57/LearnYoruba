package com.example.learnyoruba.Plants

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.learnyoruba.user

class PlantsViewModel : ViewModel() {

    private val _plants = ArrayList<user>()
    val plants : ArrayList<user>
        get() = _plants
    init {
        Log.i("Phrases", "Phrases ViewModel Created")
    }

    override fun onCleared() {
        super.onCleared()

        plants.add(user("Dandelion Lettuce", "Efo-yanrin"))
        plants.add(user("Bitter leaf", "Eworo"))
        plants.add(user("African Spinach", "Efo-tete"))
        plants.add(user("Lagos Spinach", "Shokoyokoto"))
        plants.add(user("Water leaf", "Gbure"))
        plants.add(user("Malabar Spinach", "Amunututu"))
        plants.add(user("Pumpkin leaf", "Ugu"))
        plants.add(user("Jute leaf", "Ewedu"))
        plants.add(user("Moringa leaf", "Ewe ile"))
    }
}