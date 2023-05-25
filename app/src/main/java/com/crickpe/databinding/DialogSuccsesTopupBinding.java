package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogSuccsesTopupBinding implements ViewBinding {
    public final LinearLayout relativeLayout5;
    private final RelativeLayout rootView;
    public final TextView tvDone;
    public final TextView tvTopupAmount;

    private DialogSuccsesTopupBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.relativeLayout5 = linearLayout;
        this.tvDone = textView;
        this.tvTopupAmount = textView2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static DialogSuccsesTopupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogSuccsesTopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_succses_topup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogSuccsesTopupBinding bind(View view) {
        int i = C1188R.C1192id.relativeLayout5;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.relativeLayout5);
        if (linearLayout != null) {
            i = C1188R.C1192id.tvDone;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvDone);
            if (textView != null) {
                i = C1188R.C1192id.tvTopupAmount;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvTopupAmount);
                if (textView2 != null) {
                    return new DialogSuccsesTopupBinding((RelativeLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
