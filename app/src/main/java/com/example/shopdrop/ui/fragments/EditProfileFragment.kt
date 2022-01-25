package com.example.shopdrop.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import com.example.shopdrop.R
import kotlinx.android.synthetic.main.fragment_profile_edit.*

class EditProfileFragment: Fragment(R.layout.fragment_profile_edit) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        saveBtn.setOnClickListener {
            val navOptions = NavOptions.Builder()
                .setPopUpTo(R.id.editProfileFragment, true)
                .build()
            findNavController().navigate(R.id.action_editProfileFragment2_to_dashboardFragment, savedInstanceState, navOptions)
        }


    }
    
}