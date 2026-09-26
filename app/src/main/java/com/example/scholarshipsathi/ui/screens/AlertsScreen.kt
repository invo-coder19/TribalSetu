package com.example.scholarshipsathi.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.Composable

@Composable
fun AlertsScreen() {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF8F7FF)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(20.dp)
        ) {

            Text(
                text = "Alerts",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Important updates about your scholarships",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))


            // ACTION REQUIRED

            Text(
                text = "Action Required",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            AlertCard(
                icon = "⚠",
                title = "Income Certificate Verification",
                message = "Your income certificate is still pending verification.",
                time = "Today",
                backgroundColor = Color(0xFFFFF4E5),
                statusColor = Color(0xFFB77900)
            )

            Spacer(modifier = Modifier.height(12.dp))


            // APPLICATION UPDATE

            Text(
                text = "Application Updates",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            AlertCard(
                icon = "✓",
                title = "Application Verified",
                message = "Your Post-Matric Scholarship application has been verified.",
                time = "Yesterday",
                backgroundColor = Color.White,
                statusColor = Color(0xFF16803A)
            )

            Spacer(modifier = Modifier.height(12.dp))


            // PAYMENT

            AlertCard(
                icon = "₹",
                title = "Payment Sanctioned",
                message = "Your scholarship payment has been sanctioned.",
                time = "2 days ago",
                backgroundColor = Color.White,
                statusColor = Color(0xFF16803A)
            )

            Spacer(modifier = Modifier.height(22.dp))


            // DEADLINES

            Text(
                text = "Important Deadlines",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEDEAFF)
                )
            ) {

                Column(
                    modifier = Modifier.padding(18.dp)
                ) {

                    Text(
                        text = "📅 Scholarship Application",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "Application deadline is approaching.",
                        fontSize = 14.sp,
                        color = Color.DarkGray
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "Complete pending requirements before submission.",
                        fontSize = 13.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))


            // INFORMATION

            Text(
                text = "Recent Updates",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            AlertCard(
                icon = "🔐",
                title = "Document Verification Complete",
                message = "Your academic marksheet was successfully verified.",
                time = "3 days ago",
                backgroundColor = Color.White,
                statusColor = Color(0xFF16803A)
            )

            Spacer(modifier = Modifier.height(12.dp))

            AlertCard(
                icon = "🎯",
                title = "Eligibility Radar Updated",
                message = "Your profile was checked for available scholarship opportunities.",
                time = "4 days ago",
                backgroundColor = Color.White,
                statusColor = Color(0xFF5B4BDB)
            )

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}


@Composable
fun AlertCard(
    icon: String,
    title: String,
    message: String,
    time: String,
    backgroundColor: Color,
    statusColor: Color
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        )
    ) {

        Column(
            modifier = Modifier.padding(17.dp)
        ) {

            Text(
                text = "$icon  $title",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = statusColor
            )

            Spacer(modifier = Modifier.height(7.dp))

            Text(
                text = message,
                fontSize = 14.sp,
                color = Color.DarkGray
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = time,
                fontSize = 12.sp,
                color = Color.Gray
            )
        }
    }
}