package com.sparta.todolist

import androidx.recyclerview.widget.DiffUtil

object TodoDiffCallback:DiffUtil.ItemCallback<Todo>(){
    override fun areItemsTheSame(oldItem: Todo, newItem: Todo): Boolean {
        return oldItem === newItem
    }

    override fun areContentsTheSame(oldItem: Todo, newItem: Todo): Boolean {
        return oldItem == newItem
    }

}