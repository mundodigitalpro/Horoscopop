package com.josejordan.horoscopop.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.josejordan.horoscopop.R
import com.josejordan.horoscopop.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}