package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public abstract class FragmentShareContestBinding extends ViewDataBinding {
    public final BottomSheetContactsBinding bottomSheetContact;
    public final CardView currentItemRoot;
    public final LinearLayout llCopyCode;
    public final LinearLayout llCopyLink;
    public final LinearLayout llShareReferalCode;
    public final LinearLayout llShareReferalLink;
    @Bindable
    protected ContestDetailModel mModel;
    public final TextView name;
    public final NestedScrollView nestedScrollView2;
    public final ProgressBar progressBar;
    public final RelativeLayout rlContactLayout;
    public final RelativeLayout rlInviteFrnd;
    public final RelativeLayout rlShare1;
    public final RelativeLayout rlShare2;
    public final RecyclerView rvPreviousContacts;
    public final RecyclerView rvSelectedContacts;
    public final TextView tvContact;
    public final TextView tvContestCode;
    public final TextView tvContestLink;
    public final TextView tvDone;
    public final TextView tvInvite;
    public final TextView tvInvitePeople;
    public final TextView tvInvitee;
    public final TextView tvJoinPeople;
    public final TextView tvName;
    public final TextView tvNumberOfInvitation;
    public final TextView tvOverT1;
    public final TextView tvOverT2;
    public final TextView tvScoreT1;
    public final TextView tvScoreT2;
    public final TextView tvShare;

    public abstract void setModel(ContestDetailModel contestDetailModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentShareContestBinding(Object obj, View view, int i, BottomSheetContactsBinding bottomSheetContactsBinding, CardView cardView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, TextView textView, NestedScrollView nestedScrollView, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16) {
        super(obj, view, i);
        this.bottomSheetContact = bottomSheetContactsBinding;
        this.currentItemRoot = cardView;
        this.llCopyCode = linearLayout;
        this.llCopyLink = linearLayout2;
        this.llShareReferalCode = linearLayout3;
        this.llShareReferalLink = linearLayout4;
        this.name = textView;
        this.nestedScrollView2 = nestedScrollView;
        this.progressBar = progressBar2;
        this.rlContactLayout = relativeLayout;
        this.rlInviteFrnd = relativeLayout2;
        this.rlShare1 = relativeLayout3;
        this.rlShare2 = relativeLayout4;
        this.rvPreviousContacts = recyclerView;
        this.rvSelectedContacts = recyclerView2;
        this.tvContact = textView2;
        this.tvContestCode = textView3;
        this.tvContestLink = textView4;
        this.tvDone = textView5;
        this.tvInvite = textView6;
        this.tvInvitePeople = textView7;
        this.tvInvitee = textView8;
        this.tvJoinPeople = textView9;
        this.tvName = textView10;
        this.tvNumberOfInvitation = textView11;
        this.tvOverT1 = textView12;
        this.tvOverT2 = textView13;
        this.tvScoreT1 = textView14;
        this.tvScoreT2 = textView15;
        this.tvShare = textView16;
    }

    public ContestDetailModel getModel() {
        return this.mModel;
    }

    public static FragmentShareContestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShareContestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentShareContestBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_share_contest, viewGroup, z, obj);
    }

    public static FragmentShareContestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShareContestBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentShareContestBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_share_contest, (ViewGroup) null, false, obj);
    }

    public static FragmentShareContestBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShareContestBinding bind(View view, Object obj) {
        return (FragmentShareContestBinding) bind(obj, view, C1188R.C1193layout.fragment_share_contest);
    }
}
