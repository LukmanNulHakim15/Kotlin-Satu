package com.example.kotlinpsotgresqlapi.controller

import com.example.kotlinpsotgresqlapi.model.Jurusan
import com.example.kotlinpsotgresqlapi.repository.JurusanRepository
import com.example.kotlinpsotgresqlapi.service.JurusanService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
data class JurusanController(
    val jurusanService: JurusanService,
    val jurusanRepository: JurusanRepository
    ) {

    @GetMapping("jurusan")
    fun showAll(): Flux<Jurusan> {
        return jurusanService.showAll()
    }

    @PostMapping("jurusan")
    fun save(@RequestBody jurusan: Jurusan): Mono<Jurusan> {
        return jurusanRepository.insert(jurusan)
    }

    @GetMapping("jurusan/{id}")
    fun showById(@PathVariable("id") id: Int): Mono<Jurusan> {
        return jurusanService.showById(id)
    }

    @PutMapping("jurusan/{id}")
    fun update(@PathVariable("id") id: Int, @RequestBody jurusan: Jurusan): Mono<Jurusan> {
        return jurusanService.save(jurusan)

    }

    @DeleteMapping("jurusan/{id}")
    fun delete(@PathVariable("id") id: Int): Mono<String> {
        return jurusanService.delete(id)
            .thenReturn("Delete Succes")
    }

}