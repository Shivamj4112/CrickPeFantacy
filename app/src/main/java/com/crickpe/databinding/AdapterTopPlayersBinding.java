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
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.top_players.models.Result;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterTopPlayersBinding extends ViewDataBinding {
    public final RelativeLayout imagesLayout;
    public final ImageView ivCrown;
    public final CircleImageView ivPlayer;
    public final ImageView ivRole;
    public final LinearLayout llEarnings;
    public final LinearLayout llProfile;
    @Bindable
    protected Result mModel;
    public final LinearLayout onItemClick;
    public final TextView points;
    public final RelativeLayout rlBody;
    public final RecyclerView rvFlags;
    public final TextView tvName;
    public final TextView tvRank;
    public final TextView tvTotalAmountt;
    public final View view;
    public final View view2;

    public abstract void setModel(Result result);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AdapterTopPlayersBinding(Object obj, View view3, int i, RelativeLayout relativeLayout, ImageView imageView, CircleImageView circleImageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4, View view4, View view5) {
        super(obj, view3, i);
        this.imagesLayout = relativeLayout;
        this.ivCrown = imageView;
        this.ivPlayer = circleImageView;
        this.ivRole = imageView2;
        this.llEarnings = linearLayout;
        this.llProfile = linearLayout2;
        this.onItemClick = linearLayout3;
        this.points = textView;
        this.rlBody = relativeLayout2;
        this.rvFlags = recyclerView;
        this.tvName = textView2;
        this.tvRank = textView3;
        this.tvTotalAmountt = textView4;
        this.view = view4;
        this.view2 = view5;
    }

    public Result getModel() {
        return this.mModel;
    }

    public static AdapterTopPlayersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopPlayersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterTopPlayersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_top_players, viewGroup, z, obj);
    }

    public static AdapterTopPlayersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopPlayersBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterTopPlayersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_top_players, (ViewGroup) null, false, obj);
    }

    public static AdapterTopPlayersBinding bind(View view3) {
        return bind(view3, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopPlayersBinding bind(View view3, Object obj) {
        return (AdapterTopPlayersBinding) bind(obj, view3, C1188R.C1193layout.adapter_top_players);
    }
}
