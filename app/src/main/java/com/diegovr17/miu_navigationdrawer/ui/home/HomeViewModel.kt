package com.diegovr17.miu_navigationdrawer.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "ESTE ES EL FRAGMENTO MIS NOTAS. EN ESTE, SE MUESTRAN LAS MATERIAS Y SUS NOTAS."
    }
    val text: LiveData<String> = _text
}