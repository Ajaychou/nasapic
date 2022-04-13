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
object CarsLogoNameRoomModule {

    @Singleton
    @Provides
    fun providesCarsNameLogoDB(@ApplicationContext context: Context): CarsNameLogoDatabase {
        return Room.databaseBuilder(
            context,
            CarsNameLogoDatabase::class.java,
            CarsNameLogoDatabase.DATABASE_NAME
        )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Singleton
    @Provides
    fun providesRoomNameDao(carsNameLogoDatabase: CarsNameLogoDatabase): CarsNameLogoDao {
        return carsNameLogoDatabase.getCarsNameLogoDao()
    }
}