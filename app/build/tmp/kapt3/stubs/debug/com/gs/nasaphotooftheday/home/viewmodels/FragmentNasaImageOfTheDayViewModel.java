package com.gs.nasaphotooftheday.home.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\b\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\u0006\u0010\u0019\u001a\u00020\u0014J\u0006\u0010\u001a\u001a\u00020\u0014J\u001c\u0010\u001b\u001a\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dH\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/gs/nasaphotooftheday/home/viewmodels/FragmentNasaImageOfTheDayViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/acho/app/sellcar/repository/GetImageRepository;", "repositoryFavorite", "Lcom/gs/nasaphotooftheday/home/repository/NasaImagesFavoriteRepo;", "(Lcom/acho/app/sellcar/repository/GetImageRepository;Lcom/gs/nasaphotooftheday/home/repository/NasaImagesFavoriteRepo;)V", "liveDataStatesRegistrationCar", "Landroidx/lifecycle/LiveData;", "Lcom/gs/nasaphotooftheday/home/HomeActivityViewStates;", "getLiveDataStatesRegistrationCar", "()Landroidx/lifecycle/LiveData;", "mutableImageListingEvents", "Landroidx/lifecycle/MutableLiveData;", "Lcom/gs/nasaphotooftheday/home/di/Event;", "Lcom/gs/nasaphotooftheday/home/HomeActivityViewEvents;", "mutableLiveDataEvents", "getMutableLiveDataEvents", "mutableLiveDataStates", "getNasaImageApi", "", "date", "", "getNasaImageApi$app_debug", "onCalenderButtonClick", "onClickFloatingFavoriteButton", "onClickPassData", "processCarsNameLogoResponse", "it", "Lcom/gs/nasaphotooftheday/home/util/DataState;", "", "Lcom/gs/nasaphotooftheday/home/entity/NasaImageModel;", "app_debug"})
public final class FragmentNasaImageOfTheDayViewModel extends androidx.lifecycle.ViewModel {
    private final com.acho.app.sellcar.repository.GetImageRepository repository = null;
    private final com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo repositoryFavorite = null;
    private final androidx.lifecycle.MutableLiveData<com.gs.nasaphotooftheday.home.di.Event<com.gs.nasaphotooftheday.home.HomeActivityViewEvents>> mutableImageListingEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.di.Event<com.gs.nasaphotooftheday.home.HomeActivityViewEvents>> mutableLiveDataEvents = null;
    private final androidx.lifecycle.MutableLiveData<com.gs.nasaphotooftheday.home.HomeActivityViewStates> mutableLiveDataStates = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.HomeActivityViewStates> liveDataStatesRegistrationCar = null;
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public FragmentNasaImageOfTheDayViewModel(@org.jetbrains.annotations.NotNull()
    com.acho.app.sellcar.repository.GetImageRepository repository, @org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo repositoryFavorite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.di.Event<com.gs.nasaphotooftheday.home.HomeActivityViewEvents>> getMutableLiveDataEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.HomeActivityViewStates> getLiveDataStatesRegistrationCar() {
        return null;
    }
    
    /**
     * Api call
     */
    public final void getNasaImageApi$app_debug(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
    }
    
    /**
     * Click event of the Image
     */
    public final void onClickPassData() {
    }
    
    /**
     * Click event of the favorite button
     */
    public final void onClickFloatingFavoriteButton() {
    }
    
    /**
     * Click event of the open calender
     */
    public final void onCalenderButtonClick() {
    }
    
    /**
     * Handle the response based on result
     */
    private final void processCarsNameLogoResponse(com.gs.nasaphotooftheday.home.util.DataState<? extends java.util.List<com.gs.nasaphotooftheday.home.entity.NasaImageModel>> it) {
    }
}