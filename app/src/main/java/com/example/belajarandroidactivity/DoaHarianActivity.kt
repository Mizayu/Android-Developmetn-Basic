package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val rvDoaHarian: RecyclerView = findViewById(R.id.rvDoaHarian)

        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Sholat Subuh", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرُ", "Alhamdulillahil ladzii qodzoo haajaati"),
            DoaHarian("Doa Sholat Dhuha", "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Alhamdulillahil ladzii qodzoo haajaati"),
            DoaHarian("Doa Sholat Maghrib", "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Alhamdulillahil ladzii qodzoo haajaati"),
            DoaHarian("Doa Sholat Subuh", "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Alhamdulillahil ladzii qodzoo haajaati"),
            DoaHarian("Doa Sholat Subuh", "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِ","Alhamdulillahil ladzii qodzoo haajaati"),
        )

        val adapter = DoaHarianAdapter(data)

        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false)
    }
}