package com.sparta.todolist

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

object TodoViewModel : ViewModel() {
    private val _todoList = MutableLiveData(
        mutableListOf<Todo>(
            Todo("할 일0", "이것은 할 일0 입니다."),
            Todo("할 일1", "이것은 할 일1 입니다."),
            Todo("할 일2", "이것은 할 일2 입니다."),
            Todo("할 일3", "이것은 할 일3 입니다."),
            Todo("할 일4", "이것은 할 일4 입니다."),
            Todo("할 일5", "이것은 할 일5 입니다."),
            Todo("할 일6", "이것은 할 일6 입니다."),
            Todo("할 일7", "이것은 할 일7 입니다.")
        )
    )
    val todoList get() = _todoList

    fun addTodo(title: String, description: String? = null) {
        todoList.value!!.add(Todo(title, description))
        Log.d("TodoManager", "addTodo) todoList.size = ${todoList.value!!.size}")
    }
}