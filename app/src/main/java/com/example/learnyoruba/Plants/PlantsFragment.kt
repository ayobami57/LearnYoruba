package com.example.learnyoruba.Plants

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.Phrases.PhrasesViewModel
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentPlantsBinding
import com.example.learnyoruba.user


class PlantsFragment : Fragment() {


    private lateinit var viewModel : PlantsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentPlantsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_plants, container, false)



        viewModel = ViewModelProvider(this).get(PlantsViewModel::class.java)

        binding.plantsList.adapter = activity?.let{ MyAdapter(it, viewModel.plants) }
        return binding.root
    }

}