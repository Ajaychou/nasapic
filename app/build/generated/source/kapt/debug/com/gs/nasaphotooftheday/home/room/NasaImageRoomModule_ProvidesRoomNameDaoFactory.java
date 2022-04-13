// Generated by Dagger (https://dagger.dev).
package com.gs.nasaphotooftheday.home.room;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NasaImageRoomModule_ProvidesRoomNameDaoFactory implements Factory<NasaImageDao> {
  private final Provider<NasaImageDatabase> nasaImageDatabaseProvider;

  public NasaImageRoomModule_ProvidesRoomNameDaoFactory(
      Provider<NasaImageDatabase> nasaImageDatabaseProvider) {
    this.nasaImageDatabaseProvider = nasaImageDatabaseProvider;
  }

  @Override
  public NasaImageDao get() {
    return providesRoomNameDao(nasaImageDatabaseProvider.get());
  }

  public static NasaImageRoomModule_ProvidesRoomNameDaoFactory create(
      Provider<NasaImageDatabase> nasaImageDatabaseProvider) {
    return new NasaImageRoomModule_ProvidesRoomNameDaoFactory(nasaImageDatabaseProvider);
  }

  public static NasaImageDao providesRoomNameDao(NasaImageDatabase nasaImageDatabase) {
    return Preconditions.checkNotNullFromProvides(NasaImageRoomModule.INSTANCE.providesRoomNameDao(nasaImageDatabase));
  }
}