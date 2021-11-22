package com.example.kotlinpsotgresqlapi.service.impl

import com.example.kotlinpsotgresqlapi.model.Jurusan
import com.example.kotlinpsotgresqlapi.repository.JurusanRepository
import com.example.kotlinpsotgresqlapi.service.JurusanService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
data class JurusanImpl(val jurusanRepository: JurusanRepository): JurusanService {
    override fun showAll(): Flux<Jurusan> {
        return jurusanRepository.findAll()
    }

    override fun save(jurusan: Jurusan): Mono<Jurusan> {
        return jurusanRepository.save(jurusan)
    }

    override fun showById(id: Int): Mono<Jurusan> {
        return jurusanRepository.findById(id)
    }

    override fun update(id: Int, jurusan: Jurusan): Mono<Jurusan> {
        return jurusanRepository.findById(id)
            .flatMap { jurusan ->
                jurusan.deskripsi = jurusan.deskripsi
                jurusan.terminal_awal = jurusan.terminal_awal
                jurusan.terminal_akhir = jurusan.terminal_akhir

                jurusanRepository.save(jurusan)
            }
    }

    override fun delete(id: Int): Mono<Void> =
        jurusanRepository.deleteById(id)

}