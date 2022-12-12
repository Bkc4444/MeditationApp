package com.example.meditationapp

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainFragment : Fragment() {
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            val view = inflater.inflate(R.layout.fragment_main, container, false)

            //All of the button in Main fragment
            val med1 : Button = view.findViewById(R.id.button1)
            val med2 : Button = view.findViewById(R.id.button2)
            val med3 : Button = view.findViewById(R.id.button3)
            val med4 : Button = view.findViewById(R.id.button4)

            // make on clicks for each button to link to the other fragments to pull them up
            med1.setOnClickListener(){
                val medFrag1  = Meditation1Fragment()
                val transaction = fragmentManager?.beginTransaction()
                transaction?.replace(R.id.nav_graph,medFrag1)?.commit()
            }
            med2.setOnClickListener(){
                val medFrag2  = Meditation1Fragment()
                val transaction = fragmentManager?.beginTransaction()
                transaction?.replace(R.id.nav_graph,medFrag2)?.commit()
            }
            med3.setOnClickListener(){
                val medFrag3  = Meditation1Fragment()
                val transaction = fragmentManager?.beginTransaction()
                transaction?.replace(R.id.nav_graph,medFrag3)?.commit()
            }
            med4.setOnClickListener(){
                val medFrag4  = Meditation1Fragment()
                val transaction = fragmentManager?.beginTransaction()
                transaction?.replace(R.id.nav_graph,medFrag4)?.commit()
            }

            return view
    }
}