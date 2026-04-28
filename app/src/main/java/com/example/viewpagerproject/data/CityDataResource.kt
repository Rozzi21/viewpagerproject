package com.example.viewpagerproject.data
import com.example.viewpagerproject.R

class CityDataResource{
    fun loadCities(): List<City> {
        return listOf(
            City(1, R.string.spain, R.drawable.spain),
            City(2, R.string.new_york, R.drawable.new_york),
            City(3, R.string.tokyo, R.drawable.tokyo),
            City(4, R.string.switzerland, R.drawable.switzerland),
            City(5, R.string.singapore, R.drawable.singapore),
            City(6, R.string.paris, R.drawable.paris),
        )
    }
}
