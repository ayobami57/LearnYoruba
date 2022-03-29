package com.example.learnyoruba.Food


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentFoodBinding
import com.example.learnyoruba.user


class FoodFragment : Fragment() {

    private lateinit var viewModel: FoodViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentFoodBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_food, container, false)


        viewModel = ViewModelProvider(this).get(FoodViewModel::class.java)

        binding.foodList.adapter = activity?.let{ MyAdapter(it, viewModel.food) }
        return binding.root
    }


}