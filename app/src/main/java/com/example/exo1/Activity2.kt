package com.example.exo1

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val sp = getSharedPreferences("my_prefs", Activity.MODE_PRIVATE)
        setContentView(R.layout.activity2)
        window.decorView.setBackgroundColor(sp.getInt("background_color", -1))
    }
}
