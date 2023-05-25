package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogBonusBinding implements ViewBinding {
    public final Guideline guideline1;
    public final Guideline guideline2;
    public final ImageView ivCancelDialog;
    public final ImageView ivWallet;
    public final RelativeLayout relativeLayout5;
    public final RelativeLayout rlBody;
    public final RelativeLayout rlTitle;
    private final ConstraintLayout rootView;
    public final RelativeLayout top;
    public final TextView tvBody;
    public final TextView tvDone;

    private DialogBonusBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline3, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.guideline1 = guideline;
        this.guideline2 = guideline3;
        this.ivCancelDialog = imageView;
        this.ivWallet = imageView2;
        this.relativeLayout5 = relativeLayout;
        this.rlBody = relativeLayout2;
        this.rlTitle = relativeLayout3;
        this.top = relativeLayout4;
        this.tvBody = textView;
        this.tvDone = textView2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogBonusBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogBonusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_bonus, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBonusBinding bind(View view) {
        int i = C1188R.C1192id.guideline1;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, C1188R.C1192id.guideline1);
        if (guideline != null) {
            i = C1188R.C1192id.guideline2;
            Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, C1188R.C1192id.guideline2);
            if (guideline3 != null) {
                i = C1188R.C1192id.ivCancelDialog;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivCancelDialog);
                if (imageView != null) {
                    i = C1188R.C1192id.ivWallet;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivWallet);
                    if (imageView2 != null) {
                        i = C1188R.C1192id.relativeLayout5;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.relativeLayout5);
                        if (relativeLayout != null) {
                            i = C1188R.C1192id.rlBody;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlBody);
                            if (relativeLayout2 != null) {
                                i = C1188R.C1192id.rlTitle;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlTitle);
                                if (relativeLayout3 != null) {
                                    i = C1188R.C1192id.top;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.top);
                                    if (relativeLayout4 != null) {
                                        i = C1188R.C1192id.tvBody;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvBody);
                                        if (textView != null) {
                                            i = C1188R.C1192id.tvDone;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvDone);
                                            if (textView2 != null) {
                                                return new DialogBonusBinding((ConstraintLayout) view, guideline, guideline3, imageView, imageView2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, textView, textView2);
                                            }
                                        }
                                    }
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
