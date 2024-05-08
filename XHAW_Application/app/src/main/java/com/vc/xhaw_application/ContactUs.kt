package com.vc.xhaw_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ContactUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        val contactHeading = findViewById<TextView>(R.id.contactHeading)
        val logoTextView6 = findViewById<TextView>(R.id.logoTextView6)
        val contactName = findViewById<TextView>(R.id.contactName)
        val numberTextView = findViewById<TextView>(R.id.numberTextView)
        val emailTextView = findViewById<TextView>(R.id.emailTextView)

        val nameEdit = findViewById<EditText>(R.id.nameEdit)
        val numberEdit = findViewById<EditText>(R.id.numberEdit)
        val emailEdit = findViewById<EditText>(R.id.emailEdit)

        val menuButton5 = findViewById<Button>(R.id.menuButton5)
        val submitButton = findViewById<Button>(R.id.submitButton)

        menuButton5?.setOnClickListener{
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }


    }
}