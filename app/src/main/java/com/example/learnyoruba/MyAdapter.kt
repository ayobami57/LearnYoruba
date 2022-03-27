package com.example.learnyoruba

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MyAdapter(private  val context : Activity, private val arrayList: ArrayList<user>) : ArrayAdapter<user>(
    context, R.layout.list_view, arrayList) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_view, null)

        val english : TextView = view.findViewById(R.id.englishText)
        val youruba: TextView = view.findViewById(R.id.yoruba_text)

        english.text = arrayList[position].name
        youruba.text = arrayList[position].yoru

        return view
    }


}