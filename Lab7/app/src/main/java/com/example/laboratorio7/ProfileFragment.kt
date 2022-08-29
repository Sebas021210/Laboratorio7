package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class ProfileFragment: Fragment(R.layout.profile_fragment) {

    private lateinit var buttonAct: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonAct = view.findViewById(R.id.buttonActualizar);

        setListeners()
    }

    private fun setListeners() {
        buttonAct.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_profileFragment_to_loginFragment23)
        }
    }

}