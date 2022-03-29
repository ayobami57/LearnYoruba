package com.example.learnyoruba.Numbers

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.learnyoruba.user

class NumbersViewModel : ViewModel() {
   private val _numbers = ArrayList<user>()
    val numbers : ArrayList<user>
    get() = _numbers


    init {
        Log.i("Numbers", "Numbers ViewModel is Created")
    }

    override fun onCleared() {
        super.onCleared()

        numbers.add(user("One", "Ookan"))
        numbers.add(user("Two", "Eeji"))
        numbers.add(user("Three", "Eeta"))
        numbers.add(user("Four", "Eerin"))
        numbers.add(user("Five", "Aarun"))
        numbers.add(user("Six", "Eefa"))
        numbers.add(user("Seven", "Eeje"))
        numbers.add(user("Eight", "Eejo"))
        numbers.add(user("Nine", "Esan"))
        numbers.add(user("Ten", "Eewa"))
    }
}