package com.kodiiiofc.urbanuniversity.worldcurrencies.presentation

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.kodiiiofc.urbanuniversity.worldcurrencies.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setStatusBarHeight()
        setSupportActionBar(binding.toolbar)
        enableEdgeToEdge()
        val adapter = CurrencyRecyclerViewAdapter()
        binding.recyclerView.adapter = adapter
        viewModel.currencyListLiveData.observe(this) { list ->
            adapter.updateCurrencyList(list)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(0, 0,0, "Exit")
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            0 -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setStatusBarHeight() {
        val statusBarHeight = resources.getIdentifier("status_bar_height", "dimen", "android")
        binding.statusBar.layoutParams.height = resources.getDimensionPixelSize(statusBarHeight)
    }

}