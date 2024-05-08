package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SixWeek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_week)

        val shortCourseTextView = findViewById<TextView>(R.id.shortCourseTextView)
        val menuButton2 = findViewById<Button>(R.id.menuButton2)
        val textViewShortDuration = findViewById<TextView>(R.id.textViewShortDuration)
        val logoTextView3 = findViewById<TextView>(R.id.logoTextView3)
        val textViewChildMindingPic = findViewById<TextView>(R.id.textViewChildMindingPic)
        val textViewCookingPic = findViewById<TextView>(R.id.textViewCookingPic)
        val textViewGardenMaintenancePic = findViewById<TextView>(R.id.textViewGardenMaintenancePic)
        val textViewChildMinding = findViewById<TextView>(R.id.textViewChildMinding)
        val textViewGardenMaintenance = findViewById<TextView>(R.id.textViewGardenMaintenance)
        val textViewCooking = findViewById<TextView>(R.id.textViewCooking)


        menuButton2?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

    }
}