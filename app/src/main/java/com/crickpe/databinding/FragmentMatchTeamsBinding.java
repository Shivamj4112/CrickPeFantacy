package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentMatchTeamsBinding implements ViewBinding {
    public final ProgressBar progressBar;
    private final SwipeRefreshLayout rootView;
    public final RecyclerView rvFantasyTeams;
    public final SwipeRefreshLayout swipeRv;

    private FragmentMatchTeamsBinding(SwipeRefreshLayout swipeRefreshLayout, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.rootView = swipeRefreshLayout;
        this.progressBar = progressBar2;
        this.rvFantasyTeams = recyclerView;
        this.swipeRv = swipeRefreshLayout2;
    }

    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchTeamsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMatchTeamsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_match_teams, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchTeamsBinding bind(View view) {
        int i = C1188R.C1192id.progressBar;
        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
        if (progressBar2 != null) {
            i = C1188R.C1192id.rvFantasyTeams;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvFantasyTeams);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                return new FragmentMatchTeamsBinding(swipeRefreshLayout, progressBar2, recyclerView, swipeRefreshLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
