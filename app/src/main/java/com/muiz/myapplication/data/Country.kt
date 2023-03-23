package com.muiz.myapplication.data

data class Country(
    val name: String,
    val capital: String,
    val flag: Flag,
)

data class Flag(
    val url : String,
    val description: String
)