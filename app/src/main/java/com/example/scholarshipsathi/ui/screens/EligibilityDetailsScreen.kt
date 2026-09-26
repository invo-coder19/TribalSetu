package com.example.scholarshipsathi.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
fun EligibilityDetailsScreen() {

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
                text = "Eligibility Result",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Based on your current student profile",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))


            // SCHOLARSHIP RESULT

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE8F7ED)
                )
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Text(
                        text = "Post-Matric Scholarship",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "🟢 Eligible",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF16803A)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Your current profile matches the available eligibility information.",
                        fontSize = 14.sp,
                        color = Color.DarkGray
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))


            // WHY YOU QUALIFY

            Text(
                text = "Why You Qualify",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            EligibilityReason(
                text = "ST category information is verified"
            )

            Spacer(modifier = Modifier.height(8.dp))

            EligibilityReason(
                text = "Student is enrolled in higher education"
            )

            Spacer(modifier = Modifier.height(8.dp))

            EligibilityReason(
                text = "Academic information is available"
            )

            Spacer(modifier = Modifier.height(8.dp))

            EligibilityReason(
                text = "Scholarship profile information is available"
            )

            Spacer(modifier = Modifier.height(22.dp))


            // VERIFICATION STATUS

            Text(
                text = "Verification Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            VerificationCard(
                document = "ST / Caste Certificate",
                status = "Verified",
                color = Color(0xFF16803A)
            )

            Spacer(modifier = Modifier.height(10.dp))

            VerificationCard(
                document = "Academic Record",
                status = "Verified",
                color = Color(0xFF16803A)
            )

            Spacer(modifier = Modifier.height(10.dp))

            VerificationCard(
                document = "Income Certificate",
                status = "Pending",
                color = Color(0xFFB77900)
            )

            Spacer(modifier = Modifier.height(22.dp))


            // NEXT ACTION

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
                        text = "⚡ What You Need To Do",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Complete income certificate verification before submitting the scholarship application.",
                        fontSize = 14.sp,
                        color = Color.DarkGray
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}


@Composable
fun EligibilityReason(
    text: String
) {

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = "✓",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF16803A)
        )

        Text(
            text = "  $text",
            fontSize = 14.sp
        )
    }
}


@Composable
fun VerificationCard(
    document: String,
    status: String,
    color: Color
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = document,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Text(
                text = "● $status",
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold,
                color = color
            )
        }
    }
}