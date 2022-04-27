package com.gs.nasaphotooftheday.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.gs.nasaphotooftheday.R
import com.gs.nasaphotooftheday.home.navigator.AppNavigator
import com.gs.nasaphotooftheday.home.navigator.Screens
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var navigator: AppNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES){
            setTheme(R.style.Theme_Light)
        }else{
            setTheme(R.style.Theme_Dark)
        }
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            navigator.navigateTo(Screens.IMAGES_LIST,0)
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
        }
    }
}