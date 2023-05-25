package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class LayoutTeamSequenceBinding implements ViewBinding {
    private final RelativeLayout rootView;
    public final TextView tvTeamSequence;

    private LayoutTeamSequenceBinding(RelativeLayout relativeLayout, TextView textView) {
        this.rootView = relativeLayout;
        this.tvTeamSequence = textView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutTeamSequenceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutTeamSequenceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.layout_team_sequence, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutTeamSequenceBinding bind(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvTeamSequence);
        if (textView != null) {
            return new LayoutTeamSequenceBinding((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C1188R.C1192id.tvTeamSequence)));
    }
}
