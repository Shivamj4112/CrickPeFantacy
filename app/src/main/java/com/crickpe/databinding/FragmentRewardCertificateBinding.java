package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class FragmentRewardCertificateBinding implements ViewBinding {
    public final CardView cardView;
    public final ImageView ivCertificate;
    public final CircleImageView ivShareIcon;
    public final LinearLayout linearLayout18;
    public final LinearLayout llShare;
    private final ConstraintLayout rootView;
    public final TextView textView11;
    public final TextView tvShare;

    private FragmentRewardCertificateBinding(ConstraintLayout constraintLayout, CardView cardView2, ImageView imageView, CircleImageView circleImageView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.cardView = cardView2;
        this.ivCertificate = imageView;
        this.ivShareIcon = circleImageView;
        this.linearLayout18 = linearLayout;
        this.llShare = linearLayout2;
        this.textView11 = textView;
        this.tvShare = textView2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentRewardCertificateBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentRewardCertificateBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_reward_certificate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentRewardCertificateBinding bind(View view) {
        int i = C1188R.C1192id.cardView;
        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, C1188R.C1192id.cardView);
        if (cardView2 != null) {
            i = C1188R.C1192id.ivCertificate;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivCertificate);
            if (imageView != null) {
                i = C1188R.C1192id.ivShareIcon;
                CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivShareIcon);
                if (circleImageView != null) {
                    i = C1188R.C1192id.linearLayout18;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.linearLayout18);
                    if (linearLayout != null) {
                        i = C1188R.C1192id.llShare;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.llShare);
                        if (linearLayout2 != null) {
                            i = C1188R.C1192id.textView11;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView11);
                            if (textView != null) {
                                i = C1188R.C1192id.tvShare;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvShare);
                                if (textView2 != null) {
                                    return new FragmentRewardCertificateBinding((ConstraintLayout) view, cardView2, imageView, circleImageView, linearLayout, linearLayout2, textView, textView2);
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
