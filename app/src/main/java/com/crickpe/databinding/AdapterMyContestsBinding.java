package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterMyContestsBinding extends ViewDataBinding {
    public final FrameLayout flBorderMyContest;
    public final CircleImageView ivContest;
    public final ImageView ivContestType;
    public final LinearLayout llEntry;
    public final LinearLayout llPrize;
    public final LinearLayout llProgress;
    public final LinearLayout llTeamSequence;
    public final LinearLayout llTop;
    public final LinearLayout llWinPercentagee;
    public final LinearLayout llwinningAmount;
    @Bindable
    protected TopContestModel mModel;
    public final CardView onItemClick;
    public final RelativeLayout rlMyContest;
    public final RelativeLayout rlPricing;
    public final TextView rvMainWinnAmount;
    public final TextView tvAmount;
    public final TextView tvEntry;
    public final TextView tvJoin;
    public final TextView tvJoinWith;
    public final TextView tvMyGlory;
    public final TextView tvMyPrice;
    public final TextView tvMyTraining;
    public final TextView tvName;
    public final TextView tvTeamSequence;

    public abstract void setModel(TopContestModel topContestModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AdapterMyContestsBinding(Object obj, View view, int i, FrameLayout frameLayout, CircleImageView circleImageView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, CardView cardView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        super(obj, view, i);
        this.flBorderMyContest = frameLayout;
        this.ivContest = circleImageView;
        this.ivContestType = imageView;
        this.llEntry = linearLayout;
        this.llPrize = linearLayout2;
        this.llProgress = linearLayout3;
        this.llTeamSequence = linearLayout4;
        this.llTop = linearLayout5;
        this.llWinPercentagee = linearLayout6;
        this.llwinningAmount = linearLayout7;
        this.onItemClick = cardView;
        this.rlMyContest = relativeLayout;
        this.rlPricing = relativeLayout2;
        this.rvMainWinnAmount = textView;
        this.tvAmount = textView2;
        this.tvEntry = textView3;
        this.tvJoin = textView4;
        this.tvJoinWith = textView5;
        this.tvMyGlory = textView6;
        this.tvMyPrice = textView7;
        this.tvMyTraining = textView8;
        this.tvName = textView9;
        this.tvTeamSequence = textView10;
    }

    public TopContestModel getModel() {
        return this.mModel;
    }

    public static AdapterMyContestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyContestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterMyContestsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_my_contests, viewGroup, z, obj);
    }

    public static AdapterMyContestsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyContestsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterMyContestsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_my_contests, (ViewGroup) null, false, obj);
    }

    public static AdapterMyContestsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyContestsBinding bind(View view, Object obj) {
        return (AdapterMyContestsBinding) bind(obj, view, C1188R.C1193layout.adapter_my_contests);
    }
}
