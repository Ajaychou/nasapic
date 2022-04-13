package com.gs.nasaphotooftheday.home.room;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/gs/nasaphotooftheday/home/room/NasaImageRoomModule;", "", "()V", "providesNasaImageDB", "Lcom/gs/nasaphotooftheday/home/room/NasaImageDatabase;", "context", "Landroid/content/Context;", "providesRoomNameDao", "Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;", "nasaImageDatabase", "app_debug"})
@dagger.Module()
public final class NasaImageRoomModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.gs.nasaphotooftheday.home.room.NasaImageRoomModule INSTANCE = null;
    
    private NasaImageRoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.gs.nasaphotooftheday.home.room.NasaImageDatabase providesNasaImageDB(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.gs.nasaphotooftheday.home.room.NasaImageDao providesRoomNameDao(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.room.NasaImageDatabase nasaImageDatabase) {
        return null;
    }
}