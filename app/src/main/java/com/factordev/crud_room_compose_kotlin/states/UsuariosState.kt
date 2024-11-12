package com.factordev.crud_room_compose_kotlin.states

import com.factordev.crud_room_compose_kotlin.models.Usuarios

data class UsuariosState(
    val listaUsuarios: List<Usuarios> = emptyList()
)
