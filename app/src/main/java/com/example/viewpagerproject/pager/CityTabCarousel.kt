package com.example.viewpagerproject.pager

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CityTabCarousel() {
    val pagerState = rememberPagerState( pageCount = { 5 })

    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
    ) { page ->
        Text(
            text ="Page ${page + 1}",
            modifier = Modifier.padding(20.dp)
        )
    }
}