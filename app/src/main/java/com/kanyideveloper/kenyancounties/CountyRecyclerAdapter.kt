package com.kanyideveloper.kenyancounties

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kanyideveloper.kenyan_counties.County
import com.kanyideveloper.kenyancounties.databinding.CountyRowBinding

class CountyRecyclerAdapter : ListAdapter<County, CountyRecyclerAdapter.MyViewHolder>(MyDiffUtil) {

    private object MyDiffUtil : DiffUtil.ItemCallback<County>() {
        override fun areItemsTheSame(oldItem: County, newItem: County): Boolean {
            return oldItem.countyName == newItem.countyName
        }

        override fun areContentsTheSame(oldItem: County, newItem: County): Boolean {
            return oldItem == newItem
        }
    }

    inner class MyViewHolder(private val binding: CountyRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(county: County?) {
            binding.textViewCountyNm.text = county?.countyName
            binding.textViewCountyCd.text = county?.countyCode
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            CountyRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val county = getItem(position)
        holder.bind(county)
    }
}