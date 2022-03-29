package com.example.learnyoruba.BodyParts

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.learnyoruba.user

class BodyPartsViewModel : ViewModel() {
    private val _bodyParts= ArrayList<user>()
    val bodyParts: ArrayList<user>
        get() = _bodyParts

    init{
        Log.i("BodyParts", "BodyParts ViewModel created!")
        
    }

    override fun onCleared() {
        super.onCleared()



        bodyParts.add(user("Ear", "Eti"))
        bodyParts.add(user("Eye", "Oju"))
        bodyParts.add(user("Mouth", "Enu"))
        bodyParts.add(user("Nose", "Imu"))
        bodyParts.add(user("Hair", "Irun"))
        bodyParts.add(user("Face", "Oju"))
        bodyParts.add(user("Head", "Ori"))
        bodyParts.add(user("Heart","Okan"))
        bodyParts.add(user("Hand", "Owo"))
        bodyParts.add(user("Fingers", "Ika"))
        bodyParts.add(user("Leg", "Ese"))
        bodyParts.add(user("Feet", "Ese"))

    }
}