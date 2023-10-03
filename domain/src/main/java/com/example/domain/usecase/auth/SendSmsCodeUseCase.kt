package com.example.domain.usecase.auth

import com.example.domain.repo.AuthRepository


class SendSmsCodeUseCase(
    private val authRepository: AuthRepository
) {

    operator fun invoke(phone: String) {
        authRepository.sendSmsCode(phone)
    }
}