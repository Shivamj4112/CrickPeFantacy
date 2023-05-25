package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentPreviewTeamBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final RecyclerView rvTeamPreview;
    public final TextView tvUpcoming;

    private FragmentPreviewTeamBinding(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView) {
        this.rootView = linearLayout;
        this.rvTeamPreview = recyclerView;
        this.tvUpcoming = textView;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPreviewTeamBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentPreviewTeamBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_preview_team, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPreviewTeamBinding bind(View view) {
        int i = C1188R.C1192id.rvTeamPreview;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvTeamPreview);
        if (recyclerView != null) {
            i = C1188R.C1192id.tvUpcoming;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvUpcoming);
            if (textView != null) {
                return new FragmentPreviewTeamBinding((LinearLayout) view, recyclerView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
