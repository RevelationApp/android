package com.rahulkatariya.revelation.application

import android.app.Activity
import android.app.Application
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rahulkatariya.revelation.external.AppBootstrapper
import com.rahulkatariya.revelation.external.AppCoordinator

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val application = (application as AppDelegate)
        application.handleUrl(this)
        finish()
    }
}

class AppDelegate : Application() {
    private val appService = AppProvider()
    private var appCoordinator: AppCoordinator? = null

    override fun onCreate() {
        super.onCreate()
        val appBootstrapper = AppBootstrapper(appService)
        val appRouter = AppRouter()
        appCoordinator = AppCoordinator(
            appBootstrapper,
            appRouter
        )
    }

    fun handleUrl(activity: Activity) {
        appCoordinator!!.start(activity)
    }
}
