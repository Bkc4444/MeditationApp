package com.example.meditationapp

import android.graphics.drawable.AnimationDrawable
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class Meditation1Fragment : Fragment() {
    private lateinit var  mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_meditation1, container, false)
        val homeBtn : Button = view.findViewById(R.id.homeBtn1)
        val playAndPauseBtn : Button = view.findViewById(R.id.startStopBtn1)

        goHome(homeBtn)
        playAndPause(playAndPauseBtn)
        backgroundControls(view)
        return view
    }

    //Controls the background
    private fun backgroundControls(view: View) {
        val constraintLayout: ConstraintLayout = view.findViewById(R.id.meditationFragment1)
        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(4500)
        animationDrawable.setExitFadeDuration(4500)
        animationDrawable.start()
    }

    // When clicked you go the the Main fragment
    private fun Meditation1Fragment.goHome(homeBtn: Button) {
        homeBtn.setOnClickListener {
            val mainFrag = MainFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_graph, mainFrag)?.commit()
        }
    }

    //When Start/Stop button is pushed it plays the meditation or pauses it
    private fun playAndPause(playAndPauseBtn: Button) {
        playAndPauseBtn.setOnClickListener {
            if (!this::mediaPlayer.isInitialized) {
                mediaPlayer = MediaPlayer.create(requireContext(), R.raw.reformstress)
            }
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                return@setOnClickListener
            }
            mediaPlayer.start()
        }
    }

    // Stop the sound file from playing in the same spot if you go to a new fragment
    override fun onDestroy(){
        if (this::mediaPlayer.isInitialized){
            mediaPlayer.stop()
            mediaPlayer.release()
        }
        super.onDestroy()
    }

}