package com.example.learnyoruba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.databinding.FragmentBodyPartsBinding


class BodyPartsFragment : Fragment() {


val bodyParts = ArrayList<String>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentBodyPartsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_body_parts, container, false)
        bodyParts.add("Ear")
        bodyParts.add("Eye")
        bodyParts.add("Mouth")
        bodyParts.add("Nose")
        bodyParts.add("Hair")
        bodyParts.add("Face")
        bodyParts.add("Head")
        bodyParts.add("Heart")
        bodyParts.add("Hand")
        bodyParts.add("Fingers")
        bodyParts.add("Leg")
        bodyParts.add("Feet")

        binding.bodyPartsList.adapter = activity?.let{ ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, bodyParts) }

        return binding.root
    }


}