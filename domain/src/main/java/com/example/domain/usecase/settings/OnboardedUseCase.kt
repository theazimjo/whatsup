package com.example.domain.usecase.settings

import com.example.domain.repo.SettingsRepository

class OnboardedUseCase(
    private val settingsRepository: SettingsRepository
) {
    operator fun invoke() = settingsRepository.onboarded()
}