package com.gs.nasaphotooftheday.home.entity

/**
 * This file is used to map with network data
 */
data class NasaImageModel(
    val date: String,
    val explaination: String,
    val hdUrl: String,
    val mediaType: String,
    val serviceVirsion: String,
    val title: String,
    val url: String
)