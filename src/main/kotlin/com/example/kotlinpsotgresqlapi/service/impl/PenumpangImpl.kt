package com.example.kotlinpsotgresqlapi.service.impl

import com.example.kotlinpsotgresqlapi.model.Penumpang
import com.example.kotlinpsotgresqlapi.repository.PenumpangRepository
import com.example.kotlinpsotgresqlapi.service.PenumpangService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono


@Service
data class PenumpangImpl(val penumpangRepository: PenumpangRepository): PenumpangService {


    override fun showAll(): Flux<Penumpang> {
       return penumpangRepository.findAll()
    }

    override fun save(penumpang: Penumpang): Mono<Penumpang> {
        return penumpangRepository.save(penumpang)
    }

    override fun showById(id: String): Mono<Penumpang> {
        return penumpangRepository.findById(id)
    }

    override fun update(id: String, penumpang: Penumpang): Mono<Penumpang> {
        return penumpangRepository.findById(id)
            .flatMap { penumpang ->
                penumpang.nama = penumpang.nama
                penumpang.nomor_telpon = penumpang.nomor_telpon

                penumpangRepository.save(penumpang)
            }
    }

    override fun delete(id: String): Mono<Void> =
        penumpangRepository.deleteById(id)

}


