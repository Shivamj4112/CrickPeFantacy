package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogKycAlertBinding implements ViewBinding {
    private final CardView rootView;
    public final TextView tvBody;
    public final TextView tvNo;
    public final TextView tvTitle;
    public final View view;

    private DialogKycAlertBinding(CardView cardView, TextView textView, TextView textView2, TextView textView3, View view2) {
        this.rootView = cardView;
        this.tvBody = textView;
        this.tvNo = textView2;
        this.tvTitle = textView3;
        this.view = view2;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static DialogKycAlertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogKycAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_kyc_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogKycAlertBinding bind(View view2) {
        int i = C1188R.C1192id.tvBody;
        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvBody);
        if (textView != null) {
            i = C1188R.C1192id.tvNo;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvNo);
            if (textView2 != null) {
                i = C1188R.C1192id.tvTitle;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTitle);
                if (textView3 != null) {
                    i = C1188R.C1192id.view;
                    View findChildViewById = ViewBindings.findChildViewById(view2, C1188R.C1192id.view);
                    if (findChildViewById != null) {
                        return new DialogKycAlertBinding((CardView) view2, textView, textView2, textView3, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
