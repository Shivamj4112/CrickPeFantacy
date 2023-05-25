package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentBattingBinding implements ViewBinding {
    public final ConstraintLayout constrainLayout;
    public final ImageView ivFilter;
    public final RelativeLayout rlTop;
    private final RelativeLayout rootView;
    public final RecyclerView rvCreateTeam;
    public final TextView textView24;
    public final TextView textView25;
    public final TextView textView26;
    public final TextView tvTitle;

    private FragmentBattingBinding(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, ImageView imageView, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.constrainLayout = constraintLayout;
        this.ivFilter = imageView;
        this.rlTop = relativeLayout2;
        this.rvCreateTeam = recyclerView;
        this.textView24 = textView;
        this.textView25 = textView2;
        this.textView26 = textView3;
        this.tvTitle = textView4;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentBattingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentBattingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_batting, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBattingBinding bind(View view) {
        int i = C1188R.C1192id.constrainLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.constrainLayout);
        if (constraintLayout != null) {
            i = C1188R.C1192id.ivFilter;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivFilter);
            if (imageView != null) {
                i = C1188R.C1192id.rlTop;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlTop);
                if (relativeLayout != null) {
                    i = C1188R.C1192id.rvCreateTeam;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvCreateTeam);
                    if (recyclerView != null) {
                        i = C1188R.C1192id.textView24;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView24);
                        if (textView != null) {
                            i = C1188R.C1192id.textView25;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView25);
                            if (textView2 != null) {
                                i = C1188R.C1192id.textView26;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView26);
                                if (textView3 != null) {
                                    i = C1188R.C1192id.tvTitle;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvTitle);
                                    if (textView4 != null) {
                                        return new FragmentBattingBinding((RelativeLayout) view, constraintLayout, imageView, relativeLayout, recyclerView, textView, textView2, textView3, textView4);
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
