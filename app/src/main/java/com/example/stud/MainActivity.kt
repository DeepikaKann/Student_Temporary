package com.example.stud
import android.content.Intent
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLoginFront: Button = findViewById(R.id.buttonLogin)
        val tvSignup: TextView = findViewById(R.id.textViewSignUp)

        btnLoginFront.setOnClickListener {
            val intent = Intent(this, SigninPage::class.java)
            startActivity(intent)
        }

        tvSignup.setOnClickListener {
            val intent = Intent(this, signuppage::class.java)
            startActivity(intent)
        }
    }
}
