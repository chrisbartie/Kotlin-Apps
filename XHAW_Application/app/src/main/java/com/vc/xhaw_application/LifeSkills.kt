package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LifeSkills : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_skills)

        val logoTextView15 = findViewById<TextView>(R.id.logoTextView15)
        val lifeSkillsHead = findViewById<TextView>(R.id.lifeSkillsHead)
        val lifeSkillsPrice = findViewById<TextView>(R.id.lifeSkillsPrice)
        val lifeSkillsPurpose = findViewById<TextView>(R.id.lifeSkillsPurpose)
        val lifeSkillsContent = findViewById<TextView>(R.id.lifeSkillsContent)
        val lifeSkillsContent1 = findViewById<TextView>(R.id.lifeSkillsContent1)
        val lifeSkillsContent2 = findViewById<TextView>(R.id.lifeSkillsContent2)
        val lifeSkillsContent3 = findViewById<TextView>(R.id.lifeSkillsContent3)
        val lifeSkillsContent4 = findViewById<TextView>(R.id.lifeSkillsContent4)
        val lifeSkillsPic1 = findViewById<TextView>(R.id.lifeSkillsPic1)
        val lifeSkillsPic2 = findViewById<TextView>(R.id.lifeSkillsPic2)

        val menuButton14 = findViewById<Button>(R.id.menuButton14)
        val backButton2 = findViewById<Button>(R.id.backButton2)

        menuButton14?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        backButton2?.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }

    }
}