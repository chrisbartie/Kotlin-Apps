package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Courses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val logoTextView8 = findViewById<TextView>(R.id.logoTextView8)
        val shortHead2 = findViewById<TextView>(R.id.shortHead2)
        val sixMonthHead2 = findViewById<TextView>(R.id.sixMonthHead2)

        val menuButton7 = findViewById<Button>(R.id.menuButton7)
        val childMindingButton = findViewById<Button>(R.id.childMindingButton)
        val cookingButton = findViewById<Button>(R.id.cookingButton)
        val maintenanceButton = findViewById<Button>(R.id.maintenanceButton)
        val firstAidButton = findViewById<Button>(R.id.firstAidButton)
        val sewingButton = findViewById<Button>(R.id.sewingButton)
        val landscapingButton = findViewById<Button>(R.id.landscapingButton)
        val lifeSkillsButton = findViewById<Button>(R.id.lifeSkillsButton)

        menuButton7?.setOnClickListener {
            val intent = Intent (this, Menu::class.java)
            startActivity(intent)
        }

        childMindingButton?.setOnClickListener {
            val intent = Intent(this, ChildMinding::class.java)
            startActivity(intent)
        }

        cookingButton?.setOnClickListener {
            val intent = Intent(this, Cooking::class.java)
            startActivity(intent)
        }

        maintenanceButton?.setOnClickListener {
            val intent = Intent(this, GardenMaintenance::class.java)
            startActivity(intent)
        }

        firstAidButton?.setOnClickListener {
            val intent = Intent(this, FirstAid::class.java)
            startActivity(intent)
        }

        sewingButton?.setOnClickListener {
            val intent = Intent(this, Sewing::class.java)
            startActivity(intent)
        }

        landscapingButton?.setOnClickListener {
            val intent = Intent(this, Landscaping::class.java)
            startActivity(intent)
        }

        lifeSkillsButton?.setOnClickListener {
            val intent = Intent(this, LifeSkills::class.java)
            startActivity(intent)
        }

    }
}