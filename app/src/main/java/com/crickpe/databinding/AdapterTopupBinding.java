package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;

public abstract class AdapterTopupBinding extends ViewDataBinding {
    public final RelativeLayout rlAmount;
    public final TextView tvAmount;

    protected AdapterTopupBinding(Object obj, View view, int i, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.rlAmount = relativeLayout;
        this.tvAmount = textView;
    }

    public static AdapterTopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterTopupBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_topup, viewGroup, z, obj);
    }

    public static AdapterTopupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopupBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterTopupBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_topup, (ViewGroup) null, false, obj);
    }

    public static AdapterTopupBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopupBinding bind(View view, Object obj) {
        return (AdapterTopupBinding) bind(obj, view, C1188R.C1193layout.adapter_topup);
    }
}
