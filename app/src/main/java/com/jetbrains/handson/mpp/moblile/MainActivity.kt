package com.jetbrains.handson.mpp.moblile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.jetbrains.handson.mpp.mobile.createApplicationScreenName

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = findViewById<TextView>(R.id.main_text)
        message.text = createApplicationScreenName()

        message.setOnClickListener {
            Toast.makeText(this, createApplicationScreenName(), Toast.LENGTH_LONG).show()
        }


    }
}
