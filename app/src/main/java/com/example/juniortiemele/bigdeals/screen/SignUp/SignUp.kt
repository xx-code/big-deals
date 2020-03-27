package com.example.juniortiemele.bigdeals.screen.SignUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.juniortiemele.bigdeals.R
import com.example.juniortiemele.bigdeals.databinding.FragmentSignUpBinding

/**
 * A simple [Fragment] subclass.
 */
class SignUp : Fragment() {

    private lateinit var binding: FragmentSignUpBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_sign_up,
                container,
                false
        )

        binding.btnSignUpDone.setOnClickListener { signUp() }

        return binding.root
    }

    private fun signUp() {
        findNavController().navigate(R.id.action_sign_up_to_confirm_sign_up)
    }

}
