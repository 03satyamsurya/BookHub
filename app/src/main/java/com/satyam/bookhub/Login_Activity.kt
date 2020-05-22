package com.satyam.bookhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnlogin = findViewById(R.id.btnlogin) as Button
        btnlogin.setOnClickListener {


            val i = Intent(this@Login_Activity, Home_Activity::class.java)

            startActivity(i)
        }

    }
}
