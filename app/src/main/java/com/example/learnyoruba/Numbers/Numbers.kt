package com.example.learnyoruba.Numbers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentNumbersBinding
import com.example.learnyoruba.user


class Numbers : Fragment() {


    val numbers = ArrayList<user>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentNumbersBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_numbers, container, false)
        numbers.add(user("One", "Ookan"))
        numbers.add(user("Two", "Eeji"))
        numbers.add(user("Three", "Eeta"))
        numbers.add(user("Four", "Eerin"))
        numbers.add(user("Five", "Aarun"))
        numbers.add(user("Six", "Eefa"))
        numbers.add(user("Seven", "Eeje"))
        numbers.add(user("Eight", "Eejo"))
        numbers.add(user("Nine", "Esan"))
        numbers.add(user("Ten", "Eewa"))
        binding.numberList.adapter = activity?.let { MyAdapter(it, numbers) }





        // Inflate the layout for this fragment
        return binding.root



    }


}