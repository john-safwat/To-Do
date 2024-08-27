package com.example.to_do.Home

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.to_do.R
import com.example.to_do.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var viewBinging:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinging = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(viewBinging.root)
    }
}