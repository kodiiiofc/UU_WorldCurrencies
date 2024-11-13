package com.kodiiiofc.urbanuniversity.worldcurrencies.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kodiiiofc.urbanuniversity.worldcurrencies.domain.CurrencyModel
import com.kodiiiofc.urbanuniversity.worldcurrencies.domain.CurrencyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val currencyRepository: CurrencyRepository) : ViewModel() {

    private val mutableCurrencyListLiveData = MutableLiveData<List<CurrencyModel>>().apply {
        value = currencyRepository.getCurrencyList()
    }

    val currencyListLiveData : LiveData<List<CurrencyModel>> = mutableCurrencyListLiveData
}