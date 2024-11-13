package com.kodiiiofc.urbanuniversity.worldcurrencies.domain

interface CurrencyRepository {
    
    fun getCurrencyList() : List<CurrencyModel>

}