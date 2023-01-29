package com.example.flowex

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.flowex.data.ImageList
import com.example.flowex.databinding.ViewholderGifItemBinding

class GifItemViewHolder(
    parent: ViewGroup
) : RecyclerView.ViewHolder(
    ViewholderGifItemBinding.inflate(
        LayoutInflater.from(parent.context),
        parent,
        false
    ).root
) {
    private val binding = ViewholderGifItemBinding.bind(itemView)

    fun bind(data: ImageList) {
        with(binding) {
            Glide.with(itemView.context)
                .load(data.images.fixed_height.url)
                .into(imgGif)
        }
    }

}
