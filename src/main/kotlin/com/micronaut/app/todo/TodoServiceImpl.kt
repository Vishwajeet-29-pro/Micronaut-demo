package com.micronaut.app.todo

import jakarta.inject.Singleton

@Singleton
class TodoServiceImpl(
    private val todoRepository: TodoRepository
): TodoService {
    override fun listAll(): List<Todo> {
       return todoRepository.findAll()
    }

    override fun getById(id: Long): Todo {
        TODO("Not yet implemented")
    }

    override fun create(todo: Todo): Todo {
        TODO("Not yet implemented")
    }

    override fun updateById(id: Long, todo: Todo): Todo {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: Long) {
        TODO("Not yet implemented")
    }
}