// Build file del módulo app.
// Acá se configuran las dependencias, versiones del SDK y opciones de compilación.
plugins {
    alias(libs.plugins.android.application)  // Plugin principal de Android
    alias(libs.plugins.kotlin.compose)       // Compilador de Jetpack Compose (incluye soporte Kotlin)
    // PENDIENTE: habilitar cuando se agregue KSP con la versión correcta
    // alias(libs.plugins.hilt)
    // alias(libs.plugins.ksp)
}

android {
    namespace = "com.example.quotes"
    compileSdk = 35  // Versión del SDK con la que se compila

    defaultConfig {
        applicationId = "com.example.quotes"
        minSdk = 24      // Versión mínima de Android soportada (Android 7.0)
        targetSdk = 35   // Versión objetivo de Android
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false  // En producción se activaría para ofuscar y reducir el APK
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    buildFeatures {
        compose = true  // Habilita Jetpack Compose
    }
}

dependencies {
    // Compose BOM: garantiza que todas las librerías de Compose sean compatibles entre sí
    implementation(platform(libs.androidx.compose.bom))

    // UI base de Compose
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)  // Componentes de Material Design 3

    // Android core
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose)  // viewModel() y collectAsState()

    // Navegación entre pantallas con Compose
    implementation(libs.androidx.navigation.compose)

    // PENDIENTE: habilitar con versión KSP correcta
    // Hilt - Inyección de dependencias
    // implementation(libs.hilt.android)
    // ksp(libs.hilt.compiler)
    // implementation(libs.hilt.navigation.compose)

    // Retrofit - Consumo de API REST
    // Se define la interfaz con @GET/@POST y Retrofit genera la implementación
    implementation(libs.retrofit)
    implementation(libs.retrofit.gson)  // Deserializa JSON a data classes de Kotlin

    // PENDIENTE: habilitar con versión KSP correcta
    // Room - Base de datos local
    // implementation(libs.room.runtime)
    // implementation(libs.room.ktx)
    // ksp(libs.room.compiler)

    // Tests
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    debugImplementation(libs.androidx.compose.ui.tooling)
}
