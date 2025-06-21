package com.shuklavijay249.klistDemo.ui.theme

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class KList<T> private constructor() {
    private var padding: Dp = 0.dp
    private val sections: MutableList<Section<T>> = mutableListOf()
    private var showDivider: Boolean = false

    private data class Section<T>(val header: String?, val items: List<T>, val content: @Composable (T) -> Unit)

    fun padding(value: Dp): KList<T> {
        padding = value
        return this
    }

    fun section(header: String? = null, list: List<T>, content: @Composable (T) -> Unit): KList<T> {
        sections.add(Section(header, list, content))
        return this
    }

    fun withDivider(): KList<T> {
        showDivider = true
        return this
    }

    @Composable
    fun render() {
        LazyColumn(modifier = Modifier.padding(padding).animateContentSize()) {
            sections.forEach { section ->
                section.header?.let { title ->
                    item {
                        Text(
                            text = title,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(12.dp)
                        )
                    }
                }
                items(section.items) { item ->
                    section.content(item)
                    if (showDivider) Divider()
                }
            }
        }
    }

    companion object {
        fun <T> builder(): KList<T> = KList()
    }
}
