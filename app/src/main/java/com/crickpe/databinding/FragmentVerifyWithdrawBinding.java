package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentVerifyWithdrawBinding implements ViewBinding {
    public final TextView forQuickWithdrwal;
    public final ImageView imageView13;
    public final ImageView ivBank;
    public final ImageView ivKyc;
    public final ImageView ivPan;

    /* renamed from: ll */
    public final LinearLayout f460ll;
    public final LinearLayout ll2;
    private final NestedScrollView rootView;
    public final TextView tvKyc;
    public final TextView tvMobile;
    public final TextView tvPanStatus;
    public final TextView tvVerifyBank;
    public final TextView tvVerifyPan;

    private FragmentVerifyWithdrawBinding(NestedScrollView nestedScrollView, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = nestedScrollView;
        this.forQuickWithdrwal = textView;
        this.imageView13 = imageView;
        this.ivBank = imageView2;
        this.ivKyc = imageView3;
        this.ivPan = imageView4;
        this.f460ll = linearLayout;
        this.ll2 = linearLayout2;
        this.tvKyc = textView2;
        this.tvMobile = textView3;
        this.tvPanStatus = textView4;
        this.tvVerifyBank = textView5;
        this.tvVerifyPan = textView6;
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentVerifyWithdrawBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentVerifyWithdrawBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_verify_withdraw, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentVerifyWithdrawBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.forQuickWithdrwal;
        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.forQuickWithdrwal);
        if (textView != null) {
            i = C1188R.C1192id.imageView13;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imageView13);
            if (imageView != null) {
                i = C1188R.C1192id.ivBank;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivBank);
                if (imageView2 != null) {
                    i = C1188R.C1192id.ivKyc;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivKyc);
                    if (imageView3 != null) {
                        i = C1188R.C1192id.ivPan;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivPan);
                        if (imageView4 != null) {
                            i = C1188R.C1192id.f418ll;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.f418ll);
                            if (linearLayout != null) {
                                i = C1188R.C1192id.ll2;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.ll2);
                                if (linearLayout2 != null) {
                                    i = C1188R.C1192id.tvKyc;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvKyc);
                                    if (textView2 != null) {
                                        i = C1188R.C1192id.tvMobile;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMobile);
                                        if (textView3 != null) {
                                            i = C1188R.C1192id.tvPanStatus;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvPanStatus);
                                            if (textView4 != null) {
                                                i = C1188R.C1192id.tvVerifyBank;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvVerifyBank);
                                                if (textView5 != null) {
                                                    i = C1188R.C1192id.tvVerifyPan;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvVerifyPan);
                                                    if (textView6 != null) {
                                                        return new FragmentVerifyWithdrawBinding((NestedScrollView) view2, textView, imageView, imageView2, imageView3, imageView4, linearLayout, linearLayout2, textView2, textView3, textView4, textView5, textView6);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
