package com.e.simpleprog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var no = 0
    var startTime: Long = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        text_hello.setText("${no}")

        buttonStart.setOnClickListener {
            no = 0
            startTime = System.currentTimeMillis()
            text_hello.setText("${no}")
        }

        background.setOnClickListener{
            no++
            val time = System.currentTimeMillis()-startTime;
            text_hello.setText("${no} ${time}ms")

            if(no==20){
                textGameResult.setText("Zakończono grę")
            }
        }
    }

    fun gameResult(){

    }
}