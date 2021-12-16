package com.aplikasi.al_quran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.aplikasi.al_quran.adapter.SurahAdapter
import com.aplikasi.al_quran.model.DataSurahItem
import com.aplikasi.al_quran.presenter.SurahPresenter
import com.aplikasi.al_quran.presenter.SurahView
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("UNCHECKED_CAST")
class MainActivity : AppCompatActivity(), SurahView {
    private lateinit var surahAdapter : SurahAdapter
    private lateinit var surahPresenter: SurahPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        surahPresenter = SurahPresenter(this)
        surahPresenter.getDataSurah()
    }

    override fun onDataCompleteFromApi(surah: List<DataSurahItem>) {
        surahAdapter = SurahAdapter(surah as ArrayList<DataSurahItem>)
        recycler_view.apply {
            layoutManager =LinearLayoutManager(this@MainActivity)
            adapter = surahAdapter
        }
    }

    override fun onDataErrorFromApi(throwable: Throwable?) {
        Toast.makeText(this, "Tidak ada respon $throwable", Toast.LENGTH_LONG).show()
        error("Tidak ada respon: ${throwable?.localizedMessage}")
    }
}
