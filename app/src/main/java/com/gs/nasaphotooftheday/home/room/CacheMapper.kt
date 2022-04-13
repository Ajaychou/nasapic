package com.gs.nasaphotooftheday.home.room

import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.util.EntityMapper
import javax.inject.Inject

class CacheMapper @Inject constructor() :
    EntityMapper<CarsNameAndModelCacheEntity, NasaImageModel> {

    override fun mapFromEntity(entity: CarsNameAndModelCacheEntity): NasaImageModel {
        return NasaImageModel(
            entity.date, entity.explaination,
            entity.hdurl, entity.mediatype, entity.serviceVersion, entity.title, entity.url
        )
    }

    override fun mapToEntity(domainModel: NasaImageModel): CarsNameAndModelCacheEntity {
        return CarsNameAndModelCacheEntity(
            1, domainModel.date, domainModel.explaination,
            domainModel.hdUrl, domainModel.mediaType, domainModel.serviceVirsion,
            domainModel.title, domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<CarsNameAndModelCacheEntity>): List<NasaImageModel> {
        return entities.map { mapFromEntity(it) }
    }

}