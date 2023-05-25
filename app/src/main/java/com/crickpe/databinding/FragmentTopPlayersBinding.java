package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayersModel;

public abstract class FragmentTopPlayersBinding extends ViewDataBinding {
    public final ConstraintLayout container;
    public final TextView filter;
    @Bindable
    protected TopPlayersModel mModel;
    public final ProgressBar progressBar;
    public final LinearLayout relativeLayout9;
    public final RelativeLayout rlFilter;
    public final RecyclerView rvFilter;
    public final RecyclerView rvTopPlayers;
    public final TextView tvEarnings;

    public abstract void setModel(TopPlayersModel topPlayersModel);

    protected FragmentTopPlayersBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, TextView textView, ProgressBar progressBar2, LinearLayout linearLayout, RelativeLayout relativeLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView2) {
        super(obj, view, i);
        this.container = constraintLayout;
        this.filter = textView;
        this.progressBar = progressBar2;
        this.relativeLayout9 = linearLayout;
        this.rlFilter = relativeLayout;
        this.rvFilter = recyclerView;
        this.rvTopPlayers = recyclerView2;
        this.tvEarnings = textView2;
    }

    public TopPlayersModel getModel() {
        return this.mModel;
    }

    public static FragmentTopPlayersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTopPlayersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentTopPlayersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_top_players, viewGroup, z, obj);
    }

    public static FragmentTopPlayersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTopPlayersBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentTopPlayersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_top_players, (ViewGroup) null, false, obj);
    }

    public static FragmentTopPlayersBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentTopPlayersBinding bind(View view, Object obj) {
        return (FragmentTopPlayersBinding) bind(obj, view, C1188R.C1193layout.fragment_top_players);
    }
}
