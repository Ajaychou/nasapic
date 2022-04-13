package com.gs.nasaphotooftheday.home.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Data access object file for all nasa images
 */
@Dao
interface NasaImageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNameLogoEntity(cacheEntity: NasaImageCacheEntity)

    @Query("SELECT * from nasa_images")
    suspend fun getLogosAndName() : List<NasaImageCacheEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorites(cacheEntity: NasaImagesFavoritesCacheEntity)

    @Query("SELECT * from favorite_images")
    suspend fun getFiles() : List<NasaImagesFavoritesCacheEntity>

}
