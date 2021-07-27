package com.example.study

import android.icu.number.Precision.integer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val rollButton: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)


        val resetButton: Button = findViewById(R.id.reset_button)
        //val countButton: Button = findViewById(R.id.count_button)

        rollButton.setOnClickListener{ rollDice() }
        resetButton.setOnClickListener { reset() }
        //countButton.setOnClickListener{ addOne() }



    }

    private fun getRandomDiceImage() : Int{
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
        return drawableResource
    }

    private fun rollDice(){
        //val randomInt = (1..6).random()
        //val diceImage: ImageView = findViewById(R.id.dice_image)

        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        //Toast.makeText(this, "button_clicked", Toast.LENGTH_SHORT).show()
    }


    private fun reset(){
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }

    /*private fun addOne(){
        val resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text == "Hello world!"){
            resultText.text = "1"
        }else
        if(resultText.text == "6"){

        }else{
            val aux = resultText.text.toString().toInt() + 1
            resultText.text = aux.toString()
        }
    }
    */
}