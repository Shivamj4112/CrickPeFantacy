package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.MyContestModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterMyLiveContestsBinding extends ViewDataBinding {
    public final FrameLayout flBorder;
    public final CircleImageView ivContest;
    public final ImageView ivContestType;
    public final LinearLayout llTeamSequencee;
    public final LinearLayout llwinningAmount;
    @Bindable
    protected MyContestModel mModel;
    public final CardView onItemClick;
    public final TextView tvEntry;
    public final TextView tvJoin;
    public final TextView tvJoinWith;
    public final TextView tvName;
    public final TextView tvRejected;
    public final TextView tvTeamSequence;

    public abstract void setModel(MyContestModel myContestModel);

    protected AdapterMyLiveContestsBinding(Object obj, View view, int i, FrameLayout frameLayout, CircleImageView circleImageView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, CardView cardView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.flBorder = frameLayout;
        this.ivContest = circleImageView;
        this.ivContestType = imageView;
        this.llTeamSequencee = linearLayout;
        this.llwinningAmount = linearLayout2;
        this.onItemClick = cardView;
        this.tvEntry = textView;
        this.tvJoin = textView2;
        this.tvJoinWith = textView3;
        this.tvName = textView4;
        this.tvRejected = textView5;
        this.tvTeamSequence = textView6;
    }

    public MyContestModel getModel() {
        return this.mModel;
    }

    public static AdapterMyLiveContestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyLiveContestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterMyLiveContestsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_my_live_contests, viewGroup, z, obj);
    }

    public static AdapterMyLiveContestsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyLiveContestsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterMyLiveContestsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_my_live_contests, (ViewGroup) null, false, obj);
    }

    public static AdapterMyLiveContestsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyLiveContestsBinding bind(View view, Object obj) {
        return (AdapterMyLiveContestsBinding) bind(obj, view, C1188R.C1193layout.adapter_my_live_contests);
    }
}
