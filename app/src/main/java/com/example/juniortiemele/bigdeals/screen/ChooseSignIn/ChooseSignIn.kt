package com.example.juniortiemele.bigdeals.screen.ChooseSignIn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.example.juniortiemele.bigdeals.R
import com.example.juniortiemele.bigdeals.databinding.FragmentChooseSignInBinding

/**
 * A simple [Fragment] subclass.
 */
class ChooseSignIn : Fragment() {

    private lateinit var binding: FragmentChooseSignInBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                               savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_choose_sign_in,
                container,
                false
        )

        binding.btnSignInWithEmail.setOnClickListener {
            findNavController().navigate(R.id.action_choose_sign_in_to_sign_in)
        }

        return binding.root
}

}
