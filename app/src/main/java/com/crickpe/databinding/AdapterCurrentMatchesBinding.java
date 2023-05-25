package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;

public abstract class AdapterCurrentMatchesBinding extends ViewDataBinding {
    public final CardView currentItemRoot;
    @Bindable
    protected MyMatchesModel mModel;
    public final TextView tvMatchName;
    public final TextView tvOverT1;
    public final TextView tvOverT2;
    public final TextView tvScoreT1;
    public final TextView tvScoreT2;

    public abstract void setModel(MyMatchesModel myMatchesModel);

    protected AdapterCurrentMatchesBinding(Object obj, View view, int i, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.currentItemRoot = cardView;
        this.tvMatchName = textView;
        this.tvOverT1 = textView2;
        this.tvOverT2 = textView3;
        this.tvScoreT1 = textView4;
        this.tvScoreT2 = textView5;
    }

    public MyMatchesModel getModel() {
        return this.mModel;
    }

    public static AdapterCurrentMatchesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterCurrentMatchesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterCurrentMatchesBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_current_matches, viewGroup, z, obj);
    }

    public static AdapterCurrentMatchesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterCurrentMatchesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterCurrentMatchesBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_current_matches, (ViewGroup) null, false, obj);
    }

    public static AdapterCurrentMatchesBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterCurrentMatchesBinding bind(View view, Object obj) {
        return (AdapterCurrentMatchesBinding) bind(obj, view, C1188R.C1193layout.adapter_current_matches);
    }
}
