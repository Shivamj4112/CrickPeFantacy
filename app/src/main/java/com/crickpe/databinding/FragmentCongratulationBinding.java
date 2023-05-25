package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;

public abstract class FragmentCongratulationBinding extends ViewDataBinding {
    public final LinearLayout llCopyCode;
    public final LinearLayout llShareContestUrl;
    public final LinearLayout llShareReferalCode;
    @Bindable
    protected Contest mModel;
    public final TextView tvContestCode;
    public final TextView tvContestLink;
    public final TextView tvContinue;
    public final TextView tvInvitee;
    public final TextView tvShare;

    public abstract void setModel(Contest contest);

    protected FragmentCongratulationBinding(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.llCopyCode = linearLayout;
        this.llShareContestUrl = linearLayout2;
        this.llShareReferalCode = linearLayout3;
        this.tvContestCode = textView;
        this.tvContestLink = textView2;
        this.tvContinue = textView3;
        this.tvInvitee = textView4;
        this.tvShare = textView5;
    }

    public Contest getModel() {
        return this.mModel;
    }

    public static FragmentCongratulationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCongratulationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentCongratulationBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_congratulation, viewGroup, z, obj);
    }

    public static FragmentCongratulationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCongratulationBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentCongratulationBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_congratulation, (ViewGroup) null, false, obj);
    }

    public static FragmentCongratulationBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCongratulationBinding bind(View view, Object obj) {
        return (FragmentCongratulationBinding) bind(obj, view, C1188R.C1193layout.fragment_congratulation);
    }
}
