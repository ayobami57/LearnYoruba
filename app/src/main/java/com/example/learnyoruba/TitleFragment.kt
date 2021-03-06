package com.example.learnyoruba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.learnyoruba.databinding.FragmentTitleBinding



class TitleFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment by using binding root
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        binding.numbersText.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_numbers))

        binding.familyText.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_family))

        binding.phrasesText.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_phrasesFragment))

        binding.colorText.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_colorsFragment))

        binding.foodText.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_foodFragment))

        binding.plantText.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_plantsFragment))

        binding.bodypartsText.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_bodyPartsFragment))
        setHasOptionsMenu(true)

        return binding.root

    }


}