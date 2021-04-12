package com.example.jetpacknavigationpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView: TextView = view.findViewById(R.id.textViewF1)
        textView.setOnClickListener {

            // type safe with Safe args
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment()

            findNavController().navigate(action)
        }

    }

}