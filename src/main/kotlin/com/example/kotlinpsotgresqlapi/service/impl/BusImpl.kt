package com.example.kotlinpsotgresqlapi.service.impl

import com.example.kotlinpsotgresqlapi.model.Bus
import com.example.kotlinpsotgresqlapi.repository.BusRepository
import com.example.kotlinpsotgresqlapi.service.BusService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
data class BusImpl(val busRepository: BusRepository): BusService {
    override fun showAll(): Flux<Bus> {
       return busRepository.findAll()
    }

    override fun save(bus: Bus): Mono<Bus> {
        return busRepository.save(bus)
    }

    override fun showById(id: String): Mono<Bus> {
        return busRepository.findById(id)
    }

    override fun update(id: String, bus: Bus): Mono<Bus> {
        return busRepository.findById(id)
            .flatMap { bus ->
                bus.kapasitas = bus.kapasitas
                bus.nama_supir = bus.nama_supir
                bus.nama_perusahaan = bus.nama_perusahaan

                busRepository.save(bus)
            }
    }

    override fun delete(id: String): Mono<Void> =
        busRepository.deleteById(id)


}