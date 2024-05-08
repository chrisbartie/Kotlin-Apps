package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class TotalFees : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_total_fees)

        val menuButton3 = findViewById<Button>(R.id.menuButton3)

        val checkBoxCooking = findViewById<CheckBox>(R.id.checkBoxCooking)
        val checkBoxGardenMaintenance = findViewById<CheckBox>(R.id.checkBoxGardenMaintenance)
        val checkBoxChildMinding = findViewById<CheckBox>(R.id.checkBoxChildMinding)
        val checkBoxLifeSkills = findViewById<CheckBox>(R.id.checkBoxLifeSkills)
        val checkBoxLandscaping = findViewById<CheckBox>(R.id.checkBoxLandscaping)
        val checkBoxSewing = findViewById<CheckBox>(R.id.checkBoxSewing)
        val checkBoxFirstAid = findViewById<CheckBox>(R.id.checkBoxFirstAid)

        val textViewOneDiscount = findViewById<TextView>(R.id.textViewOneDiscount)
        val textViewTwoDiscount = findViewById<TextView>(R.id.textViewTwoDiscount)
        val textViewThreeDiscount = findViewById<TextView>(R.id.textViewThreeDiscount)
        val textViewMoreDiscount = findViewById<TextView>(R.id.durationTextView)
        val logoTextView = findViewById<TextView>(R.id.logoTextView)
        val sixMonthHead = findViewById<TextView>(R.id.sixMonthHead)
        val sixWeekHead = findViewById<TextView>(R.id.sixWeekHead)
        val priceTextView = findViewById<TextView>(R.id.priceTextView)
        val priceTextView1 = findViewById<TextView>(R.id.priceTextView1)
        val durationTextView = findViewById<TextView>(R.id.durationTextView)
        val feesHeadTextView = findViewById<TextView>(R.id.priceTextView1)



        menuButton3?.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}
