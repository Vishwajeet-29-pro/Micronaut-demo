package com.micronaut.app.todo

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import jakarta.inject.Inject

@Controller("/api/todo")
class TodoController(@Inject private val todoService: TodoService) {

    @Get("/test")
    fun testGreeting(): String {
        return todoService.testConfig()
    }

    @Get("/")
    fun listAllTodo(): List<Todo> = todoService.listAll()

    @Get("/{id}")
    fun getTodoById(@PathVariable id: Long): Todo? {
        return todoService.getById(id)
    }

    @Post("/")
    fun createTodo(@Body todo: Todo): Todo {
        return todoService.create(todo)
    }

    @Put("/{id}")
    fun updateTodo(@PathVariable id: Long, @Body todo: Todo): Todo {
        return todoService.updateById(id, todo)
    }

    @Delete("/{id}")
    fun deleteById(@PathVariable id: Long) = todoService.deleteById(id)
}