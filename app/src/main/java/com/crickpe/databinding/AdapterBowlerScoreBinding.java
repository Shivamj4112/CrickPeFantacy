package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BowlingOrder;

public abstract class AdapterBowlerScoreBinding extends ViewDataBinding {
    @Bindable
    protected BowlingOrder mModel;
    public final RelativeLayout onItemClick;
    public final RelativeLayout rlPlayer;
    public final TextView tvEconomy;
    public final TextView tvName;
    public final View view2;

    public abstract void setModel(BowlingOrder bowlingOrder);

    protected AdapterBowlerScoreBinding(Object obj, View view, int i, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, View view3) {
        super(obj, view, i);
        this.onItemClick = relativeLayout;
        this.rlPlayer = relativeLayout2;
        this.tvEconomy = textView;
        this.tvName = textView2;
        this.view2 = view3;
    }

    public BowlingOrder getModel() {
        return this.mModel;
    }

    public static AdapterBowlerScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBowlerScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterBowlerScoreBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_bowler_score, viewGroup, z, obj);
    }

    public static AdapterBowlerScoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBowlerScoreBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterBowlerScoreBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_bowler_score, (ViewGroup) null, false, obj);
    }

    public static AdapterBowlerScoreBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBowlerScoreBinding bind(View view, Object obj) {
        return (AdapterBowlerScoreBinding) bind(obj, view, C1188R.C1193layout.adapter_bowler_score);
    }
}
