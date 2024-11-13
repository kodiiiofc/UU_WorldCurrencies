package com.kodiiiofc.urbanuniversity.worldcurrencies.data

import com.kodiiiofc.urbanuniversity.worldcurrencies.R
import com.kodiiiofc.urbanuniversity.worldcurrencies.domain.CurrencyModel
import com.kodiiiofc.urbanuniversity.worldcurrencies.domain.CurrencyRepository

class CurrencyRepositoryImplementation : CurrencyRepository {

    private val currencyList = listOf(
        CurrencyModel("Рубль", R.drawable.ruble),
        CurrencyModel("Доллар", R.drawable.dollar),
        CurrencyModel("Евро", R.drawable.euro),
        CurrencyModel("Белорусский рубль", R.drawable.belruble),
        CurrencyModel("Фунт стерлингов", R.drawable.pound),
        CurrencyModel("Юань", R.drawable.yuan),
        CurrencyModel("Турецкая лира", R.drawable.lira),
        CurrencyModel("Теньге", R.drawable.tenge),
    )

    override fun getCurrencyList(): List<CurrencyModel> {
        return currencyList
    }

}