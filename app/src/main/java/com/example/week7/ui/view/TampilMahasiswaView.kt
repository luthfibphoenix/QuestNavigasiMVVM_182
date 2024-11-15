package com.example.week7.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.week7.model.Mahasiswa




@Composable
fun TampilMahasiswaView(
    mhs:Mahasiswa,
    navController: NavHostController
){
    Column(modifier = Modifier.fillMaxSize()) {
        TampilData(
            Judul = "Nama",
            isinya = mhs.Nama
        )
        TampilData(
            Judul = "Jenis Kelamin",
            isinya = mhs.Gender
        )
        TampilData(
            Judul = "Alamat",
            isinya = mhs.Alamat
        )
        TampilData(
            Judul = "Email",
            isinya = mhs.Email
        )
        TampilData(
            Judul = "No Handphone",
            isinya = mhs.NoHP
        )
        TampilData(
            Judul = "NIM",
            isinya = mhs.Nim
        )

        Button(onClick = { navController.popBackStack() }) { // Navigate back to the previous screen
            Text("Back")
        }
    }
}
@Composable
fun TampilData(
    Judul:String,
    isinya:String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(Judul, modifier = Modifier.weight(0.8f))
        Text(":", modifier = Modifier.weight(0.2f))
        Text(isinya, modifier = Modifier.weight(0.8f))
    }
}