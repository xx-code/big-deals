package com.example.juniortiemele.bigdeals.screen.SignIn

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.juniortiemele.bigdeals.R
import com.example.juniortiemele.bigdeals.databinding.FragmentSignInBinding

class SignIn : Fragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_sign_in,
                container,
                false
        )

        binding.btnSignIn.setOnClickListener {
            signIn()
        }

        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_sign_in_to_sign_up)
        }

        return binding.root
    }

    private fun signIn(){

    }
}