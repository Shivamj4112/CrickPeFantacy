package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentUpcomingMatchBinding implements ViewBinding {
    public final ProgressBar progressBar;
    public final LinearLayout relativeLayout8;
    private final ConstraintLayout rootView;
    public final RecyclerView rvUpcomingMatch;
    public final TextView tvAll;
    public final TextView tvDomestic;
    public final TextView tvInternational;
    public final TextView tvLatest;
    public final TextView tvNoData;
    public final TextView tvSortBy;

    private FragmentUpcomingMatchBinding(ConstraintLayout constraintLayout, ProgressBar progressBar2, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.progressBar = progressBar2;
        this.relativeLayout8 = linearLayout;
        this.rvUpcomingMatch = recyclerView;
        this.tvAll = textView;
        this.tvDomestic = textView2;
        this.tvInternational = textView3;
        this.tvLatest = textView4;
        this.tvNoData = textView5;
        this.tvSortBy = textView6;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentUpcomingMatchBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentUpcomingMatchBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_upcoming_match, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentUpcomingMatchBinding bind(View view) {
        int i = C1188R.C1192id.progressBar;
        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
        if (progressBar2 != null) {
            i = C1188R.C1192id.relativeLayout8;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.relativeLayout8);
            if (linearLayout != null) {
                i = C1188R.C1192id.rvUpcomingMatch;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvUpcomingMatch);
                if (recyclerView != null) {
                    i = C1188R.C1192id.tvAll;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvAll);
                    if (textView != null) {
                        i = C1188R.C1192id.tvDomestic;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvDomestic);
                        if (textView2 != null) {
                            i = C1188R.C1192id.tvInternational;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvInternational);
                            if (textView3 != null) {
                                i = C1188R.C1192id.tvLatest;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvLatest);
                                if (textView4 != null) {
                                    i = C1188R.C1192id.tvNoData;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvNoData);
                                    if (textView5 != null) {
                                        i = C1188R.C1192id.tvSortBy;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvSortBy);
                                        if (textView6 != null) {
                                            return new FragmentUpcomingMatchBinding((ConstraintLayout) view, progressBar2, linearLayout, recyclerView, textView, textView2, textView3, textView4, textView5, textView6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
