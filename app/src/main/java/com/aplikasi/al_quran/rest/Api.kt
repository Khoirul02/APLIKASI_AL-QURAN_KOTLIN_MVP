package com.aplikasi.al_quran.rest

import com.aplikasi.al_quran.model.SurahResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @GET("surah")
    fun getSurah(): Call<SurahResponse>
}