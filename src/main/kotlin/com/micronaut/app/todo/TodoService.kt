package com.micronaut.app.todo

interface TodoService {
    fun listAll(): List<Todo>
    fun getById(id: Long): Todo?
    fun create(todo: Todo): Todo
    fun updateById(id: Long, todo: Todo): Todo
    fun deleteById(id: Long)
}