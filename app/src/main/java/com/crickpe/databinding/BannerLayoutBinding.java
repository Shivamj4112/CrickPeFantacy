package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class BannerLayoutBinding implements ViewBinding {
    public final ConstraintLayout clFourthBanner;
    public final Guideline guideline1;
    public final Guideline guideline2;
    public final Guideline guideline3;
    public final Guideline guideline4;
    public final Guideline guideline5;
    public final Guideline guideline6;
    public final CircleImageView imageProfile;
    public final CircleImageView imageProfile4;
    public final ImageView img;
    public final ImageView imgBadge;
    public final ImageView ivBanner;
    public final ImageView ivPlayVideo;
    public final LinearLayout llSecondBanner;
    public final RelativeLayout rlFirstBanner;
    public final RelativeLayout rlUpcomingMatch;
    private final ConstraintLayout rootView;
    public final TextView tvLable;
    public final TextView tvName;
    public final TextView tvUsername;

    private BannerLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, Guideline guideline, Guideline guideline7, Guideline guideline8, Guideline guideline9, Guideline guideline10, Guideline guideline11, CircleImageView circleImageView, CircleImageView circleImageView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.clFourthBanner = constraintLayout2;
        this.guideline1 = guideline;
        this.guideline2 = guideline7;
        this.guideline3 = guideline8;
        this.guideline4 = guideline9;
        this.guideline5 = guideline10;
        this.guideline6 = guideline11;
        this.imageProfile = circleImageView;
        this.imageProfile4 = circleImageView2;
        this.img = imageView;
        this.imgBadge = imageView2;
        this.ivBanner = imageView3;
        this.ivPlayVideo = imageView4;
        this.llSecondBanner = linearLayout;
        this.rlFirstBanner = relativeLayout;
        this.rlUpcomingMatch = relativeLayout2;
        this.tvLable = textView;
        this.tvName = textView2;
        this.tvUsername = textView3;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static BannerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static BannerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.banner_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static BannerLayoutBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.clFourthBanner;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.clFourthBanner);
        if (constraintLayout != null) {
            i = C1188R.C1192id.guideline1;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view2, C1188R.C1192id.guideline1);
            if (guideline != null) {
                i = C1188R.C1192id.guideline2;
                Guideline guideline7 = (Guideline) ViewBindings.findChildViewById(view2, C1188R.C1192id.guideline2);
                if (guideline7 != null) {
                    i = C1188R.C1192id.guideline3;
                    Guideline guideline8 = (Guideline) ViewBindings.findChildViewById(view2, C1188R.C1192id.guideline3);
                    if (guideline8 != null) {
                        i = C1188R.C1192id.guideline4;
                        Guideline guideline9 = (Guideline) ViewBindings.findChildViewById(view2, C1188R.C1192id.guideline4);
                        if (guideline9 != null) {
                            i = C1188R.C1192id.guideline5;
                            Guideline guideline10 = (Guideline) ViewBindings.findChildViewById(view2, C1188R.C1192id.guideline5);
                            if (guideline10 != null) {
                                i = C1188R.C1192id.guideline6;
                                Guideline guideline11 = (Guideline) ViewBindings.findChildViewById(view2, C1188R.C1192id.guideline6);
                                if (guideline11 != null) {
                                    i = C1188R.C1192id.imageProfile;
                                    CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imageProfile);
                                    if (circleImageView != null) {
                                        i = C1188R.C1192id.imageProfile4;
                                        CircleImageView circleImageView2 = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imageProfile4);
                                        if (circleImageView2 != null) {
                                            i = C1188R.C1192id.img;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.img);
                                            if (imageView != null) {
                                                i = C1188R.C1192id.imgBadge;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imgBadge);
                                                if (imageView2 != null) {
                                                    i = C1188R.C1192id.ivBanner;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivBanner);
                                                    if (imageView3 != null) {
                                                        i = C1188R.C1192id.ivPlayVideo;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivPlayVideo);
                                                        if (imageView4 != null) {
                                                            i = C1188R.C1192id.llSecondBanner;
                                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llSecondBanner);
                                                            if (linearLayout != null) {
                                                                i = C1188R.C1192id.rlFirstBanner;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlFirstBanner);
                                                                if (relativeLayout != null) {
                                                                    i = C1188R.C1192id.rlUpcomingMatch;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlUpcomingMatch);
                                                                    if (relativeLayout2 != null) {
                                                                        i = C1188R.C1192id.tvLable;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvLable);
                                                                        if (textView != null) {
                                                                            i = C1188R.C1192id.tvName;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvName);
                                                                            if (textView2 != null) {
                                                                                i = C1188R.C1192id.tvUsername;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvUsername);
                                                                                if (textView3 != null) {
                                                                                    return new BannerLayoutBinding((ConstraintLayout) view2, constraintLayout, guideline, guideline7, guideline8, guideline9, guideline10, guideline11, circleImageView, circleImageView2, imageView, imageView2, imageView3, imageView4, linearLayout, relativeLayout, relativeLayout2, textView, textView2, textView3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
