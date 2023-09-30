package com.example.whatsup.app

import android.app.Application
import com.example.whatsup.di.localModule
import com.example.whatsup.di.remoteModule
import com.example.whatsup.di.repositoryModule
import com.example.whatsup.di.usercaseModule
import com.example.whatsup.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
//            dependency injecter uchun loglarni yozib boradi
            androidLogger()
            androidContext(this@App)
            modules(repositoryModule, usercaseModule, localModule, remoteModule, viewModule)

        }
    }
}