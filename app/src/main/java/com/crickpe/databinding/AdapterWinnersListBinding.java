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
import com.crickpe.view.detail.fragments.contest_winners.models.model.WinnersList;

public abstract class AdapterWinnersListBinding extends ViewDataBinding {
    public final LinearLayout llDuck;
    public final LinearLayout llPrice;
    public final LinearLayout llProfile;
    @Bindable
    protected WinnersList mModel;
    @Bindable
    protected int mPosi;
    public final LinearLayout rlMain;
    public final TextView tvAmount;
    public final TextView tvName;
    public final TextView tvPoints;
    public final TextView tvRank;
    public final TextView tvWon;

    public abstract void setModel(WinnersList winnersList);

    public abstract void setPosi(int i);

    protected AdapterWinnersListBinding(Object obj, View view, int i, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.llDuck = linearLayout;
        this.llPrice = linearLayout2;
        this.llProfile = linearLayout3;
        this.rlMain = linearLayout4;
        this.tvAmount = textView;
        this.tvName = textView2;
        this.tvPoints = textView3;
        this.tvRank = textView4;
        this.tvWon = textView5;
    }

    public WinnersList getModel() {
        return this.mModel;
    }

    public int getPosi() {
        return this.mPosi;
    }

    public static AdapterWinnersListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterWinnersListBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_winners_list, viewGroup, z, obj);
    }

    public static AdapterWinnersListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersListBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterWinnersListBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_winners_list, (ViewGroup) null, false, obj);
    }

    public static AdapterWinnersListBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersListBinding bind(View view, Object obj) {
        return (AdapterWinnersListBinding) bind(obj, view, C1188R.C1193layout.adapter_winners_list);
    }
}
