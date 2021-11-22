package com.example.kotlinpsotgresqlapi.service

import com.example.kotlinpsotgresqlapi.model.Bus
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface BusService {

    fun showAll(): Flux<Bus>

    fun save(bus: Bus): Mono<Bus>

    fun showById(id: String): Mono<Bus>

    fun update(id: String, bus: Bus): Mono<Bus>

    fun delete(id: String): Mono<Void>
}