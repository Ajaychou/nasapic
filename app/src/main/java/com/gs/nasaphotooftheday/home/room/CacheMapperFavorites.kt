package com.gs.nasaphotooftheday.home.room

import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.util.EntityMapper
import java.util.*
import javax.inject.Inject

/**
 * This will used to map all the favorite images to database
 */
class CacheMapperFavorites @Inject constructor() :
    EntityMapper<NasaImagesFavoritesCacheEntity, NasaImageModel> {

    override fun mapFromEntity(entity: NasaImagesFavoritesCacheEntity): NasaImageModel {
        return NasaImageModel(
            entity.date, entity.explaination,
            entity.hdurl, entity.mediatype, entity.serviceVersion, entity.title, entity.url
        )
    }

    override fun mapToEntity(domainModel: NasaImageModel): NasaImagesFavoritesCacheEntity {
        return NasaImagesFavoritesCacheEntity(
            Random().nextInt(), domainModel.date, domainModel.explaination,
            domainModel.hdUrl, domainModel.mediaType, domainModel.serviceVirsion,
            domainModel.title, domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<NasaImagesFavoritesCacheEntity>): List<NasaImageModel> {
        return entities.map { mapFromEntity(it) }
    }

}