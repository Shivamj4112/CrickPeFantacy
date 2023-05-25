package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class UpcomingMatchLayoutBinding implements ViewBinding {
    public final ImageView imageView;
    public final ImageView ivTeam1;
    public final ImageView ivTeam2;
    public final ConstraintLayout rlStart;
    public final RelativeLayout rlView;
    private final RelativeLayout rootView;
    public final TextView textView;
    public final TextView tvContest;
    public final TextView tvContestPrice;
    public final TextView tvSeriesName;
    public final TextView tvTeam1Name;
    public final TextView tvTeam2Name;
    public final TextView tvVanue;

    private UpcomingMatchLayoutBinding(RelativeLayout relativeLayout, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, RelativeLayout relativeLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = relativeLayout;
        this.imageView = imageView2;
        this.ivTeam1 = imageView3;
        this.ivTeam2 = imageView4;
        this.rlStart = constraintLayout;
        this.rlView = relativeLayout2;
        this.textView = textView2;
        this.tvContest = textView3;
        this.tvContestPrice = textView4;
        this.tvSeriesName = textView5;
        this.tvTeam1Name = textView6;
        this.tvTeam2Name = textView7;
        this.tvVanue = textView8;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static UpcomingMatchLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static UpcomingMatchLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.upcoming_match_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static UpcomingMatchLayoutBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.imageView;
        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imageView);
        if (imageView2 != null) {
            i = C1188R.C1192id.ivTeam1;
            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivTeam1);
            if (imageView3 != null) {
                i = C1188R.C1192id.ivTeam2;
                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivTeam2);
                if (imageView4 != null) {
                    i = C1188R.C1192id.rlStart;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlStart);
                    if (constraintLayout != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view2;
                        i = C1188R.C1192id.textView;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView);
                        if (textView2 != null) {
                            i = C1188R.C1192id.tvContest;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvContest);
                            if (textView3 != null) {
                                i = C1188R.C1192id.tvContestPrice;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvContestPrice);
                                if (textView4 != null) {
                                    i = C1188R.C1192id.tvSeriesName;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvSeriesName);
                                    if (textView5 != null) {
                                        i = C1188R.C1192id.tvTeam1Name;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTeam1Name);
                                        if (textView6 != null) {
                                            i = C1188R.C1192id.tvTeam2Name;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTeam2Name);
                                            if (textView7 != null) {
                                                i = C1188R.C1192id.tvVanue;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvVanue);
                                                if (textView8 != null) {
                                                    return new UpcomingMatchLayoutBinding(relativeLayout, imageView2, imageView3, imageView4, constraintLayout, relativeLayout, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
