package com.example.scholarshipsathi.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    onProfileClick: () -> Unit,
    onScholarshipsClick: () -> Unit,
    onDocumentsClick: () -> Unit,
    onAlertsClick: () -> Unit
) {

    var showJago by remember { mutableStateOf(false) }

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

            // HEADER
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Good Morning 👋",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(3.dp))

                    Text(
                        text = "RAM",
                        fontSize = 27.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF252238)
                    )
                }

                Box(
                    modifier = Modifier
                        .size(45.dp)
                        .background(
                            Color(0xFFEDEAFF),
                            CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "R",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF5B4BDB)
                    )
                }

                Spacer(modifier = Modifier.width(5.dp))

                IconButton(
                    onClick = onAlertsClick
                ) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notifications",
                        tint = Color(0xFF333044)
                    )
                }
            }

            Spacer(modifier = Modifier.height(18.dp))

            // SYNC STATUS
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFE8F7ED)
                )
            ) {

                Row(
                    modifier = Modifier.padding(
                        horizontal = 14.dp,
                        vertical = 11.dp
                    ),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Text(
                        text = "●",
                        color = Color(0xFF16803A),
                        fontSize = 13.sp
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(
                        text = "Profile data synced successfully",
                        fontSize = 12.sp,
                        color = Color(0xFF27663A)
                    )

                    Spacer(modifier = Modifier.weight(1f))

                    Text(
                        text = "Just now",
                        fontSize = 11.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(18.dp))

            // PROFILE COMPLETION
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onProfileClick() },
                shape = RoundedCornerShape(19.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Column(
                    modifier = Modifier.padding(18.dp)
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Box(
                            modifier = Modifier
                                .size(42.dp)
                                .background(
                                    Color(0xFFEDEAFF),
                                    CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = null,
                                tint = Color(0xFF5B4BDB)
                            )
                        }

                        Spacer(modifier = Modifier.width(12.dp))

                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = "Profile Completion",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = "Complete your profile for better matching",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }

                        Text(
                            text = "80%",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF5B4BDB)
                        )
                    }

                    Spacer(modifier = Modifier.height(14.dp))

                    LinearProgressIndicator(
                        progress = 0.8f,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(7.dp),
                    )

                    Spacer(modifier = Modifier.height(9.dp))

                    Text(
                        text = "Add income details to reach 100%",
                        fontSize = 12.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            // SCHOLARSHIP 360
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onScholarshipsClick() },
                shape = RoundedCornerShape(21.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF5B4BDB)
                )
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "SCHOLARSHIP 360",
                            fontSize = 13.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )

                        Text(
                            text = "View all →",
                            fontSize = 12.sp,
                            color = Color.White.copy(alpha = 0.85f)
                        )
                    }

                    Spacer(modifier = Modifier.height(18.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        StatItem("2", "Active")
                        StatItem("8/9", "Verified")
                        StatItem("₹24K", "Received")
                    }

                    Spacer(modifier = Modifier.height(17.dp))

                    Text(
                        text = "Your scholarship journey at a glance",
                        fontSize = 12.sp,
                        color = Color.White.copy(alpha = 0.85f)
                    )
                }
            }

            Spacer(modifier = Modifier.height(23.dp))

            // ELIGIBILITY
            SectionTitle("🎯 Eligibility Radar")

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onScholarshipsClick() },
                shape = RoundedCornerShape(19.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFEDEAFF)
                )
            ) {

                Column(
                    modifier = Modifier.padding(18.dp)
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {

                        Text(
                            text = "Scholarships matched to RAM",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "2",
                            fontSize = 22.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFF5B4BDB)
                        )
                    }

                    Spacer(modifier = Modifier.height(13.dp))

                    Text(
                        text = "🟢 1 Eligible",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF16803A)
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "🟡 1 Potentially Eligible",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFB77900)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Explore eligibility →",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF5B4BDB)
                    )
                }
            }

            Spacer(modifier = Modifier.height(23.dp))

            // ACTION REQUIRED
            SectionTitle("⚠ Action Required")

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onDocumentsClick() },
                shape = RoundedCornerShape(19.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFFFFF4E5)
                )
            ) {

                Column(
                    modifier = Modifier.padding(18.dp)
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "📄",
                            fontSize = 25.sp
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Column(
                            modifier = Modifier.weight(1f)
                        ) {

                            Text(
                                text = "Income Certificate",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = "Verification is pending",
                                fontSize = 13.sp,
                                color = Color.Gray
                            )
                        }

                        Text(
                            text = "1",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFB77900)
                        )
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "View documents →",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFB77900)
                    )
                }
            }

            Spacer(modifier = Modifier.height(23.dp))

            // RECENT ACTIVITY
            SectionTitle("Recent Activity")

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onAlertsClick() },
                shape = RoundedCornerShape(19.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Column(
                    modifier = Modifier.padding(18.dp)
                ) {

                    ActivityRow("✓", "Application verified", "Today")
                    Spacer(modifier = Modifier.height(13.dp))
                    ActivityRow("✓", "Payment sanctioned", "Yesterday")
                    Spacer(modifier = Modifier.height(13.dp))
                    ActivityRow("✓", "Documents verified", "2 days ago")

                    Spacer(modifier = Modifier.height(14.dp))

                    Text(
                        text = "View all updates →",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF5B4BDB)
                    )
                }
            }

            Spacer(modifier = Modifier.height(23.dp))

            // JAGO
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { showJago = true },
                shape = RoundedCornerShape(21.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF24213D)
                )
            ) {

                Column(
                    modifier = Modifier.padding(20.dp)
                ) {

                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Text(
                            text = "🤖",
                            fontSize = 30.sp
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Column {
                            Text(
                                text = "Meet JAGO",
                                fontSize = 19.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.White
                            )

                            Text(
                                text = "Your scholarship assistant",
                                fontSize = 12.sp,
                                color = Color(0xFFD8D6E8)
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Ask about eligibility, documents, applications or payments.",
                        fontSize = 13.sp,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        text = "Chat with JAGO →",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }

    // JAGO DIALOG
    if (showJago) {

        AlertDialog(
            onDismissRequest = { showJago = false },

            title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "🤖",
                        fontSize = 25.sp
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(
                        text = "JAGO",
                        fontWeight = FontWeight.Bold
                    )
                }
            },

            text = {

                Column {

                    Text(
                        text = "Hi RAM! 👋",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "I checked your scholarship profile. Here's what needs your attention:"
                    )

                    Spacer(modifier = Modifier.height(14.dp))

                    Text(
                        text = "🎯 2 scholarship schemes matched"
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "📄 1 document needs attention"
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "💰 Latest payment has been sanctioned"
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Text(
                        text = "What would you like to know?",
                        fontWeight = FontWeight.Bold
                    )
                }
            },

            confirmButton = {
                TextButton(
                    onClick = { showJago = false }
                ) {
                    Text("Got it")
                }
            }
        )
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun StatItem(
    number: String,
    label: String
) {
    Column {
        Text(
            text = number,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )

        Text(
            text = label,
            fontSize = 12.sp,
            color = Color.White.copy(alpha = 0.85f)
        )
    }
}

@Composable
fun ActivityRow(
    icon: String,
    title: String,
    time: String
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = icon,
            fontSize = 17.sp,
            color = Color(0xFF16803A)
        )

        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = title,
            modifier = Modifier.weight(1f),
            fontSize = 14.sp
        )

        Text(
            text = time,
            fontSize = 11.sp,
            color = Color.Gray
        )
    }
}