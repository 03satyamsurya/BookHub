package com.satyam.bookhub.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.satyam.bookhub.R

class Login_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnlogin = findViewById(R.id.btnlogin) as Button
        val register = findViewById(R.id.register) as TextView
        btnlogin.setOnClickListener {
            val i = Intent(this@Login_Activity, Home_Activity::class.java)
            startActivity(i)
        }
        register.setOnClickListener(){
            val i = Intent(this@Login_Activity, Register::class.java)
        }

    }
}
