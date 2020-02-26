package com.diegovr17.miu_navigationdrawer.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "ESTE ES EL FRAGMENTO CALENDARIO. EN ESTE SE VISUALIZAN, LAS NOTAS O RECORDATORIOS"
    }
    val text: LiveData<String> = _text
}