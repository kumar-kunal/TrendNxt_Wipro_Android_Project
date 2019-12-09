package com.example.dialpad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openRelative(view: View) {
        val intent = Intent(this, RelativeLogin::class.java)
        startActivity(intent)
    }

}
