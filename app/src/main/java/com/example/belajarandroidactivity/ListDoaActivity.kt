package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.LanguageAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.Language

class ListDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_doa)
        val rvDoa:RecyclerView = findViewById(R.id.rvDoa)

        val data = arrayListOf<Doa>(
            Doa("Doa Sholat Subuh", R.drawable.doa),
            Doa("Doa Sholat Dhuha", R.drawable.doa),
            Doa("Doa Sholat Maghrib", R.drawable.doa),
            Doa("Doa Sholat Subuh", R.drawable.doa),
            Doa("Doa Sholat Subuh", R.drawable.doa),
        )
val tvSelengkapnya:CardView = findViewById(R.id.tvSelengkapnya)
        val adapter = DoaAdapter(data)

        rvDoa.adapter = adapter
        rvDoa.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false)

        tvSelengkapnya.setOnClickListener {
            val intent = Intent(this, DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
}

