package com.kanyideveloper.kenyan_counties

class Kenya {
    companion object {

        private val counties = arrayListOf(
            "Mombasa",
            "Kwale",
            "Kilifi",
            "Tana River",
            "Lamu",
            "Taita Taveta",
            "Garissa",
            "Wajir",
            "Mandera",
            "Marsabit",
            "Isiolo",
            "Meru",
            "Tharaka-Nithi",
            "Embu",
            "Kitui",
            "Machakos",
            "Makueni",
            "Nyandarua",
            "Nyeri",
            "Kirinyaga",
            "Murang’a",
            "Kiambu",
            "Turkana",
            "West Pokot",
            "Samburu",
            "Trans-Nzoia",
            "Uasin Gishu",
            "Elgeyo-Marakwet",
            "Nandi",
            "Baringo",
            "Laikipia",
            "Nakuru",
            "Narok",
            "Kajiado",
            "Kericho",
            "Bomet",
            "Kakamega",
            "Vihiga",
            "Bungoma",
            "Busia",
            "Siaya",
            "Kisumu",
            "Homa Bay",
            "Migori",
            "Kisii",
            "Nyamira",
            "Nairobi"
        )

        private val countyCodes = arrayListOf(
            "001",
            "002",
            "003",
            "004",
            "005",
            "006",
            "007",
            "008",
            "009",
            "010",
            "011",
            "012",
            "013",
            "014",
            "015",
            "016",
            "017",
            "018",
            "019",
            "020",
            "021",
            "022",
            "023",
            "024",
            "025",
            "026",
            "027",
            "028",
            "029",
            "030",
            "031",
            "032",
            "033",
            "034",
            "035",
            "036",
            "037",
            "038",
            "039",
            "040",
            "041",
            "042",
            "043",
            "044",
            "045",
            "046",
            "047"
        )

        fun counties(): List<String> {
            return counties
        }

        fun countyCodes(): List<String> {
            return countyCodes
        }

        fun getCountyCode(county: String): String {
            return when (county) {
                counties[0] -> {
                    return countyCodes[0]
                }
                counties[1] -> {
                    return countyCodes[1]
                }
                counties[2] -> {
                    return countyCodes[2]
                }
                counties[3] -> {
                    return countyCodes[3]
                }
                counties[4] -> {
                    return countyCodes[4]
                }
                counties[5] -> {
                    return countyCodes[5]
                }
                counties[6] -> {
                    return countyCodes[6]
                }
                counties[7] -> {
                    return countyCodes[7]
                }
                counties[8] -> {
                    return countyCodes[8]
                }
                counties[9] -> {
                    return countyCodes[9]
                }
                counties[10] -> {
                    return countyCodes[10]
                }
                counties[11] -> {
                    return countyCodes[11]
                }
                counties[12] -> {
                    return countyCodes[12]
                }
                counties[13] -> {
                    return countyCodes[13]
                }
                counties[14] -> {
                    return countyCodes[14]
                }
                counties[15] -> {
                    return countyCodes[15]
                }
                counties[16] -> {
                    return countyCodes[16]
                }
                counties[17] -> {
                    return countyCodes[17]
                }
                counties[18] -> {
                    return countyCodes[18]
                }
                counties[19] -> {
                    return countyCodes[19]
                }
                counties[20] -> {
                    return countyCodes[20]
                }
                counties[21] -> {
                    return countyCodes[21]
                }
                counties[22] -> {
                    return countyCodes[22]
                }
                counties[23] -> {
                    return countyCodes[23]
                }
                counties[24] -> {
                    return countyCodes[24]
                }
                counties[25] -> {
                    return countyCodes[25]
                }
                counties[26] -> {
                    return countyCodes[26]
                }
                counties[27] -> {
                    return countyCodes[27]
                }
                counties[28] -> {
                    return countyCodes[28]
                }
                counties[29] -> {
                    return countyCodes[29]
                }
                counties[30] -> {
                    return countyCodes[30]
                }
                counties[31] -> {
                    return countyCodes[31]
                }
                counties[32] -> {
                    return countyCodes[32]
                }
                counties[33] -> {
                    return countyCodes[33]
                }
                counties[34] -> {
                    return countyCodes[34]
                }
                counties[35] -> {
                    return countyCodes[35]
                }
                counties[36] -> {
                    return countyCodes[36]
                }
                counties[37] -> {
                    return countyCodes[37]
                }
                counties[38] -> {
                    return countyCodes[38]
                }
                counties[39] -> {
                    return countyCodes[39]
                }
                counties[40] -> {
                    return countyCodes[40]
                }
                counties[41] -> {
                    return countyCodes[41]
                }
                counties[42] -> {
                    return countyCodes[42]
                }
                counties[43] -> {
                    return countyCodes[43]
                }
                counties[44] -> {
                    return countyCodes[44]
                }
                counties[45] -> {
                    return countyCodes[45]
                }
                counties[46] -> {
                    return countyCodes[46]
                }
                else -> {
                    "County Not Found"
                }
            }
        }

        fun getCountyName(countyCode: String): String {
            return when (countyCode) {
                countyCodes[0] -> {
                    return counties[0]
                }
                countyCodes[1] -> {
                    return counties[1]
                }
                countyCodes[2] -> {
                    return counties[2]
                }
                countyCodes[3] -> {
                    return counties[3]
                }
                countyCodes[4] -> {
                    return counties[4]
                }
                countyCodes[5] -> {
                    return counties[5]
                }
                countyCodes[6] -> {
                    return counties[6]
                }
                countyCodes[7] -> {
                    return counties[7]
                }
                countyCodes[8] -> {
                    return counties[8]
                }
                countyCodes[9] -> {
                    return counties[9]
                }
                countyCodes[10] -> {
                    return counties[10]
                }
                countyCodes[11] -> {
                    return counties[11]
                }
                countyCodes[12] -> {
                    return counties[12]
                }
                countyCodes[13] -> {
                    return counties[13]
                }
                countyCodes[14] -> {
                    return counties[14]
                }
                countyCodes[15] -> {
                    return counties[15]
                }
                countyCodes[16] -> {
                    return counties[16]
                }
                countyCodes[17] -> {
                    return counties[17]
                }
                countyCodes[18] -> {
                    return counties[18]
                }
                countyCodes[19] -> {
                    return counties[19]
                }
                countyCodes[20] -> {
                    return counties[20]
                }
                countyCodes[21] -> {
                    return counties[21]
                }
                countyCodes[22] -> {
                    return counties[22]
                }
                countyCodes[23] -> {
                    return counties[23]
                }
                countyCodes[24] -> {
                    return counties[24]
                }
                countyCodes[25] -> {
                    return counties[25]
                }
                countyCodes[26] -> {
                    return counties[26]
                }
                countyCodes[27] -> {
                    return counties[27]
                }
                countyCodes[28] -> {
                    return counties[28]
                }
                countyCodes[29] -> {
                    return counties[29]
                }
                countyCodes[30] -> {
                    return counties[30]
                }
                countyCodes[31] -> {
                    return counties[31]
                }
                countyCodes[32] -> {
                    return counties[32]
                }
                countyCodes[33] -> {
                    return counties[33]
                }
                countyCodes[34] -> {
                    return counties[34]
                }
                countyCodes[35] -> {
                    return counties[35]
                }
                countyCodes[36] -> {
                    return counties[36]
                }
                countyCodes[37] -> {
                    return counties[37]
                }
                counties[38] -> {
                    return counties[38]
                }
                countyCodes[39] -> {
                    return counties[39]
                }
                countyCodes[40] -> {
                    return counties[40]
                }
                countyCodes[41] -> {
                    return counties[41]
                }
                countyCodes[42] -> {
                    return counties[42]
                }
                countyCodes[43] -> {
                    return counties[43]
                }
                countyCodes[44] -> {
                    return counties[44]
                }
                countyCodes[45] -> {
                    return counties[45]
                }
                countyCodes[46] -> {
                    return counties[46]
                }
                else -> {
                    "County Not Found"
                }
            }
        }

        fun countiesWithCodes(): List<County> {
            return arrayListOf(
                County(counties[0], countyCodes[0]),
                County(counties[1], countyCodes[1]),
                County(counties[2], countyCodes[2]),
                County(counties[3], countyCodes[3]),
                County(counties[4], countyCodes[4]),
                County(counties[5], countyCodes[5]),
                County(counties[6], countyCodes[6]),
                County(counties[7], countyCodes[7]),
                County(counties[8], countyCodes[8]),
                County(counties[9], countyCodes[9]),
                County(counties[10], countyCodes[10]),
                County(counties[11], countyCodes[11]),
                County(counties[12], countyCodes[12]),
                County(counties[13], countyCodes[13]),
                County(counties[14], countyCodes[14]),
                County(counties[15], countyCodes[15]),
                County(counties[16], countyCodes[16]),
                County(counties[17], countyCodes[17]),
                County(counties[18], countyCodes[18]),
                County(counties[19], countyCodes[19]),
                County(counties[20], countyCodes[20]),
                County(counties[21], countyCodes[21]),
                County(counties[22], countyCodes[22]),
                County(counties[23], countyCodes[23]),
                County(counties[24], countyCodes[24]),
                County(counties[25], countyCodes[25]),
                County(counties[26], countyCodes[26]),
                County(counties[27], countyCodes[27]),
                County(counties[28], countyCodes[28]),
                County(counties[29], countyCodes[29]),
                County(counties[30], countyCodes[30]),
                County(counties[31], countyCodes[31]),
                County(counties[32], countyCodes[32]),
                County(counties[33], countyCodes[33]),
                County(counties[34], countyCodes[34]),
                County(counties[35], countyCodes[35]),
                County(counties[36], countyCodes[36]),
                County(counties[37], countyCodes[37]),
                County(counties[38], countyCodes[38]),
                County(counties[39], countyCodes[39]),
                County(counties[40], countyCodes[40]),
                County(counties[41], countyCodes[41]),
                County(counties[42], countyCodes[42]),
                County(counties[43], countyCodes[43]),
                County(counties[44], countyCodes[44]),
                County(counties[45], countyCodes[45]),
                County(counties[46], countyCodes[46])
            )
        }
    }
}