package com.example.stud
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the views

        val editTextPassword = findViewById<EditText>(R.id.editTextPassword)
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        // Handle login button click
        buttonLogin.setOnClickListener {
            val password = editTextPassword.text.toString()

            // Validate credentials (you can add your logic here)
            if (isValidCredentials(password)) {
                // Navigate to the next screen (e.g., home screen)
                // You can start a new activity or fragment here
            } else {
                // Show an error message (e.g., invalid credentials)
                // For example: Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {
        // Implement your validation logic (e.g., check against a database)
        // For demonstration purposes, let's assume valid credentials
        return true
    }
}
