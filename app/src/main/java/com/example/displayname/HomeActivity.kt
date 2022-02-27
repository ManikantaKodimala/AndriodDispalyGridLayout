package com.example.displayname

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.log

const val Name="name"
const val Age="age"
const val Email ="email"
const val PhoneNumber ="phoneNumber"
class HomeActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val submitButton= findViewById<Button>(R.id.confirm_button)
        val name=findViewById<EditText>(R.id.userName)
        val age=findViewById<EditText>(R.id.age)
        val email = findViewById<EditText>(R.id.email)
        val phoneNumber = findViewById<EditText>(R.id.phoneNumber)
        submitButton.setOnClickListener{
            val intent=Intent(this,MainActivity::class.java)
            intent.putExtra(Name,name.text.toString())
            intent.putExtra(Age,age.text.toString())
            intent.putExtra(Email,email.text.toString())
            intent.putExtra(PhoneNumber,phoneNumber.text.toString())
            startActivity(intent)
        }
    }
}