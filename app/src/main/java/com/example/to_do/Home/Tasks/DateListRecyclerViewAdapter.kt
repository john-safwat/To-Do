package com.example.to_do.Home.Tasks

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.to_do.models.CardDate
import com.example.to_do.databinding.ItemDateBinding

class DateListRecyclerViewAdapter(private val dateList: MutableList<CardDate>) : Adapter<DateListRecyclerViewAdapter.DateViewHolder>() {

    inner class DateViewHolder(private val viewBinding:ItemDateBinding): ViewHolder(viewBinding.root){
        fun bind(cardDate: CardDate){
            viewBinding.cardDate = cardDate
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DateViewHolder {
        val viewBinding = ItemDateBinding.inflate(LayoutInflater.from(parent.context) , parent ,false)
        return  DateViewHolder(viewBinding)
    }

    override fun getItemCount(): Int {
        return dateList.size
    }

    override fun onBindViewHolder(holder: DateViewHolder, position: Int) {
        holder.bind(dateList[position])
    }
}