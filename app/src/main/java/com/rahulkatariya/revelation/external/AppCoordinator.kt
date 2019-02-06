package com.rahulkatariya.revelation.external

import android.app.Activity
import android.content.Intent

public class AppCoordinator(
    private val bootstrapper: AppBootstrapper,
    private val appRouter: AppRoutable
) {
    public fun start(activity: Activity) {
        val coldLaunch = bootstrapper.bootstrap()
        if (coldLaunch) {
            val intent = Intent(activity, appRouter.rootActivity())
            activity.startActivity(intent)
        }
    }
}
