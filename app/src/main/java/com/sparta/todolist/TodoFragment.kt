package com.sparta.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sparta.todolist.databinding.FragmentTodoListBinding

class TodoFragment : Fragment() {

    private var _binding:FragmentTodoListBinding? = null
    private val binding get() = _binding!!

    private lateinit var  todoAdapter:TodoAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTodoListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        todoAdapter = TodoAdapter().apply { submitList(TodoManager.getTodoList()) }
        binding.recyclerview.adapter = todoAdapter
    }

    override fun onResume() {
        super.onResume()
    }
    companion object {
        fun newInstance() = TodoFragment()
    }
}