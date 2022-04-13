package com.gs.nasaphotooftheday.home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.gs.nasaphotooftheday.databinding.FragmentFavouritesBinding
import com.gs.nasaphotooftheday.home.HomeActivityViewEvents
import com.gs.nasaphotooftheday.home.di.ViewModelFactory
import com.gs.nasaphotooftheday.home.viewmodels.FragmentFavoritesImagesViewModel
import com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class NasaImageDetailFragment : Fragment() {

    private lateinit var fragmentSelectYourBrandBinding: FragmentFavouritesBinding
    private val binding get() = fragmentSelectYourBrandBinding
    @Inject
    lateinit var viewModelFactory: ViewModelFactory
    lateinit var viewModelCarBrand: FragmentFavoritesImagesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentSelectYourBrandBinding =
            FragmentFavouritesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        initViewModelAndBindings()
        callLogosDesignAndNameApi()
        initStateEvents()
        return root
    }

    private fun initStateEvents() {
        viewModelCarBrand.liveDataStatesRegistrationCar.observe(viewLifecycleOwner) {
            provideStates(it)
        }
    }

    private fun provideStates(it: FragmentFavoriteViewStates?) {

    }

    private fun provideEvents(it: HomeActivityViewEvents) {
    }


    private fun initViewModelAndBindings() {
        viewModelCarBrand =
            ViewModelProvider(
                this,
                viewModelFactory
            )[FragmentFavoritesImagesViewModel::class.java]
        with(fragmentSelectYourBrandBinding) {
            lifecycleOwner = this@NasaImageDetailFragment
            viewModel = viewModelCarBrand
            executePendingBindings()
        }
    }

    private fun callLogosDesignAndNameApi() {
        viewModelCarBrand.getAllFavoriteImages()
    }
}