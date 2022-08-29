package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class HomeFragment: Fragment(R.layout.home_fragment) {

    private lateinit var buttonActualize: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonActualize = view.findViewById(R.id.buttonActualizarPerfil);
        setListeners()
    }

    private fun setListeners() {
        buttonActualize.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
    }
}