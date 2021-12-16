package com.aplikasi.al_quran.presenter
import com.aplikasi.al_quran.model.DataSurahItem

interface SurahView {
    fun onDataCompleteFromApi(surah: List<DataSurahItem>)
    fun onDataErrorFromApi(throwable: Throwable?)
}