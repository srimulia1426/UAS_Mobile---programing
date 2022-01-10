package com.example.myuas.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Info : Restoran Korean Halal. " +
                "call: 08217865485. " +
                "loc: Grand Indonesia Mall,Jl.Mh.Thamrin,Jakarta Pusat"

    }
    val text: LiveData<String> = _text
}