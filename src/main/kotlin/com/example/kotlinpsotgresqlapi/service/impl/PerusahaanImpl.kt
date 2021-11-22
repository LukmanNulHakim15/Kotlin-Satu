package com.example.kotlinpsotgresqlapi.service.impl

import com.example.kotlinpsotgresqlapi.model.Perusahaan
import com.example.kotlinpsotgresqlapi.repository.PerusahaanRepository
import com.example.kotlinpsotgresqlapi.service.PerusahaanService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
data class PerusahaanImpl(val perusahaanRepository: PerusahaanRepository): PerusahaanService {

    override fun getAll(): Flux<Perusahaan> {
        return perusahaanRepository.findAll()
    }

    override fun save(perusahaan: Perusahaan): Mono<Perusahaan> {
        return perusahaanRepository.save(perusahaan)
    }

    override fun showById(id: String): Mono<Perusahaan> {
        return perusahaanRepository.findById(id)
    }

    override fun update(id: String, perusahaan: Perusahaan): Mono<Perusahaan> {
        return perusahaanRepository.findById(id)
            .flatMap { perusahaan ->
                perusahaan.nama = perusahaan.nama
                perusahaan.alamat = perusahaan.alamat

                perusahaanRepository.save(perusahaan)
            }
    }

    override fun delete(id: String): Mono<Void> =
        perusahaanRepository.deleteById(id)


}