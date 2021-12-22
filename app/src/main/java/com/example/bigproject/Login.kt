package com.example.bigproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener {
            val intent = Intent(this@Login, menu::class.java)
            val user = username.text.toString()
            val pass = password.text.toString()
            if (user == "admin" && pass == "admin"){
                startActivity(intent)
            }
        }
    }
}