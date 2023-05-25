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
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentRewardsBinding extends ViewDataBinding {
    public final TextView currencySymbol;
    public final EditText etRewardAmount;
    public final CircleImageView flag;
    public final ImageView imageView12;
    public final ImageView ivCash;
    public final ImageView ivHeart;
    public final ImageView ivPlayer;
    public final CircleImageView ivPlayerImage;
    public final CircleImageView ivTeam1Flag;
    public final CircleImageView ivTeam2Flag;
    public final LinearLayout linearLayout12;
    public final LinearLayout linearLayout13;
    public final LinearLayout linearLayout16;
    public final LinearLayout linearLayoutReward;
    public final LinearLayout llMyRewards;
    public final LinearLayout llRanking;
    public final LinearLayout llTopBar;
    public final LinearLayout llbutton;
    @Bindable
    protected PlayerStatsModel mModel;
    public final ConstraintLayout navHostHome;
    public final NestedScrollView nestedScrollView;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout7;
    public final RelativeLayout rlCountry;
    public final RelativeLayout rlFifty;
    public final RelativeLayout rlHundred;
    public final RelativeLayout rlLifeTimeEarning;
    public final RelativeLayout rlNoData;
    public final RelativeLayout rlOneFifty;
    public final ConstraintLayout rlPayReward;
    public final RelativeLayout rlPlayerStat;
    public final RelativeLayout rlRewardPlayer;
    public final RelativeLayout rlTop;
    public final RelativeLayout rlTopMyRewards;
    public final RelativeLayout rlUserReward;
    public final ConstraintLayout rlUserRewards;
    public final RecyclerView rvFlags;
    public final RecyclerView rvMyRewards;
    public final RecyclerView rvPlayerStats;
    public final RecyclerView rvUserRewards;
    public final NestedScrollView scrollView;
    public final SwipeRefreshLayout swipeData;
    public final TextView team1Name;
    public final TextView team2Name;
    public final TextView textView21;
    public final TextView tvAmount;
    public final TextView tvFanReward;
    public final TextView tvFifty;
    public final TextView tvHundred;
    public final TextView tvLifeTimeEarnings;
    public final TextView tvLifetimeEarnings;
    public final TextView tvName;
    public final TextView tvOneFifty;
    public final TextView tvPayReward;
    public final TextView tvPlayerName;
    public final TextView tvRank;
    public final TextView tvReward;
    public final TextView tvRewardPlayer;
    public final TextView tvShowHistory;
    public final TextView tvTeam;
    public final TextView tvTime;
    public final TextView tvUserRewards;
    public final View view;
    public final View view1;

    public abstract void setModel(PlayerStatsModel playerStatsModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentRewardsBinding(Object obj, View view2, int i, TextView textView, EditText editText, CircleImageView circleImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, CircleImageView circleImageView2, CircleImageView circleImageView3, CircleImageView circleImageView4, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView2, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout8, ConstraintLayout constraintLayout2, RelativeLayout relativeLayout9, RelativeLayout relativeLayout10, RelativeLayout relativeLayout11, RelativeLayout relativeLayout12, RelativeLayout relativeLayout13, ConstraintLayout constraintLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, NestedScrollView nestedScrollView3, SwipeRefreshLayout swipeRefreshLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19, TextView textView20, TextView textView22, View view3, View view4) {
        super(obj, view2, i);
        this.currencySymbol = textView;
        this.etRewardAmount = editText;
        this.flag = circleImageView;
        this.imageView12 = imageView;
        this.ivCash = imageView2;
        this.ivHeart = imageView3;
        this.ivPlayer = imageView4;
        this.ivPlayerImage = circleImageView2;
        this.ivTeam1Flag = circleImageView3;
        this.ivTeam2Flag = circleImageView4;
        this.linearLayout12 = linearLayout;
        this.linearLayout13 = linearLayout2;
        this.linearLayout16 = linearLayout3;
        this.linearLayoutReward = linearLayout4;
        this.llMyRewards = linearLayout5;
        this.llRanking = linearLayout6;
        this.llTopBar = linearLayout7;
        this.llbutton = linearLayout8;
        this.navHostHome = constraintLayout;
        this.nestedScrollView = nestedScrollView2;
        this.progressBar = progressBar2;
        this.relativeLayout7 = relativeLayout;
        this.rlCountry = relativeLayout2;
        this.rlFifty = relativeLayout3;
        this.rlHundred = relativeLayout4;
        this.rlLifeTimeEarning = relativeLayout5;
        this.rlNoData = relativeLayout6;
        this.rlOneFifty = relativeLayout8;
        this.rlPayReward = constraintLayout2;
        this.rlPlayerStat = relativeLayout9;
        this.rlRewardPlayer = relativeLayout10;
        this.rlTop = relativeLayout11;
        this.rlTopMyRewards = relativeLayout12;
        this.rlUserReward = relativeLayout13;
        this.rlUserRewards = constraintLayout3;
        this.rvFlags = recyclerView;
        this.rvMyRewards = recyclerView2;
        this.rvPlayerStats = recyclerView3;
        this.rvUserRewards = recyclerView4;
        this.scrollView = nestedScrollView3;
        this.swipeData = swipeRefreshLayout;
        this.team1Name = textView2;
        this.team2Name = textView3;
        this.textView21 = textView4;
        this.tvAmount = textView5;
        this.tvFanReward = textView6;
        this.tvFifty = textView7;
        this.tvHundred = textView8;
        this.tvLifeTimeEarnings = textView9;
        this.tvLifetimeEarnings = textView10;
        this.tvName = textView11;
        this.tvOneFifty = textView12;
        this.tvPayReward = textView13;
        this.tvPlayerName = textView14;
        this.tvRank = textView15;
        this.tvReward = textView16;
        this.tvRewardPlayer = textView17;
        this.tvShowHistory = textView18;
        this.tvTeam = textView19;
        this.tvTime = textView20;
        this.tvUserRewards = textView22;
        this.view = view3;
        this.view1 = view4;
    }

    public PlayerStatsModel getModel() {
        return this.mModel;
    }

    public static FragmentRewardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRewardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentRewardsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_rewards, viewGroup, z, obj);
    }

    public static FragmentRewardsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRewardsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentRewardsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_rewards, (ViewGroup) null, false, obj);
    }

    public static FragmentRewardsBinding bind(View view2) {
        return bind(view2, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentRewardsBinding bind(View view2, Object obj) {
        return (FragmentRewardsBinding) bind(obj, view2, C1188R.C1193layout.fragment_rewards);
    }
}
