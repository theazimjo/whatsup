package com.example.whatsup.di

import com.example.data.local.user.UserStorage
import com.example.data.local.user.UserStorageImple
import com.example.data.remote.auth.AuthFirebase
import com.example.data.remote.auth.AuthFirebaseImple
import com.example.data.repo.AuthRepositoryImple
import com.example.datas.local.settings.SettingsRealm
import com.example.datas.local.settings.SettingsStorage
import com.example.datas.local.settings.SettingsStorageImple
import com.example.datas.repo.SettingsRepositoryImple
import com.example.domain.repo.AuthRepository
import com.example.domain.userCase.Auth.SendSmsCodeUserCase
import com.example.domains.repo.SettingsRepository
import com.example.domains.usecase.settings.GetOnboardedUseCase
import com.example.domains.usecase.settings.OnboardedUseCase
import com.example.presentation.screens.main.MainViewModel
import com.example.presentation.screens.phone.PhoneViewModel
import com.github.terrakok.cicerone.Cicerone
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val cicerone = Cicerone.create()

val config = RealmConfiguration.Builder(schema = setOf(SettingsRealm::class)).build()

val appModule = module {
    single { cicerone.router }
    single { cicerone.getNavigatorHolder() }
    single { Realm.open(config) }
}

val repositoryModule = module {
    single<AuthRepository> { AuthRepositoryImple(get()) }
    single<SettingsRepository> { SettingsRepositoryImple(get()) }
}

val useCaseModule = module {
    single { SendSmsCodeUserCase(get()) }
    single { OnboardedUseCase(get()) }
    single { GetOnboardedUseCase(get()) }
}

val localModule = module {
    single<UserStorage> { UserStorageImple() }
    single<SettingsStorage> { SettingsStorageImple(get()) }
}

val remoteModule = module {
    single<AuthFirebase> { AuthFirebaseImple() }
}

val viewModelModule = module {
    viewModel { PhoneViewModel(get()) }
    viewModel { MainViewModel(get()) }
}