package com.example.shopdrop.auth.fragments

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.shopdrop.MainActivity
import com.example.shopdrop.R
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment:Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        loginBtn.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
            activity?.finish()

        }

        registerTV.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)

        }
    }
}