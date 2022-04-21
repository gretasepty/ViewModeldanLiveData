package binar.greta.viewmodeldanlivedata.ViewModelLiveData

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {

    var number = 0

    val currentNumber : MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }

    val currentBoolean : MutableLiveData<Boolean> by lazy {
        MutableLiveData<Boolean>()
    }

}