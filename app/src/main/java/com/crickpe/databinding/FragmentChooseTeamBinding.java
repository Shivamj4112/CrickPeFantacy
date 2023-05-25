package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentChooseTeamBinding implements ViewBinding {
    public final ImageView createTeam;
    public final ImageView ivTrail;
    private final CoordinatorLayout rootView;
    public final ImageView scorecardComp;

    private FragmentChooseTeamBinding(CoordinatorLayout coordinatorLayout, ImageView imageView, ImageView imageView2, ImageView imageView3) {
        this.rootView = coordinatorLayout;
        this.createTeam = imageView;
        this.ivTrail = imageView2;
        this.scorecardComp = imageView3;
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static FragmentChooseTeamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentChooseTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_choose_team, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentChooseTeamBinding bind(View view) {
        int i = C1188R.C1192id.createTeam;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.createTeam);
        if (imageView != null) {
            i = C1188R.C1192id.ivTrail;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivTrail);
            if (imageView2 != null) {
                i = C1188R.C1192id.scorecard_comp;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.scorecard_comp);
                if (imageView3 != null) {
                    return new FragmentChooseTeamBinding((CoordinatorLayout) view, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
