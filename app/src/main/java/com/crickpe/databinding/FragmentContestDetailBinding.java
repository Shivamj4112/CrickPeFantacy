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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentContestDetailBinding extends ViewDataBinding {
    public final ConstraintLayout constrainWinning;
    public final CardView cvTop;
    public final TextView fee;
    public final CircleImageView ivContest;
    public final ImageView ivContestType;
    public final TextView joiningFee;
    public final LinearLayout linearLayout8;

    /* renamed from: ll */
    public final LinearLayout f458ll;
    public final LinearLayout llPrize;
    public final LinearLayout llProgress;
    public final LinearLayout llTraining;
    public final LinearLayout llWiningPercentage;
    public final LinearLayout llwinningAmount;
    @Bindable
    protected TopContestModel mModel;
    public final TextView megaAmount;
    public final TextView prizePool;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout3;
    public final RelativeLayout rlEntry;
    public final RecyclerView rvWinnings;
    public final TextView spots;
    public final TextView tvFee;
    public final TextView tvFee2;
    public final TextView tvJoiningFee;
    public final TextView tvMGlory;
    public final TextView tvName;
    public final TextView tvPoolPrize;
    public final TextView tvPrice;
    public final TextView tvSpotLeft;
    public final TextView tvSpots;
    public final TextView tvTraining;
    public final TextView tvmWinningAmount;
    public final TextView tvwinnings;

    public abstract void setModel(TopContestModel topContestModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentContestDetailBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, CardView cardView, TextView textView, CircleImageView circleImageView, ImageView imageView, TextView textView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, TextView textView3, TextView textView4, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17) {
        super(obj, view, i);
        this.constrainWinning = constraintLayout;
        this.cvTop = cardView;
        this.fee = textView;
        this.ivContest = circleImageView;
        this.ivContestType = imageView;
        this.joiningFee = textView2;
        this.linearLayout8 = linearLayout;
        this.f458ll = linearLayout2;
        this.llPrize = linearLayout3;
        this.llProgress = linearLayout4;
        this.llTraining = linearLayout5;
        this.llWiningPercentage = linearLayout6;
        this.llwinningAmount = linearLayout7;
        this.megaAmount = textView3;
        this.prizePool = textView4;
        this.progressBar = progressBar2;
        this.relativeLayout3 = relativeLayout;
        this.rlEntry = relativeLayout2;
        this.rvWinnings = recyclerView;
        this.spots = textView5;
        this.tvFee = textView6;
        this.tvFee2 = textView7;
        this.tvJoiningFee = textView8;
        this.tvMGlory = textView9;
        this.tvName = textView10;
        this.tvPoolPrize = textView11;
        this.tvPrice = textView12;
        this.tvSpotLeft = textView13;
        this.tvSpots = textView14;
        this.tvTraining = textView15;
        this.tvmWinningAmount = textView16;
        this.tvwinnings = textView17;
    }

    public TopContestModel getModel() {
        return this.mModel;
    }

    public static FragmentContestDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentContestDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentContestDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_contest_detail, viewGroup, z, obj);
    }

    public static FragmentContestDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentContestDetailBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentContestDetailBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_contest_detail, (ViewGroup) null, false, obj);
    }

    public static FragmentContestDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentContestDetailBinding bind(View view, Object obj) {
        return (FragmentContestDetailBinding) bind(obj, view, C1188R.C1193layout.fragment_contest_detail);
    }
}
