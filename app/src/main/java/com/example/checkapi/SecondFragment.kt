package com.example.checkapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.checkapi.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        binding.secondButtonNext.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        binding.secondButtonPrev.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_secondFragment_to_firstFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}