package com.diegovr17.miu_navigationdrawer.ui.send

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SendViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "CERRAR SESIÓN"
    }
    val text: LiveData<String> = _text
}