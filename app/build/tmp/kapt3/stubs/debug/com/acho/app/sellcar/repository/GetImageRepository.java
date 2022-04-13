package com.acho.app.sellcar.repository;

import java.lang.System;

/**
 * This is the repository file.
 * This will be used to make network call and get the updated data.
 * This will also update the database once it receive the data successfully
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ+\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/acho/app/sellcar/repository/GetImageRepository;", "", "dao", "Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;", "retrofit", "Lcom/gs/nasaphotooftheday/home/repository/Repository;", "cacheMapper", "Lcom/gs/nasaphotooftheday/home/room/CacheMapper;", "networkMapper", "Lcom/gs/nasaphotooftheday/home/util/NetworkMapper;", "(Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;Lcom/gs/nasaphotooftheday/home/repository/Repository;Lcom/gs/nasaphotooftheday/home/room/CacheMapper;Lcom/gs/nasaphotooftheday/home/util/NetworkMapper;)V", "getNameAndLogos", "Lkotlinx/coroutines/flow/Flow;", "Lcom/gs/nasaphotooftheday/home/util/DataState;", "", "Lcom/gs/nasaphotooftheday/home/entity/NasaImageModel;", "date", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetImageRepository {
    private final com.gs.nasaphotooftheday.home.room.NasaImageDao dao = null;
    private final com.gs.nasaphotooftheday.home.repository.Repository retrofit = null;
    private final com.gs.nasaphotooftheday.home.room.CacheMapper cacheMapper = null;
    private final com.gs.nasaphotooftheday.home.util.NetworkMapper networkMapper = null;
    
    @javax.inject.Inject()
    public GetImageRepository(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.room.NasaImageDao dao, @org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.repository.Repository retrofit, @org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.util.NetworkMapper networkMapper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNameAndLogos(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.gs.nasaphotooftheday.home.util.DataState<? extends java.util.List<com.gs.nasaphotooftheday.home.entity.NasaImageModel>>>> continuation) {
        return null;
    }
}