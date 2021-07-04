package com.mavericks.demo.mavericks.vavericksstate

import com.airbnb.mvrx.MavericksState

data class RandomNumberState(
    val randomNumber: Int = 0
): MavericksState