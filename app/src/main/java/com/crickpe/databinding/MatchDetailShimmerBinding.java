package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class MatchDetailShimmerBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final View tvMyContests;

    private MatchDetailShimmerBinding(RelativeLayout relativeLayout, View view) {
        this.rootView = relativeLayout;
        this.tvMyContests = view;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static MatchDetailShimmerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static MatchDetailShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.match_detail_shimmer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static MatchDetailShimmerBinding bind(View view) {
        View findChildViewById = ViewBindings.findChildViewById(view, C1188R.C1192id.tvMyContests);
        if (findChildViewById != null) {
            return new MatchDetailShimmerBinding((RelativeLayout) view, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C1188R.C1192id.tvMyContests)));
    }
}
