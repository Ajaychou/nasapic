// Generated by Dagger (https://dagger.dev).
package com.acho.app.sellcar.di;

import androidx.lifecycle.ViewModel;
import com.acho.app.sellcar.repository.GetImageRepository;
import com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ViewModelModules_ProvidesSelectYourCarBrandViewModelFactory implements Factory<ViewModel> {
  private final ViewModelModules module;

  private final Provider<GetImageRepository> repositoryModuleProvider;

  private final Provider<NasaImagesFavoriteRepo> repositoryProvider;

  public ViewModelModules_ProvidesSelectYourCarBrandViewModelFactory(ViewModelModules module,
      Provider<GetImageRepository> repositoryModuleProvider,
      Provider<NasaImagesFavoriteRepo> repositoryProvider) {
    this.module = module;
    this.repositoryModuleProvider = repositoryModuleProvider;
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ViewModel get() {
    return providesSelectYourCarBrandViewModel(module, repositoryModuleProvider.get(), repositoryProvider.get());
  }

  public static ViewModelModules_ProvidesSelectYourCarBrandViewModelFactory create(
      ViewModelModules module, Provider<GetImageRepository> repositoryModuleProvider,
      Provider<NasaImagesFavoriteRepo> repositoryProvider) {
    return new ViewModelModules_ProvidesSelectYourCarBrandViewModelFactory(module, repositoryModuleProvider, repositoryProvider);
  }

  public static ViewModel providesSelectYourCarBrandViewModel(ViewModelModules instance,
      GetImageRepository repositoryModule, NasaImagesFavoriteRepo repository) {
    return Preconditions.checkNotNullFromProvides(instance.providesSelectYourCarBrandViewModel(repositoryModule, repository));
  }
}