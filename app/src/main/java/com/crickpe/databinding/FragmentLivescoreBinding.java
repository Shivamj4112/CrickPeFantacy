package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentLivescoreBinding implements ViewBinding {
    public final ImageView noDataImage;
    public final ProgressBar progressBar;
    private final SwipeRefreshLayout rootView;
    public final RecyclerView rvLivescore;
    public final SwipeRefreshLayout swipeRv;

    private FragmentLivescoreBinding(SwipeRefreshLayout swipeRefreshLayout, ImageView imageView, ProgressBar progressBar2, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout2) {
        this.rootView = swipeRefreshLayout;
        this.noDataImage = imageView;
        this.progressBar = progressBar2;
        this.rvLivescore = recyclerView;
        this.swipeRv = swipeRefreshLayout2;
    }

    public SwipeRefreshLayout getRoot() {
        return this.rootView;
    }

    public static FragmentLivescoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentLivescoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_livescore, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLivescoreBinding bind(View view) {
        int i = C1188R.C1192id.noDataImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.noDataImage);
        if (imageView != null) {
            i = C1188R.C1192id.progressBar;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
            if (progressBar2 != null) {
                i = C1188R.C1192id.rvLivescore;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvLivescore);
                if (recyclerView != null) {
                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                    return new FragmentLivescoreBinding(swipeRefreshLayout, imageView, progressBar2, recyclerView, swipeRefreshLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
