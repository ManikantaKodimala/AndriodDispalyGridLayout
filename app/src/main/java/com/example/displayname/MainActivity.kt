package com.example.displayname

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.userNameCell).text = intent.getStringExtra(Name)
        findViewById<TextView>(R.id.emailCell).text = intent.getStringExtra(Email)
        findViewById<TextView>(R.id.ageCell).text = intent.getStringExtra(Age)
        findViewById<TextView>(R.id.phoneNumberCell).text = intent.getStringExtra(PhoneNumber)
    }
}