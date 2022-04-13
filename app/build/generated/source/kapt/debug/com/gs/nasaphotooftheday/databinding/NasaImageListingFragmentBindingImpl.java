package com.gs.nasaphotooftheday.databinding;
import com.gs.nasaphotooftheday.R;
import com.gs.nasaphotooftheday.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class NasaImageListingFragmentBindingImpl extends NasaImageListingFragmentBinding implements com.gs.nasaphotooftheday.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.guideline_start, 8);
        sViewsWithIds.put(R.id.guideline_end, 9);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public NasaImageListingFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private NasaImageListingFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Button) bindings[7]
            , (android.widget.TextView) bindings[3]
            );
        this.fabFavourite.setTag(null);
        this.ivFavorite.setTag(null);
        this.ivNasaImage.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.progressBar.setTag(null);
        this.tvExplanation.setTag(null);
        this.tvSelectDate.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.gs.nasaphotooftheday.generated.callback.OnClickListener(this, 3);
        mCallback4 = new com.gs.nasaphotooftheday.generated.callback.OnClickListener(this, 4);
        mCallback1 = new com.gs.nasaphotooftheday.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.gs.nasaphotooftheday.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLiveDataStatesRegistrationCar((androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.HomeActivityViewStates>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLiveDataStatesRegistrationCar(androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.HomeActivityViewStates> ViewModelLiveDataStatesRegistrationCar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelLiveDataStatesRegistrationCarNasaImageModelExplaination = null;
        com.gs.nasaphotooftheday.home.HomeActivityViewStates viewModelLiveDataStatesRegistrationCarGetValue = null;
        com.gs.nasaphotooftheday.home.entity.NasaImageModel viewModelLiveDataStatesRegistrationCarNasaImageModel = null;
        java.lang.String viewModelLiveDataStatesRegistrationCarNasaImageModelTitle = null;
        boolean viewModelLiveDataStatesRegistrationCarLoading = false;
        com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.HomeActivityViewStates> viewModelLiveDataStatesRegistrationCar = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.liveDataStatesRegistrationCar
                    viewModelLiveDataStatesRegistrationCar = viewModel.getLiveDataStatesRegistrationCar();
                }
                updateLiveDataRegistration(0, viewModelLiveDataStatesRegistrationCar);


                if (viewModelLiveDataStatesRegistrationCar != null) {
                    // read viewModel.liveDataStatesRegistrationCar.getValue()
                    viewModelLiveDataStatesRegistrationCarGetValue = viewModelLiveDataStatesRegistrationCar.getValue();
                }


                if (viewModelLiveDataStatesRegistrationCarGetValue != null) {
                    // read viewModel.liveDataStatesRegistrationCar.getValue().nasaImageModel
                    viewModelLiveDataStatesRegistrationCarNasaImageModel = viewModelLiveDataStatesRegistrationCarGetValue.getNasaImageModel();
                    // read viewModel.liveDataStatesRegistrationCar.getValue().loading
                    viewModelLiveDataStatesRegistrationCarLoading = viewModelLiveDataStatesRegistrationCarGetValue.isLoading();
                }


                if (viewModelLiveDataStatesRegistrationCarNasaImageModel != null) {
                    // read viewModel.liveDataStatesRegistrationCar.getValue().nasaImageModel.explaination
                    viewModelLiveDataStatesRegistrationCarNasaImageModelExplaination = viewModelLiveDataStatesRegistrationCarNasaImageModel.getExplaination();
                    // read viewModel.liveDataStatesRegistrationCar.getValue().nasaImageModel.title
                    viewModelLiveDataStatesRegistrationCarNasaImageModelTitle = viewModelLiveDataStatesRegistrationCarNasaImageModel.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.fabFavourite.setOnClickListener(mCallback3);
            this.ivFavorite.setOnClickListener(mCallback2);
            this.ivNasaImage.setOnClickListener(mCallback1);
            this.tvSelectDate.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.gs.nasaphotooftheday.home.ViewBindingsKt.setDrawableOnFavorite(this.ivFavorite, viewModelLiveDataStatesRegistrationCarGetValue);
            com.gs.nasaphotooftheday.home.ViewBindingsKt.setImageResource(this.ivNasaImage, viewModelLiveDataStatesRegistrationCarGetValue);
            com.gs.nasaphotooftheday.home.ViewBindingsKt.setVisibleOrGone(this.progressBar, viewModelLiveDataStatesRegistrationCarLoading);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvExplanation, viewModelLiveDataStatesRegistrationCarNasaImageModelExplaination);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, viewModelLiveDataStatesRegistrationCarNasaImageModelTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickFloatingFavoriteButton();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onCalenderButtonClick();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickPassData();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.gs.nasaphotooftheday.home.viewmodels.FragmentNasaImageOfTheDayViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClickPassData();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.liveDataStatesRegistrationCar
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}