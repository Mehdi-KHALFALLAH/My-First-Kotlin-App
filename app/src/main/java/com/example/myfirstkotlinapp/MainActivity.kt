package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnclickme = findViewById<Button>(R.id.ClickMe)
        val btndecrease = findViewById<Button>(R.id.buttonDecrease)
        val text = findViewById<TextView>(R.id.textView2)
        val textDecrease = findViewById<TextView>(R.id.textDecrease)
        var count = 0
        var uncount = 0
        btndecrease.setOnClickListener {
            textDecrease.text = uncount.toString()
            uncount +=  1

        }
        btnclickme.setOnClickListener {

            text.text = count.toString()
            count += 1

        }

    }
}