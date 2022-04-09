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
        val text = findViewById<TextView>(R.id.textView2)
        var count = 0
        btnclickme.setOnClickListener {

            text.text = count.toString()
            count += 1
        }
    }
}