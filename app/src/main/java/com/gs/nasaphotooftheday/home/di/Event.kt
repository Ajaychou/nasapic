package com.gs.nasaphotooftheday.home.di

/**
 * Event file used to observe the events and states of view model
 */
open class Event<out T>(private val content: T) {

    var hasBeenHandled=false
    private set

    fun getContentIfNotNeeded(): T?{
        return if (hasBeenHandled){
            null
        }else {
            hasBeenHandled=true
            content
        }
    }

    inline fun <R> handleEvent(block:(T)->R):R?{
        return getContentIfNotNeeded()?.let{
            block(it)
        }
    }
}