// Generated by Dagger (https://dagger.dev).
package com.gs.nasaphotooftheday.home.room;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CacheMapper_Factory implements Factory<CacheMapper> {
  @Override
  public CacheMapper get() {
    return newInstance();
  }

  public static CacheMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CacheMapper newInstance() {
    return new CacheMapper();
  }

  private static final class InstanceHolder {
    private static final CacheMapper_Factory INSTANCE = new CacheMapper_Factory();
  }
}
