package com.example.radiobutton

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.RelativeLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val radio = findViewById<RadioGroup>(R.id.radioGroup) as RadioGroup
        val background = findViewById<LinearLayout>(R.id.back) as LinearLayout

        radio.setOnCheckedChangeListener { group, checkedId ->
            when(checkedId){
                R.id.red ->{
                    background.setBackgroundColor(Color.parseColor("#FF0000"))
                }
                R.id.green ->{
                    background.setBackgroundColor(Color.parseColor("#00FF00"))
                }
                R.id.blue ->{
                    background.setBackgroundColor(Color.parseColor("#0000FF"))
                }
            }
        }
    }
}