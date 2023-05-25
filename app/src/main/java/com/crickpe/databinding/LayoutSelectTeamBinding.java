package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Players;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class LayoutSelectTeamBinding extends ViewDataBinding {
    public final ImageView checkbox;
    public final RelativeLayout imagesLayout;
    public final ImageView ivBowlingStyle;
    public final ImageView ivCup1;
    public final ImageView ivCup2;
    public final ImageView ivCup3;
    public final ImageView ivCup4;
    public final ImageView ivCup5;
    public final CircleImageView ivFlag;
    public final ImageView ivIsPlaying;
    public final ImageView ivIsPlayingNot;
    public final CircleImageView ivPlayer;
    public final ImageView ivRole;
    @Bindable
    protected Players mModel;
    public final ConstraintLayout onItemClick;
    public final TextView points;
    public final RelativeLayout relativeLayout;
    public final ConstraintLayout rlBowlingStyle;
    public final RelativeLayout rlCup1;
    public final RelativeLayout rlCup2;
    public final RelativeLayout rlCup3;
    public final RelativeLayout rlCup4;
    public final RelativeLayout rlCup5;
    public final TextView tvAnnouced;
    public final TextView tvBattingStyle;
    public final TextView tvBowlingStyle;
    public final TextView tvSeeAll;
    public final TextView tvTeamCode;
    public final TextView tvpoints;

    public abstract void setModel(Players players);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected LayoutSelectTeamBinding(Object obj, View view, int i, ImageView imageView, RelativeLayout relativeLayout2, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, CircleImageView circleImageView, ImageView imageView8, ImageView imageView9, CircleImageView circleImageView2, ImageView imageView10, ConstraintLayout constraintLayout, TextView textView, RelativeLayout relativeLayout3, ConstraintLayout constraintLayout2, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, RelativeLayout relativeLayout8, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.checkbox = imageView;
        this.imagesLayout = relativeLayout2;
        this.ivBowlingStyle = imageView2;
        this.ivCup1 = imageView3;
        this.ivCup2 = imageView4;
        this.ivCup3 = imageView5;
        this.ivCup4 = imageView6;
        this.ivCup5 = imageView7;
        this.ivFlag = circleImageView;
        this.ivIsPlaying = imageView8;
        this.ivIsPlayingNot = imageView9;
        this.ivPlayer = circleImageView2;
        this.ivRole = imageView10;
        this.onItemClick = constraintLayout;
        this.points = textView;
        this.relativeLayout = relativeLayout3;
        this.rlBowlingStyle = constraintLayout2;
        this.rlCup1 = relativeLayout4;
        this.rlCup2 = relativeLayout5;
        this.rlCup3 = relativeLayout6;
        this.rlCup4 = relativeLayout7;
        this.rlCup5 = relativeLayout8;
        this.tvAnnouced = textView2;
        this.tvBattingStyle = textView3;
        this.tvBowlingStyle = textView4;
        this.tvSeeAll = textView5;
        this.tvTeamCode = textView6;
        this.tvpoints = textView7;
    }

    public Players getModel() {
        return this.mModel;
    }

    public static LayoutSelectTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSelectTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (LayoutSelectTeamBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.layout_select_team, viewGroup, z, obj);
    }

    public static LayoutSelectTeamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSelectTeamBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (LayoutSelectTeamBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.layout_select_team, (ViewGroup) null, false, obj);
    }

    public static LayoutSelectTeamBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutSelectTeamBinding bind(View view, Object obj) {
        return (LayoutSelectTeamBinding) bind(obj, view, C1188R.C1193layout.layout_select_team);
    }
}
