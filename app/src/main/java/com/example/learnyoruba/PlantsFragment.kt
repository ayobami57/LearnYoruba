package com.example.learnyoruba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.databinding.FragmentPlantsBinding


class PlantsFragment : Fragment() {

val plants = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPlantsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_plants, container, false)

        plants.add("Dandelion Lettuce")
        plants.add("Bitter leaf")
        plants.add("African Spinach")
        plants.add("Lagos Spinach")
        plants.add("Water leaf")
        plants.add("Malabar Spinach")
        plants.add("Pumpkin leaf")
        plants.add("Jute leaf")
        plants.add("Moringa leaf")

        binding.plantsList.adapter = activity?.let{ ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, plants) }
        return binding.root
    }

}