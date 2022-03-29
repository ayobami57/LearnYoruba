package com.example.learnyoruba.Colors

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.learnyoruba.BodyParts.BodyPartsViewModel
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentColorsBinding
import com.example.learnyoruba.user


class ColorsFragment : Fragment() {


    private lateinit var viewModel: ColorsViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        val binding: FragmentColorsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_colors, container, false)
       viewModel = ViewModelProvider(this).get(ColorsViewModel::class.java)

        binding.colorsList.adapter =  activity?.let { MyAdapter(it, viewModel.colors) }
        return binding.root
    }


}