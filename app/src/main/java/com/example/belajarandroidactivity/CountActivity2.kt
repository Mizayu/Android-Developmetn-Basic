package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count2)

        val tvNumber: TextView = findViewById(R.id.tvNumber)
        val btnCount: Button = findViewById(R.id.btnCount)
        val btnReset: Button = findViewById(R.id.btnReset)
        val btnMinus: Button = findViewById(R.id.btnMinus)

        // setText = fungsi mengisi text

        tvNumber.text = "0"

//        getText = mengambil text

        println(tvNumber.text)
        Log.d("Number", "Hasilnya: ${tvNumber.text} ")

//        action
        btnCount.setOnClickListener {
//            bikin variabel nilainya berubah
//            ambil text lalu konversi dari string ke integer
            var countInteger: Int =tvNumber.text.toString().toInt()
            countInteger++

            tvNumber.text= countInteger.toInt().toString()



        }
        btnReset.setOnClickListener {
//            bikin variabel nilainya berubah
//            ambil text lalu konversi dari string ke integer
            var resetInteger: Int =tvNumber.text.toString().toInt()
            resetInteger=0

            tvNumber.text= resetInteger.toInt().toString()



        }
        btnMinus.setOnClickListener {
//            bikin variabel nilainya berubah
//            ambil text lalu konversi dari string ke integer
            var minusInteger: Int =tvNumber.text.toString().toInt()
            minusInteger--

            tvNumber.text= minusInteger.toInt().toString()



        }
    }
}