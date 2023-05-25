package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class ActivityDetailBinding implements ViewBinding {
    public final ImageView ivBack;
    public final ImageView ivDownload;
    public final ImageView ivFilterTopPlayer;
    public final CircleImageView ivTeam1;
    public final CircleImageView ivTeam2;
    public final ImageView ivWallet;
    public final LinearLayout llMatchBetween;
    public final FragmentContainerView navHostFragmentDetail;
    public final RelativeLayout rlPTS;
    public final RelativeLayout rlTop;
    public final RelativeLayout rlWallet;
    private final CoordinatorLayout rootView;
    public final TextView tvAmount;
    public final TextView tvSave;
    public final TextView tvTime;
    public final TextView tvTitle;
    public final View view;

    private ActivityDetailBinding(CoordinatorLayout coordinatorLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, CircleImageView circleImageView, CircleImageView circleImageView2, ImageView imageView4, LinearLayout linearLayout, FragmentContainerView fragmentContainerView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        this.rootView = coordinatorLayout;
        this.ivBack = imageView;
        this.ivDownload = imageView2;
        this.ivFilterTopPlayer = imageView3;
        this.ivTeam1 = circleImageView;
        this.ivTeam2 = circleImageView2;
        this.ivWallet = imageView4;
        this.llMatchBetween = linearLayout;
        this.navHostFragmentDetail = fragmentContainerView;
        this.rlPTS = relativeLayout;
        this.rlTop = relativeLayout2;
        this.rlWallet = relativeLayout3;
        this.tvAmount = textView;
        this.tvSave = textView2;
        this.tvTime = textView3;
        this.tvTitle = textView4;
        this.view = view2;
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static ActivityDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.activity_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityDetailBinding bind(View view2) {
        View view3 = view2;
        int i = C1188R.C1192id.ivBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivBack);
        if (imageView != null) {
            i = C1188R.C1192id.ivDownload;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivDownload);
            if (imageView2 != null) {
                i = C1188R.C1192id.ivFilterTopPlayer;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivFilterTopPlayer);
                if (imageView3 != null) {
                    i = C1188R.C1192id.ivTeam1;
                    CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivTeam1);
                    if (circleImageView != null) {
                        i = C1188R.C1192id.ivTeam2;
                        CircleImageView circleImageView2 = (CircleImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivTeam2);
                        if (circleImageView2 != null) {
                            i = C1188R.C1192id.ivWallet;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivWallet);
                            if (imageView4 != null) {
                                i = C1188R.C1192id.llMatchBetween;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.llMatchBetween);
                                if (linearLayout != null) {
                                    i = C1188R.C1192id.nav_host_fragment_detail;
                                    FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view3, C1188R.C1192id.nav_host_fragment_detail);
                                    if (fragmentContainerView != null) {
                                        i = C1188R.C1192id.rlPTS;
                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlPTS);
                                        if (relativeLayout != null) {
                                            i = C1188R.C1192id.rlTop;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlTop);
                                            if (relativeLayout2 != null) {
                                                i = C1188R.C1192id.rlWallet;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlWallet);
                                                if (relativeLayout3 != null) {
                                                    i = C1188R.C1192id.tvAmount;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvAmount);
                                                    if (textView != null) {
                                                        i = C1188R.C1192id.tvSave;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvSave);
                                                        if (textView2 != null) {
                                                            i = C1188R.C1192id.tvTime;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvTime);
                                                            if (textView3 != null) {
                                                                i = C1188R.C1192id.tvTitle;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvTitle);
                                                                if (textView4 != null) {
                                                                    i = C1188R.C1192id.view;
                                                                    View findChildViewById = ViewBindings.findChildViewById(view3, C1188R.C1192id.view);
                                                                    if (findChildViewById != null) {
                                                                        return new ActivityDetailBinding((CoordinatorLayout) view3, imageView, imageView2, imageView3, circleImageView, circleImageView2, imageView4, linearLayout, fragmentContainerView, relativeLayout, relativeLayout2, relativeLayout3, textView, textView2, textView3, textView4, findChildViewById);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
