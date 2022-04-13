package com.gs.nasaphotooftheday.home.models

import com.google.gson.annotations.SerializedName

data class NasaImageModelNetworkMapper(
    @SerializedName("date") val date: String,
    @SerializedName("explanation") val explaination: String,
    @SerializedName("hdurl") val hdUrl: String,
    @SerializedName("media_type") val mediaType: String,
    @SerializedName("service_version") val serviceVirsion: String,
    @SerializedName("title") val title: String,
    @SerializedName("url") val url: String)