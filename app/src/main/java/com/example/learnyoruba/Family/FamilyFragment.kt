package com.example.learnyoruba.Family

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentFamilyBinding
import com.example.learnyoruba.user


class FamilyFragment : Fragment() {

private lateinit var viewModel : FamilyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentFamilyBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_family, container, false)


        viewModel = ViewModelProvider(this).get(FamilyViewModel::class.java)

        binding.familyList.adapter = activity?.let { MyAdapter(it, viewModel.family) }

        return binding.root
    }


}