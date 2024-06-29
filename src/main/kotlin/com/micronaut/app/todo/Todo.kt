package com.micronaut.app.todo

import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Serdeable
@Entity
data class Todo(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var title: String,
    var completed: Boolean
)
