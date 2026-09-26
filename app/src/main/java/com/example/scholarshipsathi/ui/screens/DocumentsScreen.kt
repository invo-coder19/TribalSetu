package com.example.scholarshipsathi.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
fun DocumentsScreen(
    onDocumentClick: () -> Unit
) {

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
                text = "Documents",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "One verified document can be reused across scholarships",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))

            // ZERO REUPLOAD CARD

            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEDEAFF)
                )
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Text(
                        text = "🔐 Zero-Reupload Verification",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Your verified documents are securely linked to your scholarship profile.",
                        fontSize = 14.sp,
                        color = Color.DarkGray
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    Text(
                        text = "✓ Verified documents can be reused",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF16803A)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "✓ No repeated uploads for every application",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF16803A)
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))

            // VERIFICATION SUMMARY

            Text(
                text = "Verification Summary",
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

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(18.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Column {
                        Text(
                            text = "4",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF16803A)
                        )

                        Text(
                            text = "Verified",
                            fontSize = 13.sp,
                            color = Color.Gray
                        )
                    }

                    Column {
                        Text(
                            text = "1",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFB77900)
                        )

                        Text(
                            text = "Pending",
                            fontSize = 13.sp,
                            color = Color.Gray
                        )
                    }

                    Column {
                        Text(
                            text = "0",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Mismatch",
                            fontSize = 13.sp,
                            color = Color.Gray
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(22.dp))

            // DOCUMENT LIST

            Text(
                text = "My Documents",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            DocumentCard(
                icon = "🪪",
                title = "Aadhaar Card",
                status = "Verified",
                statusColor = Color(0xFF16803A)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // CLICKABLE ST CERTIFICATE

            DocumentCard(
                icon = "📜",
                title = "ST / Caste Certificate",
                status = "Verified",
                statusColor = Color(0xFF16803A),
                onClick = onDocumentClick
            )

            Spacer(modifier = Modifier.height(10.dp))

            DocumentCard(
                icon = "💰",
                title = "Income Certificate",
                status = "Pending Verification",
                statusColor = Color(0xFFB77900)
            )

            Spacer(modifier = Modifier.height(10.dp))

            DocumentCard(
                icon = "🎓",
                title = "Academic Marksheet",
                status = "Verified",
                statusColor = Color(0xFF16803A)
            )

            Spacer(modifier = Modifier.height(10.dp))

            DocumentCard(
                icon = "🏦",
                title = "Bank Account",
                status = "Verified",
                statusColor = Color(0xFF16803A)
            )

            Spacer(modifier = Modifier.height(22.dp))

            // REUSE INFORMATION

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
                        text = "How Zero-Reupload Works",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "1. Upload or fetch your document once",
                        fontSize = 14.sp
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "2. Document is verified against an authoritative source",
                        fontSize = 14.sp
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "3. Verified status is stored in your scholarship profile",
                        fontSize = 14.sp
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "4. Reuse it for eligible scholarship applications",
                        fontSize = 14.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}


// DOCUMENT CARD

@Composable
fun DocumentCard(
    icon: String,
    title: String,
    status: String,
    statusColor: Color,
    onClick: () -> Unit = {}
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick()
            },
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Text(
                text = icon,
                fontSize = 25.sp
            )

            Spacer(modifier = Modifier.width(14.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "● $status",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = statusColor
                )
            }
        }
    }
}