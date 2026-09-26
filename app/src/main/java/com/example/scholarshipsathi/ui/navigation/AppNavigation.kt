package com.example.scholarshipsathi.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.scholarshipsathi.ui.screens.LoginScreen
import com.example.scholarshipsathi.ui.screens.OtpScreen
import com.example.scholarshipsathi.ui.screens.MainAppScreen
import com.example.scholarshipsathi.ui.screens.WelcomeScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {

        composable("welcome") {
            WelcomeScreen(
                onGetStartedClick = {
                    navController.navigate("login")
                }
            )
        }

        composable("login") {
            LoginScreen(
                onSendOtpClick = {
                    navController.navigate("otp")
                }
            )
        }

        composable("otp") {
            OtpScreen(
                onVerifyClick = {
                    navController.navigate("main")
                }
            )
        }

        // MAIN APP
        composable("main") {
            MainAppScreen()
        }
    }
}