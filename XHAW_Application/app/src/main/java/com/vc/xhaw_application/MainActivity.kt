package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val headingTextView = findViewById<TextView>(R.id.headingTextView)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionTextView)
        val logoTextView = findViewById<TextView>(R.id.logoTextView)

        val menuButton = findViewById<Button>(R.id.menuButton)

        menuButton?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

    }
}