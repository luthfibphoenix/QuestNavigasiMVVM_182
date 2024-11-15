package com.example.week7.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.week7.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(Mahasiswa())

    val uistate: StateFlow<Mahasiswa> = _uiState.asStateFlow()

    fun saveDataMahasiswa(
        ls:MutableList<String>
    ){
        _uiState.update { data ->
            data.copy(
                Nama = ls[0],
                Gender = ls[1],
                Alamat = ls[2],
                Email = ls[3],
                NoHP = ls[4],
                Nim = ls[5]
            )
        }
    }
}