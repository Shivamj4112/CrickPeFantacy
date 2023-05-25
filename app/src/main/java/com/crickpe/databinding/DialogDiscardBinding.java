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

public final class DialogDiscardBinding implements ViewBinding {
    public final LinearLayout llBottomButton;
    private final CardView rootView;
    public final TextView tvBody;
    public final TextView tvNo;
    public final TextView tvTitle;
    public final TextView tvYes;
    public final View view;

    private DialogDiscardBinding(CardView cardView, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        this.rootView = cardView;
        this.llBottomButton = linearLayout;
        this.tvBody = textView;
        this.tvNo = textView2;
        this.tvTitle = textView3;
        this.tvYes = textView4;
        this.view = view2;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static DialogDiscardBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogDiscardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_discard, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogDiscardBinding bind(View view2) {
        int i = C1188R.C1192id.llBottomButton;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llBottomButton);
        if (linearLayout != null) {
            i = C1188R.C1192id.tvBody;
            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvBody);
            if (textView != null) {
                i = C1188R.C1192id.tvNo;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvNo);
                if (textView2 != null) {
                    i = C1188R.C1192id.tvTitle;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTitle);
                    if (textView3 != null) {
                        i = C1188R.C1192id.tvYes;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvYes);
                        if (textView4 != null) {
                            i = C1188R.C1192id.view;
                            View findChildViewById = ViewBindings.findChildViewById(view2, C1188R.C1192id.view);
                            if (findChildViewById != null) {
                                return new DialogDiscardBinding((CardView) view2, linearLayout, textView, textView2, textView3, textView4, findChildViewById);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
