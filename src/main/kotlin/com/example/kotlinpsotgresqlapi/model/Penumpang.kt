package com.example.kotlinpsotgresqlapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("penumpang")
data class Penumpang (
    @Id
    @Column("nik")
    var nik: String,

    @Column("nama")
    var nama: String,

    @Column("nomor_telpon")
    var nomor_telpon: String

    )