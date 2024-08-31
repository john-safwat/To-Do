package com.example.to_do.Home.Settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.to_do.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(){

    private lateinit var viewBinding:FragmentSettingsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentSettingsBinding.inflate(inflater)
        return  viewBinding.root
    }
}