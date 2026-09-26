package com.example.scholarshipsathi.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WelcomeScreen(
    onGetStartedClick: () -> Unit
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF5B4BDB),
                        Color(0xFF8175E8),
                        Color(0xFFF8F7FF)
                    )
                )
            )
    ) {

        // Decorative circles

        Box(
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
                .background(Color.White.copy(alpha = 0.08f))
                .align(Alignment.TopEnd)
        )

        Box(
            modifier = Modifier
                .size(130.dp)
                .clip(CircleShape)
                .background(Color.White.copy(alpha = 0.08f))
                .align(Alignment.BottomStart)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 28.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            // Hero illustration

            Card(
                modifier = Modifier.size(145.dp),
                shape = RoundedCornerShape(40.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha = 0.96f)
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 8.dp
                )
            ) {

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "🎓",
                        fontSize = 70.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(28.dp))

            Text(
                text = "ScholarshipSathi",
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Your scholarship journey,\nsimplified.",
                fontSize = 19.sp,
                lineHeight = 27.sp,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(28.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(22.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha = 0.94f)
                )
            ) {

                Column(
                    modifier = Modifier.padding(20.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "One place for your complete scholarship journey",
                        fontSize = 15.sp,
                        color = Color(0xFF444444),
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "🎯 Eligibility  •  📄 Documents  •  🔔 Updates",
                        fontSize = 12.sp,
                        color = Color(0xFF666666),
                        textAlign = TextAlign.Center
                    )
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Button(
                onClick = onGetStartedClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color(0xFF5B4BDB)
                )
            ) {

                Text(
                    text = "Get Started →",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Secure • Simple • Transparent",
                fontSize = 13.sp,
                color = Color.White.copy(alpha = 0.9f)
            )
        }
    }
}