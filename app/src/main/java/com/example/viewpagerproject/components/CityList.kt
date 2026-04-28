package com.example.viewpagerproject.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.viewpagerproject.data.City

@Composable
fun CityList(cityList: List<City>) {
    LazyColumn {
        items(cityList) { city ->
            CityCard(city)
        }
    }
}