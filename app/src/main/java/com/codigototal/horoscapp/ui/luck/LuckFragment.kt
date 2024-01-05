package com.codigototal.horoscapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codigototal.horoscapp.R
import com.codigototal.horoscapp.databinding.FragmentHoroscopeBinding
import com.codigototal.horoscapp.databinding.FragmentLuckBinding


class LuckFragment : Fragment() {
    private var _binding: FragmentLuckBinding? = null;
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}