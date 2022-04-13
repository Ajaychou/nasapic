package com.gs.nasaphotooftheday.home.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.gs.nasaphotooftheday.home.room.CarsNameAndModelCacheEntity

@Dao
interface CarsNameLogoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNameLogoEntity(cacheEntity: CarsNameAndModelCacheEntity)

    @Query("SELECT * from cars_name_and_model_cache")
    suspend fun getLogosAndName() : List<CarsNameAndModelCacheEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorites(cacheEntity: NasaImagesFavoritesCacheEntity)

    @Query("SELECT * from favorite_images")
    suspend fun getFiles() : List<NasaImagesFavoritesCacheEntity>

}
