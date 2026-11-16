package com.example.lab4_s76229

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lab4_s76229.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerBinding
    private var grid = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val bars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom)
            insets
        }

        val data = List(50) { Student("Student ${it + 1}", 50 + it) }
        binding.recycler.adapter = StudentAdapter(data)
        binding.recycler.layoutManager = LinearLayoutManager(this)

        binding.btnToggle.setOnClickListener {
            grid = !grid
            binding.recycler.layoutManager =
                if (grid) GridLayoutManager(this, 2) else LinearLayoutManager(this)
            binding.btnToggle.text = if (grid) "Switch to List" else "Switch to Grid"
        }
    }
}
