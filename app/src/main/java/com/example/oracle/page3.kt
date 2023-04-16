package com.example.oracle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class page3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)

        val kes = findViewById<ImageButton>(R.id.nex3)
        val gau = findViewById<ImageButton>(R.id.ex)
        kes.setOnClickListener {
            val ish4 = Intent(this, page1::class.java)
            startActivity(ish4)
        }
        gau.setOnClickListener {
            val ish5 = Intent(this, MainActivity::class.java)
            startActivity(ish5)
        }

    }
}