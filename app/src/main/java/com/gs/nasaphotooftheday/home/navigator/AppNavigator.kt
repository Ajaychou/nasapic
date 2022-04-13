package com.gs.nasaphotooftheday.home.navigator

enum class Screens{
    IMAGES_LIST, IMAGES_DETAIL
}

interface AppNavigator {
    fun navigateTo(screen: Screens, data: Int)
}