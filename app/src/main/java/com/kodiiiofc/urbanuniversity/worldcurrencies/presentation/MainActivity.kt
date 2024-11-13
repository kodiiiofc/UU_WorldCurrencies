package com.kodiiiofc.urbanuniversity.worldcurrencies.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kodiiiofc.urbanuniversity.worldcurrencies.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = CurrencyRecyclerViewAdapter()
//        binding.recyclerView.adapter = adapter

    }
}