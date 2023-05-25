package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public final class FragmentOnboardingBinding implements ViewBinding {
    public final DotsIndicator dot3;
    public final ImageView imageView;
    public final ImageView ivIntroText;
    public final LinearLayout llButtons;
    private final RelativeLayout rootView;
    public final TextView tvGetStarted;
    public final TextView tvNext;
    public final ViewPager viewPager;

    private FragmentOnboardingBinding(RelativeLayout relativeLayout, DotsIndicator dotsIndicator, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, TextView textView, TextView textView2, ViewPager viewPager2) {
        this.rootView = relativeLayout;
        this.dot3 = dotsIndicator;
        this.imageView = imageView2;
        this.ivIntroText = imageView3;
        this.llButtons = linearLayout;
        this.tvGetStarted = textView;
        this.tvNext = textView2;
        this.viewPager = viewPager2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOnboardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentOnboardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_onboarding, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOnboardingBinding bind(View view) {
        int i = C1188R.C1192id.dot3;
        DotsIndicator dotsIndicator = (DotsIndicator) ViewBindings.findChildViewById(view, C1188R.C1192id.dot3);
        if (dotsIndicator != null) {
            i = C1188R.C1192id.image_view;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.image_view);
            if (imageView2 != null) {
                i = C1188R.C1192id.iv_intro_text;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.iv_intro_text);
                if (imageView3 != null) {
                    i = C1188R.C1192id.ll_buttons;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.ll_buttons);
                    if (linearLayout != null) {
                        i = C1188R.C1192id.tvGetStarted;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvGetStarted);
                        if (textView != null) {
                            i = C1188R.C1192id.tvNext;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvNext);
                            if (textView2 != null) {
                                i = C1188R.C1192id.view_pager;
                                ViewPager viewPager2 = (ViewPager) ViewBindings.findChildViewById(view, C1188R.C1192id.view_pager);
                                if (viewPager2 != null) {
                                    return new FragmentOnboardingBinding((RelativeLayout) view, dotsIndicator, imageView2, imageView3, linearLayout, textView, textView2, viewPager2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
