package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterUpcomingMatchNewBinding extends ViewDataBinding {
    public final ImageView ivInfoMatch;
    public final CircleImageView ivTeam1Flag;
    public final CircleImageView ivTeam2Flag;
    public final ImageView ivTime;
    public final ImageView ivVipTag;
    public final LinearLayout linearLayout15;
    public final LinearLayout llTop;
    @Bindable
    protected UpcomingMatchModel mModel;
    public final RelativeLayout relativeLayout7;
    public final RelativeLayout rlTop;
    public final TextView textView17;
    public final TextView textView19;
    public final RelativeLayout timeLayout;
    public final TextView tvTeamCode1;
    public final TextView tvTeamCode2;
    public final TextView tvTimeRemaining;
    public final View view3;

    public abstract void setModel(UpcomingMatchModel upcomingMatchModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AdapterUpcomingMatchNewBinding(Object obj, View view, int i, ImageView imageView, CircleImageView circleImageView, CircleImageView circleImageView2, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, RelativeLayout relativeLayout3, TextView textView3, TextView textView4, TextView textView5, View view2) {
        super(obj, view, i);
        this.ivInfoMatch = imageView;
        this.ivTeam1Flag = circleImageView;
        this.ivTeam2Flag = circleImageView2;
        this.ivTime = imageView2;
        this.ivVipTag = imageView3;
        this.linearLayout15 = linearLayout;
        this.llTop = linearLayout2;
        this.relativeLayout7 = relativeLayout;
        this.rlTop = relativeLayout2;
        this.textView17 = textView;
        this.textView19 = textView2;
        this.timeLayout = relativeLayout3;
        this.tvTeamCode1 = textView3;
        this.tvTeamCode2 = textView4;
        this.tvTimeRemaining = textView5;
        this.view3 = view2;
    }

    public UpcomingMatchModel getModel() {
        return this.mModel;
    }

    public static AdapterUpcomingMatchNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterUpcomingMatchNewBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_upcoming_match_new, viewGroup, z, obj);
    }

    public static AdapterUpcomingMatchNewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchNewBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterUpcomingMatchNewBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_upcoming_match_new, (ViewGroup) null, false, obj);
    }

    public static AdapterUpcomingMatchNewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchNewBinding bind(View view, Object obj) {
        return (AdapterUpcomingMatchNewBinding) bind(obj, view, C1188R.C1193layout.adapter_upcoming_match_new);
    }
}
