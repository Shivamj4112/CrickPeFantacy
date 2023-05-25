package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.my_matches_detail.Balls;

public abstract class AdapterBallCountBinding extends ViewDataBinding {
    @Bindable
    protected Balls mModel;
    public final TextView tvBallLabel;

    public abstract void setModel(Balls balls);

    protected AdapterBallCountBinding(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.tvBallLabel = textView;
    }

    public Balls getModel() {
        return this.mModel;
    }

    public static AdapterBallCountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBallCountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterBallCountBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_ball_count, viewGroup, z, obj);
    }

    public static AdapterBallCountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBallCountBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterBallCountBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_ball_count, (ViewGroup) null, false, obj);
    }

    public static AdapterBallCountBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBallCountBinding bind(View view, Object obj) {
        return (AdapterBallCountBinding) bind(obj, view, C1188R.C1193layout.adapter_ball_count);
    }
}
