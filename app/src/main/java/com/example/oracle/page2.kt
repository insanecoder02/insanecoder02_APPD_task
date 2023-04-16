package com.example.oracle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val lav = findViewById<ImageButton>(R.id.nex2)
        lav.setOnClickListener{
            val ish3 = Intent(this,page3::class.java)
            startActivity(ish3)
        }
    }
}