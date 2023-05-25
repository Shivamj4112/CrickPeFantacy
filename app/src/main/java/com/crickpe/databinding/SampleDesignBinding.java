package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;

public abstract class SampleDesignBinding extends ViewDataBinding {
    public final CardView currentItemRoot;
    public final LinearLayout llShareReferalCode;
    @Bindable
    protected ContestDetailModel mModel;
    public final TextView name;
    public final ProgressBar progressBar;
    public final TextView tvContact;
    public final TextView tvContestCode;
    public final TextView tvContestLink;
    public final TextView tvDone;
    public final TextView tvInvitee;
    public final TextView tvName;
    public final TextView tvOverT1;
    public final TextView tvOverT2;
    public final TextView tvScoreT1;
    public final TextView tvScoreT2;
    public final TextView tvShare;

    public abstract void setModel(ContestDetailModel contestDetailModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected SampleDesignBinding(Object obj, View view, int i, CardView cardView, LinearLayout linearLayout, TextView textView, ProgressBar progressBar2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        super(obj, view, i);
        this.currentItemRoot = cardView;
        this.llShareReferalCode = linearLayout;
        this.name = textView;
        this.progressBar = progressBar2;
        this.tvContact = textView2;
        this.tvContestCode = textView3;
        this.tvContestLink = textView4;
        this.tvDone = textView5;
        this.tvInvitee = textView6;
        this.tvName = textView7;
        this.tvOverT1 = textView8;
        this.tvOverT2 = textView9;
        this.tvScoreT1 = textView10;
        this.tvScoreT2 = textView11;
        this.tvShare = textView12;
    }

    public ContestDetailModel getModel() {
        return this.mModel;
    }

    public static SampleDesignBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static SampleDesignBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (SampleDesignBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.sample_design, viewGroup, z, obj);
    }

    public static SampleDesignBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static SampleDesignBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (SampleDesignBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.sample_design, (ViewGroup) null, false, obj);
    }

    public static SampleDesignBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static SampleDesignBinding bind(View view, Object obj) {
        return (SampleDesignBinding) bind(obj, view, C1188R.C1193layout.sample_design);
    }
}
