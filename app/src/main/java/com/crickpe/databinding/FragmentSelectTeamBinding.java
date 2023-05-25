package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;

public abstract class FragmentSelectTeamBinding extends ViewDataBinding {
    public final LinearLayout linearLayout17;
    public final ProgressBar progressBar;
    public final RecyclerView rvFantasyTeams;
    public final TextView tvCreateTeamm;
    public final TextView tvJoin;

    protected FragmentSelectTeamBinding(Object obj, View view, int i, LinearLayout linearLayout, ProgressBar progressBar2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.linearLayout17 = linearLayout;
        this.progressBar = progressBar2;
        this.rvFantasyTeams = recyclerView;
        this.tvCreateTeamm = textView;
        this.tvJoin = textView2;
    }

    public static FragmentSelectTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSelectTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentSelectTeamBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_select_team, viewGroup, z, obj);
    }

    public static FragmentSelectTeamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSelectTeamBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentSelectTeamBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_select_team, (ViewGroup) null, false, obj);
    }

    public static FragmentSelectTeamBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSelectTeamBinding bind(View view, Object obj) {
        return (FragmentSelectTeamBinding) bind(obj, view, C1188R.C1193layout.fragment_select_team);
    }
}
