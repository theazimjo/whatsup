package com.example.data.repo

import com.example.data.remote.auth.AuthFirebase
import com.example.domain.repo.AuthRepository

class AuthRepositoryImple constructor(
    private val authFirebase: AuthFirebase
) : AuthRepository {
    override fun sendSmsCode(phone: String) {
        TODO("Not yet implemented")
    }
}