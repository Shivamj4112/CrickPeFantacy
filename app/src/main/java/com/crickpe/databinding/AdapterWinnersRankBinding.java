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
import com.crickpe.view.detail.fragments.create_contest.TeamWinnings;

public abstract class AdapterWinnersRankBinding extends ViewDataBinding {
    public final ImageView ivCrown;
    public final LinearLayout linearLayout11;
    @Bindable
    protected TeamWinnings mModel;
    public final TextView tvIndex;
    public final View view;

    public abstract void setModel(TeamWinnings teamWinnings);

    protected AdapterWinnersRankBinding(Object obj, View view2, int i, ImageView imageView, LinearLayout linearLayout, TextView textView, View view3) {
        super(obj, view2, i);
        this.ivCrown = imageView;
        this.linearLayout11 = linearLayout;
        this.tvIndex = textView;
        this.view = view3;
    }

    public TeamWinnings getModel() {
        return this.mModel;
    }

    public static AdapterWinnersRankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersRankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterWinnersRankBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_winners_rank, viewGroup, z, obj);
    }

    public static AdapterWinnersRankBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersRankBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterWinnersRankBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_winners_rank, (ViewGroup) null, false, obj);
    }

    public static AdapterWinnersRankBinding bind(View view2) {
        return bind(view2, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersRankBinding bind(View view2, Object obj) {
        return (AdapterWinnersRankBinding) bind(obj, view2, C1188R.C1193layout.adapter_winners_rank);
    }
}
