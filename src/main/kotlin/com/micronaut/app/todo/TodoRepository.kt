package com.micronaut.app.todo

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface TodoRepository : JpaRepository<Todo, Long>