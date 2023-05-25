package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class LayoutStatesBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final TextView tvStateName;

    private LayoutStatesBinding(ConstraintLayout constraintLayout, TextView textView) {
        this.rootView = constraintLayout;
        this.tvStateName = textView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static LayoutStatesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutStatesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.layout_states, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutStatesBinding bind(View view) {
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvStateName);
        if (textView != null) {
            return new LayoutStatesBinding((ConstraintLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C1188R.C1192id.tvStateName)));
    }
}
