package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentRewardGivenBinding implements ViewBinding {
    public final LinearLayout llMyRewards;
    private final ConstraintLayout rootView;
    public final RecyclerView rvMyRewards;

    private FragmentRewardGivenBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.llMyRewards = linearLayout;
        this.rvMyRewards = recyclerView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardGivenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentRewardGivenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_reward_given, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentRewardGivenBinding bind(View view) {
        int i = C1188R.C1192id.llMyRewards;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.llMyRewards);
        if (linearLayout != null) {
            i = C1188R.C1192id.rvMyRewards;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvMyRewards);
            if (recyclerView != null) {
                return new FragmentRewardGivenBinding((ConstraintLayout) view, linearLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
