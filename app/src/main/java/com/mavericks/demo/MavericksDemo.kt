package com.mavericks.demo

import android.app.Application
import com.airbnb.mvrx.Mavericks

class MavericksDemo: Application()  {
    override fun onCreate() {
        super.onCreate()
        Mavericks.initialize(this)
    }
}