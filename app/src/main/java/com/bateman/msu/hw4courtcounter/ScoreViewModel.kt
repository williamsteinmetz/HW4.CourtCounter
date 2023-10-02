package com.bateman.msu.hw4courtcounter

import android.view.View
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"
const val CURRENT_INDEX_KEY = "CURRENT_INDEX_KEY"

class ScoreViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var scoreTeamA = 0
    var scoreTeamB = 0

    val displayAScore: String
        get() = scoreTeamA.toString()

    val displayBScore: String
        get() = scoreTeamB.toString()


    var currentIndex: Int
        get() = savedStateHandle.get(CURRENT_INDEX_KEY) ?: 0
        set(value) = savedStateHandle.set(CURRENT_INDEX_KEY, value)
    /**
     * Increase the score for Team A by 1 point.
     */

    fun onePointTeamA() {
        scoreTeamA++
        currentIndex++
    }
    fun twoPointTeamA() {
        scoreTeamA += 2
        currentIndex++
    }
    fun threePointTeamA() {
        scoreTeamA += 3
        currentIndex++
    }
    fun onePointTeamB() {
        scoreTeamB++
        currentIndex++
    }
    fun twoPointTeamB() {
        scoreTeamB += 2
        currentIndex++
    }
    fun threePointTeamB() {
        scoreTeamB += 3
        currentIndex++
    }





    fun resetScore() {
        scoreTeamA = 0;
        scoreTeamB = 0;
    }

}