package com.example.learnyoruba.Plants

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentPlantsBinding
import com.example.learnyoruba.user


class PlantsFragment : Fragment() {

val plants = ArrayList<user>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentPlantsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_plants, container, false)

        plants.add(user("Dandelion Lettuce", "Efo-yanrin"))
        plants.add(user("Bitter leaf", "Eworo"))
        plants.add(user("African Spinach", "Efo-tete"))
        plants.add(user("Lagos Spinach", "Shokoyokoto"))
        plants.add(user("Water leaf", "Gbure"))
        plants.add(user("Malabar Spinach", "Amunututu"))
        plants.add(user("Pumpkin leaf", "Ugu"))
        plants.add(user("Jute leaf", "Ewedu"))
        plants.add(user("Moringa leaf", "Ewe ile"))

        binding.plantsList.adapter = activity?.let{ MyAdapter(it, plants) }
        return binding.root
    }

}