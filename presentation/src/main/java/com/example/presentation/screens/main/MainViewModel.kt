package com.example.presentation.screens.main

import com.example.presentation.base.BaseViewModel
import com.example.presentation.navigation.Screens.Phone
import com.example.presentation.screens.main.MainViewModel.*
import com.github.terrakok.cicerone.Router

class MainViewModel(
    private val router: Router
) : BaseViewModel<State, Input, Effect>() {

    class State

    class Input

    class Effect

    init {
        router.newRootScreen(Phone())
    }

    override fun getDefaultState() = State()

    override fun processInput(input: Input) {

    }
}