package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;

public abstract class AdapterMegaAmountBinding extends ViewDataBinding {
    public final RelativeLayout rlAmount;
    public final TextView tvAmount;

    protected AdapterMegaAmountBinding(Object obj, View view, int i, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.rlAmount = relativeLayout;
        this.tvAmount = textView;
    }

    public static AdapterMegaAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMegaAmountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterMegaAmountBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_mega_amount, viewGroup, z, obj);
    }

    public static AdapterMegaAmountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMegaAmountBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterMegaAmountBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_mega_amount, (ViewGroup) null, false, obj);
    }

    public static AdapterMegaAmountBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMegaAmountBinding bind(View view, Object obj) {
        return (AdapterMegaAmountBinding) bind(obj, view, C1188R.C1193layout.adapter_mega_amount);
    }
}
