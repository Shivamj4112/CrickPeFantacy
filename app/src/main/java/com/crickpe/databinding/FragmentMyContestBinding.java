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

public final class FragmentMyContestBinding implements ViewBinding {
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final RecyclerView rvMyContest;
    public final TextView tvNoData;

    private FragmentMyContestBinding(RelativeLayout relativeLayout, ProgressBar progressBar2, RecyclerView recyclerView, TextView textView) {
        this.rootView = relativeLayout;
        this.progressBar = progressBar2;
        this.rvMyContest = recyclerView;
        this.tvNoData = textView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMyContestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMyContestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_my_contest, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMyContestBinding bind(View view) {
        int i = C1188R.C1192id.progressBar;
        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
        if (progressBar2 != null) {
            i = C1188R.C1192id.rvMyContest;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvMyContest);
            if (recyclerView != null) {
                i = C1188R.C1192id.tvNoData;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvNoData);
                if (textView != null) {
                    return new FragmentMyContestBinding((RelativeLayout) view, progressBar2, recyclerView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
