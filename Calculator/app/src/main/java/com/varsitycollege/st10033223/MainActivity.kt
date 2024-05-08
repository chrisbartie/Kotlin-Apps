package com.varsitycollege.st10033223

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAddition = findViewById<Button>(R.id.buttonAddition)
        val buttonSubtraction = findViewById<Button>(R.id.buttonSubtraction)
        val buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        val buttonDivision = findViewById<Button>(R.id.buttonDivision)
        val buttonRoot = findViewById<Button>(R.id.buttonRoot)
        val buttonPower = findViewById<Button>(R.id.buttonPower)
        val buttonStats = findViewById<Button>(R.id.buttonStats)

        val editTextNumber1 = findViewById<EditText>(R.id.editTextNumber1)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)

        val textViewDisplay = findViewById<TextView>(R.id.textViewDisplay)
        val textViewAnswer = findViewById<TextView>(R.id.textViewAnswer)
        var textViewOperation = findViewById<TextView>(R.id.textViewOperation)
        val textViewDivError = findViewById<TextView>(R.id.textViewDivError)

        buttonStats?.setOnClickListener {
            val intent = Intent(this, Stats::class.java)
            startActivity(intent)
        }


        buttonAddition?.setOnClickListener {
          var  inputNumberOne = editTextNumber1.text.toString().toInt()
          var  inputNumberTwo = editTextNumber2.text.toString().toInt()
            /*The IIE, (2022)*/
            val answer: String
            val addition: Number
            addition = (inputNumberOne + inputNumberTwo)

            answer = "${inputNumberOne} + ${inputNumberTwo} = ${addition}"
            textViewOperation.text = answer
            textViewDivError.text = " "
        }

        buttonSubtraction?.setOnClickListener {
           var inputNumberOne = editTextNumber1.text.toString().toInt()
           var inputNumberTwo = editTextNumber2.text.toString().toInt()
            /*The IIE, (2022)*/
            val answer: String
            val subtraction: Number
            subtraction = (inputNumberOne - inputNumberTwo)

            answer = "${inputNumberOne} - ${inputNumberTwo} = ${subtraction}"
            textViewOperation.text = answer
            textViewDivError.text = " "
        }

        buttonDivision?.setOnClickListener {
            var inputNumberOne = editTextNumber1.text.toString().toInt()
            var inputNumberTwo = editTextNumber2.text.toString().toInt()
            /*The IIE, (2022)*/
            val answer: String = ""
            val division: Number


            if (inputNumberTwo == 0){
                textViewDivError.text = "You may not divide by zero."
                textViewOperation.text = " "
            }
            
            else{
            division = (inputNumberOne / inputNumberTwo)



            textViewOperation.text = "${inputNumberOne} / ${inputNumberTwo} = ${division}"
        }

        buttonMultiply?.setOnClickListener {
            var inputNumberOne = editTextNumber1.text.toString().toInt()
            var inputNumberTwo = editTextNumber2.text.toString().toInt()
            /*The IIE, (2022)*/
            val answer: String
            val multiply: Number

            multiply = (inputNumberOne * inputNumberTwo)

            answer = "${inputNumberOne} * ${inputNumberTwo} = ${multiply}"
            textViewOperation.text = answer

            textViewDivError.text = " "
        }

        buttonRoot?.setOnClickListener {
            var inputNumberOne = editTextNumber1.text.toString().toInt()
            /*The IIE, (2022)*/
            val answer: String
            var root: Number
            var number: Number

            if (inputNumberOne < 0){
                number = (inputNumberOne - inputNumberOne - inputNumberOne)
                root = Math.sqrt(number.toDouble())
                answer = "sqrt(${inputNumberOne}) = ${root}i"
                /*The IIE, (2022)*/
            }
            else{
                root = Math.sqrt(inputNumberOne.toDouble())
                answer = "sqrt(${inputNumberOne}) = ${root}"
                /*The IIE, (2022)*/
            }
            textViewOperation.text = answer

            textViewDivError.text = " "
        }

        buttonPower?.setOnClickListener {
            var inputNumberOne = editTextNumber1.text.toString().toInt()
            var inputNumberTwo = editTextNumber2.text.toString().toInt()
            var otherNum2 = editTextNumber2.text.toString().toInt()
            /*The IIE, (2022)*/
            val answer: String
            val power: Number

            var toPower : Long = 1

            while (inputNumberTwo != 0){
                toPower *= inputNumberOne.toLong()
                --inputNumberTwo
                /*The IIE, (2022)*/
            }
            textViewOperation.text = "${inputNumberOne} ^ ${otherNum2} = ${toPower}"

            textViewDivError.text = " "
        }


/*The IIE.2022.Introduction To Mobile Application Development [IMAD5112 Module Manual]. The Independent Institute of Education: Unpublished.*/


        }
    }
}




