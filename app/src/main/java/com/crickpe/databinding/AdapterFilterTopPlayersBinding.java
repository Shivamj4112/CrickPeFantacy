package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayerFilter;

public abstract class AdapterFilterTopPlayersBinding extends ViewDataBinding {
    public final ImageView imageView8;
    @Bindable
    protected TopPlayerFilter mModel;
    public final TextView tvFilterTite;

    public abstract void setModel(TopPlayerFilter topPlayerFilter);

    protected AdapterFilterTopPlayersBinding(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.imageView8 = imageView;
        this.tvFilterTite = textView;
    }

    public TopPlayerFilter getModel() {
        return this.mModel;
    }

    public static AdapterFilterTopPlayersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFilterTopPlayersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterFilterTopPlayersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_filter_top_players, viewGroup, z, obj);
    }

    public static AdapterFilterTopPlayersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFilterTopPlayersBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterFilterTopPlayersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_filter_top_players, (ViewGroup) null, false, obj);
    }

    public static AdapterFilterTopPlayersBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFilterTopPlayersBinding bind(View view, Object obj) {
        return (AdapterFilterTopPlayersBinding) bind(obj, view, C1188R.C1193layout.adapter_filter_top_players);
    }
}
