package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val judulForm: TextView = findViewById(R.id.judulForm)
        val labelNama: TextView = findViewById(R.id.labelNama)
        val inputNama: TextView = findViewById(R.id.inputNama)
        val labelKelas: TextView = findViewById(R.id.labelKelas)
        val inputKelas: TextView = findViewById(R.id.inputKelas)
        val labelBuku: TextView = findViewById(R.id.labelBuku)
        val inputBuku: TextView = findViewById(R.id.inputBuku)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)
        val tampilKelas: TextView = findViewById(R.id.tampilKelas)
        val tampilNama: TextView = findViewById(R.id.tampilNama)
        val tampilBuku: TextView = findViewById(R.id.tampilBuku)

        btnSubmit.setOnClickListener {
            Toast.makeText(this,"Kamu Meminjam ${tampilBuku.text}",
                Toast.LENGTH_SHORT).show();
            tampilNama.text=inputNama.text
            tampilKelas.text=inputKelas.text
            tampilBuku.text=inputBuku.text
            val code:Int = inputBuku.text.toString().toInt()

            when(code) {
                123 -> tampilBuku.text = "Harry Porter"
                456 -> tampilBuku.text = "Alice in Wonderland"
                789 -> tampilBuku.text = "sutanto"

            }
        }


    }
}