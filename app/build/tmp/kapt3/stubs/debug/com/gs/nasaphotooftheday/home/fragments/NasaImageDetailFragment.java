package com.gs.nasaphotooftheday.home.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010 H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/gs/nasaphotooftheday/home/fragments/NasaImageDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/gs/nasaphotooftheday/databinding/FragmentFavouritesBinding;", "getBinding", "()Lcom/gs/nasaphotooftheday/databinding/FragmentFavouritesBinding;", "fragmentSelectYourBrandBinding", "viewModelCarBrand", "Lcom/gs/nasaphotooftheday/home/viewmodels/FragmentFavoritesImagesViewModel;", "viewModelFactory", "Lcom/gs/nasaphotooftheday/home/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/gs/nasaphotooftheday/home/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/gs/nasaphotooftheday/home/di/ViewModelFactory;)V", "callLogosDesignAndNameApi", "", "initStateEvents", "initViewModelAndBindings", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "provideEvents", "it", "Lcom/gs/nasaphotooftheday/home/HomeActivityViewEvents;", "provideStates", "Lcom/gs/nasaphotooftheday/home/viewstates/FragmentFavoriteViewStates;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NasaImageDetailFragment extends androidx.fragment.app.Fragment {
    private com.gs.nasaphotooftheday.databinding.FragmentFavouritesBinding fragmentSelectYourBrandBinding;
    @javax.inject.Inject()
    public com.gs.nasaphotooftheday.home.di.ViewModelFactory viewModelFactory;
    private com.gs.nasaphotooftheday.home.viewmodels.FragmentFavoritesImagesViewModel viewModelCarBrand;
    
    public NasaImageDetailFragment() {
        super();
    }
    
    private final com.gs.nasaphotooftheday.databinding.FragmentFavouritesBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gs.nasaphotooftheday.home.di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initStateEvents() {
    }
    
    private final void provideStates(com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates it) {
    }
    
    private final void provideEvents(com.gs.nasaphotooftheday.home.HomeActivityViewEvents it) {
    }
    
    /**
     * Initialise viewbindings
     */
    private final void initViewModelAndBindings() {
    }
    
    /**
     * Call all the favorite from the database
     */
    private final void callLogosDesignAndNameApi() {
    }
}