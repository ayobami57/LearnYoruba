package com.example.learnyoruba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.databinding.FragmentPhrasesBinding


class PhrasesFragment : Fragment() {

    val phrases = ArrayList<String>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPhrasesBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_phrases, container, false)
        phrases.add("What is your name?")
        phrases.add("Nice to meet you")
        phrases.add("How are you?")
        phrases.add("i am fine, thanks")
        phrases.add("It was nice talking to you")
        phrases.add("Where are you from?")
        phrases.add("Where do you live?")
        phrases.add("Can i help you?")
        phrases.add("How much is this?")

        binding.phraseslist.adapter = activity?.let{ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, phrases)}
        return binding.root
    }


}