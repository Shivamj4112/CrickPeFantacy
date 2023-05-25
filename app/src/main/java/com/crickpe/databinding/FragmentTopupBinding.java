package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentTopupBinding implements ViewBinding {
    public final TextView currency;
    public final EditText etAmount;
    public final ImageView imageView4;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout4;
    private final ConstraintLayout rootView;
    public final RecyclerView rvTopupAmount;
    public final TextView textView6;
    public final TextView textView8;
    public final TextView textView9;
    public final TextView tvMinAmount;
    public final TextView tvProceedToPay;
    public final View view;

    private FragmentTopupBinding(ConstraintLayout constraintLayout, TextView textView, EditText editText, ImageView imageView, ProgressBar progressBar2, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView7, View view2) {
        this.rootView = constraintLayout;
        this.currency = textView;
        this.etAmount = editText;
        this.imageView4 = imageView;
        this.progressBar = progressBar2;
        this.relativeLayout4 = relativeLayout;
        this.rvTopupAmount = recyclerView;
        this.textView6 = textView2;
        this.textView8 = textView3;
        this.textView9 = textView4;
        this.tvMinAmount = textView5;
        this.tvProceedToPay = textView7;
        this.view = view2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentTopupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentTopupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_topup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentTopupBinding bind(View view2) {
        View view3 = view2;
        int i = C1188R.C1192id.currency;
        TextView textView = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.currency);
        if (textView != null) {
            i = C1188R.C1192id.etAmount;
            EditText editText = (EditText) ViewBindings.findChildViewById(view3, C1188R.C1192id.etAmount);
            if (editText != null) {
                i = C1188R.C1192id.imageView4;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.imageView4);
                if (imageView != null) {
                    i = C1188R.C1192id.progressBar;
                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view3, C1188R.C1192id.progressBar);
                    if (progressBar2 != null) {
                        i = C1188R.C1192id.relativeLayout4;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.relativeLayout4);
                        if (relativeLayout != null) {
                            i = C1188R.C1192id.rvTopupAmount;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view3, C1188R.C1192id.rvTopupAmount);
                            if (recyclerView != null) {
                                i = C1188R.C1192id.textView6;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.textView6);
                                if (textView2 != null) {
                                    i = C1188R.C1192id.textView8;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.textView8);
                                    if (textView3 != null) {
                                        i = C1188R.C1192id.textView9;
                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.textView9);
                                        if (textView4 != null) {
                                            i = C1188R.C1192id.tvMinAmount;
                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvMinAmount);
                                            if (textView5 != null) {
                                                i = C1188R.C1192id.tvProceedToPay;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvProceedToPay);
                                                if (textView7 != null) {
                                                    i = C1188R.C1192id.view;
                                                    View findChildViewById = ViewBindings.findChildViewById(view3, C1188R.C1192id.view);
                                                    if (findChildViewById != null) {
                                                        return new FragmentTopupBinding((ConstraintLayout) view3, textView, editText, imageView, progressBar2, relativeLayout, recyclerView, textView2, textView3, textView4, textView5, textView7, findChildViewById);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
