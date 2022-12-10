package com.example.meditationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // make the launcher screen as main fragment

        supportFragmentManager.beginTransaction().replace(R.id.nav_graph,MainFragment()).commit()
    }
}