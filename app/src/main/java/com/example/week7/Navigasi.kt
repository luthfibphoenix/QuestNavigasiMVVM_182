package com.example.week7

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.week7.model.dataJk
import com.example.week7.ui.view.FormulirView
import com.example.week7.ui.view.TampilMahasiswaView
import com.example.week7.ui.viewmodel.MahasiswaViewModel


enum class Halaman{
    Form,
    Data
}

@Preview(showBackground = true)

@Composable
fun Navigasi(
    modifier: Modifier = Modifier,
    viewModel: MahasiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
){
    Scaffold { isipadding ->
        val _uiState by viewModel.uistate.collectAsState()
        NavHost(
            modifier = modifier.padding(isipadding),
            navController = navHost, startDestination = Halaman.Form.name
        ) {
            composable(route = Halaman.Form.name) {
                val konteks = LocalContext.current
                FormulirView(
                    pilihanJk = dataJk.isiJK.map {
                        isi -> konteks.resources.getString(isi)
                    },
                    onClickButton = {
                        viewModel.saveDataMahasiswa(it)
                        navHost.navigate(Halaman.Data.name)
                    }
                )
            }
            composable(route = Halaman.Data.name){
                TampilMahasiswaView(
                    mhs = _uiState
                )
            }
        }
    }
}