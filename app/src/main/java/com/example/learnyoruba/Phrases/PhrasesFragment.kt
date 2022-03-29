package com.example.learnyoruba.Phrases

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentPhrasesBinding
import com.example.learnyoruba.user


class PhrasesFragment : Fragment() {

    private lateinit var viewModel : PhrasesViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentPhrasesBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_phrases, container, false)


        viewModel= ViewModelProvider(this).get(PhrasesViewModel::class.java)

        binding.phraseslist.adapter = activity?.let{ MyAdapter(it, viewModel.phrases) }
        return binding.root
    }


}