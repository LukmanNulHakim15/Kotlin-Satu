package com.example.kotlinpsotgresqlapi.repository

import com.example.kotlinpsotgresqlapi.model.Perusahaan
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface PerusahaanRepository: ReactiveCrudRepository<Perusahaan, String> {

}