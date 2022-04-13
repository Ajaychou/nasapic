package com.gs.nasaphotooftheday.databinding;
import com.gs.nasaphotooftheday.R;
import com.gs.nasaphotooftheday.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFavouritesBindingImpl extends FragmentFavouritesBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFavouritesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentFavouritesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvFavorite.setTag(null);
        setRootTag(root);
        // listeners
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
            setViewModel((com.gs.nasaphotooftheday.home.viewmodels.FragmentFavoritesImagesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.gs.nasaphotooftheday.home.viewmodels.FragmentFavoritesImagesViewModel ViewModel) {
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
                return onChangeViewModelLiveDataStatesRegistrationCar((androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLiveDataStatesRegistrationCar(androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates> ViewModelLiveDataStatesRegistrationCar, int fieldId) {
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
        com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates viewModelLiveDataStatesRegistrationCarGetValue = null;
        com.gs.nasaphotooftheday.home.viewmodels.FragmentFavoritesImagesViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<com.gs.nasaphotooftheday.home.viewstates.FragmentFavoriteViewStates> viewModelLiveDataStatesRegistrationCar = null;

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
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.gs.nasaphotooftheday.home.ViewBindingsKt.setAdapter(this.rvFavorite, viewModelLiveDataStatesRegistrationCarGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.liveDataStatesRegistrationCar
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}