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
import com.crickpe.view.detail.fragments.my_matches_detail.Players;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterPlayersPotBinding extends ViewDataBinding {
    public final TextView battingStyle;
    public final RelativeLayout imagesLayout;
    public final CircleImageView ivPlayer;
    public final ImageView ivRole;
    public final CircleImageView ivTeamFlag;
    public final LinearLayout llProfile;
    public final LinearLayout llname;
    @Bindable
    protected Players mModel;
    public final RelativeLayout onItemClick;
    public final TextView tvName;
    public final TextView tvPoints;
    public final View view;
    public final View view2;

    public abstract void setModel(Players players);

    protected AdapterPlayersPotBinding(Object obj, View view3, int i, TextView textView, RelativeLayout relativeLayout, CircleImageView circleImageView, ImageView imageView, CircleImageView circleImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout2, TextView textView2, TextView textView3, View view4, View view5) {
        super(obj, view3, i);
        this.battingStyle = textView;
        this.imagesLayout = relativeLayout;
        this.ivPlayer = circleImageView;
        this.ivRole = imageView;
        this.ivTeamFlag = circleImageView2;
        this.llProfile = linearLayout;
        this.llname = linearLayout2;
        this.onItemClick = relativeLayout2;
        this.tvName = textView2;
        this.tvPoints = textView3;
        this.view = view4;
        this.view2 = view5;
    }

    public Players getModel() {
        return this.mModel;
    }

    public static AdapterPlayersPotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPlayersPotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterPlayersPotBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_players_pot, viewGroup, z, obj);
    }

    public static AdapterPlayersPotBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPlayersPotBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterPlayersPotBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_players_pot, (ViewGroup) null, false, obj);
    }

    public static AdapterPlayersPotBinding bind(View view3) {
        return bind(view3, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPlayersPotBinding bind(View view3, Object obj) {
        return (AdapterPlayersPotBinding) bind(obj, view3, C1188R.C1193layout.adapter_players_pot);
    }
}
