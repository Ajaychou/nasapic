package com.acho.app.sellcar.di

import androidx.lifecycle.ViewModel
import com.acho.app.sellcar.repository.GetImageRepository
import com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel
import com.gs.nasaphotooftheday.home.di.ViewModelFactory
import com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo
import com.gs.nasaphotooftheday.home.viewmodels.FragmentFavoritesImagesViewModel
import com.quick.quickopinionapp.di.ViewModelKey
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoMap
import javax.inject.Provider

@Module
@InstallIn(SingletonComponent::class)
class ViewModelModules {

    @Provides
    fun providesViewModelFactory(viewModels: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>): ViewModelFactory {
        return ViewModelFactory.create(viewModels)
    }

    @Provides
    @ViewModelKey(FragmentNasaImageOfTheDayViewModel::class)
    @IntoMap
    fun providesSelectYourCarBrandViewModel(repositoryModule: GetImageRepository, repository: NasaImagesFavoriteRepo): ViewModel {
        return FragmentNasaImageOfTheDayViewModel(repositoryModule,repository)
    }

    @Provides
    @ViewModelKey(FragmentFavoritesImagesViewModel::class)
    @IntoMap
    fun providesFragmentFavoritesImagesViewModel(repository: NasaImagesFavoriteRepo): ViewModel {
        return FragmentFavoritesImagesViewModel(repository)
    }
}