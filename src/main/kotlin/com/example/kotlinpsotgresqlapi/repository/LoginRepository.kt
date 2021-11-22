package com.example.kotlinpsotgresqlapi.repository

import com.example.kotlinpsotgresqlapi.controller.Login
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface LoginRepository: ReactiveCrudRepository <Login, String> {

    fun getByEmail(email: String): Mono<Login>
}