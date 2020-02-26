package com.diegovr17.miu_navigationdrawer.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "ESTE ES EL FRAGMENTO MI HORARIO. EN ESTE SE MOSTRARÁ EL HORARIO, POR DIA Y MATERIAS"
    }
    val text: LiveData<String> = _text
}