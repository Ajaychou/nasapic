// Generated by data binding compiler. Do not edit!
package com.gs.nasaphotooftheday.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.gs.nasaphotooftheday.R;
import com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class NasaImageListingFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ExtendedFloatingActionButton fabFavourite;

  @NonNull
  public final Guideline guidelineEnd;

  @NonNull
  public final Guideline guidelineStart;

  @NonNull
  public final ImageView ivFavorite;

  @NonNull
  public final ImageView ivNasaImage;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView tvExplanation;

  @NonNull
  public final Button tvSelectDate;

  @NonNull
  public final TextView tvTitle;

  @Bindable
  protected FragmentNasaImageOfTheDayViewModel mViewModel;

  protected NasaImageListingFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ExtendedFloatingActionButton fabFavourite, Guideline guidelineEnd,
      Guideline guidelineStart, ImageView ivFavorite, ImageView ivNasaImage,
      ProgressBar progressBar, TextView tvExplanation, Button tvSelectDate, TextView tvTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.fabFavourite = fabFavourite;
    this.guidelineEnd = guidelineEnd;
    this.guidelineStart = guidelineStart;
    this.ivFavorite = ivFavorite;
    this.ivNasaImage = ivNasaImage;
    this.progressBar = progressBar;
    this.tvExplanation = tvExplanation;
    this.tvSelectDate = tvSelectDate;
    this.tvTitle = tvTitle;
  }

  public abstract void setViewModel(@Nullable FragmentNasaImageOfTheDayViewModel viewModel);

  @Nullable
  public FragmentNasaImageOfTheDayViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static NasaImageListingFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.nasa_image_listing_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static NasaImageListingFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<NasaImageListingFragmentBinding>inflateInternal(inflater, R.layout.nasa_image_listing_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static NasaImageListingFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.nasa_image_listing_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static NasaImageListingFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<NasaImageListingFragmentBinding>inflateInternal(inflater, R.layout.nasa_image_listing_fragment, null, false, component);
  }

  public static NasaImageListingFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static NasaImageListingFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (NasaImageListingFragmentBinding)bind(component, view, R.layout.nasa_image_listing_fragment);
  }
}
