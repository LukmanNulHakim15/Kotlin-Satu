package com.example.kotlinpsotgresqlapi.repository

import com.example.kotlinpsotgresqlapi.model.Bus
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface BusRepository: ReactiveCrudRepository<Bus, String>, WithInsert<Bus> {
}