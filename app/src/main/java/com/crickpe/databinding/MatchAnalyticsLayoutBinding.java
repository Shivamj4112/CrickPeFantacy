package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class MatchAnalyticsLayoutBinding implements ViewBinding {
    public final LinearLayout linearLayout4;
    public final LinearLayout llTeams;
    public final RelativeLayout relativeLayout2;
    private final ConstraintLayout rootView;
    public final TextView textView2;
    public final TextView textView3;
    public final TextView tvTitle;
    public final View view;
    public final View viewMatches;

    private MatchAnalyticsLayoutBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, TextView textView, TextView textView4, TextView textView5, View view2, View view3) {
        this.rootView = constraintLayout;
        this.linearLayout4 = linearLayout;
        this.llTeams = linearLayout2;
        this.relativeLayout2 = relativeLayout;
        this.textView2 = textView;
        this.textView3 = textView4;
        this.tvTitle = textView5;
        this.view = view2;
        this.viewMatches = view3;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static MatchAnalyticsLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static MatchAnalyticsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.match_analytics_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MatchAnalyticsLayoutBinding bind(View view2) {
        int i = C1188R.C1192id.linearLayout4;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.linearLayout4);
        if (linearLayout != null) {
            i = C1188R.C1192id.llTeams;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llTeams);
            if (linearLayout2 != null) {
                i = C1188R.C1192id.relativeLayout2;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.relativeLayout2);
                if (relativeLayout != null) {
                    i = C1188R.C1192id.textView2;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView2);
                    if (textView != null) {
                        i = C1188R.C1192id.textView3;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView3);
                        if (textView4 != null) {
                            i = C1188R.C1192id.tvTitle;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTitle);
                            if (textView5 != null) {
                                i = C1188R.C1192id.view;
                                View findChildViewById = ViewBindings.findChildViewById(view2, C1188R.C1192id.view);
                                if (findChildViewById != null) {
                                    i = C1188R.C1192id.view_matches;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view2, C1188R.C1192id.view_matches);
                                    if (findChildViewById2 != null) {
                                        return new MatchAnalyticsLayoutBinding((ConstraintLayout) view2, linearLayout, linearLayout2, relativeLayout, textView, textView4, textView5, findChildViewById, findChildViewById2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
