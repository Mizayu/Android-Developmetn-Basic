package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaAcitivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama_acitivity)
//        Define array adapter
        val arrayAdapter:ArrayAdapter<*>
        val users = arrayOf(
            "Python","C#","C++","JavaScript","PHP","Swift","Java","Go","SQL","Ruby"
        )
//        Deklarasikan variabel
        var mListView: ListView = findViewById(R.id.lvNama)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,users
        )
        mListView.adapter = arrayAdapter
    }
}