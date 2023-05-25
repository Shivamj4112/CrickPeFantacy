package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.Teams;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterFlagsBinding extends ViewDataBinding {
    public final CircleImageView ivFlags;
    @Bindable
    protected Teams mModel;

    public abstract void setModel(Teams teams);

    protected AdapterFlagsBinding(Object obj, View view, int i, CircleImageView circleImageView) {
        super(obj, view, i);
        this.ivFlags = circleImageView;
    }

    public Teams getModel() {
        return this.mModel;
    }

    public static AdapterFlagsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFlagsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterFlagsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_flags, viewGroup, z, obj);
    }

    public static AdapterFlagsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFlagsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterFlagsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_flags, (ViewGroup) null, false, obj);
    }

    public static AdapterFlagsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFlagsBinding bind(View view, Object obj) {
        return (AdapterFlagsBinding) bind(obj, view, C1188R.C1193layout.adapter_flags);
    }
}
