package com.example.oracle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sn = findViewById<Button>(R.id.sn)
        val ary = findViewById<EditText>(R.id.roll)
        val tiy = findViewById<EditText>(R.id.pass)
        val osh = findViewById<TextView>(R.id.forg)

        osh.setOnClickListener{
            Toast.makeText(this, "I Don't Care", Toast.LENGTH_SHORT).show()
        }
        ary.setOnClickListener{
            ary.text = null
        }
        tiy.setOnClickListener {
            tiy.text = null
        }
        sn.setOnClickListener{
            val nan :String = ary.text.toString()
            val ast :String = tiy.text.toString()

            if(nan==null && ast!= null){
                Toast.makeText(this, "Enter Roll No.", Toast.LENGTH_SHORT).show()
            }
            else if(ast == null && nan!=null){
                Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show()
            }
            else if(nan == null && ast == null){
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            }
            else if(nan=="Roll no." || ast=="Password"){
                Toast.makeText(this, "Please enter Your Credentials", Toast.LENGTH_SHORT).show()
            }
            else{
                val ish1 = Intent(this,page1::class.java)
                startActivity(ish1)
            }

        }




        }
}