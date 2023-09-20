package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Language

class ListPemrogramanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)
        val rvBahasaPemograman:RecyclerView = findViewById(R.id.rvBahasaPemrograman)

        val data = arrayListOf<Language>(
            Language("Golang", R.drawable.golang),
            Language("C++", R.drawable.golang),
            Language("Kotlin", R.drawable.golang),
            Language("JavaScript", R.drawable.golang),
            Language("Ruby", R.drawable.golang),
        )

        val adapter = LanguageAdapter(data)

        rvBahasaPemograman.adapter = adapter
        rvBahasaPemograman.layoutManager =
            LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
    }
}