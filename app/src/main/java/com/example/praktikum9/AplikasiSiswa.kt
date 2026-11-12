package com.example.praktikum9

import android.app.Application
import com.example.praktikum9.repositori.ContainerApp
import com.example.praktikum9.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}