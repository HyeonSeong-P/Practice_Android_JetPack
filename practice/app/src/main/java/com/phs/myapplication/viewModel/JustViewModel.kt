package com.phs.myapplication.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.phs.myapplication.SingleLiveEvent
import com.phs.myapplication.data.Player

class JustViewModel:ViewModel() {
    private val _playerData = SingleLiveEvent<Player>()
    val playerData: LiveData<Player> get() = _playerData

    private val _assistData = SingleLiveEvent<Int>()
    val assistData: LiveData<Int> get() = _assistData
    init{
        _assistData.value = 0
    }
    fun plusAssist(){ // Int 타입을 가지는 라이브데이터 값 변경
        _assistData.value = _assistData.value!!.plus(1)
    }
    fun setPlayer(player: Player){
        _playerData.value = player
    }

    fun incrementGoal(){ // Player 타입을 가지는 라이브데이터 값 변경
        if(_playerData.value != null){
            var p = _playerData.value
            p!!.goal = p!!.goal.plus(1)
            _playerData.value = p
        }

    }

    fun incrementAssist(){
        if(_playerData.value != null){
            var p = _playerData.value
            p!!.assist = p!!.assist.plus(1)
            _playerData.value = p
        }

    }


}
