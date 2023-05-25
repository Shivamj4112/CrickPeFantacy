package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class LayoutAvatarBinding implements ViewBinding {
    public final ImageView btnClose;
    public final ConstraintLayout constraintLayout;
    public final RelativeLayout rlAvatarLayout;
    private final RelativeLayout rootView;
    public final RecyclerView rvProfileAvtar;
    public final TextView textView23;

    private LayoutAvatarBinding(RelativeLayout relativeLayout, ImageView imageView, ConstraintLayout constraintLayout2, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView) {
        this.rootView = relativeLayout;
        this.btnClose = imageView;
        this.constraintLayout = constraintLayout2;
        this.rlAvatarLayout = relativeLayout2;
        this.rvProfileAvtar = recyclerView;
        this.textView23 = textView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static LayoutAvatarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutAvatarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.layout_avatar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutAvatarBinding bind(View view) {
        int i = C1188R.C1192id.btnClose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.btnClose);
        if (imageView != null) {
            i = C1188R.C1192id.constraintLayout;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.constraintLayout);
            if (constraintLayout2 != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = C1188R.C1192id.rvProfileAvtar;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvProfileAvtar);
                if (recyclerView != null) {
                    i = C1188R.C1192id.textView23;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView23);
                    if (textView != null) {
                        return new LayoutAvatarBinding(relativeLayout, imageView, constraintLayout2, relativeLayout, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
