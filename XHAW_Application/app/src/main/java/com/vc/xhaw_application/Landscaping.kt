package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Landscaping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landscaping)

        val logoTextView14 = findViewById<TextView>(R.id.logoTextView14)
        val landscapingHead = findViewById<TextView>(R.id.landscapingHead)
        val landscapingPrice = findViewById<TextView>(R.id.landscapingPrice)
        val landscapingPurpose = findViewById<TextView>(R.id.landscapingPurpose)
        val landscapingContent = findViewById<TextView>(R.id.landscapingContent)
        val landscapingContent1 = findViewById<TextView>(R.id.landscapingContent1)
        val landscapingContent2 = findViewById<TextView>(R.id.landscapingContent2)
        val landscapingContent3 = findViewById<TextView>(R.id.landscapingContent3)
        val landscapingContent4 = findViewById<TextView>(R.id.landscapingContent4)
        val landscapingContent5 = findViewById<TextView>(R.id.landscapingContent5)
        val landscapingPic1 = findViewById<TextView>(R.id.landscapingPic1)
        val landscapingPic2 = findViewById<TextView>(R.id.landscapingPic2)

        val menuButton13 = findViewById<Button>(R.id.menuButton13)
        val backButton3 = findViewById<Button>(R.id.backButton3)

        menuButton13?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        backButton3?.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }
    }
}