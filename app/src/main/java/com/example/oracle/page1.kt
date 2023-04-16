package com.example.oracle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        val ish = findViewById<ImageButton>(R.id.nex1)
        ish.setOnClickListener{
            val ish2 = Intent(this,page2::class.java)
            startActivity(ish2)
        }

    }
}