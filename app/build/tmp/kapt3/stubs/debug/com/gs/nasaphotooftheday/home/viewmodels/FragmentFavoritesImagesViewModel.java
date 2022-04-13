package com.gs.nasaphotooftheday.home.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\b\u0013J\u001c\u0010\u0014\u001a\u00020\u00122\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016H\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/gs/nasaphotooftheday/home/viewmodels/FragmentFavoritesImagesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/gs/nasaphotooftheday/home/repository/NasaImagesFavoriteRepo;", "(Lcom/gs/nasaphotooftheday/home/repository/NasaImagesFavoriteRepo;)V", "liveDataStatesRegistrationCar", "Landroidx/lifecycle/LiveData;", "Lcom/gs/nasaphotooftheday/home/viewstates/FragmentFavoriteViewStates;", "getLiveDataStatesRegistrationCar", "()Landroidx/lifecycle/LiveData;", "mutableImageListingEvents", "Landroidx/lifecycle/MutableLiveData;", "Lcom/gs/nasaphotooftheday/home/di/Event;", "Lcom/gs/nasaphotooftheday/home/viewevents/FragmentFavoriteViewEvents;", "mutableLiveDataEvents", "getMutableLiveDataEvents", "mutableLiveDataStates", "getAllFavoriteImages", "", "getAllFavoriteImages$app_debug", "processCarsNameLogoResponse", "it", "Lcom/gs/nasaphotooftheday/home/util/DataState;", "", "Lcom/gs/nasaphotooftheday/home/entity/NasaImageModel;", "app_debug"})
public final class FragmentFavoritesImagesViewModel extends androidx.lifecycle.ViewModel {
    private final com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo repository = null;
    private final androidx.lifecycle.MutableLiveData<com.gs.nasaphotooftheday.home.di.Event<com.gs.nasaphotooftheday.home.viewevents.FragmentFavoriteViewEvents>> mutableImageListingEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.di.Event<com.gs.nasaphotooftheday.home.viewevents.FragmentFavoriteViewEvents>> mutableLiveDataEvents = null;
    private final androidx.lifecycle.MutableLiveData<com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates> mutableLiveDataStates = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates> liveDataStatesRegistrationCar = null;
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public FragmentFavoritesImagesViewModel(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.di.Event<com.gs.nasaphotooftheday.home.viewevents.FragmentFavoriteViewEvents>> getMutableLiveDataEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates> getLiveDataStatesRegistrationCar() {
        return null;
    }
    
    /**
     * Call for the favorite images
     */
    public final void getAllFavoriteImages$app_debug() {
    }
    
    /**
     * Handle response based on result
     */
    private final void processCarsNameLogoResponse(com.gs.nasaphotooftheday.home.util.DataState<? extends java.util.List<com.gs.nasaphotooftheday.home.entity.NasaImageModel>> it) {
    }
}