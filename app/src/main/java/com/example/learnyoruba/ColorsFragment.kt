package com.example.learnyoruba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.databinding.FragmentColorsBinding


class ColorsFragment : Fragment() {



val colors = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val binding: FragmentColorsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_colors, container, false)
        colors.add("Red")
        colors.add("White")
        colors.add("Green")
        colors.add("Black")
        colors.add("Grey")
        colors.add("Yellow")
        colors.add("Brown")

        binding.colorsList.adapter = activity?.let{ ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, colors) }
        return binding.root
    }


}