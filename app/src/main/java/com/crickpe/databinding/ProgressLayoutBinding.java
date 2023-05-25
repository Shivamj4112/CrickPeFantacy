package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

public abstract class ProgressLayoutBinding extends ViewDataBinding {
    public final LinearProgressIndicator progressIndicator;

    protected ProgressLayoutBinding(Object obj, View view, int i, LinearProgressIndicator linearProgressIndicator) {
        super(obj, view, i);
        this.progressIndicator = linearProgressIndicator;
    }

    public static ProgressLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProgressLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ProgressLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.progress_layout, viewGroup, z, obj);
    }

    public static ProgressLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProgressLayoutBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ProgressLayoutBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.progress_layout, (ViewGroup) null, false, obj);
    }

    public static ProgressLayoutBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ProgressLayoutBinding bind(View view, Object obj) {
        return (ProgressLayoutBinding) bind(obj, view, C1188R.C1193layout.progress_layout);
    }
}
