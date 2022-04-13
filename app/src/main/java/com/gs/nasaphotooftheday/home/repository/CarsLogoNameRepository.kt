package com.acho.app.sellcar.repository

import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.models.NasaImageModelNetworkMapper
import com.gs.nasaphotooftheday.home.repository.Constants
import com.gs.nasaphotooftheday.home.repository.Repository
import com.gs.nasaphotooftheday.home.room.CacheMapper
import com.gs.nasaphotooftheday.home.room.CarsNameLogoDao
import com.gs.nasaphotooftheday.home.util.DataState
import com.gs.nasaphotooftheday.home.util.NetworkMapper
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.net.UnknownHostException
import javax.inject.Inject

class CarsLogoNameRepository @Inject constructor(
    private val dao: CarsNameLogoDao,
    private val retrofit: Repository,
    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
) {
    suspend fun getNameAndLogos(date:String): Flow<DataState<List<NasaImageModel>>> = flow {
        try {
            val nameAndLogoNetworkCall = retrofit.getTrueCallerScreenImages(date, Constants.NASA_API_KEY)
            val arrayListOfResponseBody = ArrayList<NasaImageModelNetworkMapper>()
            arrayListOfResponseBody.add(nameAndLogoNetworkCall)
            val carsNameLogoMapToNetwork = networkMapper.mapFromEntityList(arrayListOfResponseBody)
            for (nameLogo in carsNameLogoMapToNetwork) {
                dao.insertNameLogoEntity(cacheMapper.mapToEntity(nameLogo))
            }
            val cachedCarsNameLogos = dao.getLogosAndName()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cachedCarsNameLogos)))
        } catch (e: UnknownHostException) {
            val cachedCarsNameLogos = dao.getLogosAndName()
            emit(DataState.OnNoInternet(cacheMapper.mapFromEntityList(cachedCarsNameLogos)))

        } catch (e: Exception) {
            emit(DataState.Failure(e))
        }
    }
}