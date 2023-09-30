package com.example.whatsup.di

import com.example.data.local.user.UserStorage
import com.example.data.local.user.UserStorageImple
import com.example.data.remote.auth.AuthFirebase
import com.example.data.remote.auth.AuthFirebaseImple
import com.example.data.repo.AuthRepositoryImple
import com.example.domain.repo.AuthRepository
import com.example.domain.userCase.Auth.SendSmsCodeUserCase
import com.example.presentation.screens.phone.PhoneViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repositoryModule = module {
    single<AuthRepository> { AuthRepositoryImple(get()) }
}

val usercaseModule = module {
    single { SendSmsCodeUserCase(get()) }
}

val localModule = module {
    single<UserStorage> { UserStorageImple() }
}
val remoteModule = module {
    single<AuthFirebase> { AuthFirebaseImple() }
}

val viewModule = module {
    viewModel {
        PhoneViewModel(get())
    }
}