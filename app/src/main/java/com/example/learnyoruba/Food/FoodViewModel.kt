package com.example.learnyoruba.Food

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.learnyoruba.user

class FoodViewModel : ViewModel() {
    private val _food = ArrayList<user>()
    val food : ArrayList<user>
    get() = _food


    init {
        Log.i("Food", "FoodViewModel is created")
    }

    override fun onCleared() {
        super.onCleared()

        food.add(user("BreakFast", "Ounje aaro"))
        food.add(user("Lunch", "Ounje osan"))
        food.add(user("Dinner", "Ounje ale"))
        food.add(user("Milk", "Wara"))
        food.add(user("Coffee", "Kofi"))
        food.add(user("Bread", "Buredi"))
        food.add(user("Yam", "Isu"))
        food.add(user("Beans","Ewa"))

    }
}