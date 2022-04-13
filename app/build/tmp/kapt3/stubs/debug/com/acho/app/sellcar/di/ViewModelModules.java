package com.acho.app.sellcar.di;

import java.lang.System;

/**
 * This file is used to initialise the viewmodels and their parameters
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J/\u0010\n\u001a\u00020\u000b2%\u0010\f\u001a!\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000e\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00040\u000f\u00a2\u0006\u0002\b\u00100\rH\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/acho/app/sellcar/di/ViewModelModules;", "", "()V", "providesFragmentFavoritesImagesViewModel", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/gs/nasaphotooftheday/home/repository/NasaImagesFavoriteRepo;", "providesSelectYourCarBrandViewModel", "repositoryModule", "Lcom/acho/app/sellcar/repository/GetImageRepository;", "providesViewModelFactory", "Lcom/gs/nasaphotooftheday/home/di/ViewModelFactory;", "viewModels", "", "Ljava/lang/Class;", "Ljavax/inject/Provider;", "Lkotlin/jvm/JvmSuppressWildcards;", "app_debug"})
@dagger.Module()
public final class ViewModelModules {
    
    public ViewModelModules() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.gs.nasaphotooftheday.home.di.ViewModelFactory providesViewModelFactory(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Class<? extends androidx.lifecycle.ViewModel>, javax.inject.Provider<androidx.lifecycle.ViewModel>> viewModels) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntoMap()
    @com.quick.quickopinionapp.di.ViewModelKey(value = com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel.class)
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel providesSelectYourCarBrandViewModel(@org.jetbrains.annotations.NotNull()
    com.acho.app.sellcar.repository.GetImageRepository repositoryModule, @org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.multibindings.IntoMap()
    @com.quick.quickopinionapp.di.ViewModelKey(value = com.gs.nasaphotooftheday.home.viewmodels.FragmentFavoritesImagesViewModel.class)
    @dagger.Provides()
    public final androidx.lifecycle.ViewModel providesFragmentFavoritesImagesViewModel(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo repository) {
        return null;
    }
}