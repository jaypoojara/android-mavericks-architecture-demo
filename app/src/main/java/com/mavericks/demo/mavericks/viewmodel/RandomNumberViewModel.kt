package com.mavericks.demo.mavericks.viewmodel

import com.airbnb.mvrx.MavericksViewModel
import com.mavericks.demo.mavericks.vavericksstate.RandomNumberState
import kotlin.random.Random

class RandomNumberViewModel(initialState: RandomNumberState) :
    MavericksViewModel<RandomNumberState>(initialState = RandomNumberState()) {
    fun updateRandomNumber() {
        val randomNumber = Random.nextInt(0, 1000)
        setState { copy(randomNumber = randomNumber) }
    }

}