package com.gs.nasaphotooftheday.home.util

import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.models.NasaImageModelNetworkMapper
import javax.inject.Inject

class NetworkMapper @Inject constructor() :
    EntityMapper<NasaImageModelNetworkMapper, NasaImageModel> {

    override fun mapFromEntity(entity: NasaImageModelNetworkMapper): NasaImageModel {
        return NasaImageModel(
            entity.date, entity.explaination,
            entity.hdUrl, entity.mediaType, entity.serviceVirsion, entity.title, entity.url
        )
    }

    override fun mapToEntity(domainModel: NasaImageModel): NasaImageModelNetworkMapper {
        return NasaImageModelNetworkMapper(
            domainModel.date, domainModel.explaination,
            domainModel.hdUrl, domainModel.mediaType, domainModel.serviceVirsion,
            domainModel.title, domainModel.url
        )
    }

    fun mapFromEntityList(entities: List<NasaImageModelNetworkMapper>): List<NasaImageModel> {
        return entities.map { mapFromEntity(it) }
    }
}