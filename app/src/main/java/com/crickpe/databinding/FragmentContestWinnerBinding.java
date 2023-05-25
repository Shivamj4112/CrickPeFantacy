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
import com.crickpe.view.detail.fragments.contest_winners.models.model.ContestDetailWinnersModel;

public abstract class FragmentContestWinnerBinding extends ViewDataBinding {
    public final CardView cvUpcomingMatches;
    public final TextView filter;
    public final ImageView ivFiler;
    public final LinearLayout llProfile;
    @Bindable
    protected ContestDetailWinnersModel mModel;
    public final LinearLayout onItemClick;
    public final ProgressBar progressBar;
    public final RecyclerView recyclerView;
    public final RelativeLayout rlFilterContest;
    public final RecyclerView rvFilterWinners;
    public final RecyclerView rvWinnersList;
    public final TextView tvContestPrice;
    public final TextView tvDate;
    public final TextView tvMatchName;
    public final TextView tvName;
    public final TextView tvPoints;

    public abstract void setModel(ContestDetailWinnersModel contestDetailWinnersModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentContestWinnerBinding(Object obj, View view, int i, CardView cardView, TextView textView, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar2, RecyclerView recyclerView2, RelativeLayout relativeLayout, RecyclerView recyclerView3, RecyclerView recyclerView4, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.cvUpcomingMatches = cardView;
        this.filter = textView;
        this.ivFiler = imageView;
        this.llProfile = linearLayout;
        this.onItemClick = linearLayout2;
        this.progressBar = progressBar2;
        this.recyclerView = recyclerView2;
        this.rlFilterContest = relativeLayout;
        this.rvFilterWinners = recyclerView3;
        this.rvWinnersList = recyclerView4;
        this.tvContestPrice = textView2;
        this.tvDate = textView3;
        this.tvMatchName = textView4;
        this.tvName = textView5;
        this.tvPoints = textView6;
    }

    public ContestDetailWinnersModel getModel() {
        return this.mModel;
    }

    public static FragmentContestWinnerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentContestWinnerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentContestWinnerBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_contest_winner, viewGroup, z, obj);
    }

    public static FragmentContestWinnerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentContestWinnerBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentContestWinnerBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_contest_winner, (ViewGroup) null, false, obj);
    }

    public static FragmentContestWinnerBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentContestWinnerBinding bind(View view, Object obj) {
        return (FragmentContestWinnerBinding) bind(obj, view, C1188R.C1193layout.fragment_contest_winner);
    }
}
