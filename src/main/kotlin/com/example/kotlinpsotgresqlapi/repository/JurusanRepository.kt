package com.example.kotlinpsotgresqlapi.repository

import com.example.kotlinpsotgresqlapi.model.Jurusan
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface JurusanRepository: ReactiveCrudRepository<Jurusan, Int>, WithInsert<Jurusan>{
}