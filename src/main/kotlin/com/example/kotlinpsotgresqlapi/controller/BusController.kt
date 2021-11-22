package com.example.kotlinpsotgresqlapi.controller

import com.example.kotlinpsotgresqlapi.model.Bus
import com.example.kotlinpsotgresqlapi.repository.BusRepository
import com.example.kotlinpsotgresqlapi.service.BusService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
data class BusController (
    val busService: BusService,
    val busRepository: BusRepository
     ){

    @GetMapping("bus")
     fun showAll(): Flux<Bus> {
         return busService.showAll()
    }

    @PostMapping("bus")
     fun save(@RequestBody bus: Bus): Mono<String> {
       return   busRepository.insert(bus)
           .thenReturn("Insert Succes")
    }

    @GetMapping("bus/{id}")
     fun showById(@PathVariable("id") id: String): Mono<Bus> {
        return busService.showById(id)
    }

    @PutMapping("bus/{id}")
     fun update(@PathVariable("id") id: String, @RequestBody bus: Bus): Mono<Bus> {
        return busService.save(bus)
    }

    @DeleteMapping("bus/{id}")
     fun delete(@PathVariable ("id")id: String): Mono<String>{
         return busService.delete(id)
             .thenReturn("Delete Oke")
     }


}