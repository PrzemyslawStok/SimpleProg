package com.e.simpleprog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        text_hello.setText("Nowy tekst")

        button.setOnClickListener{
            text_hello.setText("Kolejny tekst")
        }
    }
}