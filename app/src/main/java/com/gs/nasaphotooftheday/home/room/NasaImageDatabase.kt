package com.gs.nasaphotooftheday.home.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [NasaImageCacheEntity::class, NasaImagesFavoritesCacheEntity::class], version = 2)
abstract class NasaImageDatabase : RoomDatabase() {

    abstract fun getCarsNameLogoDao(): NasaImageDao

    companion object{
        val DATABASE_NAME = "cars_name_logo_db"
    }
}