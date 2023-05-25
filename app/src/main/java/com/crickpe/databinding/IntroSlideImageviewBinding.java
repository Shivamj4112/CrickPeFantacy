package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class IntroSlideImageviewBinding implements ViewBinding {
    public final ImageView imageView;
    public final ImageView introTextt;
    private final ConstraintLayout rootView;

    private IntroSlideImageviewBinding(ConstraintLayout constraintLayout, ImageView imageView2, ImageView imageView3) {
        this.rootView = constraintLayout;
        this.imageView = imageView2;
        this.introTextt = imageView3;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static IntroSlideImageviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static IntroSlideImageviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.intro_slide_imageview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static IntroSlideImageviewBinding bind(View view) {
        int i = C1188R.C1192id.image_view;
        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.image_view);
        if (imageView2 != null) {
            i = C1188R.C1192id.intro_textt;
            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.intro_textt);
            if (imageView3 != null) {
                return new IntroSlideImageviewBinding((ConstraintLayout) view, imageView2, imageView3);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
