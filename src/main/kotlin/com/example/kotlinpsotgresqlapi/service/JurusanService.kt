package com.example.kotlinpsotgresqlapi.service

import com.example.kotlinpsotgresqlapi.model.Jurusan
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface JurusanService {

    fun showAll(): Flux<Jurusan>
    fun save(jurusan: Jurusan): Mono<Jurusan>
    fun showById(id: Int): Mono<Jurusan>
    fun update(id: Int, jurusan: Jurusan): Mono<Jurusan>
    fun delete(id: Int): Mono<Void>
}