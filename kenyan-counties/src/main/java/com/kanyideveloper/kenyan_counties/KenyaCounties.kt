package com.kanyideveloper.kenyan_counties

import java.lang.Exception

class Kenya {
    companion object {
        private val countyCodes = ArrayList<String>()

        init {
            for (i in 1..47) {
                var code = "00${i}"
                if (code.length > 3) code = code.removePrefix("0")
                countyCodes.add(code)
            }
        }
        private val counties = CountyNameProvider.counties

        fun counties(): List<String> {
            return counties
        }

        fun countyCodes(): List<String> {
            return countyCodes
        }

        fun getCountyCode(county: String): String {
            return try {
                val index = counties.indexOf(county)
                countyCodes[index]
            } catch (_: Exception) {
                "County Not Found"
            }
        }

        fun getCountyName(countyCode: String): String {
            return try {
                val index = countyCodes.indexOf(countyCode)
                counties[index]
            } catch (_: Exception) {
                "County Not Found"
            }
        }

        fun countiesWithCodes(): List<County> {
            val countyWithCodes = ArrayList<County>()
            counties.forEachIndexed { index, county ->
                val currentCounty = County(county, countyCodes[index])
                countyWithCodes.add(currentCounty)
            }
            return countyWithCodes
        }
    }
}