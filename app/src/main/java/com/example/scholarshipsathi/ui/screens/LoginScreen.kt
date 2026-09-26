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
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.PersonAdd
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
fun LoginScreen(onSendOtpClick: () -> Unit) {

    var isCreateAccount by remember { mutableStateOf(false) }
    var name by remember { mutableStateOf("") }
    var mobileNumber by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF8F7FF)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 22.dp)
        ) {

            Spacer(modifier = Modifier.height(35.dp))

            // BRAND HEADER
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    modifier = Modifier
                        .background(
                            Color(0xFFEDEAFF),
                            RoundedCornerShape(14.dp)
                        )
                        .padding(10.dp)
                ) {
                    Text(
                        text = "🎓",
                        fontSize = 28.sp
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = "ScholarshipSathi",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF2C2850)
                    )

                    Text(
                        text = "Unified Scholarship Portal",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(28.dp))

            // LOGIN / CREATE ACCOUNT TABS
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEDEAFF)
                )
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {

                    Button(
                        onClick = { isCreateAccount = false },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor =
                            if (!isCreateAccount)
                                Color.White
                            else
                                Color.Transparent,
                            contentColor = Color(0xFF5B4BDB)
                        )
                    ) {
                        Text(
                            text = "Login",
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Button(
                        onClick = { isCreateAccount = true },
                        modifier = Modifier.weight(1f),
                        shape = RoundedCornerShape(12.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor =
                            if (isCreateAccount)
                                Color.White
                            else
                                Color.Transparent,
                            contentColor = Color(0xFF5B4BDB)
                        )
                    ) {
                        Text(
                            text = "Create Account",
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(25.dp))

            // TITLE
            Text(
                text = if (isCreateAccount)
                    "Create your account"
                else
                    "Welcome back 👋",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF252238)
            )

            Spacer(modifier = Modifier.height(7.dp))

            Text(
                text = if (isCreateAccount)
                    "Create your profile and discover scholarships made for you."
                else
                    "Login to continue your scholarship journey.",
                fontSize = 14.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))

            // INFO CARD
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEDEAFF)
                )
            ) {

                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        imageVector = Icons.Default.VerifiedUser,
                        contentDescription = null,
                        tint = Color(0xFF5B4BDB)
                    )

                    Spacer(modifier = Modifier.width(12.dp))

                    Column {
                        Text(
                            text = "One account. Multiple scholarships.",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(
                            text = "Your profile helps us identify eligible schemes.",
                            fontSize = 12.sp,
                            color = Color.Gray
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // CREATE ACCOUNT FIELDS
            if (isCreateAccount) {

                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Full Name") },
                    placeholder = { Text("Enter your full name") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.PersonAdd,
                            contentDescription = null
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    shape = RoundedCornerShape(14.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email Address") },
                    placeholder = { Text("Enter your email") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    shape = RoundedCornerShape(14.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))
            }

            // MOBILE NUMBER
            OutlinedTextField(
                value = mobileNumber,
                onValueChange = { mobileNumber = it },
                label = { Text("Mobile Number") },
                placeholder = { Text("Enter 10-digit mobile number") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = null
                    )
                },
                prefix = {
                    Text(
                        text = "+91 ",
                        fontWeight = FontWeight.SemiBold
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true,
                shape = RoundedCornerShape(14.dp)
            )

            Spacer(modifier = Modifier.height(18.dp))

            // MAIN BUTTON
            Button(
                onClick = onSendOtpClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF5B4BDB)
                )
            ) {

                Text(
                    text = if (isCreateAccount)
                        "Create Account & Continue →"
                    else
                        "Continue with Mobile →",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            // OTP INFO
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier.padding(end = 5.dp)
                )

                Text(
                    text = "You'll receive a one-time verification code",
                    fontSize = 11.sp,
                    color = Color.Gray
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "🔐 Secure authentication  •  Your data stays protected",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 22.dp),
                fontSize = 11.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}