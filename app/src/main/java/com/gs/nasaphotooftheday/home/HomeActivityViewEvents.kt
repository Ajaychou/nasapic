package com.gs.nasaphotooftheday.home

sealed class HomeActivityViewEvents {
    object OnClickPassData: HomeActivityViewEvents()
    object OnClickFavoriteButton: HomeActivityViewEvents()
    object OnClickCalenderOpen: HomeActivityViewEvents()
}