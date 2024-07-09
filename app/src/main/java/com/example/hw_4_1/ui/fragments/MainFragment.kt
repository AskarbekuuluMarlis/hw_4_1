package com.example.hw_4_1.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hw_4_1.R
import com.example.hw_4_1.data.models.User
import com.example.hw_4_1.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {

        binding = FragmentMainBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupListener()
    }

    private fun setupListener() {
        binding.btnSend.setOnClickListener {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment(
                User(binding.etName.text.toString(),
                    binding.etEmail.text.toString(),
                    binding.etPassword.text.toString().toInt())
            ))

        }

    }


}