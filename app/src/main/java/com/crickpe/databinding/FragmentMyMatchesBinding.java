package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentMyMatchesBinding implements ViewBinding {
    public final RelativeLayout btnJoin;
    public final HorizontalScrollView flTop;
    public final ImageView ivCompleted;
    public final ImageView ivLive;
    public final ImageView ivUpcoming;
    public final ImageView noDataImage;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout12;
    public final RelativeLayout rlCompleted;
    public final RelativeLayout rlCurrent;
    public final LinearLayout rlNoData;
    public final RelativeLayout rlUpcoming;
    private final ConstraintLayout rootView;
    public final RecyclerView rvMyMatches;
    public final SwipeRefreshLayout swipeRv;
    public final TextView tvCompleteMatches;
    public final TextView tvCurrentMatches;
    public final TextView tvNoData;
    public final TextView tvUpcomingMatches;

    private FragmentMyMatchesBinding(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, HorizontalScrollView horizontalScrollView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ProgressBar progressBar2, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout, RelativeLayout relativeLayout5, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.btnJoin = relativeLayout;
        this.flTop = horizontalScrollView;
        this.ivCompleted = imageView;
        this.ivLive = imageView2;
        this.ivUpcoming = imageView3;
        this.noDataImage = imageView4;
        this.progressBar = progressBar2;
        this.relativeLayout12 = relativeLayout2;
        this.rlCompleted = relativeLayout3;
        this.rlCurrent = relativeLayout4;
        this.rlNoData = linearLayout;
        this.rlUpcoming = relativeLayout5;
        this.rvMyMatches = recyclerView;
        this.swipeRv = swipeRefreshLayout;
        this.tvCompleteMatches = textView;
        this.tvCurrentMatches = textView2;
        this.tvNoData = textView3;
        this.tvUpcomingMatches = textView4;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMyMatchesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMyMatchesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_my_matches, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMyMatchesBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.btnJoin;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.btnJoin);
        if (relativeLayout != null) {
            i = C1188R.C1192id.flTop;
            HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view2, C1188R.C1192id.flTop);
            if (horizontalScrollView != null) {
                i = C1188R.C1192id.ivCompleted;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivCompleted);
                if (imageView != null) {
                    i = C1188R.C1192id.ivLive;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivLive);
                    if (imageView2 != null) {
                        i = C1188R.C1192id.ivUpcoming;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivUpcoming);
                        if (imageView3 != null) {
                            i = C1188R.C1192id.noDataImage;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.noDataImage);
                            if (imageView4 != null) {
                                i = C1188R.C1192id.progressBar;
                                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progressBar);
                                if (progressBar2 != null) {
                                    i = C1188R.C1192id.relativeLayout12;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.relativeLayout12);
                                    if (relativeLayout2 != null) {
                                        i = C1188R.C1192id.rlCompleted;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlCompleted);
                                        if (relativeLayout3 != null) {
                                            i = C1188R.C1192id.rlCurrent;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlCurrent);
                                            if (relativeLayout4 != null) {
                                                i = C1188R.C1192id.rlNoData;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlNoData);
                                                if (linearLayout != null) {
                                                    i = C1188R.C1192id.rlUpcoming;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlUpcoming);
                                                    if (relativeLayout5 != null) {
                                                        i = C1188R.C1192id.rvMyMatches;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvMyMatches);
                                                        if (recyclerView != null) {
                                                            i = C1188R.C1192id.swipeRv;
                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.swipeRv);
                                                            if (swipeRefreshLayout != null) {
                                                                i = C1188R.C1192id.tvCompleteMatches;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCompleteMatches);
                                                                if (textView != null) {
                                                                    i = C1188R.C1192id.tvCurrentMatches;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCurrentMatches);
                                                                    if (textView2 != null) {
                                                                        i = C1188R.C1192id.tvNoData;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvNoData);
                                                                        if (textView3 != null) {
                                                                            i = C1188R.C1192id.tvUpcomingMatches;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvUpcomingMatches);
                                                                            if (textView4 != null) {
                                                                                return new FragmentMyMatchesBinding((ConstraintLayout) view2, relativeLayout, horizontalScrollView, imageView, imageView2, imageView3, imageView4, progressBar2, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout, relativeLayout5, recyclerView, swipeRefreshLayout, textView, textView2, textView3, textView4);
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
