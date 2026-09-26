package com.example.scholarshipsathi.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
fun ProfileScreen() {

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
                text = "My Profile",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Your unified scholarship profile",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))


            // PROFILE HEADER

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF5B4BDB)
                )
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Row {

                        Text(
                            text = "👤",
                            fontSize = 42.sp
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Column {

                            Text(
                                text = "Ram",
                                fontSize = 21.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(4.dp))

                            Text(
                                text = "Student Profile",
                                fontSize = 14.sp,
                                color = Color.White
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "Profile Completion: 80%",
                                fontSize = 13.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(22.dp))


            // PERSONAL INFORMATION

            Text(
                text = "Personal Information",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "Mobile Number",
                value = "+91 XXXXX XXXXX"
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "Category",
                value = "Scheduled Tribe (ST)"
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "State",
                value = "Maharashtra"
            )

            Spacer(modifier = Modifier.height(22.dp))


            // EDUCATION

            Text(
                text = "Education",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "Course",
                value = "B.Tech — Artificial Intelligence & Data Science"
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "Institution",
                value = "AISSMS Institute of Information Technology"
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "Current Year",
                value = "Final Year"
            )

            Spacer(modifier = Modifier.height(22.dp))


            // ELIGIBILITY DATA

            Text(
                text = "Eligibility Information",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "Income Certificate",
                value = "Pending Verification"
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "ST Certificate",
                value = "Verified ✓"
            )

            Spacer(modifier = Modifier.height(10.dp))

            ProfileInfoCard(
                title = "Academic Records",
                value = "Verified ✓"
            )

            Spacer(modifier = Modifier.height(22.dp))


            // PRIVACY & CONSENT

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Column(
                    modifier = Modifier.padding(18.dp)
                ) {

                    Text(
                        text = "🔐 Privacy & Consent",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Your information is used to match you with eligible scholarship schemes and verify application details.",
                        fontSize = 13.sp,
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "✓ Consent status: Active",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF16803A)
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}


@Composable
fun ProfileInfoCard(
    title: String,
    value: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(
                text = title,
                fontSize = 12.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = value,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}