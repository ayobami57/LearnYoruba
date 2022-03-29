package com.example.learnyoruba.BodyParts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentBodyPartsBinding
import com.example.learnyoruba.user


class BodyPartsFragment : Fragment() {

    private lateinit var viewModel: BodyPartsViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentBodyPartsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_body_parts, container, false)

        viewModel = ViewModelProvider(this).get(BodyPartsViewModel::class.java)





        binding.bodyPartsList.adapter = activity?.let { MyAdapter(it, viewModel.bodyParts) }
        return binding.root
    }


}