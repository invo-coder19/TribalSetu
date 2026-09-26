package com.example.scholarshipsathi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.scholarshipsathi.ui.navigation.AppNavigation
import com.example.scholarshipsathi.ui.theme.ScholarshipSathiTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ScholarshipSathiTheme {
                AppNavigation()
            }
        }
    }
}