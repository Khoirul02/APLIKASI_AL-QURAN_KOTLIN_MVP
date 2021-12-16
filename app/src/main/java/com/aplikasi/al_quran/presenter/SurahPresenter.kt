package com.aplikasi.al_quran.presenter

import android.content.Context
import com.aplikasi.al_quran.model.DataSurahItem
import com.aplikasi.al_quran.model.SurahResponse
import com.aplikasi.al_quran.rest.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Suppress("UNCHECKED_CAST")
class SurahPresenter(context: Context) {
    private var surahView = context as SurahView
    fun getDataSurah(){
        RetrofitClient.instance.getSurah()
            .enqueue(object : Callback<SurahResponse>{
                override fun onResponse(
                    call: Call<SurahResponse>,
                    response: Response<SurahResponse>
                ) {
                    if(response.isSuccessful){
                        surahView.onDataCompleteFromApi(response.body()?.data as List<DataSurahItem>)
                    }
                }
                override fun onFailure(call: Call<SurahResponse>, t: Throwable) {
                    surahView.onDataErrorFromApi(t)
                }
            })
    }
}