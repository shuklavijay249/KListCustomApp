package com.shuklavijay249.klistDemo.ui

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.shuklavijay249.klistDemo.model.Coin
import com.shuklavijay249.klistDemo.ui.theme.KList

@Composable
fun KListDemo() {
    val context = LocalContext.current

    val topCoins = listOf(
        Coin("Bitcoin", 5850000.0),
        Coin("Ethereum", 375000.0)
    )

    val trendingCoins = listOf(
        Coin("Dogecoin", 7.25),
        Coin("Solana", 12000.0)
    )

    KList.builder<Coin>()
        .padding(16.dp)
        .section(header = "Top Gainers", list = topCoins) {
            KListItem(it) {
                Toast.makeText(context, "Clicked on ${it.name}", Toast.LENGTH_SHORT).show()
            }
        }
        .section(header = "Trending Coins", list = trendingCoins) {
            KListItem(it) {
                Toast.makeText(context, "Clicked on ${it.name}", Toast.LENGTH_SHORT).show()
            }
        }
        .withDivider()
        .render()
}
