package com.example.checkapi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.checkapi.databinding.ActivityMainBinding
import com.example.checkapi.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onStart() {
        super.onStart()
        binding.firstButtonNext.setOnClickListener {
            (activity as MainActivity).navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}