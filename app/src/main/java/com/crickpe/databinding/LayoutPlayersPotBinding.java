package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class LayoutPlayersPotBinding implements ViewBinding {
    public final LinearLayout layoutPlayersPot;
    public final LinearLayout llNoPot;
    public final LinearLayout llProfile;
    public final RelativeLayout onItemClick;
    private final LinearLayout rootView;
    public final RecyclerView rvPlayersPot;
    public final TextView tvLable;
    public final TextView tvPoints;

    private LayoutPlayersPotBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.layoutPlayersPot = linearLayout2;
        this.llNoPot = linearLayout3;
        this.llProfile = linearLayout4;
        this.onItemClick = relativeLayout;
        this.rvPlayersPot = recyclerView;
        this.tvLable = textView;
        this.tvPoints = textView2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutPlayersPotBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutPlayersPotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.layout_players_pot, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutPlayersPotBinding bind(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = C1188R.C1192id.llNoPot;
        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.llNoPot);
        if (linearLayout2 != null) {
            i = C1188R.C1192id.llProfile;
            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.llProfile);
            if (linearLayout3 != null) {
                i = C1188R.C1192id.onItemClick;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.onItemClick);
                if (relativeLayout != null) {
                    i = C1188R.C1192id.rvPlayersPot;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvPlayersPot);
                    if (recyclerView != null) {
                        i = C1188R.C1192id.tvLable;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvLable);
                        if (textView != null) {
                            i = C1188R.C1192id.tvPoints;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvPoints);
                            if (textView2 != null) {
                                return new LayoutPlayersPotBinding(linearLayout, linearLayout, linearLayout2, linearLayout3, relativeLayout, recyclerView, textView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
