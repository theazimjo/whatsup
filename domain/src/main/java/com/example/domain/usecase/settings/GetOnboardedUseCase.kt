package com.example.domain.usecase.settings

import com.example.domain.repo.SettingsRepository


class GetOnboardedUseCase(
    private val settingsRepository: SettingsRepository
) {
    operator fun invoke() = settingsRepository.getOnboarded()
}