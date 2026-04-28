package com.example.viewpagerproject.pager

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.viewpagerproject.components.CityList
import com.example.viewpagerproject.data.CityDataResource

@Composable

fun CityApp() {
    Column {
        CityTabCarousel() // viewpager
//        CityList(cityList = CityDataResource().loadCities()) // LazyList
    }
}
