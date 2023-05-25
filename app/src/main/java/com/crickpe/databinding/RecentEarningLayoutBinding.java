package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class RecentEarningLayoutBinding implements ViewBinding {
    public final ImageView ivCrown;
    private final LinearLayout rootView;

    private RecentEarningLayoutBinding(LinearLayout linearLayout, ImageView imageView) {
        this.rootView = linearLayout;
        this.ivCrown = imageView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RecentEarningLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static RecentEarningLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.recent_earning_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RecentEarningLayoutBinding bind(View view) {
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivCrown);
        if (imageView != null) {
            return new RecentEarningLayoutBinding((LinearLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C1188R.C1192id.ivCrown)));
    }
}
