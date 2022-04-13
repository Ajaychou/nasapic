package com.gs.nasaphotooftheday.home.repository

import com.gs.nasaphotooftheday.home.models.NasaImageModelNetworkMapper
import retrofit2.http.GET
import retrofit2.http.Query

interface Repository {


    @GET(Constants.APOD)
    suspend fun getTrueCallerScreenImages(
        @Query("date") date: String,
        @Query("api_key") apiKey: String
    ): NasaImageModelNetworkMapper
}