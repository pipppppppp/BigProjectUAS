package com.example.bigproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sscreen)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(this@SScreen,
                    Login::class.java)
            )
            finish()
        }, 3000)
    }

}