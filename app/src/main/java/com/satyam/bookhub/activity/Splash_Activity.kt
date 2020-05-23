package com.satyam.bookhub.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.satyam.bookhub.R

class Splash_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_)
        Handler().postDelayed(
            {
                val i = Intent(this@Splash_Activity, Login_Activity::class.java)
                startActivity(i)
                finish()
            }, 2000)
    }
}
