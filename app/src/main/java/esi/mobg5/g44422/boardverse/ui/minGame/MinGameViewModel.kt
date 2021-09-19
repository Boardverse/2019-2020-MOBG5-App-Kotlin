package esi.mobg5.g44422.boardverse.ui.minGame

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import esi.mobg5.g44422.boardverse.model.MinGame

class MinGameViewModel : ViewModel() {

    private val _minGame = MutableLiveData<MinGame>().apply {
        value = MinGame()
    }

    val minGame: LiveData<MinGame> = _minGame

}
