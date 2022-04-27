package com.gs.nasaphotooftheday.home

import android.view.View
import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gs.nasaphotooftheday.R
import com.gs.nasaphotooftheday.home.adapter.FavoritesAdapter
import com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates
import com.squareup.picasso.Picasso

@BindingAdapter("visibleOrGone")
fun setVisibleOrGone(view: View, visible: Boolean) {
    view.visibility = if (visible) View.VISIBLE else View.GONE
}

@BindingAdapter("setSrc")
fun setImageResource(view: View, homeActivityViewStates: HomeActivityViewStates) {
    if (!homeActivityViewStates.nasaImageModel.hdUrl.isEmpty())
        Picasso.get().load(homeActivityViewStates.nasaImageModel.url).into(view as ImageView)
}

@BindingAdapter("setAdapter")
fun setAdapter(view: View, homeActivityViewStates: FragmentFavoriteViewStates) {
    with((view as RecyclerView)) {
        val selectYourVehicleBrandAdapter =
            FavoritesAdapter(homeActivityViewStates.responseDataList)
        adapter = selectYourVehicleBrandAdapter
        layoutManager = LinearLayoutManager(context)
    }
}

@BindingAdapter("setDrawableOnFavorite")
fun setDrawableOnFavorite(view: View, homeActivityViewStates: HomeActivityViewStates) {
    if (homeActivityViewStates.isFavorite) {
        (view as ImageView).setImageDrawable(
            ResourcesCompat.getDrawable(view.context.resources, R.drawable.filled_heart, null)
        )
    } else {
        (view as ImageView).setImageDrawable(
            ResourcesCompat.getDrawable(
                view.context.resources,
                R.drawable.ic_baseline_favorite_border_24,
                null
            )
        )
    }
}
