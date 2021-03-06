// Generated by Dagger (https://dagger.dev).
package com.gs.nasaphotooftheday.home;

import com.gs.nasaphotooftheday.home.navigator.AppNavigator;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<AppNavigator> navigatorProvider;

  public MainActivity_MembersInjector(Provider<AppNavigator> navigatorProvider) {
    this.navigatorProvider = navigatorProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<AppNavigator> navigatorProvider) {
    return new MainActivity_MembersInjector(navigatorProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectNavigator(instance, navigatorProvider.get());
  }

  @InjectedFieldSignature("com.gs.nasaphotooftheday.home.MainActivity.navigator")
  public static void injectNavigator(MainActivity instance, AppNavigator navigator) {
    instance.navigator = navigator;
  }
}
