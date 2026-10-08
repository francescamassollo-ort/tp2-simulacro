package com.example.quotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.quotes.ui.theme.QuotesTheme

// PENDIENTE: agregar @AndroidEntryPoint cuando se configure KSP + Hilt
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuotesTheme {
                // TODO: agregar AppNavHost cuando esté creado
            }
        }
    }
}
