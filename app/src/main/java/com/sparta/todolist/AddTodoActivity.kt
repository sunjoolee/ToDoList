package com.sparta.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sparta.todolist.databinding.ActivityAddTodoBinding

class AddTodoActivity : AppCompatActivity() {
    private var _binding:ActivityAddTodoBinding? = null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAddTodoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            finish()
        }
    }
}