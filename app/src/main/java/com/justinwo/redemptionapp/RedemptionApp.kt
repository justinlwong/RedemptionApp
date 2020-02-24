package com.justinwo.redemptionapp

import android.app.Application
import android.content.Context
import com.justinwo.redemptionapp.di.AppComponent
import com.justinwo.redemptionapp.di.AppModule
import com.justinwo.redemptionapp.di.DaggerAppComponent

class RedemptionApp : Application() {

    companion object {
        lateinit var instance: RedemptionApp
        fun getAppComponent(): AppComponent = instance.appComponent
    }

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        instance = this
    }
}