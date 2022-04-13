package com.gs.nasaphotooftheday.home.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_images")
data class NasaImagesFavoritesCacheEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int,
    @ColumnInfo(name = "date")
    val date: String,
    @ColumnInfo(name = "explanation")
    val explaination: String,
    @ColumnInfo(name = "hdurl")
    val hdurl: String,
    @ColumnInfo(name = "media_type")
    val mediatype: String,
    @ColumnInfo(name = "service_version")
    val serviceVersion: String,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "url")
    val url: String
)