package com.gs.nasaphotooftheday.home.room

import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.util.EntityMapper
import javax.inject.Inject

/**
 * This file will mat the network data with database
 */
class CacheMapper @Inject constructor() :
    EntityMapper<NasaImageCacheEntity, NasaImageModel> {

    override fun mapFromEntity(entity: NasaImageCacheEntity): NasaImageModel {
        return NasaImageModel(
            entity.date, entity.explaination,
            entity.hdurl, entity.mediatype, entity.serviceVersion, entity.title, entity.url
        )
    }

    override fun mapToEntity(domainModel: NasaImageModel): NasaImageCacheEntity {
        return NasaImageCacheEntity(
            1, domainModel.date, domainModel.explaination,
            domainModel.hdUrl, domainModel.mediaType, domainModel.serviceVirsion,
            domainModel.title, domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<NasaImageCacheEntity>): List<NasaImageModel> {
        return entities.map { mapFromEntity(it) }
    }

}