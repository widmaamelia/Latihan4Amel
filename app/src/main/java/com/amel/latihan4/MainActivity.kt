package com.amel.latihan4

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var forgotPassword : TextView
    private lateinit var signUp : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        forgotPassword = findViewById(R.id.forgotPassword)
        signUp = findViewById(R.id.signUp)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        forgotPassword.setOnClickListener() {
            var intent = Intent(this@MainActivity, forgotPassword::class.java)
            startActivity(intent)
        }

        signUp.setOnClickListener() {
            var intent2 = Intent(this@MainActivity, signUp::class.java)
            startActivity(intent2)
        }

    }
}