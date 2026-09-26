package com.example.scholarshipsathi.ui.screens
import androidx.compose.foundation.clickable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun ScholarshipsScreen(
    onScholarshipClick: () -> Unit
) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFF8F7FF)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {

            Text(
                text = "Scholarships",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "Discover scholarships based on your profile",
                fontSize = 15.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(20.dp))


            // ELIGIBILITY RADAR

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
                        text = "🎯 Eligibility Radar",
                        fontSize = 21.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "We checked available scholarship schemes against your student profile.",
                        fontSize = 14.sp,
                        color = Color.DarkGray
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "🟢 1 Eligible",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF16803A)
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "🟡 1 Potentially Eligible",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFB77900)
                    )

                    Spacer(modifier = Modifier.height(7.dp))

                    Text(
                        text = "⚪ 3 Future Opportunities",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))


            // ELIGIBLE SCHOLARSHIP

            Text(
                text = "Eligible for You",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onScholarshipClick()
                    },
                shape = RoundedCornerShape(18.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {

                Column(
                    modifier = Modifier.padding(18.dp)
                ) {

                    Text(
                        text = "Post-Matric Scholarship",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "🟢 Eligible",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF16803A)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Based on your education level and student profile.",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Why you may qualify →",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF5B4BDB)
                    )
                }
            }

            Spacer(modifier = Modifier.height(15.dp))


            // POTENTIALLY ELIGIBLE

            Text(
                text = "Potentially Eligible",
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
                        text = "Top Class Scholarship",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "🟡 Potentially Eligible",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFB77900)
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "Some information needs additional verification.",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = "View missing information →",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFF5B4BDB)
                    )
                }
            }

            Spacer(modifier = Modifier.height(22.dp))


            // MY APPLICATIONS

            Text(
                text = "My Applications",
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
                        text = "Post-Matric Scholarship",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "🟢 Active",
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF16803A)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Verification Progress: 80%",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = "Current Stage: Government Verification",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                }
            }
        }
    }
}