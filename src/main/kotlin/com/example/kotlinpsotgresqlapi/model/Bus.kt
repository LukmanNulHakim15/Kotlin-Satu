package com.example.kotlinpsotgresqlapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("bus")
data class Bus (

    @Id
    @Column("nomor_polisi")
    var nomor_polisi: String,

    @Column("kapasitas")
    var kapasitas: Int,

    @Column("nama_supir")
    var nama_supir: String,

    @Column("nama_perusahaan")
    var nama_perusahaan: String

        )