package com.varsitycollege.st10033223

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Exception

class Stats : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)


        var number = arrayListOf<Int>(0,0,0,0,0,0,0,0,0,0)
        var counter = 0
        //The IIE, 2022

        val numberEditText1 = findViewById<EditText>(R.id.numberEditText1)


        val textViewAnswer = findViewById<TextView>(R.id.textViewAnswer)
        val statsHeading = findViewById<TextView>(R.id.statsHeading)
        val textViewMemory = findViewById<TextView>(R.id.textViewMemory)
        val textViewNumMem = findViewById<TextView>(R.id.textViewNumMem)
        val errorDisplay = findViewById<TextView>(R.id.errorDisplay)
        val textViewAnswer2 = findViewById<TextView>(R.id.textViewAnswer2)

        val minMaxButton = findViewById<Button>(R.id.minMaxButton)
        val averageButton = findViewById<Button>(R.id.averageButton)
        val buttonClear1 = findViewById<Button>(R.id.buttonClear1)
        val buttonAddNum = findViewById<Button>(R.id.buttonAddNum)
        val buttonBack = findViewById<Button>(R.id.buttonBack)

        buttonBack?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        buttonAddNum?.setOnClickListener {
            try {
                var numInput = Integer.valueOf(numberEditText1.text.toString())
                var valDisp = ""
                errorDisplay.text = ""
                var count = 0
                if (counter < 10) {
                    number[counter] = numInput
                    counter ++
                    while (count <= 9) {
                        valDisp += "${number[count]},"
                        count++
                    }
                    //Stackoverflow, 2019
                    textViewNumMem.text = valDisp.subSequence(0, counter*2)
                }else{
                    errorDisplay.text = "You may not add more than 10 numbers"
                }
            } catch(e : Exception){
                errorDisplay.text = "Please enter a valid number"
            }
            //Stackoverflow, 2019
        }

        buttonClear1?.setOnClickListener {
            var count = 0
            var temp = 0

            while (count < 10){
                number[count] = temp
                count++
            }
            counter = 0
            textViewNumMem.text = ""

                }
        //The IIE, 2022

        averageButton?.setOnClickListener {

            var sum = 0
            var totalNumbers = number.count()
            var averageNumber = 0

            if(totalNumbers > 0) {
                for (e in number) {
                    sum += e
                }

                averageNumber = sum / totalNumbers
            }

            textViewAnswer2.setText("The average is ${averageNumber}");
            //The IIE, 2022
        }

        minMaxButton?.setOnClickListener {
            var totalNumbers = number.count()

            var displayText = "No min, no max"
            if(totalNumbers > 0) {
                var min = number[0]
                var max = number[0]

                for (e in number) {
                    if (number.indexOf(e) <= counter-1){
                         if (e < min ) {
                              min = e
                       }

                    if (e > max ) {
                        max = e
                        //The IIE, 2022
                    }
                    }
                }

                displayText = "The MIN is ${min} and the MAX is ${max}"
            }

            textViewAnswer2.setText(displayText);
        }
    }

    }

/*The IIE.2022.Introduction To Mobile Application Development [IMAD5112 Module Manual]. The Independent Institute of Education: Unpublished.*/
/*Stackoverflow. 2019. How to add try/catch in kotlin code using android studio? [n.d.]. [Online]. Available at: https://stackoverflow.com/questions/57072354/how-to-add-try-catch-in-kotlin-code-using-android-studio [Accessed 7 November 2022] */

