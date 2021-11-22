package com.example.kotlinpsotgresqlapi.repository

import org.springframework.data.r2dbc.core.R2dbcEntityOperations
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface WithInsert<E> {
    fun insert(e: E): Mono<E>
    fun insertMany(entities: List<E>): Flux<E>
}
class WithInsertImpl <E>(private val r2dbcEntityOperations: R2dbcEntityOperations) : WithInsert<E> {
    override fun insert(e: E): Mono<E> {
        return r2dbcEntityOperations.insert(e!!)
    }

    override fun insertMany(entities: List<E>): Flux<E> {
        return Flux.fromIterable(entities)
            .flatMap { r2dbcEntityOperations.insert(it!!) }
    }
}