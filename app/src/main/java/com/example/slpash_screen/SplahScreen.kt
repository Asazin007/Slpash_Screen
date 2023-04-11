package com.example.slpash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView


lateinit var img: ImageView
class SplahScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah_screen)

        img=findViewById(R.id.imageView)
        var handler = Handler();
        handler.postDelayed({
            val intent= Intent(this,MainActivity::class.java)
            startActivity((intent))
            finish()
        },2500)
    }
}