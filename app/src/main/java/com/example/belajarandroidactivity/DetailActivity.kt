package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val btnPindah: Button = findViewById(R.id.btnPindah)
        val btnShare: Button = findViewById(R.id.btnShare)

        btnPindah.setOnClickListener {
            val intent = Intent( this,DetailActivity::class.java)

        }
    }
}