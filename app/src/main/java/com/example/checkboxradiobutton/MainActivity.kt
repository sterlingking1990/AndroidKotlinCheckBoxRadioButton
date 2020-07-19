package com.example.checkboxradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View.VISIBLE
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOrder.setOnClickListener{
            var checkedOptionId=rgChoice.checkedRadioButtonId
            var selectedOpton=findViewById<RadioButton>(checkedOptionId)
            var onion:Boolean=chkOnion.isChecked
            var cheese:Boolean=chkCheese.isChecked
            var salad:Boolean=chkSalad.isChecked
            tvOrder.visibility= VISIBLE
            tvOrder.text="You ordered the following \n " +
            "${selectedOpton.text.toString()}" +
                    (if(onion) "\nOnion" else "") +
                    (if(cheese) "\nCheese" else "") +
                    (if(salad) "\nSalad" else "")
        }


    }
}