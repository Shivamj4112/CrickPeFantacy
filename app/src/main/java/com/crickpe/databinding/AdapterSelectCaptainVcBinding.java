package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Players;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterSelectCaptainVcBinding extends ViewDataBinding {
    public final ConstraintLayout constrainTop;
    public final TextView halfx;
    public final RelativeLayout imagesLayout;
    public final CircleImageView ivFlag;
    public final CircleImageView ivPlayerCVc;
    public final ImageView ivRole;
    public final LinearLayout llSelection;
    @Bindable
    protected Players mModel;
    public final TextView points;
    public final RelativeLayout relativeLayout;
    public final TextView selectionPercentage;
    public final TextView tvBattingStyle;
    public final TextView tvCaptain;
    public final TextView tvPointsCaptainVc;
    public final TextView tvTeamCode;
    public final TextView tvVCaptain;
    public final TextView tvVcPer;
    public final TextView twox;

    public abstract void setModel(Players players);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AdapterSelectCaptainVcBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, RelativeLayout relativeLayout2, CircleImageView circleImageView, CircleImageView circleImageView2, ImageView imageView, LinearLayout linearLayout, TextView textView2, RelativeLayout relativeLayout3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        super(obj, view, i);
        this.constrainTop = constraintLayout;
        this.halfx = textView;
        this.imagesLayout = relativeLayout2;
        this.ivFlag = circleImageView;
        this.ivPlayerCVc = circleImageView2;
        this.ivRole = imageView;
        this.llSelection = linearLayout;
        this.points = textView2;
        this.relativeLayout = relativeLayout3;
        this.selectionPercentage = textView3;
        this.tvBattingStyle = textView4;
        this.tvCaptain = textView5;
        this.tvPointsCaptainVc = textView6;
        this.tvTeamCode = textView7;
        this.tvVCaptain = textView8;
        this.tvVcPer = textView9;
        this.twox = textView10;
    }

    public Players getModel() {
        return this.mModel;
    }

    public static AdapterSelectCaptainVcBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectCaptainVcBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterSelectCaptainVcBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_select_captain_vc, viewGroup, z, obj);
    }

    public static AdapterSelectCaptainVcBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectCaptainVcBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterSelectCaptainVcBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_select_captain_vc, (ViewGroup) null, false, obj);
    }

    public static AdapterSelectCaptainVcBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectCaptainVcBinding bind(View view, Object obj) {
        return (AdapterSelectCaptainVcBinding) bind(obj, view, C1188R.C1193layout.adapter_select_captain_vc);
    }
}
