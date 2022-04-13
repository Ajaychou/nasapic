package com.gs.nasaphotooftheday.home.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gs.nasaphotooftheday.home.room.CarsNameAndModelCacheEntity
import com.gs.nasaphotooftheday.home.room.CarsNameLogoDao

@Database(entities = [CarsNameAndModelCacheEntity::class, NasaImagesFavoritesCacheEntity::class], version = 2)
abstract class CarsNameLogoDatabase : RoomDatabase() {

    abstract fun getCarsNameLogoDao(): CarsNameLogoDao

    companion object{
        val DATABASE_NAME = "cars_name_logo_db"
    }
}