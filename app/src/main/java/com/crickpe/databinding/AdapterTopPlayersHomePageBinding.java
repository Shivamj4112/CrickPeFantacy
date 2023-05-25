package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.top_players.models.Result;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterTopPlayersHomePageBinding extends ViewDataBinding {
    public final Guideline guideline3;
    public final ImageView img;
    public final CircleImageView ivFlag;
    public final TextView ivRank;
    public final LinearLayout llTotalAmount;
    @Bindable
    protected Result mModel;
    public final ConstraintLayout relativeLayout11;
    public final TextView tvName;
    public final TextView tvRankT;
    public final TextView tvTotalAmount;

    public abstract void setModel(Result result);

    protected AdapterTopPlayersHomePageBinding(Object obj, View view, int i, Guideline guideline, ImageView imageView, CircleImageView circleImageView, TextView textView, LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.guideline3 = guideline;
        this.img = imageView;
        this.ivFlag = circleImageView;
        this.ivRank = textView;
        this.llTotalAmount = linearLayout;
        this.relativeLayout11 = constraintLayout;
        this.tvName = textView2;
        this.tvRankT = textView3;
        this.tvTotalAmount = textView4;
    }

    public Result getModel() {
        return this.mModel;
    }

    public static AdapterTopPlayersHomePageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopPlayersHomePageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterTopPlayersHomePageBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_top_players_home_page, viewGroup, z, obj);
    }

    public static AdapterTopPlayersHomePageBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopPlayersHomePageBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterTopPlayersHomePageBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_top_players_home_page, (ViewGroup) null, false, obj);
    }

    public static AdapterTopPlayersHomePageBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopPlayersHomePageBinding bind(View view, Object obj) {
        return (AdapterTopPlayersHomePageBinding) bind(obj, view, C1188R.C1193layout.adapter_top_players_home_page);
    }
}
