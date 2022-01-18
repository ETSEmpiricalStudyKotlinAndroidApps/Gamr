package com.brian.gamr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brian.gamr.databinding.ActivityMainBinding
import com.brian.gamr.databinding.FragmentHomeBinding
import com.denzcoskun.imageslider.constants.ScaleTypes

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}