package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ChildMinding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_minding)


        val childMindingHead =  findViewById<TextView>(R.id.childMindingHead)
        val logoTextView7 = findViewById<TextView>(R.id.logoTextView7)
        val childMindingPrice = findViewById<TextView>(R.id.childMindingPrice)
        val childMindingPurpose = findViewById<TextView>(R.id.childMindingPurpose)
        val childMindingContent = findViewById<TextView>(R.id.childMindingContent)
        val childMindingContent2 = findViewById<TextView>(R.id.childMindingContent2)
        val childMindingContent3 = findViewById<TextView>(R.id.childMindingContent3)
        val childMindingContent4 = findViewById<TextView>(R.id.childMindingContent4)
        val childMindingContent5 = findViewById<TextView>(R.id.childMindingContent5)
        val childMindingPic1 = findViewById<TextView>(R.id.childMindingPic1)
        val childMindingPic2 = findViewById<TextView>(R.id.childMindingPic2)



        val menuButton6 = findViewById<Button>(R.id.menuButton6)
        val backButton7 = findViewById<Button>(R.id.backButton7)

        menuButton6?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

        backButton7?.setOnClickListener {
            val intent = Intent(this, Courses::class.java)
            startActivity(intent)
        }
    }
}