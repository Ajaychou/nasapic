package com.gs.nasaphotooftheday.home.repository;

import java.lang.System;

/**
 * NasaImagesFavoriteRepo file
 * This file is used to return all the favorite images
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J#\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/gs/nasaphotooftheday/home/repository/NasaImagesFavoriteRepo;", "", "dao", "Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;", "cacheMapperForFavorites", "Lcom/gs/nasaphotooftheday/home/room/CacheMapperFavorites;", "(Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;Lcom/gs/nasaphotooftheday/home/room/CacheMapperFavorites;)V", "getAllTheFavorites", "Lkotlinx/coroutines/flow/Flow;", "Lcom/gs/nasaphotooftheday/home/util/DataState;", "", "Lcom/gs/nasaphotooftheday/home/entity/NasaImageModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NasaImagesFavoriteRepo {
    private final com.gs.nasaphotooftheday.home.room.NasaImageDao dao = null;
    private final com.gs.nasaphotooftheday.home.room.CacheMapperFavorites cacheMapperForFavorites = null;
    
    @javax.inject.Inject()
    public NasaImagesFavoriteRepo(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.room.NasaImageDao dao, @org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.room.CacheMapperFavorites cacheMapperForFavorites) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllTheFavorites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.gs.nasaphotooftheday.home.util.DataState<? extends java.util.List<com.gs.nasaphotooftheday.home.entity.NasaImageModel>>>> continuation) {
        return null;
    }
}