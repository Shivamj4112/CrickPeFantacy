package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogLogoutBinding implements ViewBinding {
    public final LinearLayout llBottomButton;
    private final CardView rootView;
    public final TextView tvNo;
    public final TextView tvYes;
    public final TextView tvbody;
    public final View view;

    private DialogLogoutBinding(CardView cardView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, View view2) {
        this.rootView = cardView;
        this.llBottomButton = linearLayout;
        this.tvNo = textView;
        this.tvYes = textView2;
        this.tvbody = textView3;
        this.view = view2;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static DialogLogoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogLogoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_logout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogLogoutBinding bind(View view2) {
        int i = C1188R.C1192id.llBottomButton;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llBottomButton);
        if (linearLayout != null) {
            i = C1188R.C1192id.tvNo;
            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvNo);
            if (textView != null) {
                i = C1188R.C1192id.tvYes;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvYes);
                if (textView2 != null) {
                    i = C1188R.C1192id.tvbody;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvbody);
                    if (textView3 != null) {
                        i = C1188R.C1192id.view;
                        View findChildViewById = ViewBindings.findChildViewById(view2, C1188R.C1192id.view);
                        if (findChildViewById != null) {
                            return new DialogLogoutBinding((CardView) view2, linearLayout, textView, textView2, textView3, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
