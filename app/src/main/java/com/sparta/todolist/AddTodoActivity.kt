package com.sparta.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sparta.todolist.databinding.ActivityAddTodoBinding

class AddTodoActivity : AppCompatActivity() {
    private var _binding:ActivityAddTodoBinding? = null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAddTodoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener {
            if(binding.etTitle.text.isNullOrBlank()){
                Toast.makeText(this,resources.getText(R.string.toast_enter_title),Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            TodoManager.addTodo(binding.etTitle.text!!.toString(), binding.etDescription.text.toString())
            finish()
        }
    }
}