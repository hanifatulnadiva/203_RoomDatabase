package com.example.room_database.repositori

import kotlinx.coroutines.flow.Flow
import com.example.room_database.room.Siswa

interface RepositoriSiswa{
    fun getAllSiswaStream():Flow<List<Siswa>>

    suspend fun insertSiswa(siswa:Siswa)

}
