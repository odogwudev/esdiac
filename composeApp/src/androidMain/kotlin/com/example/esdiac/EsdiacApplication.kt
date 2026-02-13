package com.example.esdiac

import android.app.Application
import com.example.esdiac.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class EsdiacApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@EsdiacApplication)
            androidLogger()
        }
    }
}