package com.example.room_database.viewmodel

import com.example.room_database.room.Siswa

data class UIStateSiswa(
    val detailSiswa: DetailSiswa= DetailSiswa(),
    val isEntryValid: Boolean= false
)
data class DetailSiswa(
    val id: Int = 0,
    val nama:String="",
    val alamat:String="",
    val telpon : String =""
)

fun DetailSiswa.toSiswa(): Siswa =Siswa(
    id= id,
    nama = nama,
    alamat = alamat,
    telpon = telpon
)

fun Siswa.toUIStateSiswa(isEntryValid: Boolean= false): UIStateSiswa = UIStateSiswa(
    detailSiswa = this. toDetailSiswa(),
    isEntryValid=isEntryValid
)
fun Siswa.toDetailSiswa(): DetailSiswa= DetailSiswa(
    id=id,
    nama=nama,
    alamat= alamat,
    telpon= telpon
)

