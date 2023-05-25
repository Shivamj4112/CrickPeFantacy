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

public final class FragmentTopContestBinding implements ViewBinding {
    public final LinearLayout linearLayout5;
    public final LinearLayout linearLayout6;
    public final ProgressBar progressBar;
    private final ConstraintLayout rootView;
    public final RecyclerView rvTopContest;
    public final TextView tvCreateContest;
    public final TextView tvJoinContest;
    public final TextView tvNoData;
    public final TextView tvUpcoming;

    private FragmentTopContestBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.linearLayout5 = linearLayout;
        this.linearLayout6 = linearLayout2;
        this.progressBar = progressBar2;
        this.rvTopContest = recyclerView;
        this.tvCreateContest = textView;
        this.tvJoinContest = textView2;
        this.tvNoData = textView3;
        this.tvUpcoming = textView4;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTopContestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentTopContestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_top_contest, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTopContestBinding bind(View view) {
        int i = C1188R.C1192id.linearLayout5;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.linearLayout5);
        if (linearLayout != null) {
            i = C1188R.C1192id.linearLayout6;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.linearLayout6);
            if (linearLayout2 != null) {
                i = C1188R.C1192id.progressBar;
                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
                if (progressBar2 != null) {
                    i = C1188R.C1192id.rvTopContest;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvTopContest);
                    if (recyclerView != null) {
                        i = C1188R.C1192id.tvCreateContest;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvCreateContest);
                        if (textView != null) {
                            i = C1188R.C1192id.tvJoinContest;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvJoinContest);
                            if (textView2 != null) {
                                i = C1188R.C1192id.tvNoData;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvNoData);
                                if (textView3 != null) {
                                    i = C1188R.C1192id.tvUpcoming;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvUpcoming);
                                    if (textView4 != null) {
                                        return new FragmentTopContestBinding((ConstraintLayout) view, linearLayout, linearLayout2, progressBar2, recyclerView, textView, textView2, textView3, textView4);
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
