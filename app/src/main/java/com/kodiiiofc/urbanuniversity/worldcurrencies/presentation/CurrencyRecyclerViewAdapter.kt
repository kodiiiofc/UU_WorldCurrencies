package com.kodiiiofc.urbanuniversity.worldcurrencies.presentation

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kodiiiofc.urbanuniversity.worldcurrencies.R
import com.kodiiiofc.urbanuniversity.worldcurrencies.domain.CurrencyModel

class CurrencyRecyclerViewAdapter : RecyclerView.Adapter<CurrencyRecyclerViewAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTV: TextView = itemView.findViewById(R.id.name_tv)
        val imageIV: ImageView = itemView.findViewById(R.id.image_iv)
    }

    private var currencyList = listOf<CurrencyModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun updateCurrencyList(list: List<CurrencyModel>) {
        currencyList = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currency = currencyList[position]
        holder.nameTV.text = currency.name
        holder.imageIV.setImageResource(currency.imageResource)
    }

    override fun getItemCount(): Int {
        return currencyList.size
    }
}