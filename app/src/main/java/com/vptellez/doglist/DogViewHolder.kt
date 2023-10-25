package com.vptellez.doglist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.vptellez.doglist.databinding.ItemDogBinding

class DogViewHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemDogBinding.bind(view)

    fun bind(image:String) {
        Picasso.get().load(image).into(binding.ivDog)
    }
}