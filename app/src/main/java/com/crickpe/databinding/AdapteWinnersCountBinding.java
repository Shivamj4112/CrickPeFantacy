package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class AdapteWinnersCountBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final TextView tvWinnerCount;

    private AdapteWinnersCountBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.tvWinnerCount = textView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapteWinnersCountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AdapteWinnersCountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.adapte_winners_count, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapteWinnersCountBinding bind(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvWinnerCount);
        if (textView != null) {
            return new AdapteWinnersCountBinding((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C1188R.C1192id.tvWinnerCount)));
    }
}
