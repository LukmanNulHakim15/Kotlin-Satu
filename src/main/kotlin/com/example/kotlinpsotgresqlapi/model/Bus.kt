package com.example.kotlinpsotgresqlapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("bus")
data class Bus (

    @Id
    @Column("nomor_polisi")
    var nomor_polisi: String, //field yang akan sama dengan atribut didatabase

    @Column("kapasitas")
    var kapasitas: Int, //field yang akan sama dengan atribut didatabase

    @Column("nama_supir")
    var nama_supir: String, //field yang akan sama dengan atribut didatabase

    @Column("nama_perusahaan")
    var nama_perusahaan: String //field yang akan sama dengan atribut didatabase

        )