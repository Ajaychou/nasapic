// Generated by Dagger (https://dagger.dev).
package com.acho.app.sellcar.repository;

import com.gs.nasaphotooftheday.home.repository.Repository;
import com.gs.nasaphotooftheday.home.room.CacheMapper;
import com.gs.nasaphotooftheday.home.room.NasaImageDao;
import com.gs.nasaphotooftheday.home.util.NetworkMapper;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetImageRepository_Factory implements Factory<GetImageRepository> {
  private final Provider<NasaImageDao> daoProvider;

  private final Provider<Repository> retrofitProvider;

  private final Provider<CacheMapper> cacheMapperProvider;

  private final Provider<NetworkMapper> networkMapperProvider;

  public GetImageRepository_Factory(Provider<NasaImageDao> daoProvider,
      Provider<Repository> retrofitProvider, Provider<CacheMapper> cacheMapperProvider,
      Provider<NetworkMapper> networkMapperProvider) {
    this.daoProvider = daoProvider;
    this.retrofitProvider = retrofitProvider;
    this.cacheMapperProvider = cacheMapperProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public GetImageRepository get() {
    return newInstance(daoProvider.get(), retrofitProvider.get(), cacheMapperProvider.get(), networkMapperProvider.get());
  }

  public static GetImageRepository_Factory create(Provider<NasaImageDao> daoProvider,
      Provider<Repository> retrofitProvider, Provider<CacheMapper> cacheMapperProvider,
      Provider<NetworkMapper> networkMapperProvider) {
    return new GetImageRepository_Factory(daoProvider, retrofitProvider, cacheMapperProvider, networkMapperProvider);
  }

  public static GetImageRepository newInstance(NasaImageDao dao, Repository retrofit,
      CacheMapper cacheMapper, NetworkMapper networkMapper) {
    return new GetImageRepository(dao, retrofit, cacheMapper, networkMapper);
  }
}