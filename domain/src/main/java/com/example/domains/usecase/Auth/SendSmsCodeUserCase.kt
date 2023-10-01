package com.example.domain.userCase.Auth

import com.example.domain.repo.AuthRepository

class SendSmsCodeUserCase(
    private val authRepository: AuthRepository
) {
    operator fun invoke(phone: String) {
        authRepository.sendSmsCode(phone)
    }
}