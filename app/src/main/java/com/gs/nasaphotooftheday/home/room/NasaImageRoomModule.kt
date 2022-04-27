package com.gs.nasaphotooftheday.home.room

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NasaImageRoomModule {

    @Singleton
    @Provides
    fun providesNasaImageDB(@ApplicationContext context: Context): NasaImageDatabase {
        return Room.databaseBuilder(
            context,
            NasaImageDatabase::class.java,
            NasaImageDatabase.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun providesRoomNameDao(nasaImageDatabase: NasaImageDatabase): NasaImageDao {
        return nasaImageDatabase.getCarsNameLogoDao()
    }
}