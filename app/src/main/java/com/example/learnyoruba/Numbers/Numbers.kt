package com.example.learnyoruba.Numbers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentNumbersBinding
import com.example.learnyoruba.user


class Numbers : Fragment() {



    private lateinit var viewModel : NumbersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentNumbersBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_numbers, container, false)


        viewModel = ViewModelProvider(this).get(NumbersViewModel::class.java)

        binding.numberList.adapter = activity?.let { MyAdapter(it, viewModel.numbers) }





        // Inflate the layout for this fragment
        return binding.root



    }


}