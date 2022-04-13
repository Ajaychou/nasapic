// Generated by Dagger (https://dagger.dev).
package com.gs.nasaphotooftheday.home.fragments;

import com.gs.nasaphotooftheday.home.di.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NasaImageDetailFragment_MembersInjector implements MembersInjector<NasaImageDetailFragment> {
  private final Provider<ViewModelFactory> viewModelFactoryProvider;

  public NasaImageDetailFragment_MembersInjector(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<NasaImageDetailFragment> create(
      Provider<ViewModelFactory> viewModelFactoryProvider) {
    return new NasaImageDetailFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(NasaImageDetailFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.gs.nasaphotooftheday.home.fragments.NasaImageDetailFragment.viewModelFactory")
  public static void injectViewModelFactory(NasaImageDetailFragment instance,
      ViewModelFactory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}