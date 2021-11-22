package com.example.kotlinpsotgresqlapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("jurusan")
data class Jurusan (

    @Id
    @Column("id")
    var id: Int,

    @Column("deskripsi")
    var deskripsi: String,

    @Column("terminal_awal")
    var terminal_awal: String,

    @Column("terminal_akhir")
    var terminal_akhir: String

        )