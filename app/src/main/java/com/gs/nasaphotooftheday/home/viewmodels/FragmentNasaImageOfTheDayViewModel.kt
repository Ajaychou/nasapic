package com.gs.nasaphotooftheday.home.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.acho.app.sellcar.repository.GetImageRepository
import com.gs.nasaphotooftheday.home.HomeActivityViewEvents
import com.gs.nasaphotooftheday.home.HomeActivityViewStates
import com.gs.nasaphotooftheday.home.di.Event
import com.gs.nasaphotooftheday.home.entity.NasaImageModel
import com.gs.nasaphotooftheday.home.repository.NasaImagesFavoriteRepo
import com.gs.nasaphotooftheday.home.util.DataState
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

class FragmentNasaImageOfTheDayViewModel @ViewModelInject constructor(
    private val repository: GetImageRepository,
    private val repositoryFavorite: NasaImagesFavoriteRepo) :
    ViewModel() {

    private val mutableImageListingEvents =
        MutableLiveData<Event<HomeActivityViewEvents>>()
    val mutableLiveDataEvents: LiveData<Event<HomeActivityViewEvents>> =
        mutableImageListingEvents

    private val mutableLiveDataStates = MutableLiveData<HomeActivityViewStates>()
    val liveDataStatesRegistrationCar: LiveData<HomeActivityViewStates> =
        mutableLiveDataStates

    init {
        val nasaImageModel= NasaImageModel("","","","","","","")
        mutableLiveDataStates.value = HomeActivityViewStates(false, nasaImageModel, false, false)
    }

    internal fun getLogoAndNmeApi(date:String) {
        viewModelScope.launch {
            repository.getNameAndLogos(date).onEach {
                processCarsNameLogoResponse(it)
            }
                .launchIn(viewModelScope)
        }
    }

    /**
     * Click event of the Image
     */
    fun onClickPassData() {
        mutableLiveDataStates.value = mutableLiveDataStates.value?.copy(isFavorite = true)
        mutableImageListingEvents.value = Event(HomeActivityViewEvents.OnClickPassData)
    }

    /**
     * Click event of the favorite button
     */
    fun onClickFloatingFavoriteButton() {
        mutableImageListingEvents.value = Event(HomeActivityViewEvents.OnClickFavoriteButton)
    }

    /**
     * Click event of the open calender
     */
    fun onCalenderButtonClick(){
        mutableImageListingEvents.value = Event(HomeActivityViewEvents.OnClickCalenderOpen)
    }

    private fun processCarsNameLogoResponse(it: DataState<List<NasaImageModel>>) {
        when (it) {
            is DataState.Success -> {
                mutableLiveDataStates.value =
                    mutableLiveDataStates.value?.copy(
                        isLoading = false,
                        nasaImageModel = it.data[0],
                        noInternet = false
                    )
            }
            is DataState.Failure -> {
                mutableLiveDataStates.value =
                    mutableLiveDataStates.value?.copy(
                        isLoading = false,
                        noInternet = false
                    )
            }
            is DataState.OnNoInternet -> {
                mutableLiveDataStates.value =
                    mutableLiveDataStates.value?.copy(
                        isLoading = false,
                        nasaImageModel = it.data[0],
                        noInternet = true

                    )
            }
        }
    }
}