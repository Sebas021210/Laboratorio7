package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class LoginFragment: Fragment(R.layout.login_fragment) {

    private lateinit var buttonLogin: Button
    private lateinit var buttonUser: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin = view.findViewById(R.id.buttonIniciarSesion);
        buttonUser = view.findViewById(R.id.buttonNuevoUsuario);

        setListeners()
    }

    private fun setListeners() {
        buttonLogin.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_loginFragment2_to_homeFragment)
        }

        buttonUser.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_loginFragment2_to_newAccountFragment)
        }
    }
}