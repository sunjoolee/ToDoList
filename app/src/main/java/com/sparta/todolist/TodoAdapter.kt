package com.sparta.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.RecyclerView
import com.sparta.todolist.databinding.RecyclerviewItemTodoBinding

class TodoAdapter(var dataset: MutableList<Todo>) :
    RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val binding = RecyclerviewItemTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TodoViewHolder(binding)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.switchButton.setOnCheckedChangeListener { _, isChecked ->
            dataset[holder.adapterPosition].done = isChecked
        }
        holder.bind(position)
    }

    private fun TodoViewHolder.bind(position: Int) {
        titleTextView.text = dataset[position].title
        descriptionTextView.text = dataset[position].description ?: ""
        switchButton.isChecked = dataset[position].done
    }

    class TodoViewHolder(private val binding: RecyclerviewItemTodoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val titleTextView: TextView = binding.tvTitle
        val descriptionTextView: TextView = binding.tvDescription
        val switchButton: SwitchCompat = binding.btnSwitch
    }
}
