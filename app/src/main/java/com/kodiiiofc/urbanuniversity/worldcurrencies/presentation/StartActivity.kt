package com.kodiiiofc.urbanuniversity.worldcurrencies.presentation

import android.content.Intent
import android.os.Bundle
import android.provider.Settings.Global
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.kodiiiofc.urbanuniversity.worldcurrencies.databinding.ActivityStartBinding
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()

        GlobalScope.launch(context = Dispatchers.Main) {
            delay(5000)
            val intent = Intent(this@StartActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}