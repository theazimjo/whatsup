package com.example.domains.usecase.settings

import com.example.domains.repo.SettingsRepository

class GetOnboardedUseCase(
    private val settingsRepository: SettingsRepository
) {
    operator fun invoke() =settingsRepository.getOnboarded()
}