package com.example.whatsup.app

import com.example.whatsup.di.*
import android.app.Application
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
            modules(
                appModule,
                repositoryModule,
                useCaseModule,
                localModule,
                remoteModule,
                viewModelModule
            )

        }
    }
}