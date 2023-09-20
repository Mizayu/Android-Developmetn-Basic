package com.example.belajarandroidactivity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView

class opencamera : AppCompatActivity() {

    var ibCamera:ImageButton?=null
    var ivSample:ImageView?=null
    val pic_id = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opencamera2)

        ibCamera = findViewById(R.id.ibCamera)
        ivSample = findViewById(R.id.ivsample)


        ibCamera!!.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }





    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
//        Jika nilai requestCode = pic_id
        if (requestCode == pic_id){
            val photo:Bitmap = data?.extras?.get("data") as Bitmap
//            Tampilkan gambar tipe bitmap pada ImageView kita
            ivSample!!.setImageBitmap(photo)
        }
    }
    private fun startActivityForResult() {
        TODO("Not yet implemented")
    }


}