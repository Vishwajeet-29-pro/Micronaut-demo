package com.micronaut.app.todo

import io.micronaut.context.annotation.Value
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class TodoServiceImpl(
    @Inject private val todoRepository: TodoRepository,
    @Value("\${myapp.greeting}") val greeting: String,
    @Value("\${myapp.number}") val number: Number
): TodoService {

    override fun testConfig(): String {
        return "$greeting with the value : $number"
    }

    override fun listAll(): List<Todo> {
       return todoRepository.findAll()
    }

    override fun getById(id: Long): Todo? {
       val todoItem = todoRepository.findById(id).orElse(null)
        return todoItem
    }

    override fun create(todo: Todo): Todo {
        return todoRepository.merge(todo)
    }

    override fun updateById(id: Long, todo: Todo): Todo {
        if (todoRepository.existsById(id)){
            return todoRepository.update(todo)
        }
        throw IllegalArgumentException("Todo not found.")
    }

    override fun deleteById(id: Long) {
        if (todoRepository.existsById(id)){
            todoRepository.deleteById(id)
        } else {
            throw IllegalArgumentException("Todo Not found")
        }
    }
}