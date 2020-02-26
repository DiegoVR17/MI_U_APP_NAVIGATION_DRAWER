package com.diegovr17.miu_navigationdrawer.ui.tools

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ToolsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "ESTE ES EL FRAGMENTO SIMULADOR DE NOTAS. EN ESTE SE PODRAN OBTENER PROMEDIOS DE NOTAS"
    }
    val text: LiveData<String> = _text
}