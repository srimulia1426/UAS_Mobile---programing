package com.example.myuas.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Saya srimulia ningsih mahasiswa semester 5 di Politeknik Harapan Bersama Tegal."
    }
    val text: LiveData<String> = _text
}