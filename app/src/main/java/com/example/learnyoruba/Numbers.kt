package com.example.learnyoruba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.databinding.FragmentNumbersBinding



class Numbers : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentNumbersBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_numbers, container, false)
        /*val numbers = ArrayList<String>()
        numbers.add("one")
        numbers.add("two")
        numbers.add("three")
        val arrayAdapter = ArrayAdapter(activity!!, android.R.layout.simple_list_item_1, numbers)
        binding.numberList.adapter = arrayAdapter*/




        // Inflate the layout for this fragment
        return binding.root


    }


}