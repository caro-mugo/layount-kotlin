package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BMIcalculatoractivity: AppCompatActivity() {
    lateinit var btnsendMoney: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicalculatoractivity)
        btnsendMoney= findViewById(R.id.btnsendMoney)
        btnsendMoney.setOnClickListener {
            val intent = Intent(this, mainActivitymoney::class.java)
            startActivity(intent)

        }
    }
}