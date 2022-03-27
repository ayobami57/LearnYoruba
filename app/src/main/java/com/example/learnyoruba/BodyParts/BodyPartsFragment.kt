package com.example.learnyoruba.BodyParts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentBodyPartsBinding
import com.example.learnyoruba.user


class BodyPartsFragment : Fragment() {


val bodyParts = ArrayList<user>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentBodyPartsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_body_parts, container, false)
        bodyParts.add(user("Ear", "Eti"))
        bodyParts.add(user("Eye", "Oju"))
        bodyParts.add(user("Mouth", "Enu"))
        bodyParts.add(user("Nose", "Imu"))
        bodyParts.add(user("Hair", "Irun"))
        bodyParts.add(user("Face", "Oju"))
        bodyParts.add(user("Head", "Ori"))
        bodyParts.add(user("Heart","Okan"))
        bodyParts.add(user("Hand", "Owo"))
        bodyParts.add(user("Fingers", "Ika"))
        bodyParts.add(user("Leg", "Ese"))
        bodyParts.add(user("Feet", "Ese"))

/*
        binding.bodyPartsList.adapter = activity?.let{ ArrayAdapter<String>(it, R.layout.list_view, bodyParts) }
*/

        binding.bodyPartsList.adapter = activity?.let { MyAdapter(it, bodyParts) }
        return binding.root
    }


}