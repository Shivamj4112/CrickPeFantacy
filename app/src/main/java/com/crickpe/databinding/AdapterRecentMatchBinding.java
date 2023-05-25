package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.settings.models.RecentlyPlayed;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterRecentMatchBinding extends ViewDataBinding {
    public final CircleImageView ivTeam1Flag;
    public final CircleImageView ivTeam2Flag;
    public final LinearLayout linearLayout15;
    public final LinearLayout llTop;
    @Bindable
    protected RecentlyPlayed mModel;
    public final RelativeLayout relativeLayout7;
    public final TextView textView17;
    public final TextView textView19;
    public final RelativeLayout timeLayout;
    public final TextView tvTimeRemaining;
    public final View view3;

    public abstract void setModel(RecentlyPlayed recentlyPlayed);

    protected AdapterRecentMatchBinding(Object obj, View view, int i, CircleImageView circleImageView, CircleImageView circleImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, TextView textView, TextView textView2, RelativeLayout relativeLayout2, TextView textView3, View view2) {
        super(obj, view, i);
        this.ivTeam1Flag = circleImageView;
        this.ivTeam2Flag = circleImageView2;
        this.linearLayout15 = linearLayout;
        this.llTop = linearLayout2;
        this.relativeLayout7 = relativeLayout;
        this.textView17 = textView;
        this.textView19 = textView2;
        this.timeLayout = relativeLayout2;
        this.tvTimeRemaining = textView3;
        this.view3 = view2;
    }

    public RecentlyPlayed getModel() {
        return this.mModel;
    }

    public static AdapterRecentMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterRecentMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterRecentMatchBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_recent_match, viewGroup, z, obj);
    }

    public static AdapterRecentMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterRecentMatchBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterRecentMatchBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_recent_match, (ViewGroup) null, false, obj);
    }

    public static AdapterRecentMatchBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterRecentMatchBinding bind(View view, Object obj) {
        return (AdapterRecentMatchBinding) bind(obj, view, C1188R.C1193layout.adapter_recent_match);
    }
}
