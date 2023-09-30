package com.example.presentation.screens.phone

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.domain.model.User
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentPhoneBinding
import com.example.presentation.screens.phone.PhoneViewModel.Effect


class PhoneFragment : BaseFragment<FragmentPhoneBinding>(FragmentPhoneBinding::inflate) {

    private lateinit var viewModel: PhoneViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        BaseFragmentda yozilgan tayyor obserni chaqirib oladi
        viewModel.state.observe(::renderUser) { it.user!! }
        viewModel.effects.doOnNext(::handleEffects)
    }

    //  Qachon user o'zgarsa render qilib auto user xolatini o'zgartirib turadi
    private fun renderUser(any: User?) {

    }

    private fun handleEffects(effect: Effect) {}
}