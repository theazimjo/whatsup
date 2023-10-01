package com.example.domains.usecase.settings

import com.example.domains.repo.SettingsRepository

class OnboardedUseCase(
    private val settingsRepository: SettingsRepository
) {
    operator fun invoke() = settingsRepository.onboarded()

}