package com.example.to_do.Home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.to_do.Home.Settings.SettingsFragment
import com.example.to_do.Home.Tasks.TasksFragment
import com.example.to_do.R
import com.example.to_do.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var viewBinging: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinging = ActivityHomeBinding.inflate(layoutInflater)
        initNavigationView()
        setContentView(viewBinging.root)
    }

    private fun initNavigationView() {

        viewBinging.bottomNavBarView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_tasks_list -> {
                    setFragment(TasksFragment())
                    true
                }

                R.id.navigation_settings -> {
                    setFragment(SettingsFragment())
                    true
                }

                R.id.navigation_place_holder -> {
                    false
                }

                else -> {
                    setFragment(TasksFragment())
                    true
                }
            }
        }
        viewBinging.bottomNavBarView.selectedItemId = R.id.navigation_tasks_list

    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_content , fragment)
            .commit()
    }
}