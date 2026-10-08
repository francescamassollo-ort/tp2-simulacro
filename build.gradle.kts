// Build file raíz del proyecto.
// Solo declara los plugins que usan los módulos hijos (apply false = no los aplica acá,
// sino que los deja disponibles para que app/build.gradle.kts los use)
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.compose) apply false  // Incluye soporte Kotlin para Android
    // alias(libs.plugins.hilt) apply false  // PENDIENTE: habilitar con versión KSP correcta
    // alias(libs.plugins.ksp) apply false
}
