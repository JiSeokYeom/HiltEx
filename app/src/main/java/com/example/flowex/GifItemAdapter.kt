package com.example.flowex

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.flowex.data.ImageList

class GifItemAdapter :
ListAdapter<ImageList, GifItemViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : GifItemViewHolder =
        GifItemViewHolder(parent)

    override fun onBindViewHolder(holder: GifItemViewHolder, position: Int) =
        holder.bind(currentList[position])

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<ImageList>() {
            override fun areItemsTheSame(
                oldItem: ImageList,
                newItem: ImageList
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: ImageList,
                newItem: ImageList
            ): Boolean {
                return oldItem == newItem
            }

        }
    }
}
