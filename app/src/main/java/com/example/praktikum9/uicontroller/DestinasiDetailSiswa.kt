package com.example.praktikum9.uicontroller

import com.example.praktikum9.R

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "detail_detail"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "IdSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}