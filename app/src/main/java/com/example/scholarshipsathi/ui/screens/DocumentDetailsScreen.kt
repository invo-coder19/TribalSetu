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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DocumentDetailsScreen() {

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
                text = "Document Details",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Verification information",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))

            // DOCUMENT HEADER

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

                    Row {

                        Text(
                            text = "📜",
                            fontSize = 38.sp
                        )

                        Spacer(modifier = Modifier.width(14.dp))

                        Column {

                            Text(
                                text = "ST / Caste Certificate",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Spacer(modifier = Modifier.height(5.dp))

                            Text(
                                text = "🟢 Verified",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFF16803A)
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(22.dp))

            // VERIFICATION INFORMATION

            Text(
                text = "Verification Information",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            InfoCard(
                title = "Verification Status",
                value = "Verified ✓"
            )

            Spacer(modifier = Modifier.height(10.dp))

            InfoCard(
                title = "Verification Type",
                value = "Authoritative Source Check"
            )

            Spacer(modifier = Modifier.height(10.dp))

            InfoCard(
                title = "Document Status",
                value = "Valid"
            )

            Spacer(modifier = Modifier.height(22.dp))

            // REUSE

            Text(
                text = "Reusable Across Scholarships",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

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
                        text = "This verified document can be reused.",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    ReuseRow(
                        scholarship = "Post-Matric Scholarship"
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    ReuseRow(
                        scholarship = "Top Class Scholarship"
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    ReuseRow(
                        scholarship = "National Fellowship"
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))

            // ZERO REUPLOAD

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
                        text = "🔐 Zero-Reupload",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Because this document is already verified, the student does not need to upload the same document again for every eligible scholarship.",
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
fun InfoCard(
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


@Composable
fun ReuseRow(
    scholarship: String
) {

    Row(
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = "✓",
            color = Color(0xFF16803A),
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text(
            text = scholarship,
            fontSize = 14.sp
        )
    }
}