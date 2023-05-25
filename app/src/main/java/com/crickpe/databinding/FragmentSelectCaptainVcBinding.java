package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentSelectCaptainVcBinding implements ViewBinding {
    public final ConstraintLayout clCaptainVC;
    private final ConstraintLayout rootView;
    public final RecyclerView rvSelectCaptain;
    public final TextView tvPreviewGround;
    public final TextView tvUpcoming;

    private FragmentSelectCaptainVcBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.clCaptainVC = constraintLayout2;
        this.rvSelectCaptain = recyclerView;
        this.tvPreviewGround = textView;
        this.tvUpcoming = textView2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSelectCaptainVcBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentSelectCaptainVcBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_select_captain_vc, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSelectCaptainVcBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C1188R.C1192id.rvSelectCaptain;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvSelectCaptain);
        if (recyclerView != null) {
            i = C1188R.C1192id.tvPreviewGround;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvPreviewGround);
            if (textView != null) {
                i = C1188R.C1192id.tvUpcoming;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvUpcoming);
                if (textView2 != null) {
                    return new FragmentSelectCaptainVcBinding(constraintLayout, constraintLayout, recyclerView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
