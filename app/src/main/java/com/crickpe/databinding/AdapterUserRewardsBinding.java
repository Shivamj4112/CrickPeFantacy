package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterUserRewardsBinding extends ViewDataBinding {
    public final CircleImageView ivFirst;
    public final CircleImageView ivPlayer;
    public final CircleImageView ivSecond;
    public final ImageView ivThumb;
    public final ImageView ivTopPlayer;
    public final CircleImageView ivUser;
    public final ConstraintLayout llCarReward;
    public final LinearLayout llFirstHighest;
    public final LinearLayout llPLayers;
    public final LinearLayout llProfile;
    public final LinearLayout llRanking;
    public final LinearLayout llRewardPlayer;
    public final LinearLayout llSecondHighest;
    public final LinearLayout llText;
    public final ConstraintLayout llTextView27;
    @Bindable
    protected TrackerModel mModel;
    public final RelativeLayout rlTop;
    public final RelativeLayout rlTopPlayer;
    public final SeekBar seekBar;
    public final TextView textView;
    public final TextView textView28;
    public final TextView textView29;
    public final TextView textView30;
    public final TextView tvCarName;
    public final TextView tvHighest;
    public final LinearLayout tvHighestPays;
    public final TextView tvMyRank;
    public final TextView tvPlayer1Name;
    public final TextView tvPlayer2Name;
    public final TextView tvRank;
    public final TextView tvRewardBy;
    public final TextView tvRewardValueBal;
    public final TextView tvTotal;
    public final View view;

    public abstract void setModel(TrackerModel trackerModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AdapterUserRewardsBinding(Object obj, View view2, int i, CircleImageView circleImageView, CircleImageView circleImageView2, CircleImageView circleImageView3, ImageView imageView, ImageView imageView2, CircleImageView circleImageView4, ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, ConstraintLayout constraintLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, SeekBar seekBar2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LinearLayout linearLayout8, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, View view3) {
        super(obj, view2, i);
        this.ivFirst = circleImageView;
        this.ivPlayer = circleImageView2;
        this.ivSecond = circleImageView3;
        this.ivThumb = imageView;
        this.ivTopPlayer = imageView2;
        this.ivUser = circleImageView4;
        this.llCarReward = constraintLayout;
        this.llFirstHighest = linearLayout;
        this.llPLayers = linearLayout2;
        this.llProfile = linearLayout3;
        this.llRanking = linearLayout4;
        this.llRewardPlayer = linearLayout5;
        this.llSecondHighest = linearLayout6;
        this.llText = linearLayout7;
        this.llTextView27 = constraintLayout2;
        this.rlTop = relativeLayout;
        this.rlTopPlayer = relativeLayout2;
        this.seekBar = seekBar2;
        this.textView = textView2;
        this.textView28 = textView3;
        this.textView29 = textView4;
        this.textView30 = textView5;
        this.tvCarName = textView6;
        this.tvHighest = textView7;
        this.tvHighestPays = linearLayout8;
        this.tvMyRank = textView8;
        this.tvPlayer1Name = textView9;
        this.tvPlayer2Name = textView10;
        this.tvRank = textView11;
        this.tvRewardBy = textView12;
        this.tvRewardValueBal = textView13;
        this.tvTotal = textView14;
        this.view = view3;
    }

    public TrackerModel getModel() {
        return this.mModel;
    }

    public static AdapterUserRewardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUserRewardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterUserRewardsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_user_rewards, viewGroup, z, obj);
    }

    public static AdapterUserRewardsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUserRewardsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterUserRewardsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_user_rewards, (ViewGroup) null, false, obj);
    }

    public static AdapterUserRewardsBinding bind(View view2) {
        return bind(view2, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUserRewardsBinding bind(View view2, Object obj) {
        return (AdapterUserRewardsBinding) bind(obj, view2, C1188R.C1193layout.adapter_user_rewards);
    }
}
