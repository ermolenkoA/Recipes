package com.example.recipes.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.data.DishItemModel
import com.example.recipes.databinding.DishListItemBinding

class DishAdapter(private val list: List<DishItemModel>) : RecyclerView.Adapter<DishAdapter.DishItemViewHolder>() {
    class DishItemViewHolder(private val binding: DishListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bindItem(item: DishItemModel) {
            with(binding) {
                titleTextView.text = item.title
                contentTextView.text = item.content
                photoImageView.setImageResource(item.image)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishItemViewHolder {
        val binding = DishListItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return DishItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: DishItemViewHolder, position: Int) {
        val currentItem = list[position]
        holder.bindItem(currentItem)
    }
}