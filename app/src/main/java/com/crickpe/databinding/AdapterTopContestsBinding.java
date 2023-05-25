package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterTopContestsBinding extends ViewDataBinding {
    public final CardView cvContest;
    public final TextView fee;
    public final FrameLayout flBorderContest;
    public final CircleImageView ivContest;
    public final ImageView ivContestType;
    public final ImageView ivVipTag;

    /* renamed from: ll */
    public final LinearLayout f456ll;
    public final LinearLayout llPrize;
    public final LinearLayout llProgress;
    public final LinearLayout llWinPercentage;
    public final LinearLayout llwinningAmount;
    @Bindable
    protected TopContestModel mModel;
    public final TextView megaAmount;
    public final ProgressBar progressBar;
    public final RelativeLayout rlBottom;
    public final RelativeLayout rlPrice;
    public final TextView spotLeft;
    public final TextView tvFee;
    public final TextView tvFee2;
    public final TextView tvFirstWinningAmount;
    public final TextView tvGlory;
    public final TextView tvNamee;
    public final TextView tvPrice;
    public final TextView tvTraining;

    public abstract void setModel(TopContestModel topContestModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AdapterTopContestsBinding(Object obj, View view, int i, CardView cardView, TextView textView, FrameLayout frameLayout, CircleImageView circleImageView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, TextView textView2, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        super(obj, view, i);
        this.cvContest = cardView;
        this.fee = textView;
        this.flBorderContest = frameLayout;
        this.ivContest = circleImageView;
        this.ivContestType = imageView;
        this.ivVipTag = imageView2;
        this.f456ll = linearLayout;
        this.llPrize = linearLayout2;
        this.llProgress = linearLayout3;
        this.llWinPercentage = linearLayout4;
        this.llwinningAmount = linearLayout5;
        this.megaAmount = textView2;
        this.progressBar = progressBar2;
        this.rlBottom = relativeLayout;
        this.rlPrice = relativeLayout2;
        this.spotLeft = textView3;
        this.tvFee = textView4;
        this.tvFee2 = textView5;
        this.tvFirstWinningAmount = textView6;
        this.tvGlory = textView7;
        this.tvNamee = textView8;
        this.tvPrice = textView9;
        this.tvTraining = textView10;
    }

    public TopContestModel getModel() {
        return this.mModel;
    }

    public static AdapterTopContestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopContestsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterTopContestsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_top_contests, viewGroup, z, obj);
    }

    public static AdapterTopContestsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopContestsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterTopContestsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_top_contests, (ViewGroup) null, false, obj);
    }

    public static AdapterTopContestsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterTopContestsBinding bind(View view, Object obj) {
        return (AdapterTopContestsBinding) bind(obj, view, C1188R.C1193layout.adapter_top_contests);
    }
}
