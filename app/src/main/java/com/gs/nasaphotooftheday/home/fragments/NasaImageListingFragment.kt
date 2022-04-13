package com.gs.nasaphotooftheday.home.fragments

import android.app.DatePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.gs.nasaphotooftheday.R
import com.gs.nasaphotooftheday.databinding.NasaImageListingFragmentBinding
import com.gs.nasaphotooftheday.home.HomeActivityViewEvents
import com.gs.nasaphotooftheday.home.HomeActivityViewStates
import com.gs.nasaphotooftheday.home.di.ViewModelFactory
import com.gs.nasaphotooftheday.home.navigator.AppNavigator
import com.gs.nasaphotooftheday.home.navigator.Screens
import com.gs.nasaphotooftheday.home.room.CarsNameLogoDao
import com.gs.nasaphotooftheday.home.room.NasaImagesFavoritesCacheEntity
import com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class NasaImageListingFragment : Fragment() {

    private lateinit var fragmentSelectYourBrandBinding: NasaImageListingFragmentBinding
    private val binding get() = fragmentSelectYourBrandBinding

    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    lateinit var viewModelCarBrand: FragmentNasaImageOfTheDayViewModel
    private lateinit var homeActivityViewStates: HomeActivityViewStates

    @Inject
    lateinit var navigator: AppNavigator

    @Inject
    lateinit var dao: CarsNameLogoDao
    private var date: String? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSelectYourBrandBinding =
            NasaImageListingFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root
        initViewModelAndBindings()
        callLogosDesignAndNameApi(getCurrentDate())
        initStateEvents()
        return root
    }

    private fun initStateEvents() {
        viewModelCarBrand.mutableLiveDataEvents.observe(viewLifecycleOwner) { event ->
            event.handleEvent { provideEvents(it) }
        }
        viewModelCarBrand.liveDataStatesRegistrationCar.observe(viewLifecycleOwner) {
            provideStates(it)
        }
    }

    private fun provideStates(it: HomeActivityViewStates?) {
        if (it != null) {
            homeActivityViewStates = it
        }
    }

    private fun provideEvents(it: HomeActivityViewEvents) {
        when (it) {
            is HomeActivityViewEvents.OnClickPassData -> {
                binding.ivFavorite.setImageDrawable(context?.resources?.let { it1 ->
                    ResourcesCompat.getDrawable(
                        it1, R.drawable.filled_heart, null
                    )
                })
                lifecycleScope.launch {
                    val random = Random()
                    val nasaImagesFavoritesCacheEntity = NasaImagesFavoritesCacheEntity(
                        random.nextInt(),
                        homeActivityViewStates.nasaImageModel.date,
                        homeActivityViewStates.nasaImageModel.explaination,
                        homeActivityViewStates.nasaImageModel.hdUrl,
                        homeActivityViewStates.nasaImageModel.mediaType,
                        homeActivityViewStates.nasaImageModel.serviceVirsion,
                        homeActivityViewStates.nasaImageModel.title,
                        homeActivityViewStates.nasaImageModel.url
                    )
                    dao.insertFavorites(nasaImagesFavoritesCacheEntity)
                    Log.d("tagged", ">>>>>" + dao.getFiles())
                }
            }
            is HomeActivityViewEvents.OnClickFavoriteButton -> {
                navigator.navigateTo(Screens.IMAGES_DETAIL, 1)
            }
            is HomeActivityViewEvents.OnClickCalenderOpen -> {
                showCalender()
            }
        }
    }

    private fun showCalender() {
        val mcurrentDate = Calendar.getInstance()
        var mYear = mcurrentDate[Calendar.YEAR]
        var mMonth = mcurrentDate[Calendar.MONTH]
        var mDay = mcurrentDate[Calendar.DAY_OF_MONTH]
        val mDatePicker = DatePickerDialog(
            requireContext(),
            { datepicker, selectedyear, selectedmonth, selectedday ->
                val myCalendar = Calendar.getInstance()
                myCalendar[Calendar.YEAR] = selectedyear
                myCalendar[Calendar.MONTH] = selectedmonth
                myCalendar[Calendar.DAY_OF_MONTH] = selectedday
                val myFormat = "yyyy-MM-dd"
                val sdf = SimpleDateFormat(myFormat, Locale.FRANCE)
                date = sdf.format(myCalendar.getTime())
                mDay = selectedday;
                mMonth = selectedmonth;
                mYear = selectedyear;
                callLogosDesignAndNameApi(sdf.format(myCalendar.getTime()))
            },
            mYear,
            mMonth,
            mDay
        )
        mDatePicker.setTitle("Select date");
        mDatePicker.show()
    }


    private fun initViewModelAndBindings() {
        viewModelCarBrand =
            ViewModelProvider(
                this,
                viewModelFactory
            )[FragmentNasaImageOfTheDayViewModel::class.java]
        with(fragmentSelectYourBrandBinding) {
            lifecycleOwner = this@NasaImageListingFragment
            viewModel = viewModelCarBrand
            executePendingBindings()
        }
    }

    private fun callLogosDesignAndNameApi(date: String) {
        viewModelCarBrand.getLogoAndNmeApi(date)
    }

    /**
     * getCurrent date
     */
    private fun getCurrentDate(): String {
        val c = Calendar.getInstance().time
        val df = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        val formattedDate = df.format(c)
        return formattedDate
    }
}