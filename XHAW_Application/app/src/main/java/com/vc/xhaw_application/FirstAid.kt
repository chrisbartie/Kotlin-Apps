package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstAid : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_aid)

        val logoTextView12 = findViewById<TextView>(R.id.logoTextView12)
        val firstAidHead = findViewById<TextView>(R.id.firstAidHead)
        val firstAidPrice = findViewById<TextView>(R.id.firstAidPrice)
        val firstAidPurpose = findViewById<TextView>(R.id.firstAidPurpose)
        val firstAidContent = findViewById<TextView>(R.id.firstAidContent)
        val firstAidContent1 = findViewById<TextView>(R.id.firstAidContent1)
        val firstAidContent2 = findViewById<TextView>(R.id.firstAidContent2)
        val firstAidContent3 = findViewById<TextView>(R.id.firstAidContent3)
        val firstAidContent4 = findViewById<TextView>(R.id.firstAidContent4)
        val firstAidContent5 = findViewById<TextView>(R.id.firstAidContent5)
        val firstAidPic1 = findViewById<TextView>(R.id.firstAidPic1)
        val firstAidPic2 = findViewById<TextView>(R.id.firstAidPic2)

        val menuButton11 = findViewById<Button>(R.id.menuButton11)
        val backButton5 = findViewById<Button>(R.id.backButton5)

        menuButton11?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        backButton5?.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }
    }
}