package com.example.room_database.viewmodel.provider

import android.widget.VideoView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.room_database.repositori.ApplikasiSiswa
import com.example.room_database.viewmodel.EntryViewModel
import com.example.room_database.viewmodel.HomeViewModel



fun CreationExtras.aplikasiSiswa(): ApplikasiSiswa=
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as ApplikasiSiswa)