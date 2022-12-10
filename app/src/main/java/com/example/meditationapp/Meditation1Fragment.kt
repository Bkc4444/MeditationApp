package com.example.meditationapp

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Meditation1Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Return to MainFragment when button clicked return
        val view = inflater.inflate(R.layout.fragment_meditation1, container, false)
        val homeBtn : Button = view.findViewById(R.id.homeBtn1)
        homeBtn.setOnClickListener{
            val mainFrag =  MainFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_graph, mainFrag)?.commit()
        }

        val constraintLayout: ConstraintLayout = view.findViewById(R.id.meditationFragment1)
        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(3000)
        animationDrawable.setExitFadeDuration(3000)
        animationDrawable.start()
        return view
    }

    //TO DO
    // Make home button when clicked return to ActivityMain

    //When Play/Pause button is pushed it plays the meditation or pauses it
}