package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentPlayerRewardsBinding extends ViewDataBinding {
    public final TextView currencySymbol;
    public final EditText etRewardAmount;
    public final CircleImageView flag;
    public final ImageView imageView12;
    public final ImageView ivPlayer;
    public final CircleImageView ivPlayerImage;
    public final CircleImageView ivTeam1Flag;
    public final CircleImageView ivTeam2Flag;
    public final LinearLayout linearLayout12;
    public final LinearLayout linearLayout13;
    public final LinearLayout linearLayout14;
    public final LinearLayout linearLayout16;
    public final LinearLayout llTopBar;
    @Bindable
    protected PlayerStatsModel mModel;
    public final ConstraintLayout navHostHome;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout7;
    public final RelativeLayout rlCountry;
    public final RelativeLayout rlFifty;
    public final RelativeLayout rlHundred;
    public final RelativeLayout rlNoData;
    public final RelativeLayout rlOneFifty;
    public final RelativeLayout rlPayReward;
    public final RelativeLayout rlPlayerStat;
    public final RelativeLayout rlRewardPlayer;
    public final RelativeLayout rlTop;
    public final RelativeLayout rlUserRewards;
    public final RecyclerView rvPlayerStats;
    public final NestedScrollView scrollView;
    public final TextView team1Name;
    public final TextView team2Name;
    public final TextView textView20;
    public final TextView textView21;
    public final TextView tvFifty;
    public final TextView tvHundred;
    public final TextView tvName;
    public final TextView tvOneFifty;
    public final TextView tvPayReward;
    public final TextView tvRank;
    public final TextView tvRewardPlayer;
    public final TextView tvTeam;
    public final TextView tvTime;
    public final TextView tvUserRewards;
    public final View view;
    public final View view1;

    public abstract void setModel(PlayerStatsModel playerStatsModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentPlayerRewardsBinding(Object obj, View view2, int i, TextView textView, EditText editText, CircleImageView circleImageView, ImageView imageView, ImageView imageView2, CircleImageView circleImageView2, CircleImageView circleImageView3, CircleImageView circleImageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, ConstraintLayout constraintLayout, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout8, RelativeLayout relativeLayout9, RelativeLayout relativeLayout10, RelativeLayout relativeLayout11, RelativeLayout relativeLayout12, RecyclerView recyclerView, NestedScrollView nestedScrollView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, View view3, View view4) {
        super(obj, view2, i);
        this.currencySymbol = textView;
        this.etRewardAmount = editText;
        this.flag = circleImageView;
        this.imageView12 = imageView;
        this.ivPlayer = imageView2;
        this.ivPlayerImage = circleImageView2;
        this.ivTeam1Flag = circleImageView3;
        this.ivTeam2Flag = circleImageView4;
        this.linearLayout12 = linearLayout;
        this.linearLayout13 = linearLayout2;
        this.linearLayout14 = linearLayout3;
        this.linearLayout16 = linearLayout4;
        this.llTopBar = linearLayout5;
        this.navHostHome = constraintLayout;
        this.progressBar = progressBar2;
        this.relativeLayout7 = relativeLayout;
        this.rlCountry = relativeLayout2;
        this.rlFifty = relativeLayout3;
        this.rlHundred = relativeLayout4;
        this.rlNoData = relativeLayout5;
        this.rlOneFifty = relativeLayout6;
        this.rlPayReward = relativeLayout8;
        this.rlPlayerStat = relativeLayout9;
        this.rlRewardPlayer = relativeLayout10;
        this.rlTop = relativeLayout11;
        this.rlUserRewards = relativeLayout12;
        this.rvPlayerStats = recyclerView;
        this.scrollView = nestedScrollView;
        this.team1Name = textView2;
        this.team2Name = textView3;
        this.textView20 = textView4;
        this.textView21 = textView5;
        this.tvFifty = textView6;
        this.tvHundred = textView7;
        this.tvName = textView8;
        this.tvOneFifty = textView9;
        this.tvPayReward = textView10;
        this.tvRank = textView11;
        this.tvRewardPlayer = textView12;
        this.tvTeam = textView13;
        this.tvTime = textView14;
        this.tvUserRewards = textView15;
        this.view = view3;
        this.view1 = view4;
    }

    public PlayerStatsModel getModel() {
        return this.mModel;
    }

    public static FragmentPlayerRewardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPlayerRewardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentPlayerRewardsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_player_rewards, viewGroup, z, obj);
    }

    public static FragmentPlayerRewardsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPlayerRewardsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentPlayerRewardsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_player_rewards, (ViewGroup) null, false, obj);
    }

    public static FragmentPlayerRewardsBinding bind(View view2) {
        return bind(view2, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentPlayerRewardsBinding bind(View view2, Object obj) {
        return (FragmentPlayerRewardsBinding) bind(obj, view2, C1188R.C1193layout.fragment_player_rewards);
    }
}
