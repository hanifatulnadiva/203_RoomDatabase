package com.example.room_database.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.room_database.room.Siswa
import com.example.room_database.viewmodel.HomeViewModel
import com.example.room_database.viewmodel.provider.PenyediaViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navigateToItemEntry:()->Unit,
    modifier:Modifier= Modifier,
    viewModel: HomeViewModel= viewModel(factory = PenyediaViewModel.Factory)
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

    }
}