package com.example.recyclerviewalloveras.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerviewalloveras.SuperHero
import com.example.recyclerviewalloveras.databinding.ItemSuperheroBinding

class SuperHeroViewHolder (view :View) : RecyclerView.ViewHolder(view){

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel : SuperHero, onClickListener :(SuperHero) -> Unit) {
        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.superhero
        binding.tvPublisher.text = superHeroModel.superhero
        Glide.with(binding.ivSuperHero).load(superHeroModel.photo).into(binding.ivSuperHero)

        itemView.setOnClickListener { onClickListener(superHeroModel) }
    }
}