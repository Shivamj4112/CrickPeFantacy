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
import com.crickpe.view.home.fragments.rewards.my_reward_model.MyRewardModelItem;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterMyRewardBinding extends ViewDataBinding {
    public final CircleImageView ivPlayer;
    public final LinearLayout llMyRewards;
    @Bindable
    protected MyRewardModelItem mModel;
    public final TextView tvDate;

    public abstract void setModel(MyRewardModelItem myRewardModelItem);

    protected AdapterMyRewardBinding(Object obj, View view, int i, CircleImageView circleImageView, LinearLayout linearLayout, TextView textView) {
        super(obj, view, i);
        this.ivPlayer = circleImageView;
        this.llMyRewards = linearLayout;
        this.tvDate = textView;
    }

    public MyRewardModelItem getModel() {
        return this.mModel;
    }

    public static AdapterMyRewardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyRewardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterMyRewardBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_my_reward, viewGroup, z, obj);
    }

    public static AdapterMyRewardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyRewardBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterMyRewardBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_my_reward, (ViewGroup) null, false, obj);
    }

    public static AdapterMyRewardBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyRewardBinding bind(View view, Object obj) {
        return (AdapterMyRewardBinding) bind(obj, view, C1188R.C1193layout.adapter_my_reward);
    }
}
