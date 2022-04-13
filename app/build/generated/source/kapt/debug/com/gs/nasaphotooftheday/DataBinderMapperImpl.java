package com.gs.nasaphotooftheday;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.gs.nasaphotooftheday.databinding.FragmentFavouritesBindingImpl;
import com.gs.nasaphotooftheday.databinding.NasaImageListingFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTFAVOURITES = 1;

  private static final int LAYOUT_NASAIMAGELISTINGFRAGMENT = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gs.nasaphotooftheday.R.layout.fragment_favourites, LAYOUT_FRAGMENTFAVOURITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gs.nasaphotooftheday.R.layout.nasa_image_listing_fragment, LAYOUT_NASAIMAGELISTINGFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTFAVOURITES: {
          if ("layout/fragment_favourites_0".equals(tag)) {
            return new FragmentFavouritesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favourites is invalid. Received: " + tag);
        }
        case  LAYOUT_NASAIMAGELISTINGFRAGMENT: {
          if ("layout/nasa_image_listing_fragment_0".equals(tag)) {
            return new NasaImageListingFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nasa_image_listing_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(2);

    static {
      sKeys.put("layout/fragment_favourites_0", com.gs.nasaphotooftheday.R.layout.fragment_favourites);
      sKeys.put("layout/nasa_image_listing_fragment_0", com.gs.nasaphotooftheday.R.layout.nasa_image_listing_fragment);
    }
  }
}
