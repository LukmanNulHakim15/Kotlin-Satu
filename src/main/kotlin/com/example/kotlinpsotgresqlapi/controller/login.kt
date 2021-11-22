package com.example.kotlinpsotgresqlapi.controller

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("login")
data class login (

    @Id
    @Column("email")
    var email: String,

    @Column("username")
    var username: String,

    @Column("password")
    var password: String,

        )