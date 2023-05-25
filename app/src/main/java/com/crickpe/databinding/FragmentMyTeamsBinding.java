package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentMyTeamsBinding implements ViewBinding {
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final RecyclerView rvFantasyTeams;
    public final TextView tvCreateTeam;
    public final TextView tvNoData;

    private FragmentMyTeamsBinding(RelativeLayout relativeLayout, ProgressBar progressBar2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.progressBar = progressBar2;
        this.rvFantasyTeams = recyclerView;
        this.tvCreateTeam = textView;
        this.tvNoData = textView2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMyTeamsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMyTeamsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_my_teams, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMyTeamsBinding bind(View view) {
        int i = C1188R.C1192id.progressBar;
        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
        if (progressBar2 != null) {
            i = C1188R.C1192id.rvFantasyTeams;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvFantasyTeams);
            if (recyclerView != null) {
                i = C1188R.C1192id.tvCreateTeam;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvCreateTeam);
                if (textView != null) {
                    i = C1188R.C1192id.tvNoData;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvNoData);
                    if (textView2 != null) {
                        return new FragmentMyTeamsBinding((RelativeLayout) view, progressBar2, recyclerView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
