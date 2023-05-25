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
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BattingOrder;

public abstract class AdapterBatterScoreBinding extends ViewDataBinding {
    @Bindable
    protected BattingOrder mModel;
    public final RelativeLayout onItemClick;
    public final RelativeLayout rlPlayer;
    public final TextView tvName;
    public final TextView tvStrikeRate;
    public final View view2;

    public abstract void setModel(BattingOrder battingOrder);

    protected AdapterBatterScoreBinding(Object obj, View view, int i, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, View view3) {
        super(obj, view, i);
        this.onItemClick = relativeLayout;
        this.rlPlayer = relativeLayout2;
        this.tvName = textView;
        this.tvStrikeRate = textView2;
        this.view2 = view3;
    }

    public BattingOrder getModel() {
        return this.mModel;
    }

    public static AdapterBatterScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBatterScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterBatterScoreBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_batter_score, viewGroup, z, obj);
    }

    public static AdapterBatterScoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBatterScoreBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterBatterScoreBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_batter_score, (ViewGroup) null, false, obj);
    }

    public static AdapterBatterScoreBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBatterScoreBinding bind(View view, Object obj) {
        return (AdapterBatterScoreBinding) bind(obj, view, C1188R.C1193layout.adapter_batter_score);
    }
}
