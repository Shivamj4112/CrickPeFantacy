package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class RowNavDrawerBinding implements ViewBinding {
    public final ImageView navigationIcon;
    public final TextView navigationTitle;
    private final LinearLayout rootView;

    private RowNavDrawerBinding(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.rootView = linearLayout;
        this.navigationIcon = imageView;
        this.navigationTitle = textView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static RowNavDrawerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static RowNavDrawerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.row_nav_drawer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static RowNavDrawerBinding bind(View view) {
        int i = C1188R.C1192id.navigation_icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.navigation_icon);
        if (imageView != null) {
            i = C1188R.C1192id.navigation_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.navigation_title);
            if (textView != null) {
                return new RowNavDrawerBinding((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
