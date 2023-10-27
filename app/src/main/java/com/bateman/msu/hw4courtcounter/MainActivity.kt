package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.view.View
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
        displayForTeamA()
        displayForTeamB()
    }

    private fun displayForTeamA() {
        binding.teamAScore.text = scoreViewModel.displayAScore
    }

    private fun displayForTeamB() {
        binding.teamBScore.text = scoreViewModel.displayBScore
    }

    fun addThreeForTeamA(view: View) {
        scoreViewModel.threePointTeamA()
        displayForTeamA()
    }
    fun addTwoForTeamA(view: View) {
        scoreViewModel.twoPointTeamA()
        displayForTeamA()
    }
    fun addOneForTeamA(view: View) {
        scoreViewModel.onePointTeamA()
        displayForTeamA()
    }
    fun addThreeForTeamB(view: View) {
        scoreViewModel.threePointTeamB()
        displayForTeamB()}
    fun addTwoForTeamB(view: View) {
        scoreViewModel.twoPointTeamB()
        displayForTeamB()
    }
    fun addOneForTeamB(view: View) {
        scoreViewModel.onePointTeamB()
        displayForTeamB()
    }
    fun resetScore(view: View) {
        scoreViewModel.resetScore()
        displayForTeamA()
        displayForTeamB()
    }



}