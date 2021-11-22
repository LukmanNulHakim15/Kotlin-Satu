package com.example.kotlinpsotgresqlapi.controller

import com.example.kotlinpsotgresqlapi.model.Penumpang
import com.example.kotlinpsotgresqlapi.repository.PenumpangRepository
import com.example.kotlinpsotgresqlapi.service.PenumpangService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
data class PenumpangController(
    val penumpangService: PenumpangService,
    val penumpangRepository: PenumpangRepository) {

    @GetMapping("penumpang")
     fun showAll(): Flux<Penumpang> {
       return penumpangService.showAll()
    }

    @PostMapping("penumpang")
     fun save(@RequestBody penumpang: Penumpang): Mono<String> {
        return penumpangRepository.insert(penumpang)
            .thenReturn("Save succes")
    }

    @GetMapping("penumpang/{id}")
     fun showById(@PathVariable ("id") id: String): Mono<Penumpang> {
        return penumpangService.showById(id)
    }

    @PutMapping("penumpang/{id}")
     fun update(@PathVariable ("id") id: String, @RequestBody penumpang: Penumpang): Mono<Penumpang> {
        return penumpangService.save(penumpang)
    }

    @DeleteMapping("penumpang/{id}")
     fun delete(@PathVariable("id") id: String): Mono<String> {
         return penumpangService.delete(id)
             .thenReturn("Delete Succes")
     }


}