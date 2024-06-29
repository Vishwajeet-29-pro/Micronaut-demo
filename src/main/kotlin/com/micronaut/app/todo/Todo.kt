package com.micronaut.app.todo

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Todo(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var title: String,
    var completed: Boolean
)
