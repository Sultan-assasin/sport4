package com.sula.sport4

import android.app.Application
import com.onesignal.OneSignal
import dagger.hilt.android.HiltAndroidApp

const val ONESIGNAL_APP_ID = "becc3e26-78c4-43cb-8fe0-2af743d7c97b"


@HiltAndroidApp
class Sport4App: Application() {
    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)

        OneSignal.promptForPushNotifications();
    }
}