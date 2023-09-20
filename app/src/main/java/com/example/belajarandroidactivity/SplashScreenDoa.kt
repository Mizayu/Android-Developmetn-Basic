package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.coroutines.handleCoroutineException

class SplashScreenDoa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_doa)
        Handler().postDelayed({
            val intent = Intent(this,ListDoaActivity::class.java)
            startActivity(intent)

            finish()
        },5000)
    }
}