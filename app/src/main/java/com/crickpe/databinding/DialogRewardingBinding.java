package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogRewardingBinding implements ViewBinding {
    public final ImageView ivCash;
    private final CardView rootView;
    public final TextView tvBodyText;
    public final TextView tvYes;

    private DialogRewardingBinding(CardView cardView, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.ivCash = imageView;
        this.tvBodyText = textView;
        this.tvYes = textView2;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static DialogRewardingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogRewardingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_rewarding, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogRewardingBinding bind(View view) {
        int i = C1188R.C1192id.ivCash;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivCash);
        if (imageView != null) {
            i = C1188R.C1192id.tvBodyText;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvBodyText);
            if (textView != null) {
                i = C1188R.C1192id.tvYes;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvYes);
                if (textView2 != null) {
                    return new DialogRewardingBinding((CardView) view, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
