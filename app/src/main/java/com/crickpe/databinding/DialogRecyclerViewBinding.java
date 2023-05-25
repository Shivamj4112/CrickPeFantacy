package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogRecyclerViewBinding implements ViewBinding {
    public final ImageView ivCloseCountry;
    public final RelativeLayout rlTop;
    private final RelativeLayout rootView;
    public final RecyclerView rvDialog;
    public final TextView tvSelect;
    public final TextView tvTitle;
    public final View view;

    private DialogRecyclerViewBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, View view2) {
        this.rootView = relativeLayout;
        this.ivCloseCountry = imageView;
        this.rlTop = relativeLayout2;
        this.rvDialog = recyclerView;
        this.tvSelect = textView;
        this.tvTitle = textView2;
        this.view = view2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogRecyclerViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogRecyclerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_recycler_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogRecyclerViewBinding bind(View view2) {
        int i = C1188R.C1192id.ivCloseCountry;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivCloseCountry);
        if (imageView != null) {
            i = C1188R.C1192id.rlTop;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlTop);
            if (relativeLayout != null) {
                i = C1188R.C1192id.rvDialog;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvDialog);
                if (recyclerView != null) {
                    i = C1188R.C1192id.tvSelect;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvSelect);
                    if (textView != null) {
                        i = C1188R.C1192id.tvTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTitle);
                        if (textView2 != null) {
                            i = C1188R.C1192id.view;
                            View findChildViewById = ViewBindings.findChildViewById(view2, C1188R.C1192id.view);
                            if (findChildViewById != null) {
                                return new DialogRecyclerViewBinding((RelativeLayout) view2, imageView, relativeLayout, recyclerView, textView, textView2, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
