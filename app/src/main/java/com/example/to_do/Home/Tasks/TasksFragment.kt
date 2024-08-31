package com.example.to_do.Home.Tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.to_do.databinding.FragmentTasksBinding

class TasksFragment : Fragment() {
    private lateinit var viewBinding: FragmentTasksBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentTasksBinding.inflate(inflater)
        return viewBinding.root
    }

}