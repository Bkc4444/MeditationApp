package com.example.meditationapp

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Meditation1Fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_meditation1)

        val constraintLayout: ConstraintLayout = findViewById(R.id.meditationFragment1)
        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(3000)
        animationDrawable.setExitFadeDuration(3000)
        animationDrawable.start()
    }

    //TO DO
    // Make home button when clicked return to ActiviyMain

    //When Play/Pause button is pushed it plays the meditation or pauses it
}