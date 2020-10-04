package com.e.simpleprog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var no = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        text_hello.setText(""+no)

        button.setOnClickListener{
            no=0
            text_hello.setText("${no}")
        }

        background.setOnClickListener{
            no++
            text_hello.setText("${no}")
        }
    }
}