package com.example.datas.repo

import com.example.datas.local.settings.SettingsStorage
import com.example.domains.repo.SettingsRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single
import io.reactivex.rxjava3.schedulers.Schedulers

class SettingsRepositoryImple(
    private val settingsStorage: SettingsStorage
) : SettingsRepository {
    override fun onboarded(): Completable = settingsStorage
        .onboarded()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())


    override fun getOnboarded(): Single<Boolean> = settingsStorage
        .getOnboarded()
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
}