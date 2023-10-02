package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding
import androidx.activity.viewModels


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    private val scoreViewModel: ScoreViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun addOneForTeamA(v: View?) {
        scoreViewModel.onePointTeamA()
        displayForTeamA()
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        scoreViewModel.twoPointTeamA()
        displayForTeamA()
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        scoreViewModel.threePointTeamA()
        displayForTeamA()
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        scoreViewModel.onePointTeamB()
        displayForTeamB()
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        scoreViewModel.twoPointTeamB()
        displayForTeamB()
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        scoreViewModel.threePointTeamB()
        displayForTeamB()
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        scoreViewModel.resetScore()
        displayForTeamA()
        displayForTeamB()
    }


    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA() {
        binding.teamAScore.setText(scoreViewModel.displayAScore)
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB() {
        binding.teamBScore.setText(scoreViewModel.displayBScore)
    }


}