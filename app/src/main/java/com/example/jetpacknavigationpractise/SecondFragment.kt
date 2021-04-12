package com.example.jetpacknavigationpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class SecondFragment : Fragment(R.layout.fragment_second) {
    private lateinit var textView: TextView
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.textViewF2)
        textView.setOnClickListener {

            // type safe with Safe args
            val action = SecondFragmentDirections.secondFragmentToFirstFragment()

            findNavController().navigate(action)
        }
    }


}