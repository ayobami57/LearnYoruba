package com.example.learnyoruba.Phrases

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.learnyoruba.user

class PhrasesViewModel : ViewModel() {

    private val _phrases = ArrayList<user>()
    val phrases : ArrayList<user>
    get() = _phrases

    init {
        Log.i("Phrases", "Phrases ViewModel Created")
    }

    override fun onCleared() {
        super.onCleared()

        phrases.add(user("What is your name?","Kini oruko re?"))
        phrases.add(user("Nice to meet you", "O dara lati pade e"))
        phrases.add(user("How are you?", "Bawo lo se wa?"))
        phrases.add(user("i am fine, thanks", "Mo wa daadaa, e se"))
        phrases.add(user("It was nice talking to you", "O dara lati ba e soro"))
        phrases.add(user("Where are you from?","Nibo loti wa"))
        phrases.add(user("Where do you live?", "Nibo lo ngbe?"))
        phrases.add(user("Can i help you?", "Se mo le ran o lowo?"))
        phrases.add(user("How much is this?", "Eelo ni eyi?"))

    }
}