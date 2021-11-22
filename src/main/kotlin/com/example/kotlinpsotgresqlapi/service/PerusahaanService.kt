package com.example.kotlinpsotgresqlapi.service

import com.example.kotlinpsotgresqlapi.model.Perusahaan
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface PerusahaanService {
    fun getAll(): Flux<Perusahaan>

    fun save(perusahaan: Perusahaan): Mono<Perusahaan>

    fun showById(id: String): Mono<Perusahaan>

    fun update(id: String, perusahaan: Perusahaan): Mono<Perusahaan>

    fun delete(id: String): Mono<Void>


}