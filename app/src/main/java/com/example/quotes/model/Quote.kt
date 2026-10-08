package com.example.quotes.model

// Data class que representa una frase.
// Es el modelo de dominio: se usa en toda la app (ViewModel, UI).
// Distinto del DTO (que viene de la API) y de la entidad de Room (base de datos local).
data class Quote(
    val id: String,
    val content: String,
    val author: String
)
