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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentJoinContestDetailBinding extends ViewDataBinding {
    public final CardView cvTop;
    public final TextView fee;
    public final CircleImageView ivContest;
    public final ImageView ivContestType;
    public final TextView joiningFee;
    public final LinearLayout linearLayout8;

    /* renamed from: ll */
    public final LinearLayout f459ll;
    public final LinearLayout llProgress;
    public final LinearLayout llwinningAmount;
    @Bindable
    protected ContestDetailModel mModel;
    public final RelativeLayout megaAmount;
    public final TextView prizePool;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout3;
    public final RelativeLayout rlEntry;
    public final RecyclerView rvWinnings;
    public final TextView spots;
    public final TextView tvFee;
    public final TextView tvJoiningFee;
    public final TextView tvName;
    public final TextView tvPoolPrize;
    public final TextView tvPrice;
    public final TextView tvSpotLeft;
    public final TextView tvSpots;
    public final TextView tvwinnings;

    public abstract void setModel(ContestDetailModel contestDetailModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentJoinContestDetailBinding(Object obj, View view, int i, CardView cardView, TextView textView, CircleImageView circleImageView, ImageView imageView, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout, TextView textView3, ProgressBar progressBar2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout4, RecyclerView recyclerView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12) {
        super(obj, view, i);
        this.cvTop = cardView;
        this.fee = textView;
        this.ivContest = circleImageView;
        this.ivContestType = imageView;
        this.joiningFee = textView2;
        this.linearLayout8 = linearLayout;
        this.f459ll = linearLayout2;
        this.llProgress = linearLayout3;
        this.llwinningAmount = linearLayout4;
        this.megaAmount = relativeLayout;
        this.prizePool = textView3;
        this.progressBar = progressBar2;
        this.relativeLayout3 = relativeLayout2;
        this.rlEntry = relativeLayout4;
        this.rvWinnings = recyclerView;
        this.spots = textView4;
        this.tvFee = textView5;
        this.tvJoiningFee = textView6;
        this.tvName = textView7;
        this.tvPoolPrize = textView8;
        this.tvPrice = textView9;
        this.tvSpotLeft = textView10;
        this.tvSpots = textView11;
        this.tvwinnings = textView12;
    }

    public ContestDetailModel getModel() {
        return this.mModel;
    }

    public static FragmentJoinContestDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentJoinContestDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentJoinContestDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_join_contest_detail, viewGroup, z, obj);
    }

    public static FragmentJoinContestDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentJoinContestDetailBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentJoinContestDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_join_contest_detail, (ViewGroup) null, false, obj);
    }

    public static FragmentJoinContestDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentJoinContestDetailBinding bind(View view, Object obj) {
        return (FragmentJoinContestDetailBinding) bind(obj, view, C1188R.C1193layout.fragment_join_contest_detail);
    }
}
