package com.example.kotlinpsotgresqlapi.controller

import com.example.kotlinpsotgresqlapi.model.Perusahaan
import com.example.kotlinpsotgresqlapi.repository.PerusahaanRepository
import com.example.kotlinpsotgresqlapi.service.PerusahaanService
import org.springframework.web.bind.annotation.RestController

@RestController
data class PerusahaanController(
    val perusahaanService: PerusahaanService,
    val perusahaanRepository: PerusahaanRepository) {
}