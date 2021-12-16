package com.aplikasi.al_quran.model

import com.google.gson.annotations.SerializedName

data class SurahResponse(

	@field:SerializedName("code")
	val code: Int? = null,

	@field:SerializedName("data")
	val data: List<DataSurahItem?>? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class DataSurahItem(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("englishName")
	val englishName: String? = null,

	@field:SerializedName("numberOfAyahs")
	val numberOfAyahs: Int? = null,

	@field:SerializedName("revelationType")
	val revelationType: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("englishNameTranslation")
	val englishNameTranslation: String? = null
)
