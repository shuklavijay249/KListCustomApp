package com.shuklavijay249.klistDemo.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.shuklavijay249.klistDemo.model.Coin

@Composable
fun KListItem(coin: Coin, onClick: (() -> Unit)? = null) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp)
            .clickable(enabled = onClick != null) { onClick?.invoke() }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = coin.name)
            Text(text = "Price: ₹${coin.price}")
        }
    }
}