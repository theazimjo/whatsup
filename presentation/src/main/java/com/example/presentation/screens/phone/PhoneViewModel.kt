package com.example.presentation.screens.phone

import com.example.domain.model.User
import com.example.domain.userCase.Auth.SendSmsCodeUserCase
import com.example.presentation.base.BaseViewModel
import com.example.presentation.screens.phone.PhoneViewModel.*

class PhoneViewModel constructor(
    private val sendSmsCodeUserCase: SendSmsCodeUserCase
) : BaseViewModel<State, Input, Effect>() {

    data class State(
        val user: User? = null
    )

    class Effect

    class Input

    override fun getDefaultState() = State()
    override fun processInput(input: Input) {
    }
}