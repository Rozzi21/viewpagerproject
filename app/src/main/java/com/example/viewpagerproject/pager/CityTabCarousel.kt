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
import com.example.viewpagerproject.components.CityList
import com.example.viewpagerproject.data.CityDataResource

@Composable
fun CityTabCarousel() {
    val pagerState = rememberPagerState( pageCount = { 5 })

    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .fillMaxSize()
    ) { page ->
        when (page) {
        0 -> {
            Text(
                text = "This is our Favorite City",
                modifier = Modifier.padding(16.dp)
            )
        }
        1 -> {
            CityList(cityList = CityDataResource().loadCities())
        }

        }
    }
}