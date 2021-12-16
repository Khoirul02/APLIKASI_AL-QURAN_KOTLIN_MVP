package com.aplikasi.al_quran.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aplikasi.al_quran.R
import com.aplikasi.al_quran.model.DataSurahItem

class SurahAdapter(val data : ArrayList<DataSurahItem>) : RecyclerView.Adapter<SurahAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurahAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_surah, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: SurahAdapter.ViewHolder, position: Int) {
        val data = data[position]
        holder.surah.text = "Surah " +data.englishName
        holder.deskripsiSurah.text = "Surah diturunkan di " + data.revelationType
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val surah : TextView = itemView.findViewById(R.id.tv_list_surah)
        val deskripsiSurah : TextView = itemView.findViewById(R.id.tv_list_deskripsi_surah)
    }

}