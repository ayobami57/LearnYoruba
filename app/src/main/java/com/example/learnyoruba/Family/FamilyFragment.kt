package com.example.learnyoruba.Family

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.learnyoruba.MyAdapter
import com.example.learnyoruba.R
import com.example.learnyoruba.databinding.FragmentFamilyBinding
import com.example.learnyoruba.user


class FamilyFragment : Fragment() {


    val family = ArrayList<user>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentFamilyBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_family, container, false)
        family.add(user("Mother", "Baba"))
        family.add(user("Father", "Mama"))
        family.add(user("Son", "Omokunrin"))
        family.add(user("Daughter", "Omobirin"))
        family.add(user("Brother","Arakunrin"))
        family.add(user("Sister", "Arabinrin"))
        family.add(user("Man", "Arakunrin"))
        family.add(user("Woman", "Arabinrin"))
        family.add(user("Grandfather", "Baba-baba"))
        family.add(user("Grandmother", "Iya-iya"))

        binding.familyList.adapter = activity?.let { MyAdapter(it, family) }

        return binding.root
    }


}