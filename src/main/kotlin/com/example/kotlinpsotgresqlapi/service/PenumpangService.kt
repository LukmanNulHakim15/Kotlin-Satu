package com.example.kotlinpsotgresqlapi.service

import com.example.kotlinpsotgresqlapi.model.Penumpang
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface PenumpangService {

    fun showAll(): Flux<Penumpang>
    fun save(penumpang: Penumpang): Mono<Penumpang>
    fun showById(id: String): Mono<Penumpang>
    fun update(id: String, penumpang: Penumpang): Mono<Penumpang>
    fun delete(id: String): Mono<Void>
}