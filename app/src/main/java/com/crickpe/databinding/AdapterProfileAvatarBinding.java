package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class AdapterProfileAvatarBinding implements ViewBinding {
    public final ConstraintLayout constrainLayout;
    public final ImageView ivProfile;
    private final ConstraintLayout rootView;

    private AdapterProfileAvatarBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView) {
        this.rootView = constraintLayout;
        this.constrainLayout = constraintLayout2;
        this.ivProfile = imageView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static AdapterProfileAvatarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static AdapterProfileAvatarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.adapter_profile_avatar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static AdapterProfileAvatarBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivProfile);
        if (imageView != null) {
            return new AdapterProfileAvatarBinding(constraintLayout, constraintLayout, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(C1188R.C1192id.ivProfile)));
    }
}
