package com.gs.nasaphotooftheday.home.room;

import java.lang.System;

/**
 * Data access object file for all nasa images
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;", "", "getFiles", "", "Lcom/gs/nasaphotooftheday/home/room/NasaImagesFavoritesCacheEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLogosAndName", "Lcom/gs/nasaphotooftheday/home/room/NasaImageCacheEntity;", "insertFavorites", "", "cacheEntity", "(Lcom/gs/nasaphotooftheday/home/room/NasaImagesFavoritesCacheEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNameLogoEntity", "(Lcom/gs/nasaphotooftheday/home/room/NasaImageCacheEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NasaImageDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertNameLogoEntity(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.room.NasaImageCacheEntity cacheEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from nasa_images")
    public abstract java.lang.Object getLogosAndName(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.gs.nasaphotooftheday.home.room.NasaImageCacheEntity>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertFavorites(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.room.NasaImagesFavoritesCacheEntity cacheEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from favorite_images")
    public abstract java.lang.Object getFiles(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.gs.nasaphotooftheday.home.room.NasaImagesFavoritesCacheEntity>> continuation);
}