// Generated by Dagger (https://dagger.dev).
package com.gs.nasaphotooftheday.home.util;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkMapper_Factory implements Factory<NetworkMapper> {
  @Override
  public NetworkMapper get() {
    return newInstance();
  }

  public static NetworkMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NetworkMapper newInstance() {
    return new NetworkMapper();
  }

  private static final class InstanceHolder {
    private static final NetworkMapper_Factory INSTANCE = new NetworkMapper_Factory();
  }
}
