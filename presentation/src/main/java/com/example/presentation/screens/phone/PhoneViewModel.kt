package com.example.presentation.screens.phone

import androidx.lifecycle.ViewModel
import com.example.domain.userCase.Auth.SendSmsCodeUserCase

class PhoneViewModel constructor(
    private val sendSmsCodeUserCase: SendSmsCodeUserCase
) : ViewModel() {
}