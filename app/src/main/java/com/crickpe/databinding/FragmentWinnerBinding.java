package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentWinnerBinding implements ViewBinding {
    public final ImageView noDataImage;
    public final ProgressBar progressBar;
    public final RelativeLayout rlNoData;
    private final RelativeLayout rootView;
    public final RecyclerView rvWinners;
    public final TextView tvNoData;

    private FragmentWinnerBinding(RelativeLayout relativeLayout, ImageView imageView, ProgressBar progressBar2, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView) {
        this.rootView = relativeLayout;
        this.noDataImage = imageView;
        this.progressBar = progressBar2;
        this.rlNoData = relativeLayout2;
        this.rvWinners = recyclerView;
        this.tvNoData = textView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWinnerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentWinnerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_winner, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWinnerBinding bind(View view) {
        int i = C1188R.C1192id.noDataImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.noDataImage);
        if (imageView != null) {
            i = C1188R.C1192id.progressBar;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
            if (progressBar2 != null) {
                i = C1188R.C1192id.rlNoData;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlNoData);
                if (relativeLayout != null) {
                    i = C1188R.C1192id.rvWinners;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvWinners);
                    if (recyclerView != null) {
                        i = C1188R.C1192id.tvNoData;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvNoData);
                        if (textView != null) {
                            return new FragmentWinnerBinding((RelativeLayout) view, imageView, progressBar2, relativeLayout, recyclerView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
