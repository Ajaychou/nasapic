package com.gs.nasaphotooftheday.home.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gs.nasaphotooftheday.home.HomeActivityViewEvents
import com.gs.nasaphotooftheday.home.HomeActivityViewStates
import com.gs.nasaphotooftheday.home.di.Event
import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo
import com.gs.nasaphotooftheday.home.room.NasaImagesFavoritesCacheEntity
import com.gs.nasaphotooftheday.home.util.DataState
import com.gs.nasaphotooftheday.home.viewevents.FragmentFavoriteViewEvents
import com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class FragmentFavoritesImagesViewModel @ViewModelInject constructor(private val repository: NasaImagesFavoriteRepo) :
    ViewModel() {

    private val mutableImageListingEvents =
        MutableLiveData<Event<FragmentFavoriteViewEvents>>()
    val mutableLiveDataEvents: LiveData<Event<FragmentFavoriteViewEvents>> =
        mutableImageListingEvents

    private val mutableLiveDataStates = MutableLiveData<FragmentFavoriteViewStates>()
    val liveDataStatesRegistrationCar: LiveData<FragmentFavoriteViewStates> =
        mutableLiveDataStates

    init {
        mutableLiveDataStates.value = FragmentFavoriteViewStates(false, listOf())
    }

    /**
     * Call for the favorite images
     */
    internal fun getAllFavoriteImages() {

        viewModelScope.launch {
            repository.getAllTheFavorites().onEach {
                processCarsNameLogoResponse(it)
            }
                .launchIn(viewModelScope)
        }
    }

    /**
     * Handle response based on result
     */
    private fun processCarsNameLogoResponse(it: DataState<List<NasaImageModel>>) {
        when (it) {
            is DataState.Success -> {
                mutableLiveDataStates.value =
                    mutableLiveDataStates.value?.copy(
                        isLoading = false,
                        responseDataList = it.data
                    )
            }
            is DataState.Failure -> {
                mutableLiveDataStates.value =
                    mutableLiveDataStates.value?.copy(
                        isLoading = false
                    )
            }
            is DataState.OnNoInternet -> {
                mutableLiveDataStates.value =
                    mutableLiveDataStates.value?.copy(
                        isLoading = false,
                        responseDataList = it.data
                    )
            }
        }
    }
}