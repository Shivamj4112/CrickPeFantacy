package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;

public abstract class AdapterUpcomingMatchBinding extends ViewDataBinding {
    public final ImageView imageView;
    @Bindable
    protected UpcomingMatchModel mModel;
    public final RelativeLayout onItemClick;
    public final ConstraintLayout rlStart;
    public final TextView textView;
    public final TextView tvContest;
    public final TextView tvVanue;

    public abstract void setModel(UpcomingMatchModel upcomingMatchModel);

    protected AdapterUpcomingMatchBinding(Object obj, View view, int i, ImageView imageView2, RelativeLayout relativeLayout, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.imageView = imageView2;
        this.onItemClick = relativeLayout;
        this.rlStart = constraintLayout;
        this.textView = textView2;
        this.tvContest = textView3;
        this.tvVanue = textView4;
    }

    public UpcomingMatchModel getModel() {
        return this.mModel;
    }

    public static AdapterUpcomingMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterUpcomingMatchBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_upcoming_match, viewGroup, z, obj);
    }

    public static AdapterUpcomingMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterUpcomingMatchBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_upcoming_match, (ViewGroup) null, false, obj);
    }

    public static AdapterUpcomingMatchBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchBinding bind(View view, Object obj) {
        return (AdapterUpcomingMatchBinding) bind(obj, view, C1188R.C1193layout.adapter_upcoming_match);
    }
}
