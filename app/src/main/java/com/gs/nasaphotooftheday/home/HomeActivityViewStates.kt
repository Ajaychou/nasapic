package com.gs.nasaphotooftheday.home

import com.gs.nasaphotooftheday.home.entity.NasaImageModel

data class HomeActivityViewStates(
    val isLoading: Boolean,
    val nasaImageModel: NasaImageModel,
    val isFavorite: Boolean,
    val noInternet: Boolean
)