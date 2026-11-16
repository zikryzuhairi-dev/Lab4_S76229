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

        // Wire semua 6 View-based activity + 1 Compose (jika ada)
        binding.btnLinear.setOnClickListener { open(LinearActivity::class.java) }
        binding.btnRelative.setOnClickListener { open(RelativeActivity::class.java) }
        binding.btnConstraint.setOnClickListener { open(ConstraintActivity::class.java) }
        binding.btnFrame.setOnClickListener { open(FrameActivity::class.java) }
        binding.btnTable.setOnClickListener { open(TableActivity::class.java) }
        binding.btnRecycler.setOnClickListener { open(RecyclerActivity::class.java) }

        // Cadangan: jika kau buat Exercise 7 dalam projek yang sama
        // binding.btnCompose.setOnClickListener { open(ComposeActivity::class.java) }
    }

    private fun open(target: Class<*>) = startActivity(Intent(this, target))
}