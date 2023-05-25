package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;

public abstract class AdapterContestTeamsBinding extends ViewDataBinding {
    public final LinearLayout llBottom;
    @Bindable
    protected FantasyTeamListModel mModel;
    public final ImageView playerImageOne;
    public final ImageView playerImageTwo;
    public final TextView points;
    public final RelativeLayout rlBackground;
    public final RelativeLayout topBar;
    public final TextView tvAR;
    public final TextView tvBat;
    public final TextView tvBowl;
    public final TextView tvCaptain;
    public final TextView tvCaptainName;
    public final TextView tvPoints;
    public final TextView tvTeamSequence;
    public final TextView tvVCaptainName;
    public final TextView tvWk;

    public abstract void setModel(FantasyTeamListModel fantasyTeamListModel);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AdapterContestTeamsBinding(Object obj, View view, int i, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, TextView textView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        super(obj, view, i);
        this.llBottom = linearLayout;
        this.playerImageOne = imageView;
        this.playerImageTwo = imageView2;
        this.points = textView;
        this.rlBackground = relativeLayout;
        this.topBar = relativeLayout2;
        this.tvAR = textView2;
        this.tvBat = textView3;
        this.tvBowl = textView4;
        this.tvCaptain = textView5;
        this.tvCaptainName = textView6;
        this.tvPoints = textView7;
        this.tvTeamSequence = textView8;
        this.tvVCaptainName = textView9;
        this.tvWk = textView10;
    }

    public FantasyTeamListModel getModel() {
        return this.mModel;
    }

    public static AdapterContestTeamsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterContestTeamsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterContestTeamsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_contest_teams, viewGroup, z, obj);
    }

    public static AdapterContestTeamsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterContestTeamsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterContestTeamsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_contest_teams, (ViewGroup) null, false, obj);
    }

    public static AdapterContestTeamsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterContestTeamsBinding bind(View view, Object obj) {
        return (AdapterContestTeamsBinding) bind(obj, view, C1188R.C1193layout.adapter_contest_teams);
    }
}
