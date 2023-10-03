package com.example.presentation.screens.phone

import android.os.Bundle
import android.view.View
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.example.domain.model.User
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentPhoneFragmentsBinding
import com.example.presentation.screens.phone.PhoneViewModel.Effect

class PhoneFragment :
    BaseFragment<FragmentPhoneFragmentsBinding>(FragmentPhoneFragmentsBinding::inflate) {

    private val viewModel: PhoneViewModel by viewModel()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.state.observe(::renderUser) { it.user }
        viewModel.effects.doOnNext(::handleEffects)
    }

    private fun renderUser(user: User?) {

    }

    private fun handleEffects(effect: Effect) {

    }
}