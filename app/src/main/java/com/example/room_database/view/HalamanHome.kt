package com.example.room_database.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.room_database.room.Siswa
import com.example.room_database.viewmodel.HomeViewModel
import com.example.room_database.viewmodel.provider.PenyediaViewModel
import com.example.room_database.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToItemEntry:()->Unit,
    modifier:Modifier= Modifier,
    viewModel: HomeViewModel= viewModel(factory = PenyediaViewModel.Factory)
){
}

@Composable
fun ListSiswa(
    itemSiswa: List<Siswa>,
    modifier: Modifier= Modifier
){

}
@Composable
fun DataSiswa(
    siswa: Siswa,
    modifier:Modifier = Modifier
){
    Card (modifier = Modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ){
        Column (
            modifier= Modifier
                .padding(all= dimensionResource(R.dimen.padding_large)),
            verticalArrangement = Arrangement.spacedBy(space = dimensionResource(R.dimen.padding_small))
        ){
            Row (modifier= Modifier
                .fillMaxWidth()
            ){
                Text(
                    text=siswa.nama,
                    style = MaterialTheme.typography.titleLarge,
                )
                Spacer(modifier = Modifier .weight(weight = 1f))
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = null,
                )
                Text(
                    text = siswa.telpon,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Text(text=siswa.alamat,
                style = MaterialTheme.typography.titleMedium)
        }
    }
}