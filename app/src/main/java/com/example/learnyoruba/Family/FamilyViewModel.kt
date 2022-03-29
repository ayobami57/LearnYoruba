package com.example.learnyoruba.Family

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.learnyoruba.user

class FamilyViewModel : ViewModel() {

    private val _family = ArrayList<user>()
    val family: ArrayList<user>
    get() = _family


    init {
        Log.i("Family", "Family ViewModel created")
    }

    override fun onCleared() {
        super.onCleared()


        family.add(user("Mother", "Baba"))
        family.add(user("Father", "Mama"))
        family.add(user("Son", "Omokunrin"))
        family.add(user("Daughter", "Omobirin"))
        family.add(user("Brother","Arakunrin"))
        family.add(user("Sister", "Arabinrin"))
        family.add(user("Man", "Arakunrin"))
        family.add(user("Woman", "Arabinrin"))
        family.add(user("Grandfather", "Baba-baba"))
        family.add(user("Grandmother", "Iya-iya"))


    }
}