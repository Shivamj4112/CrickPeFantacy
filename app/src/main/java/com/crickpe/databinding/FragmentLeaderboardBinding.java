package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentLeaderboardBinding implements ViewBinding {
    public final TextView joiningFee;
    public final LinearLayout linearLayout8;
    public final ImageView noDataImage;
    public final TextView prizePool;
    public final ProgressBar progressBar;
    private final SwipeRefreshLayout rootView;
    public final RecyclerView rvLeaderboard;
    public final TextView spots;
    public final SwipeRefreshLayout swipeRv;
    public final TextView tvNoData;

    private FragmentLeaderboardBinding(SwipeRefreshLayout swipeRefreshLayout, TextView textView, LinearLayout linearLayout, ImageView imageView, TextView textView2, ProgressBar progressBar2, RecyclerView recyclerView, TextView textView3, SwipeRefreshLayout swipeRefreshLayout2, TextView textView4) {
        this.rootView = swipeRefreshLayout;
        this.joiningFee = textView;
        this.linearLayout8 = linearLayout;
        this.noDataImage = imageView;
        this.prizePool = textView2;
        this.progressBar = progressBar2;
        this.rvLeaderboard = recyclerView;
        this.spots = textView3;
        this.swipeRv = swipeRefreshLayout2;
        this.tvNoData = textView4;
    }

    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLeaderboardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentLeaderboardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_leaderboard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLeaderboardBinding bind(View view) {
        int i = C1188R.C1192id.joiningFee;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.joiningFee);
        if (textView != null) {
            i = C1188R.C1192id.linearLayout8;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.linearLayout8);
            if (linearLayout != null) {
                i = C1188R.C1192id.noDataImage;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.noDataImage);
                if (imageView != null) {
                    i = C1188R.C1192id.prizePool;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.prizePool);
                    if (textView2 != null) {
                        i = C1188R.C1192id.progressBar;
                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
                        if (progressBar2 != null) {
                            i = C1188R.C1192id.rvLeaderboard;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvLeaderboard);
                            if (recyclerView != null) {
                                i = C1188R.C1192id.spots;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.spots);
                                if (textView3 != null) {
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                    i = C1188R.C1192id.tvNoData;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvNoData);
                                    if (textView4 != null) {
                                        return new FragmentLeaderboardBinding(swipeRefreshLayout, textView, linearLayout, imageView, textView2, progressBar2, recyclerView, textView3, swipeRefreshLayout, textView4);
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
