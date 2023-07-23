package com.example.recipes.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewTreeObserver
import androidx.recyclerview.widget.RecyclerView
import com.example.recipes.data.DishItemModel
import com.example.recipes.databinding.DishListItemBinding

class DishAdapter(private val list: List<DishItemModel>,
                  private val itemClickListener: (DishItemModel) -> Unit) : RecyclerView.Adapter<DishAdapter.DishItemViewHolder>() {
    class DishItemViewHolder(val binding: DishListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bindItem(item: DishItemModel) {
            with(binding) {
                titleTextView.setText(item.titleId)
                photoImageView.setImageResource(item.imageId)
                contentTextView.setText(item.contentId)
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
        holder.binding.root.setOnClickListener {
            itemClickListener(currentItem)
        }
        holder.itemView.post{
            with(holder.binding.contentTextView) {
                val textViewHeight = height - lineHeight/4
                val textSize = lineHeight
                setLines((textViewHeight / textSize))
                Log.d("onBindViewHolder", "$height + $lineHeight")
            }
        }
    }
}