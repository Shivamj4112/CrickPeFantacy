package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogBottomRecyclerBinding implements ViewBinding {
    public final LinearLayout llConfirm;
    private final LinearLayout rootView;
    public final RecyclerView rvBottomDialog;

    private DialogBottomRecyclerBinding(LinearLayout linearLayout, LinearLayout linearLayout2, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.llConfirm = linearLayout2;
        this.rvBottomDialog = recyclerView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogBottomRecyclerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogBottomRecyclerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_bottom_recycler, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBottomRecyclerBinding bind(View view) {
        int i = C1188R.C1192id.llConfirm;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.llConfirm);
        if (linearLayout != null) {
            i = C1188R.C1192id.rvBottomDialog;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvBottomDialog);
            if (recyclerView != null) {
                return new DialogBottomRecyclerBinding((LinearLayout) view, linearLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
