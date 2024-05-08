package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Sewing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sewing)

        val logoTextView13 = findViewById<TextView>(R.id.logoTextView13)
        val sewingHead = findViewById<TextView>(R.id.sewingHead)
        val sewingPrice = findViewById<TextView>(R.id.sewingPrice)
        val sewingPurpose = findViewById<TextView>(R.id.sewingPurpose)
        val sewingContent = findViewById<TextView>(R.id.sewingContent)
        val sewingContent1 = findViewById<TextView>(R.id.sewingContent1)
        val sewingContent2 = findViewById<TextView>(R.id.sewingContent2)
        val sewingContent3 = findViewById<TextView>(R.id.sewingContent3)
        val sewingContent4 = findViewById<TextView>(R.id.sewingContent4)
        val sewingContent5 = findViewById<TextView>(R.id.sewingContent5)
        val sewingPic1 = findViewById<TextView>(R.id.sewingPic1)
        val sewingPic2 = findViewById<TextView>(R.id.sewingPic2)

        val menuButton12 = findViewById<Button>(R.id.menuButton12)
        val backButton = findViewById<Button>(R.id.backButton)

        menuButton12?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
        backButton?.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }
    }
}