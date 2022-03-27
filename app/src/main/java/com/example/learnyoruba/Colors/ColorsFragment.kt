package com.example.learnyoruba.Colors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentColorsBinding
import com.example.learnyoruba.user


class ColorsFragment : Fragment() {



val colors = ArrayList<user>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        val binding: FragmentColorsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_colors, container, false)
        colors.add(user("Red", "Pupa"))
        colors.add(user("White", "Funfun"))
        colors.add(user("Green", "Awo-ewe"))
        colors.add(user("Black", "Dudu"))
        colors.add(user("Grey", "Awo resuresu"))
        colors.add(user("Yellow", "Yelo"))
        colors.add(user("Brown","Awo-igi"))

        binding.colorsList.adapter =  activity?.let { MyAdapter(it, colors) }
        return binding.root
    }


}