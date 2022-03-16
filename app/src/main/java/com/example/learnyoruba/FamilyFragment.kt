package com.example.learnyoruba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.databinding.FragmentFamilyBinding


class FamilyFragment : Fragment() {


    val family = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentFamilyBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_family, container, false)
        family.add("Mother")
        family.add("Father")
        family.add("Son")
        family.add("Daughter")
        family.add("Brother")
        family.add("Sister")
        family.add("Man")
        family.add("Woman")
        family.add("Grandfather")
        family.add("Grandmother")

        binding.familyList.adapter = activity?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, family) }

        return binding.root
    }


}