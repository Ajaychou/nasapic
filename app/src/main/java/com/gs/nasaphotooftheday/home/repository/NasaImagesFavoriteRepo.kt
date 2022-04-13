package com.gs.nasaphotooftheday.home.repository

import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.room.CacheMapperFavorites
import com.gs.nasaphotooftheday.home.room.CarsNameLogoDao
import com.gs.nasaphotooftheday.home.room.NasaImagesFavoritesCacheEntity
import com.gs.nasaphotooftheday.home.util.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NasaImagesFavoriteRepo @Inject constructor(
    private val dao: CarsNameLogoDao,
    private val cacheMapperForFavorites: CacheMapperFavorites,
) {
    suspend fun getAllTheFavorites(): Flow<DataState<List<NasaImageModel>>> =
        flow {
            try {
                val cachedCarsNameLogos = dao.getFiles()
                if (cachedCarsNameLogos.isEmpty()) {
                    emit(DataState.EmptyList("No Data Available"))
                } else {
                    emit(
                        DataState.Success(
                            cacheMapperForFavorites.mapFromEntityList(
                                cachedCarsNameLogos
                            )
                        )
                    )
                }
            } catch (e: Exception) {
                emit(DataState.Failure(e))
            }
        }
}