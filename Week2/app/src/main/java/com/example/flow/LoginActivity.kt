package com.example.flow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        supportActionBar?.hide()
        val btnLogIn = findViewById<Button>(R.id.buttonLogIn)
        btnLogIn.setOnClickListener{
            var inputPass = findViewById<EditText>(R.id.inputPassword).text.toString()
            var inputEmail = findViewById<EditText>(R.id.inputEmail).text.toString()
            if(inputPass == "123456" && inputEmail == "ronaldo@gmail.com"){
                Toast.makeText( this@LoginActivity, "Login Successfully", Toast.LENGTH_SHORT).show()
                /*Switch màn hình
                    thay ProfileActivity bằng màn hình Profile
                    val intent = Intent( this@MainActivity, ProfileActivity::class.java)
                    startActivity(intent)
                 */
                val intent = Intent(this, Activity_Profile_ViTien::class.java)
                startActivity(intent)
            }else{
                Toast.makeText( this@LoginActivity, "Login Failed! Please try again.", Toast.LENGTH_SHORT).show()
            }
        }

    }

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}