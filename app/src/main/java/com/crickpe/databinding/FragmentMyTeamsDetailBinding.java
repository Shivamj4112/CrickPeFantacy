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
import com.crickpe.C1188R;

public final class FragmentMyTeamsDetailBinding implements ViewBinding {
    public final ImageView ivCaptain;
    public final ImageView ivVCaptain;
    public final LinearLayout llContainerAllRound;
    public final LinearLayout llContainerBat;
    public final LinearLayout llContainerBowlers;
    public final LinearLayout llContainerWk;
    public final LinearLayout llTopView;
    public final RelativeLayout rlGroundLayout;
    private final RelativeLayout rootView;
    public final TextView textView7;
    public final TextView tvCaptainn;
    public final TextView tvTotalPoints;
    public final TextView tvVCaptainn;

    private FragmentMyTeamsDetailBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.ivCaptain = imageView;
        this.ivVCaptain = imageView2;
        this.llContainerAllRound = linearLayout;
        this.llContainerBat = linearLayout2;
        this.llContainerBowlers = linearLayout3;
        this.llContainerWk = linearLayout4;
        this.llTopView = linearLayout5;
        this.rlGroundLayout = relativeLayout2;
        this.textView7 = textView;
        this.tvCaptainn = textView2;
        this.tvTotalPoints = textView3;
        this.tvVCaptainn = textView4;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMyTeamsDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMyTeamsDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_my_teams_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMyTeamsDetailBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.ivCaptain;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivCaptain);
        if (imageView != null) {
            i = C1188R.C1192id.ivVCaptain;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivVCaptain);
            if (imageView2 != null) {
                i = C1188R.C1192id.llContainerAllRound;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llContainerAllRound);
                if (linearLayout != null) {
                    i = C1188R.C1192id.llContainerBat;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llContainerBat);
                    if (linearLayout2 != null) {
                        i = C1188R.C1192id.llContainerBowlers;
                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llContainerBowlers);
                        if (linearLayout3 != null) {
                            i = C1188R.C1192id.llContainerWk;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llContainerWk);
                            if (linearLayout4 != null) {
                                i = C1188R.C1192id.llTopView;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llTopView);
                                if (linearLayout5 != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) view2;
                                    i = C1188R.C1192id.textView7;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView7);
                                    if (textView != null) {
                                        i = C1188R.C1192id.tvCaptainn;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCaptainn);
                                        if (textView2 != null) {
                                            i = C1188R.C1192id.tvTotalPoints;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTotalPoints);
                                            if (textView3 != null) {
                                                i = C1188R.C1192id.tvVCaptainn;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvVCaptainn);
                                                if (textView4 != null) {
                                                    return new FragmentMyTeamsDetailBinding(relativeLayout, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, relativeLayout, textView, textView2, textView3, textView4);
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
