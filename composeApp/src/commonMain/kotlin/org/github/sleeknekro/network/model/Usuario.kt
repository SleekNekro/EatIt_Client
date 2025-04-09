package org.github.sleeknekro.network.model

import kotlinx.serialization.Serializable

@Serializable()
data class Usuario(
    val id : Int,
    val name : String,
    val email : String,
    val password : String
)
