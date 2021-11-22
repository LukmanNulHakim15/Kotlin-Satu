package com.example.kotlinpsotgresqlapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("perusahaan")
data class Perusahaan (

    @Id
    @Column("nama")
    var nama: String,

    @Column("alamat")
    var alamat: String

        )