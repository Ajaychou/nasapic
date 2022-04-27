package com.gs.nasaphotooftheday.home.di

import com.gs.nasaphotooftheday.home.navigator.AppNavigator
import com.gs.nasaphotooftheday.home.navigator.AppNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class NavigationModule {

    @Binds
    abstract fun bindNavigator(impl: AppNavigatorImpl): AppNavigator
}