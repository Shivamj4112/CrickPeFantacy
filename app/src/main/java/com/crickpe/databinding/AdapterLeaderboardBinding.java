package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.data.leaderboard.LeaderboardModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterLeaderboardBinding extends ViewDataBinding {
    public final ImageView ivDotted;
    public final CircleImageView ivProfile;
    public final LinearLayout llProfile;
    @Bindable
    protected LeaderboardModel mModel;
    @Bindable
    protected int mPosi;
    public final LinearLayout rlMain;
    public final TextView tvAmount;
    public final TextView tvName;
    public final TextView tvPoints;
    public final TextView tvRank;
    public final TextView tvTeam;

    public abstract void setModel(LeaderboardModel leaderboardModel);

    public abstract void setPosi(int i);

    protected AdapterLeaderboardBinding(Object obj, View view, int i, ImageView imageView, CircleImageView circleImageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.ivDotted = imageView;
        this.ivProfile = circleImageView;
        this.llProfile = linearLayout;
        this.rlMain = linearLayout2;
        this.tvAmount = textView;
        this.tvName = textView2;
        this.tvPoints = textView3;
        this.tvRank = textView4;
        this.tvTeam = textView5;
    }

    public LeaderboardModel getModel() {
        return this.mModel;
    }

    public int getPosi() {
        return this.mPosi;
    }

    public static AdapterLeaderboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterLeaderboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterLeaderboardBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_leaderboard, viewGroup, z, obj);
    }

    public static AdapterLeaderboardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterLeaderboardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterLeaderboardBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_leaderboard, (ViewGroup) null, false, obj);
    }

    public static AdapterLeaderboardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterLeaderboardBinding bind(View view, Object obj) {
        return (AdapterLeaderboardBinding) bind(obj, view, C1188R.C1193layout.adapter_leaderboard);
    }
}
