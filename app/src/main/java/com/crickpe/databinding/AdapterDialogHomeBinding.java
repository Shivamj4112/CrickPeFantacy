package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class AdapterDialogHomeBinding implements ViewBinding {
    public final CircleImageView ivFlag;
    public final ImageView ivSelection;
    private final ConstraintLayout rootView;
    public final TextView tvTitle;

    private AdapterDialogHomeBinding(ConstraintLayout constraintLayout, CircleImageView circleImageView, ImageView imageView, TextView textView) {
        this.rootView = constraintLayout;
        this.ivFlag = circleImageView;
        this.ivSelection = imageView;
        this.tvTitle = textView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterDialogHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AdapterDialogHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.adapter_dialog_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterDialogHomeBinding bind(View view) {
        int i = C1188R.C1192id.ivFlag;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivFlag);
        if (circleImageView != null) {
            i = C1188R.C1192id.ivSelection;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivSelection);
            if (imageView != null) {
                i = C1188R.C1192id.tvTitle;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvTitle);
                if (textView != null) {
                    return new AdapterDialogHomeBinding((ConstraintLayout) view, circleImageView, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
