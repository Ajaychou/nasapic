package com.gs.nasaphotooftheday.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gs.nasaphotooftheday.R
import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.interfaces.BrandListeners
import com.squareup.picasso.Picasso

class FavoritesAdapter(
    private val list: List<NasaImageModel>) :
    RecyclerView.Adapter<FavoritesAdapter.Viewolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewolder {
        return Viewolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.select_your_vehicle_brand, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Viewolder, position: Int) {
        Picasso.get().load(list[position].hdUrl).into(holder.iv_logo)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class Viewolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iv_logo = itemView.findViewById<ImageView>(R.id.iv_banner)
    }
}