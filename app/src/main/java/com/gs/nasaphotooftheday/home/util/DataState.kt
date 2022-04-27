package com.gs.nasaphotooftheday.home.util

sealed class DataState<out R> {
    data class Success<out T>(val data: T) : DataState<T>()
    data class Failure(val exception: Exception) : DataState<Nothing>()
    data class OnNoInternet<out T>(val data: T) : DataState<T>()
    data class EmptyList(val noData: String) : DataState<Nothing>()

}
