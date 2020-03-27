package com.example.juniortiemele.bigdeals.screen.ConfirmSignIn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.juniortiemele.bigdeals.R
import com.example.juniortiemele.bigdeals.databinding.FragmentConfirmSignUpBinding

/**
 * A simple [Fragment] subclass.
 */
class ConfirmSignUp : Fragment() {

    private lateinit var binding: FragmentConfirmSignUpBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding =  DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_confirm_sign_up,
                container,
                false
        )

        binding.btnConfirmSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_confirm_sign_up_to_choose_sign_in)
        }

        return binding.root
    }

}
