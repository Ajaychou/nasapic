package com.gs.nasaphotooftheday.home.di
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Provider

class ViewModelFactory private constructor(private val viewModel:Map<Class<out ViewModel>, Provider<ViewModel>>)
        : ViewModelProvider.Factory{
        companion object{
            fun create(viewModel:Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>): ViewModelFactory {
                return ViewModelFactory(viewModel)
            }
        }

        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return viewModel[modelClass]?.get() as T
        }
}