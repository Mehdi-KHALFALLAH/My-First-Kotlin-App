package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

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

        btnclickme.setOnClickListener {
            count += 1
            text.text = count.toString()
            Toast.makeText(this, "hey I'm a Toast!", Toast.LENGTH_LONG).show()


        }

    }
}