package com.example.praktikum9.viewmodel

import androidx.lifecycle.ViewModel
import com.example.praktikum9.repositori.RepositoriSiswa

class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }
