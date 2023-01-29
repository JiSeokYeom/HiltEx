package com.example.flowex

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.flowex.data.Data
import com.example.flowex.usecase.GetTrendingGifUseCaseImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel
    @Inject constructor(
        private val getTrendingGifUseCaseImpl: GetTrendingGifUseCaseImpl
): ViewModel(){

    private val _gifData : MutableLiveData<Data> = MutableLiveData()
    val gifData : LiveData<Data> = _gifData

    init {
        fetchGifData()
    }
    private fun fetchGifData() {
        viewModelScope.launch {
            runCatching {
                getTrendingGifUseCaseImpl.invoke()
            }.onSuccess {
                _gifData.value = it
                Log.d("테스","성공 ${it.data}")
            }.onFailure {
                Log.d("테스","실패 ${it.message}")
            }
        }
    }

}