package com.bateman.msu.hw4courtcounter

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val SCORE_TEAM_A = "SCORE_TEAM_A"
const val SCORE_TEAM_B = "SCORE_TEAM_B"

class ScoreViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    val displayAScore: String
        get() = scoreTeamA.toString()

    val displayBScore: String
        get() = scoreTeamB.toString()


    private var scoreTeamA: Int
        get() = savedStateHandle[SCORE_TEAM_A] ?: 0
        set(value) = savedStateHandle.set(SCORE_TEAM_A, value)
    private var scoreTeamB: Int
        get() = savedStateHandle[SCORE_TEAM_B] ?: 0
        set(value) = savedStateHandle.set(SCORE_TEAM_B, value)

    fun onePointTeamA() {
        scoreTeamA++
    }
    fun twoPointTeamA() {
        scoreTeamA += 2
    }
    fun threePointTeamA() {
        scoreTeamA += 3
    }
    fun onePointTeamB() {
        scoreTeamB++
    }
    fun twoPointTeamB() {
        scoreTeamB += 2
    }
    fun threePointTeamB() {
        scoreTeamB += 3
    }





    fun resetScore() {
        scoreTeamA = 0
        scoreTeamB = 0
    }

}