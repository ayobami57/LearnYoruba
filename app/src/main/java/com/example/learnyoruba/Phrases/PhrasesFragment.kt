package com.example.learnyoruba.Phrases

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentPhrasesBinding
import com.example.learnyoruba.user


class PhrasesFragment : Fragment() {

    val phrases = ArrayList<user>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentPhrasesBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_phrases, container, false)
        phrases.add(user("What is your name?","Kini oruko re?"))
        phrases.add(user("Nice to meet you", "O dara lati pade e"))
        phrases.add(user("How are you?", "Bawo lo se wa?"))
        phrases.add(user("i am fine, thanks", "Mo wa daadaa, e se"))
        phrases.add(user("It was nice talking to you", "O dara lati ba e soro"))
        phrases.add(user("Where are you from?","Nibo loti wa"))
        phrases.add(user("Where do you live?", "Nibo lo ngbe?"))
        phrases.add(user("Can i help you?", "Se mo le ran o lowo?"))
        phrases.add(user("How much is this?", "Eelo ni eyi?"))

        binding.phraseslist.adapter = activity?.let{ MyAdapter(it, phrases) }
        return binding.root
    }


}