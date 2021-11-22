package com.example.kotlinpsotgresqlapi.repository

import com.example.kotlinpsotgresqlapi.model.Penumpang
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface PenumpangRepository: ReactiveCrudRepository<Penumpang, String>, WithInsert<Penumpang> {
}