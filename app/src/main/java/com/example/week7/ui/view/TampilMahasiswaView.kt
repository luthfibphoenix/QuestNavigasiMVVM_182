package com.example.week7.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.week7.model.Mahasiswa




@Composable
fun TampilMahasiswaView(
    mhs:Mahasiswa
){
    Column(modifier = Modifier.fillMaxSize()) {
        TampilData(
            Judul = "Nama",
            isinya = mhs.nama
        )
        TampilData(
            Judul = "Jenis Kelamin",
            isinya = mhs.gender
        )
        TampilData(
            Judul = "Alamat",
            isinya = mhs.alamat
        )
        TampilData(
            Judul = "Email",
            isinya = mhs.email
        )
        TampilData(
            Judul = "NoHP",
            isinya = mhs.noHP
        )
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