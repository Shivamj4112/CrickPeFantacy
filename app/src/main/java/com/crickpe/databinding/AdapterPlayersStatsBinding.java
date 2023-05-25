package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterPlayersStatsBinding extends ViewDataBinding {
    public final CircleImageView ivTeam1Flag;
    public final CircleImageView ivTeam2Flag;
    public final LinearLayout llTopBar;
    @Bindable
    protected PlayerStat mModel;
    public final LinearLayout relativeLayout7;
    public final TextView tvDate;
    public final TextView tvTimeRemaining;

    public abstract void setModel(PlayerStat playerStat);

    protected AdapterPlayersStatsBinding(Object obj, View view, int i, CircleImageView circleImageView, CircleImageView circleImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivTeam1Flag = circleImageView;
        this.ivTeam2Flag = circleImageView2;
        this.llTopBar = linearLayout;
        this.relativeLayout7 = linearLayout2;
        this.tvDate = textView;
        this.tvTimeRemaining = textView2;
    }

    public PlayerStat getModel() {
        return this.mModel;
    }

    public static AdapterPlayersStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPlayersStatsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterPlayersStatsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_players_stats, viewGroup, z, obj);
    }

    public static AdapterPlayersStatsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPlayersStatsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterPlayersStatsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_players_stats, (ViewGroup) null, false, obj);
    }

    public static AdapterPlayersStatsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPlayersStatsBinding bind(View view, Object obj) {
        return (AdapterPlayersStatsBinding) bind(obj, view, C1188R.C1193layout.adapter_players_stats);
    }
}
