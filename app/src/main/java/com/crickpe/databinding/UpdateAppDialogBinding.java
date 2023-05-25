package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class UpdateAppDialogBinding implements ViewBinding {
    public final ImageView ivApplogo;
    public final LinearLayout llBottom;
    public final RelativeLayout rlBody;
    private final CardView rootView;
    public final TextView tvAllow;
    public final TextView tvAppTitle;
    public final TextView tvCancel;
    public final TextView tvDescription1;

    private UpdateAppDialogBinding(CardView cardView, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = cardView;
        this.ivApplogo = imageView;
        this.llBottom = linearLayout;
        this.rlBody = relativeLayout;
        this.tvAllow = textView;
        this.tvAppTitle = textView2;
        this.tvCancel = textView3;
        this.tvDescription1 = textView4;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static UpdateAppDialogBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static UpdateAppDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.update_app_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static UpdateAppDialogBinding bind(View view) {
        int i = C1188R.C1192id.ivApplogo;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivApplogo);
        if (imageView != null) {
            i = C1188R.C1192id.llBottom;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.llBottom);
            if (linearLayout != null) {
                i = C1188R.C1192id.rlBody;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlBody);
                if (relativeLayout != null) {
                    i = C1188R.C1192id.tvAllow;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvAllow);
                    if (textView != null) {
                        i = C1188R.C1192id.tvAppTitle;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvAppTitle);
                        if (textView2 != null) {
                            i = C1188R.C1192id.tvCancel;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvCancel);
                            if (textView3 != null) {
                                i = C1188R.C1192id.tvDescription1;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvDescription1);
                                if (textView4 != null) {
                                    return new UpdateAppDialogBinding((CardView) view, imageView, linearLayout, relativeLayout, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
