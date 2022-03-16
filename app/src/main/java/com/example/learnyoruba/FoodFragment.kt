package com.example.learnyoruba


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.databinding.FragmentFoodBinding


class FoodFragment : Fragment() {

 val food = ArrayList<String>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentFoodBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_food, container, false)
        food.add("BreakFast")
        food.add("Lunch")
        food.add("Dinner")
        food.add("Milk")
        food.add("Coffee")
        food.add("Bread")
        food.add("Yam")
        food.add("Beans")

        binding.foodList.adapter = activity?.let{ ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, food) }
        return binding.root
    }


}