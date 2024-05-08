package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class GardenMaintenance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garden_maintenance)

        val logoTextView11 = findViewById<TextView>(R.id.logoTextView11)
        val maintenanceHead1 = findViewById<TextView>(R.id.maintenanceHead1)
        val maintenancePrice = findViewById<TextView>(R.id.maintenancePrice)
        val maintenancePurpose = findViewById<TextView>(R.id.maintenancePurpose)
        val maintenanceContent = findViewById<TextView>(R.id.maintenanceContent)
        val maintenanceContent1 = findViewById<TextView>(R.id.maintenanceContent1)
        val maintenanceContent2 = findViewById<TextView>(R.id.maintenanceContent2)
        val maintenanceContent3 = findViewById<TextView>(R.id.maintenanceContent3)
        val maintenancePic1 = findViewById<TextView>(R.id.maintenancePic1)
        val maintenancePic2 = findViewById<TextView>(R.id.maintenancePic2)

        val menuButton10 = findViewById<Button>(R.id.menuButton10)
        val backButton4 = findViewById<Button>(R.id.backButton4)

        menuButton10?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        backButton4?.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }
    }
}