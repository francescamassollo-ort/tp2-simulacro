package com.example.quotes.navigation

// Sealed class que define todas las rutas de navegación de la app.
// Al usar sealed class, el compilador garantiza que no haya rutas desconocidas
// y permite usar when() sin else.
// Cada objeto tiene una ruta (string) única que identifica la pantalla en el NavHost.
sealed class AppDestination(val route: String) {
    object Login : AppDestination("login")
    object Register : AppDestination("register")
    object ForgotPassword : AppDestination("forgot_password")
    object Quote : AppDestination("quote")
    object Favorites : AppDestination("favorites")
}
