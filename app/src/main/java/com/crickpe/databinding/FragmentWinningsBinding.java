package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentWinningsBinding implements ViewBinding {
    public final TextView joiningFee;
    public final LinearLayout linearLayout8;
    public final TextView prizePool;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout3;
    private final SwipeRefreshLayout rootView;
    public final RecyclerView rvWinnings;
    public final TextView spots;
    public final SwipeRefreshLayout swipeRv;
    public final TextView tvJoiningFee;
    public final TextView tvPoolPrize;
    public final TextView tvSpots;

    private FragmentWinningsBinding(SwipeRefreshLayout swipeRefreshLayout, TextView textView, LinearLayout linearLayout, TextView textView2, ProgressBar progressBar2, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView3, SwipeRefreshLayout swipeRefreshLayout2, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = swipeRefreshLayout;
        this.joiningFee = textView;
        this.linearLayout8 = linearLayout;
        this.prizePool = textView2;
        this.progressBar = progressBar2;
        this.relativeLayout3 = relativeLayout;
        this.rvWinnings = recyclerView;
        this.spots = textView3;
        this.swipeRv = swipeRefreshLayout2;
        this.tvJoiningFee = textView4;
        this.tvPoolPrize = textView5;
        this.tvSpots = textView6;
    }

    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWinningsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentWinningsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_winnings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWinningsBinding bind(View view) {
        int i = C1188R.C1192id.joiningFee;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.joiningFee);
        if (textView != null) {
            i = C1188R.C1192id.linearLayout8;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.linearLayout8);
            if (linearLayout != null) {
                i = C1188R.C1192id.prizePool;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.prizePool);
                if (textView2 != null) {
                    i = C1188R.C1192id.progressBar;
                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
                    if (progressBar2 != null) {
                        i = C1188R.C1192id.relativeLayout3;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.relativeLayout3);
                        if (relativeLayout != null) {
                            i = C1188R.C1192id.rvWinnings;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvWinnings);
                            if (recyclerView != null) {
                                i = C1188R.C1192id.spots;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.spots);
                                if (textView3 != null) {
                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                                    i = C1188R.C1192id.tvJoiningFee;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvJoiningFee);
                                    if (textView4 != null) {
                                        i = C1188R.C1192id.tvPoolPrize;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvPoolPrize);
                                        if (textView5 != null) {
                                            i = C1188R.C1192id.tvSpots;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvSpots);
                                            if (textView6 != null) {
                                                return new FragmentWinningsBinding(swipeRefreshLayout, textView, linearLayout, textView2, progressBar2, relativeLayout, recyclerView, textView3, swipeRefreshLayout, textView4, textView5, textView6);
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
