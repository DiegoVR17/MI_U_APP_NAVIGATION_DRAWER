package com.diegovr17.miu_navigationdrawer.ui.share

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShareViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "ESTE ES EL FRAGMENTO CONFIGURACIÓN. EN ESTE SE MOSTRARAN LOS SETTINGS DE LA APP"
    }
    val text: LiveData<String> = _text
}