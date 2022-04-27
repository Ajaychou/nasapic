package com.gs.nasaphotooftheday.home.viewstates

import com.gs.nasaphotooftheday.home.entity.NasaImageModel

data class FragmentFavoriteViewStates(
    val isLoading: Boolean,
    val responseDataList: List<NasaImageModel>
)