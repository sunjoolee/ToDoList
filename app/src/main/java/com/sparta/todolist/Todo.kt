package com.sparta.todolist

data class Todo(
    val title:String,
    val description:String?,
    var done:Boolean = false
)