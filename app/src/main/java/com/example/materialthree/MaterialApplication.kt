package com.example.materialthree

import android.app.Application
import com.google.android.material.color.DynamicColors

class MaterialApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}