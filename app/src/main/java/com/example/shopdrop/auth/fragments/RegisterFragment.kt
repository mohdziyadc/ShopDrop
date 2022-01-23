package com.example.shopdrop.auth.fragments

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.shopdrop.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment:Fragment(R.layout.fragment_register) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        registerBackBtn.setOnClickListener {
          showAlertDialog("Have you registered?")
        }

        registerBtn.setOnClickListener {
            if(termsCheckbox.isChecked){
                findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
            } else {
                Snackbar.make(it, "Please accept the Terms&Conditions", Snackbar.LENGTH_SHORT).show()
            }

        }

        loginTV.setOnClickListener{
            findNavController().popBackStack()
        }

    }

    @SuppressWarnings("SameParameterValue")
    private fun showAlertDialog(message:String) {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Are you sure?")
            .setMessage(message)
            .setPositiveButton("Yes"){ _,_ ->
                findNavController().popBackStack()

            }
            .setNegativeButton("No"){ dialog,_ ->
                dialog.dismiss()
            }
            .show()
    }
}