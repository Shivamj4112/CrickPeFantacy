package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.MyContestModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterMyCompletedContestsBinding extends ViewDataBinding {
    public final RelativeLayout bottomLayout;
    public final FrameLayout flBorderCompleted;
    public final CircleImageView ivContest;
    public final ImageView ivContestTypee;
    public final ImageView ivDuck;
    @Bindable
    protected MyContestModel mModel;
    public final CardView onItemClick;
    public final RecyclerView rvSequence;
    public final TextView tvEntry;
    public final TextView tvIwon;
    public final TextView tvName;
    public final TextView tvRejectedMatch;
    public final TextView tvTotalAmount;

    public abstract void setModel(MyContestModel myContestModel);

    protected AdapterMyCompletedContestsBinding(Object obj, View view, int i, RelativeLayout relativeLayout, FrameLayout frameLayout, CircleImageView circleImageView, ImageView imageView, ImageView imageView2, CardView cardView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        super(obj, view, i);
        this.bottomLayout = relativeLayout;
        this.flBorderCompleted = frameLayout;
        this.ivContest = circleImageView;
        this.ivContestTypee = imageView;
        this.ivDuck = imageView2;
        this.onItemClick = cardView;
        this.rvSequence = recyclerView;
        this.tvEntry = textView;
        this.tvIwon = textView2;
        this.tvName = textView3;
        this.tvRejectedMatch = textView4;
        this.tvTotalAmount = textView5;
    }

    public MyContestModel getModel() {
        return this.mModel;
    }

    public static AdapterMyCompletedContestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyCompletedContestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterMyCompletedContestsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_my_completed_contests, viewGroup, z, obj);
    }

    public static AdapterMyCompletedContestsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyCompletedContestsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterMyCompletedContestsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_my_completed_contests, (ViewGroup) null, false, obj);
    }

    public static AdapterMyCompletedContestsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterMyCompletedContestsBinding bind(View view, Object obj) {
        return (AdapterMyCompletedContestsBinding) bind(obj, view, C1188R.C1193layout.adapter_my_completed_contests);
    }
}
