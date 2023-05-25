package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogFailedBinding implements ViewBinding {
    public final ImageView ivTop;
    public final LinearLayout relativeLayout5;
    private final CardView rootView;
    public final TextView tvBody;
    public final TextView tvDone;

    private DialogFailedBinding(CardView cardView, ImageView imageView, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.ivTop = imageView;
        this.relativeLayout5 = linearLayout;
        this.tvBody = textView;
        this.tvDone = textView2;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static DialogFailedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogFailedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_failed, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogFailedBinding bind(View view) {
        int i = C1188R.C1192id.ivTop;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivTop);
        if (imageView != null) {
            i = C1188R.C1192id.relativeLayout5;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.relativeLayout5);
            if (linearLayout != null) {
                i = C1188R.C1192id.tvBody;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvBody);
                if (textView != null) {
                    i = C1188R.C1192id.tvDone;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvDone);
                    if (textView2 != null) {
                        return new DialogFailedBinding((CardView) view, imageView, linearLayout, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
