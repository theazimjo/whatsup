package com.example.presentation.screens.main

import android.annotation.SuppressLint
import com.example.domain.usecase.settings.GetOnboardedUseCase
import com.example.presentation.base.BaseViewModel
import com.example.presentation.navigation.Screens.OnboardingScreen
import com.example.presentation.navigation.Screens.PhoneScreen
import com.example.presentation.screens.main.MainViewModel.*
import com.github.terrakok.cicerone.Router


class MainViewModel(
    private val getOnboardedUseCase: GetOnboardedUseCase,
    private val router: Router
) : BaseViewModel<State, Input, Effect>() {

    class State

    class Input

    class Effect

    init {
        getOnboarded()
    }

    override fun getDefaultState() = State()

    override fun processInput(input: Input) {

    }

    private fun getOnboarded() {
        getOnboardedUseCase().subscribe { onboarded ->
            router.newRootScreen(
                if (onboarded) PhoneScreen() else OnboardingScreen()
            )
        }
    }
}