package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Match;
import com.google.android.material.tabs.TabLayout;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentCreateTeamBinding extends ViewDataBinding {
    public final TextView filterBoth;
    public final TextView filterTeamOne;
    public final TextView filterTeamTwo;
    public final ImageView ivBack;
    public final ImageView ivCancel;
    public final CircleImageView ivFlagBothTeam1;
    public final CircleImageView ivFlagBothTeam2;
    public final CircleImageView ivFlagTeam1;
    public final CircleImageView ivFlagTeam2;
    public final LinearLayout linearLayout7;
    public final LinearLayout llBottomButton;
    public final LinearLayout llTeams;
    @Bindable
    protected Match mVm;
    public final ProgressBar progressBar;
    public final RadioButton rbTeam1;
    public final RadioButton rbTeam2;
    public final RadioButton rbTeam3;
    public final RelativeLayout rlBoth;
    public final RelativeLayout rlPTS;
    public final RelativeLayout rlPlayersFilter;
    public final RelativeLayout rlTeam1;
    public final RelativeLayout rlTeam2;
    public final RelativeLayout rlTitle;
    public final RelativeLayout rlTop;
    public final TabLayout tabLayout;
    public final TextView teamOne;
    public final TextView teamTwo;
    public final TextView tvContinue;
    public final TextView tvCreditLeft;
    public final TextView tvPlayerSelected;
    public final TextView tvPreview;
    public final TextView tvTitle;
    public final ViewPager viewPager;

    public abstract void setVm(Match match);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentCreateTeamBinding(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, ImageView imageView, ImageView imageView2, CircleImageView circleImageView, CircleImageView circleImageView2, CircleImageView circleImageView3, CircleImageView circleImageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, TabLayout tabLayout2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, ViewPager viewPager2) {
        super(obj, view, i);
        this.filterBoth = textView;
        this.filterTeamOne = textView2;
        this.filterTeamTwo = textView3;
        this.ivBack = imageView;
        this.ivCancel = imageView2;
        this.ivFlagBothTeam1 = circleImageView;
        this.ivFlagBothTeam2 = circleImageView2;
        this.ivFlagTeam1 = circleImageView3;
        this.ivFlagTeam2 = circleImageView4;
        this.linearLayout7 = linearLayout;
        this.llBottomButton = linearLayout2;
        this.llTeams = linearLayout3;
        this.progressBar = progressBar2;
        this.rbTeam1 = radioButton;
        this.rbTeam2 = radioButton2;
        this.rbTeam3 = radioButton3;
        this.rlBoth = relativeLayout;
        this.rlPTS = relativeLayout2;
        this.rlPlayersFilter = relativeLayout3;
        this.rlTeam1 = relativeLayout4;
        this.rlTeam2 = relativeLayout5;
        this.rlTitle = relativeLayout6;
        this.rlTop = relativeLayout7;
        this.tabLayout = tabLayout2;
        this.teamOne = textView4;
        this.teamTwo = textView5;
        this.tvContinue = textView6;
        this.tvCreditLeft = textView7;
        this.tvPlayerSelected = textView8;
        this.tvPreview = textView9;
        this.tvTitle = textView10;
        this.viewPager = viewPager2;
    }

    public Match getVm() {
        return this.mVm;
    }

    public static FragmentCreateTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCreateTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentCreateTeamBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_create_team, viewGroup, z, obj);
    }

    public static FragmentCreateTeamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCreateTeamBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentCreateTeamBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_create_team, (ViewGroup) null, false, obj);
    }

    public static FragmentCreateTeamBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentCreateTeamBinding bind(View view, Object obj) {
        return (FragmentCreateTeamBinding) bind(obj, view, C1188R.C1193layout.fragment_create_team);
    }
}
