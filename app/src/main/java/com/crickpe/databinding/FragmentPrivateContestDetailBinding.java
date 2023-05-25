package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentPrivateContestDetailBinding extends ViewDataBinding {
    public final CardView currentItemRoot;
    public final ImageView ivInvite;
    public final LinearLayout llProgress;
    @Bindable
    protected ContestDetailModel mModel;
    public final TextView name;
    public final NestedScrollView nestedScrollView3;
    public final CircleImageView playerImageOne;
    public final ProgressBar progressBar;
    public final RelativeLayout rlInviteFrnd;
    public final RelativeLayout rlProgress;
    public final RelativeLayout rlTop;
    public final RecyclerView rvJoinedFriends;
    public final TextView textView12;
    public final TextView tvInvite;
    public final TextView tvJoin;
    public final TextView tvJoined;
    public final TextView tvName;
    public final TextView tvOverT1;
    public final TextView tvOverT2;
    public final TextView tvScoreT1;
    public final TextView tvScoreT2;
    public final TextView tvTotalSpots;

    public abstract void setModel(ContestDetailModel contestDetailModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentPrivateContestDetailBinding(Object obj, View view, int i, CardView cardView, ImageView imageView, LinearLayout linearLayout, TextView textView, NestedScrollView nestedScrollView, CircleImageView circleImageView, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        super(obj, view, i);
        this.currentItemRoot = cardView;
        this.ivInvite = imageView;
        this.llProgress = linearLayout;
        this.name = textView;
        this.nestedScrollView3 = nestedScrollView;
        this.playerImageOne = circleImageView;
        this.progressBar = progressBar2;
        this.rlInviteFrnd = relativeLayout;
        this.rlProgress = relativeLayout2;
        this.rlTop = relativeLayout3;
        this.rvJoinedFriends = recyclerView;
        this.textView12 = textView2;
        this.tvInvite = textView3;
        this.tvJoin = textView4;
        this.tvJoined = textView5;
        this.tvName = textView6;
        this.tvOverT1 = textView7;
        this.tvOverT2 = textView8;
        this.tvScoreT1 = textView9;
        this.tvScoreT2 = textView10;
        this.tvTotalSpots = textView11;
    }

    public ContestDetailModel getModel() {
        return this.mModel;
    }

    public static FragmentPrivateContestDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPrivateContestDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPrivateContestDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_private_contest_detail, viewGroup, z, obj);
    }

    public static FragmentPrivateContestDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPrivateContestDetailBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPrivateContestDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_private_contest_detail, (ViewGroup) null, false, obj);
    }

    public static FragmentPrivateContestDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPrivateContestDetailBinding bind(View view, Object obj) {
        return (FragmentPrivateContestDetailBinding) bind(obj, view, C1188R.C1193layout.fragment_private_contest_detail);
    }
}
