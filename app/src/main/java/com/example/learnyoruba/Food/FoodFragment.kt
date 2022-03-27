package com.example.learnyoruba.Food


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentFoodBinding
import com.example.learnyoruba.user


class FoodFragment : Fragment() {

 val food = ArrayList<user>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentFoodBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_food, container, false)
        food.add(user("BreakFast", "Ounje aaro"))
        food.add(user("Lunch", "Ounje osan"))
        food.add(user("Dinner", "Ounje ale"))
        food.add(user("Milk", "Wara"))
        food.add(user("Coffee", "Kofi"))
        food.add(user("Bread", "Buredi"))
        food.add(user("Yam", "Isu"))
        food.add(user("Beans","Ewa"))

        binding.foodList.adapter = activity?.let{ MyAdapter(it, food) }
        return binding.root
    }


}