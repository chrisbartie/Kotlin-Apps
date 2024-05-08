package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Cooking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooking)

        val logoTextView7 = findViewById<TextView>(R.id.logoTextView7)
        val cookingHead = findViewById<TextView>(R.id.cookingHead)
        val cookingPrice = findViewById<TextView>(R.id.cookingPrice)
        val cookingPurpose = findViewById<TextView>(R.id.cookingPurpose)
        val cookingContent = findViewById<TextView>(R.id.cookingContent)
        val cookingContent1 = findViewById<TextView>(R.id.cookingContent1)
        val cookingContent2 = findViewById<TextView>(R.id.cookingContent2)
        val cookingContent3 = findViewById<TextView>(R.id.cookingContent3)
        val cookingContent4 = findViewById<TextView>(R.id.cookingContent4)
        val cookingPic1 = findViewById<TextView>(R.id.cookingPic1)
        val cookingPic2 = findViewById<TextView>(R.id.cookingPic2)

        val menuButton8 = findViewById<Button>(R.id.menuButton8)
        val backButton6 = findViewById<Button>(R.id.backButton6)

        menuButton8?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        backButton6?.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }
    }
}