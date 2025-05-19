package com.example.andazkumar.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.asPaddingValues
import com.example.andazkumar.R

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF111111))
            .padding(WindowInsets.statusBars.asPaddingValues())
    ) {
        // Top Bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Back", tint = Color.White)
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Profile",
                color = Color.White,
                fontSize = 22.sp,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(Icons.Default.ChatBubbleOutline, contentDescription = "Support", tint = Color.White)
        }

        // Profile Info
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // User profile image
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Profile Photo",
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "Siddharth Shukla",
                    color = Color.White,
                    fontSize = 20.sp,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "member since Dec, 2020",
                    color = Color(0xFFAAAAAA),
                    fontSize = 14.sp
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(Icons.Default.Edit, contentDescription = "Edit", tint = Color.White)
        }

        // CRED Garage Card
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 24.dp)
                .background(Color(0xFF222222), RoundedCornerShape(12.dp))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.DirectionsCar, contentDescription = "Car", tint = Color.White, modifier = Modifier.size(32.dp))
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = "get to know your vehicles, inside out",
                    color = Color.White,
                    fontSize = 14.sp
                )
                Text(
                    text = "CRED garage",
                    color = Color.White,
                    style = MaterialTheme.typography.titleMedium,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(Icons.Default.KeyboardArrowRight, contentDescription = "Arrow", tint = Color.White)
        }

        // Info Rows
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            InfoRow(
                icon = Icons.Default.CreditScore,
                label = "credit score • REFRESH AVAILABLE",
                value = "757",
                valueColor = Color.White,
                labelColor = Color(0xFF00FF00)
            )
            Divider(color = Color(0xFF222222), thickness = 1.dp)
            InfoRow(
                icon = Icons.Default.MonetizationOn,
                label = "lifetime cashback",
                value = "₹3",
                valueColor = Color.White
            )
            Divider(color = Color(0xFF222222), thickness = 1.dp)
            InfoRow(
                icon = Icons.Default.AccountBalance,
                label = "bank balance",
                value = "check",
                valueColor = Color.White
            )
        }

        // Rewards & Benefits
        Text(
            text = "YOUR REWARDS & BENEFITS",
            color = Color(0xFFAAAAAA),
            style = MaterialTheme.typography.titleSmall,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 16.dp, top = 32.dp, bottom = 8.dp)
        )
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            RewardsRow(label = "cashback balance", value = "₹0")
            Divider(color = Color(0xFF222222), thickness = 1.dp)
            RewardsRow(label = "coins", value = "26,46,583")
            Divider(color = Color(0xFF222222), thickness = 1.dp)
            RewardsRow(label = "win upto Rs 1000", value = "refer and earn")
        }

        // Transactions & Support
        Text(
            text = "TRANSACTIONS & SUPPORT",
            color = Color(0xFFAAAAAA),
            style = MaterialTheme.typography.titleSmall,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 16.dp, top = 32.dp, bottom = 8.dp)
        )
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            RewardsRow(label = "all transactions", value = "")
        }
    }
}

@Composable
fun InfoRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    label: String,
    value: String,
    valueColor: Color,
    labelColor: Color = Color.White
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(icon, contentDescription = null, tint = Color.White)
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = label,
            color = labelColor,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = value,
            color = valueColor,
            fontSize = 16.sp,
            style = MaterialTheme.typography.titleMedium
        )
        Icon(Icons.Default.KeyboardArrowRight, contentDescription = null, tint = Color.White)
    }
}

@Composable
fun RewardsRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            color = Color.White,
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        if (value.isNotEmpty()) {
            Text(
                text = value,
                color = Color.White,
                fontSize = 16.sp,
                style = MaterialTheme.typography.titleMedium
            )
        }
        Icon(Icons.Default.KeyboardArrowRight, contentDescription = null, tint = Color.White)
    }
} 