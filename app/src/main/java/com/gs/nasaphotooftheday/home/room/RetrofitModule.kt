package com.gs.nasaphotooftheday.home.room

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.gs.nasaphotooftheday.home.repository.Constants
import com.gs.nasaphotooftheday.home.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Singleton
    @Provides
    fun provideGsonBuilder(): Gson {
        return GsonBuilder().setLenient().create()
    }

    @Singleton
    @Provides
    fun providesRetrofit(gson: Gson): Retrofit.Builder{
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
    }

    @Singleton
    @Provides
    fun providesCarsNameLogoService(retrofit: Retrofit.Builder): Repository{
        return retrofit.build().create(Repository::class.java)
    }
}