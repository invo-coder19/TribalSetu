package com.example.scholarshipsathi.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Description
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.School
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun MainAppScreen() {

    val navController = rememberNavController()

    val items = listOf(
        "home",
        "scholarships",
        "documents",
        "alerts",
        "profile"
    )

    val icons = listOf(
        Icons.Default.Home,
        Icons.Default.School,
        Icons.Default.Description,
        Icons.Default.Notifications,
        Icons.Default.Person
    )

    val currentBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = currentBackStackEntry?.destination?.route

    Scaffold(
        bottomBar = {

            NavigationBar {

                items.forEachIndexed { index, screen ->

                    NavigationBarItem(

                        selected = currentRoute == screen,

                        onClick = {
                            navController.navigate(screen) {

                                popUpTo(
                                    navController.graph.startDestinationId
                                ) {
                                    saveState = true
                                }

                                launchSingleTop = true
                                restoreState = true
                            }
                        },

                        icon = {
                            Icon(
                                imageVector = icons[index],
                                contentDescription = screen
                            )
                        },

                        label = {
                            Text(
                                text = screen.replaceFirstChar {
                                    it.uppercase()
                                },
                                maxLines = 1,
                                fontSize = 11.sp
                            )
                        }
                    )
                }
            }
        }

    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {

            composable("home") {

                HomeScreen(
                    onProfileClick = {
                        navController.navigate("profile")
                    },

                    onScholarshipsClick = {
                        navController.navigate("scholarships")
                    },

                    onDocumentsClick = {
                        navController.navigate("documents")
                    },

                    onAlertsClick = {
                        navController.navigate("alerts")
                    }
                )
            }

            composable("scholarships") {

                ScholarshipsScreen(
                    onScholarshipClick = {
                        navController.navigate("eligibility")
                    }
                )
            }

            composable("eligibility") {
                EligibilityDetailsScreen()
            }

            composable("documents") {

                DocumentsScreen(
                    onDocumentClick = {
                        navController.navigate("documentDetails")
                    }
                )
            }

            composable("documentDetails") {
                DocumentDetailsScreen()
            }

            composable("alerts") {
                AlertsScreen()
            }

            composable("profile") {
                ProfileScreen()
            }
        }
    }
}