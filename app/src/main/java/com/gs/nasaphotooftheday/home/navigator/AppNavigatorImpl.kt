package com.gs.nasaphotooftheday.home.navigator

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.gs.nasaphotooftheday.R
import com.gs.nasaphotooftheday.home.fragments.NasaImageDetailFragment
import com.gs.nasaphotooftheday.home.fragments.NasaImageListingFragment
import com.gs.nasaphotooftheday.home.repository.Constants
import javax.inject.Inject

class AppNavigatorImpl @Inject constructor(private val activity: FragmentActivity) : AppNavigator {
    override fun navigateTo(screen: Screens, data: Int) {
        val fragment = when (screen) {
            Screens.IMAGES_LIST -> NasaImageListingFragment()
            Screens.IMAGES_DETAIL -> NasaImageDetailFragment()
        }
        fragment.apply {
            arguments = Bundle().apply {
                putInt(Constants.BUNDLE_CONSTANTS, data)
            }
        }
        activity.supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment)
            .addToBackStack(fragment::class.java.canonicalName).commit()
    }
}