package com.example.scholarshipsathi.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OtpScreen(onVerifyClick: () -> Unit) {

    var otp by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF8F7FF)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 22.dp)
        ) {

            Spacer(modifier = Modifier.height(30.dp))

            // HEADER
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    modifier = Modifier
                        .background(
                            Color(0xFFEDEAFF),
                            RoundedCornerShape(12.dp)
                        )
                        .padding(9.dp)
                ) {
                    Text(
                        text = "🎓",
                        fontSize = 25.sp
                    )
                }

                Spacer(modifier = Modifier.width(10.dp))

                Column {
                    Text(
                        text = "ScholarshipSathi",
                        fontSize = 19.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Secure verification",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(28.dp))

            // STEP INDICATOR
            Text(
                text = "STEP 2 OF 2",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5B4BDB)
            )

            Spacer(modifier = Modifier.height(7.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(6.dp)
            ) {

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(5.dp)
                        .background(
                            Color(0xFF5B4BDB),
                            RoundedCornerShape(10.dp)
                        )
                )

                Box(
                    modifier = Modifier
                        .weight(1f)
                        .height(5.dp)
                        .background(
                            Color(0xFF5B4BDB),
                            RoundedCornerShape(10.dp)
                        )
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            // ICON
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {

                Box(
                    modifier = Modifier
                        .background(
                            Color(0xFFEDEAFF),
                            RoundedCornerShape(25.dp)
                        )
                        .padding(20.dp)
                ) {

                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = null,
                        tint = Color(0xFF5B4BDB),
                        modifier = Modifier
                            .width(42.dp)
                            .height(42.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))

            Text(
                text = "Verify your mobile number",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 27.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "We've sent a 6-digit verification code to",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 14.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "+91 ••••• ••1234",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5B4BDB),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(25.dp))

            // OTP INPUT
            OutlinedTextField(
                value = otp,
                onValueChange = {
                    if (it.length <= 6 && it.all { char -> char.isDigit() }) {
                        otp = it
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Enter 6-digit OTP")
                },
                placeholder = {
                    Text("••••••")
                },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = null
                    )
                },
                singleLine = true,
                shape = RoundedCornerShape(15.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            // RESEND / CHANGE NUMBER
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                TextButton(
                    onClick = { }
                ) {
                    Text(
                        text = "Change number",
                        color = Color.Gray,
                        fontSize = 13.sp
                    )
                }

                TextButton(
                    onClick = { }
                ) {
                    Text(
                        text = "Resend OTP",
                        color = Color(0xFF5B4BDB),
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            // SECURITY CARD
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(17.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE8F7ED)
                )
            ) {

                Row(
                    modifier = Modifier.padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.VerifiedUser,
                        contentDescription = null,
                        tint = Color(0xFF16803A)
                    )

                    Spacer(modifier = Modifier.width(10.dp))

                    Column {

                        Text(
                            text = "Secure verification",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF16803A)
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = "Your OTP is used only to verify your identity.",
                            fontSize = 11.sp,
                            color = Color.DarkGray
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // VERIFY BUTTON
            Button(
                onClick = onVerifyClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5B4BDB)
                )
            ) {

                Text(
                    text = "Verify & Continue →",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "ScholarshipSathi • Unified Scholarship Platform",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp),
                fontSize = 11.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}