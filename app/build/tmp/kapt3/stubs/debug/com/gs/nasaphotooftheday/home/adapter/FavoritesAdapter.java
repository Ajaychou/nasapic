package com.gs.nasaphotooftheday.home.adapter;

import java.lang.System;

/**
 * This file is used to show all the favorite files
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\bH\u0016J\u001c\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/gs/nasaphotooftheday/home/adapter/FavoritesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gs/nasaphotooftheday/home/adapter/FavoritesAdapter$Viewolder;", "list", "", "Lcom/gs/nasaphotooftheday/home/entity/NasaImageModel;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Viewolder", "app_debug"})
public final class FavoritesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.gs.nasaphotooftheday.home.adapter.FavoritesAdapter.Viewolder> {
    private final java.util.List<com.gs.nasaphotooftheday.home.entity.NasaImageModel> list = null;
    
    public FavoritesAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gs.nasaphotooftheday.home.entity.NasaImageModel> list) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.gs.nasaphotooftheday.home.adapter.FavoritesAdapter.Viewolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.gs.nasaphotooftheday.home.adapter.FavoritesAdapter.Viewolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/gs/nasaphotooftheday/home/adapter/FavoritesAdapter$Viewolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/gs/nasaphotooftheday/home/adapter/FavoritesAdapter;Landroid/view/View;)V", "iv_image", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getIv_image", "()Landroid/widget/ImageView;", "app_debug"})
    public final class Viewolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView iv_image = null;
        
        public Viewolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final android.widget.ImageView getIv_image() {
            return null;
        }
    }
}