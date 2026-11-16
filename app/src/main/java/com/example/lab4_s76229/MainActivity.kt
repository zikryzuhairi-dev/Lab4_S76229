package com.example.lab4_s76229

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab4_s76229.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLinear.setOnClickListener { open(LinearActivity::class.java) }
        binding.btnRelative.setOnClickListener { open(RelativeActivity::class.java) }
    }

    private fun open(target: Class<*>) = startActivity(Intent(this, target))
}
