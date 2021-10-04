package com.azhar.androiddatabindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

     val factLiveDataObject = MutableLiveData("This is a fact")


    fun updateLiveData(){
        factLiveDataObject.value = "Another fact"
    }
}