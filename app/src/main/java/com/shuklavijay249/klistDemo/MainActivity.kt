package com.shuklavijay249.klistDemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.shuklavijay249.klistDemo.ui.KListDemo
import com.shuklavijay249.klistDemo.ui.theme.KListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KListTheme {
                KListDemo()
            }
        }
    }
}