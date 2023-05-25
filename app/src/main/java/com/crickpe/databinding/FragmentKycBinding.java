package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentKycBinding implements ViewBinding {
    public final ConstraintLayout clAadhaarDetail;
    public final ConstraintLayout clAadhaarDoc;
    public final EditText etAadharNumber;
    public final ImageView ivBack;
    public final ImageView ivFront;
    public final LinearLayout llAadhaarNo;
    public final LinearLayout llActiveKycMethod;
    public final LinearLayout llDocImages;
    public final LinearLayout llDocument;
    public final ProgressBar progressBar;
    public final RelativeLayout rlBack;
    public final RelativeLayout rlFront;
    public final LinearLayout rootOtpLayout;
    private final NestedScrollView rootView;
    public final Spinner spinnerState;
    public final TextView tvContinue;
    public final TextView tvDay;
    public final TextView tvMonth;
    public final TextView tvYear;

    private FragmentKycBinding(NestedScrollView nestedScrollView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, EditText editText, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout5, Spinner spinner, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = nestedScrollView;
        this.clAadhaarDetail = constraintLayout;
        this.clAadhaarDoc = constraintLayout2;
        this.etAadharNumber = editText;
        this.ivBack = imageView;
        this.ivFront = imageView2;
        this.llAadhaarNo = linearLayout;
        this.llActiveKycMethod = linearLayout2;
        this.llDocImages = linearLayout3;
        this.llDocument = linearLayout4;
        this.progressBar = progressBar2;
        this.rlBack = relativeLayout;
        this.rlFront = relativeLayout2;
        this.rootOtpLayout = linearLayout5;
        this.spinnerState = spinner;
        this.tvContinue = textView;
        this.tvDay = textView2;
        this.tvMonth = textView3;
        this.tvYear = textView4;
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentKycBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentKycBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_kyc, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentKycBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.clAadhaarDetail;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.clAadhaarDetail);
        if (constraintLayout != null) {
            i = C1188R.C1192id.clAadhaarDoc;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.clAadhaarDoc);
            if (constraintLayout2 != null) {
                i = C1188R.C1192id.etAadharNumber;
                EditText editText = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.etAadharNumber);
                if (editText != null) {
                    i = C1188R.C1192id.ivBack;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivBack);
                    if (imageView != null) {
                        i = C1188R.C1192id.ivFront;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivFront);
                        if (imageView2 != null) {
                            i = C1188R.C1192id.llAadhaarNo;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llAadhaarNo);
                            if (linearLayout != null) {
                                i = C1188R.C1192id.llActiveKycMethod;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llActiveKycMethod);
                                if (linearLayout2 != null) {
                                    i = C1188R.C1192id.llDocImages;
                                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llDocImages);
                                    if (linearLayout3 != null) {
                                        i = C1188R.C1192id.llDocument;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llDocument);
                                        if (linearLayout4 != null) {
                                            i = C1188R.C1192id.progressBar;
                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progressBar);
                                            if (progressBar2 != null) {
                                                i = C1188R.C1192id.rlBack;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlBack);
                                                if (relativeLayout != null) {
                                                    i = C1188R.C1192id.rlFront;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlFront);
                                                    if (relativeLayout2 != null) {
                                                        i = C1188R.C1192id.root_otp_layout;
                                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.root_otp_layout);
                                                        if (linearLayout5 != null) {
                                                            i = C1188R.C1192id.spinnerState;
                                                            Spinner spinner = (Spinner) ViewBindings.findChildViewById(view2, C1188R.C1192id.spinnerState);
                                                            if (spinner != null) {
                                                                i = C1188R.C1192id.tvContinue;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvContinue);
                                                                if (textView != null) {
                                                                    i = C1188R.C1192id.tvDay;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvDay);
                                                                    if (textView2 != null) {
                                                                        i = C1188R.C1192id.tvMonth;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMonth);
                                                                        if (textView3 != null) {
                                                                            i = C1188R.C1192id.tvYear;
                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvYear);
                                                                            if (textView4 != null) {
                                                                                return new FragmentKycBinding((NestedScrollView) view2, constraintLayout, constraintLayout2, editText, imageView, imageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, progressBar2, relativeLayout, relativeLayout2, linearLayout5, spinner, textView, textView2, textView3, textView4);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
