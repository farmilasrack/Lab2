package com.example.laaaaab2

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.laaaab2.databinding.FragmentSecondBinding


class FragmentSecondT : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val numberInArray = "number"
        const val name = "name"
        const val desc = "desc"
        const val url = "url"
        const val text = "text"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(view).load(arguments?.getString(url)).fitCenter().into(binding.tvPhoto)
        binding.nametrack.text = arguments?.getString(name)
        binding.texttrack.text = arguments?.getString(text)



    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}