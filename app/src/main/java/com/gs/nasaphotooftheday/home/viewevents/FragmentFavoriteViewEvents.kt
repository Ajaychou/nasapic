package com.gs.nasaphotooftheday.home.viewevents

sealed class FragmentFavoriteViewEvents {
    object onClickPassData: FragmentFavoriteViewEvents()
    object OnClickFavoriteButton: FragmentFavoriteViewEvents()
}