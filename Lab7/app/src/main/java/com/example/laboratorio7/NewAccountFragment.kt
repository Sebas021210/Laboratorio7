package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class NewAccountFragment: Fragment(R.layout.new_account_fragment) {

    private lateinit var buttonCrear: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonCrear = view.findViewById(R.id.buttonCrearCuenta);

        setListeners()
    }

    private fun setListeners() {
        buttonCrear.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_newAccountFragment_to_homeFragment)
        }
    }
}