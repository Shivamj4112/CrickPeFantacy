package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterSelectTeamBinding extends ViewDataBinding {
    public final ImageView ivTeamSelection;
    public final LinearLayout llBottom;
    @Bindable
    protected FantasyTeamListModel mModel;
    public final CircleImageView playerImageOne;
    public final CircleImageView playerImageTwo;
    public final TextView points;
    public final RadioButton radioBtn;
    public final RelativeLayout rlItemLayout;
    public final RelativeLayout topBar;
    public final TextView tvAR;
    public final TextView tvAlreadySelected;
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
    protected AdapterSelectTeamBinding(Object obj, View view, int i, ImageView imageView, LinearLayout linearLayout, CircleImageView circleImageView, CircleImageView circleImageView2, TextView textView, RadioButton radioButton, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        super(obj, view, i);
        this.ivTeamSelection = imageView;
        this.llBottom = linearLayout;
        this.playerImageOne = circleImageView;
        this.playerImageTwo = circleImageView2;
        this.points = textView;
        this.radioBtn = radioButton;
        this.rlItemLayout = relativeLayout;
        this.topBar = relativeLayout2;
        this.tvAR = textView2;
        this.tvAlreadySelected = textView3;
        this.tvBat = textView4;
        this.tvBowl = textView5;
        this.tvCaptain = textView6;
        this.tvCaptainName = textView7;
        this.tvPoints = textView8;
        this.tvTeamSequence = textView9;
        this.tvVCaptainName = textView10;
        this.tvWk = textView11;
    }

    public FantasyTeamListModel getModel() {
        return this.mModel;
    }

    public static AdapterSelectTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterSelectTeamBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_select_team, viewGroup, z, obj);
    }

    public static AdapterSelectTeamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectTeamBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterSelectTeamBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_select_team, (ViewGroup) null, false, obj);
    }

    public static AdapterSelectTeamBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectTeamBinding bind(View view, Object obj) {
        return (AdapterSelectTeamBinding) bind(obj, view, C1188R.C1193layout.adapter_select_team);
    }
}
