package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SixMonth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_month)

        val menuButton4 = findViewById<Button>(R.id.menuButton4)

        val sixMonthHeading = findViewById<TextView>(R.id.sixMonthHeading)
        val textViewLongDuration = findViewById<TextView>(R.id.textViewLongDuration)
        val logoTextView5 = findViewById<TextView>(R.id.logoTextView5)
        val textViewFirstAidPic = findViewById<TextView>(R.id.textViewFirstAidPic)
        val textViewSewingPic = findViewById<TextView>(R.id.textViewSewingPic)
        val textViewLandscapingPic = findViewById<TextView>(R.id.textViewLandscapingPic)
        val textViewLifeSkillsPic = findViewById<TextView>(R.id.textViewLifeSkillsPic)
        val textViewFirstAid = findViewById<TextView>(R.id.textViewFirstAid)
        val textViewSewing = findViewById<TextView>(R.id.textViewSewing)
        val textViewLandscaping = findViewById<TextView>(R.id.textViewLandscaping)
        val textViewLifeSkills = findViewById<TextView>(R.id.textViewLifeSkills)




        menuButton4?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

    }
}