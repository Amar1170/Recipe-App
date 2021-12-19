package com.razaqn.recipecatalogue.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.razaqn.recipecatalogue.databinding.FragmentSeafoodBinding

class SeafoodFragment : Fragment() {

    private var _binding: FragmentSeafoodBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSeafoodBinding.inflate(inflater, container, false)

        return binding.root
    }

}