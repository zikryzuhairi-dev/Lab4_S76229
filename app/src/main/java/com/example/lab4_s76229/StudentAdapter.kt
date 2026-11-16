package com.example.lab4_s76229

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutlab.databinding.ItemStudentBinding

data class Student(val name: String, val score: Int)

class StudentAdapter(private val items: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.VH>() {

    class VH(val binding: ItemStudentBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val binding = ItemStudentBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return VH(binding)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val student = items[position]
        holder.binding.txtName.text = student.name
        holder.binding.txtScore.text = "Marks: ${student.score}"
    }

    override fun getItemCount() = items.size
}
