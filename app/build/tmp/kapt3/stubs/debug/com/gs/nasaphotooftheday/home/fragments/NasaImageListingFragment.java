package com.gs.nasaphotooftheday.home.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010&\u001a\u00020\u000eH\u0002J\b\u0010\'\u001a\u00020%H\u0002J\b\u0010(\u001a\u00020%H\u0002J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020%2\u0006\u00102\u001a\u000203H\u0002J\u0012\u00104\u001a\u00020%2\b\u00102\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u00105\u001a\u00020%H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u00066"}, d2 = {"Lcom/gs/nasaphotooftheday/home/fragments/NasaImageListingFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/gs/nasaphotooftheday/databinding/NasaImageListingFragmentBinding;", "getBinding", "()Lcom/gs/nasaphotooftheday/databinding/NasaImageListingFragmentBinding;", "dao", "Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;", "getDao", "()Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;", "setDao", "(Lcom/gs/nasaphotooftheday/home/room/NasaImageDao;)V", "date", "", "fragmentSelectYourBrandBinding", "homeActivityViewStates", "Lcom/gs/nasaphotooftheday/home/HomeActivityViewStates;", "navigator", "Lcom/gs/nasaphotooftheday/home/navigator/AppNavigator;", "getNavigator", "()Lcom/gs/nasaphotooftheday/home/navigator/AppNavigator;", "setNavigator", "(Lcom/gs/nasaphotooftheday/home/navigator/AppNavigator;)V", "viewModelCarBrand", "Lcom/gs/nasaphotooftheday/home/viewmodels/FragmentNasaImageOfTheDayViewModel;", "getViewModelCarBrand", "()Lcom/gs/nasaphotooftheday/home/viewmodels/FragmentNasaImageOfTheDayViewModel;", "setViewModelCarBrand", "(Lcom/gs/nasaphotooftheday/home/viewmodels/FragmentNasaImageOfTheDayViewModel;)V", "viewModelFactory", "Lcom/gs/nasaphotooftheday/home/di/ViewModelFactory;", "getViewModelFactory", "()Lcom/gs/nasaphotooftheday/home/di/ViewModelFactory;", "setViewModelFactory", "(Lcom/gs/nasaphotooftheday/home/di/ViewModelFactory;)V", "callLogosDesignAndNameApi", "", "getCurrentDate", "initStateEvents", "initViewModelAndBindings", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "provideEvents", "it", "Lcom/gs/nasaphotooftheday/home/HomeActivityViewEvents;", "provideStates", "showCalender", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class NasaImageListingFragment extends androidx.fragment.app.Fragment {
    private com.gs.nasaphotooftheday.databinding.NasaImageListingFragmentBinding fragmentSelectYourBrandBinding;
    @javax.inject.Inject()
    public com.gs.nasaphotooftheday.home.di.ViewModelFactory viewModelFactory;
    public com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel viewModelCarBrand;
    private com.gs.nasaphotooftheday.home.HomeActivityViewStates homeActivityViewStates;
    @javax.inject.Inject()
    public com.gs.nasaphotooftheday.home.navigator.AppNavigator navigator;
    @javax.inject.Inject()
    public com.gs.nasaphotooftheday.home.room.NasaImageDao dao;
    private java.lang.String date = "";
    
    public NasaImageListingFragment() {
        super();
    }
    
    private final com.gs.nasaphotooftheday.databinding.NasaImageListingFragmentBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gs.nasaphotooftheday.home.di.ViewModelFactory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.di.ViewModelFactory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel getViewModelCarBrand() {
        return null;
    }
    
    public final void setViewModelCarBrand(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gs.nasaphotooftheday.home.navigator.AppNavigator getNavigator() {
        return null;
    }
    
    public final void setNavigator(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.navigator.AppNavigator p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gs.nasaphotooftheday.home.room.NasaImageDao getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.room.NasaImageDao p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * This method  is used to initialise the view events and states
     */
    private final void initStateEvents() {
    }
    
    /**
     * View states from view model
     */
    private final void provideStates(com.gs.nasaphotooftheday.home.HomeActivityViewStates it) {
    }
    
    /**
     * View events from viewodel
     */
    private final void provideEvents(com.gs.nasaphotooftheday.home.HomeActivityViewEvents it) {
    }
    
    /**
     * This method is used to show calender to select the date and call the api
     */
    private final void showCalender() {
    }
    
    /**
     * Initialise bindings
     */
    private final void initViewModelAndBindings() {
    }
    
    /**
     * Network call for nasa image
     * @param date : current date
     */
    private final void callLogosDesignAndNameApi(java.lang.String date) {
    }
    
    /**
     * getCurrent date
     */
    private final java.lang.String getCurrentDate() {
        return null;
    }
}