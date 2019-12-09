package com.example.dialpad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RelativeLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_login)
    }
    fun openDialpad(view: View) {
        val intent = Intent(this, DialPad::class.java)
        startActivity(intent)
    }
}
