package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val bn = findViewById<Button>(R.id.btn_website)

        bn.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://zalegoacademy.ac.ke/"))
            startActivity(i)
        }


        val buttonClick =findViewById<Button>(R.id.btn_page)
        buttonClick.setOnClickListener {
            val intent =Intent(this, color::class.java)
            startActivity(intent)
            finish()
        }

    }
}