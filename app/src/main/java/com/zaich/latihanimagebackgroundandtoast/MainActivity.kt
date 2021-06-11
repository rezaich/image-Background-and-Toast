package com.zaich.latihanimagebackgroundandtoast

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView1.setOnClickListener {
            imageView1.setBackgroundColor(Color.GREEN)
            imageView2.setBackgroundColor(Color.WHITE)
            Toast.makeText(this, "New Challenger", Toast.LENGTH_SHORT).show()
        }
        imageView2.setOnClickListener {
            imageView2.setBackgroundColor(Color.GREEN)
            imageView1.setBackgroundColor(Color.WHITE)
            Toast.makeText(this, "New Challenger", Toast.LENGTH_SHORT).show()
        }
    }
}