package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val homeButton = findViewById<Button>(R.id.homeButton)
        val feesButton = findViewById<Button>(R.id.feesButton)
        val contactButton = findViewById<Button>(R.id.contactButton)
        val longButton = findViewById<Button>(R.id.longButton)
        val shortButton = findViewById<Button>(R.id.shortButton)
        val coursesButton = findViewById<Button>(R.id.coursesButton)

        homeButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        feesButton?.setOnClickListener {
            val intent = Intent(this, TotalFees::class.java)
            startActivity(intent)

            }
        shortButton?.setOnClickListener {
            val intent = Intent(this, SixWeek::class.java)
            startActivity(intent)

        }
        longButton?.setOnClickListener {
            val intent = Intent(this, SixMonth::class.java)
            startActivity(intent)
        }
        contactButton?.setOnClickListener {
            val intent = Intent( this, ContactUs::class.java)
            startActivity(intent)
        }
        coursesButton?.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }


    }
}

