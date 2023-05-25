package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentPaymentMethodBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final RecyclerView rvTopupAmount;
    public final TextView textView10;
    public final TextView textView6;
    public final TextView tvProceedToPay;

    private FragmentPaymentMethodBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.rvTopupAmount = recyclerView;
        this.textView10 = textView;
        this.textView6 = textView2;
        this.tvProceedToPay = textView3;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentPaymentMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_payment_method, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPaymentMethodBinding bind(View view) {
        int i = C1188R.C1192id.rvTopupAmount;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvTopupAmount);
        if (recyclerView != null) {
            i = C1188R.C1192id.textView10;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView10);
            if (textView != null) {
                i = C1188R.C1192id.textView6;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView6);
                if (textView2 != null) {
                    i = C1188R.C1192id.tvProceedToPay;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvProceedToPay);
                    if (textView3 != null) {
                        return new FragmentPaymentMethodBinding((ConstraintLayout) view, recyclerView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
