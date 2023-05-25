package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentOtpVerificationBinding implements ViewBinding {
    public final EditText otpTextboxFive;
    public final EditText otpTextboxFour;
    public final EditText otpTextboxOne;
    public final EditText otpTextboxSeven;
    public final EditText otpTextboxSix;
    public final EditText otpTextboxThree;
    public final EditText otpTextboxTwo;
    public final ProgressBar progressBar;
    public final LinearLayout rootOtpLayout;
    private final RelativeLayout rootView;
    public final TextView tvMobileNo;
    public final TextView tvResend;
    public final TextView tvTimeLapse;
    public final TextView tvVerify;

    private FragmentOtpVerificationBinding(RelativeLayout relativeLayout, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5, EditText editText6, EditText editText7, ProgressBar progressBar2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.otpTextboxFive = editText;
        this.otpTextboxFour = editText2;
        this.otpTextboxOne = editText3;
        this.otpTextboxSeven = editText4;
        this.otpTextboxSix = editText5;
        this.otpTextboxThree = editText6;
        this.otpTextboxTwo = editText7;
        this.progressBar = progressBar2;
        this.rootOtpLayout = linearLayout;
        this.tvMobileNo = textView;
        this.tvResend = textView2;
        this.tvTimeLapse = textView3;
        this.tvVerify = textView4;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentOtpVerificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentOtpVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_otp_verification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentOtpVerificationBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.otp_textbox_five;
        EditText editText = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.otp_textbox_five);
        if (editText != null) {
            i = C1188R.C1192id.otp_textbox_four;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.otp_textbox_four);
            if (editText2 != null) {
                i = C1188R.C1192id.otp_textbox_one;
                EditText editText3 = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.otp_textbox_one);
                if (editText3 != null) {
                    i = C1188R.C1192id.otp_textbox_seven;
                    EditText editText4 = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.otp_textbox_seven);
                    if (editText4 != null) {
                        i = C1188R.C1192id.otp_textbox_six;
                        EditText editText5 = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.otp_textbox_six);
                        if (editText5 != null) {
                            i = C1188R.C1192id.otp_textbox_three;
                            EditText editText6 = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.otp_textbox_three);
                            if (editText6 != null) {
                                i = C1188R.C1192id.otp_textbox_two;
                                EditText editText7 = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.otp_textbox_two);
                                if (editText7 != null) {
                                    i = C1188R.C1192id.progressBar;
                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progressBar);
                                    if (progressBar2 != null) {
                                        i = C1188R.C1192id.root_otp_layout;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.root_otp_layout);
                                        if (linearLayout != null) {
                                            i = C1188R.C1192id.tvMobileNo;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMobileNo);
                                            if (textView != null) {
                                                i = C1188R.C1192id.tvResend;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvResend);
                                                if (textView2 != null) {
                                                    i = C1188R.C1192id.tvTimeLapse;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTimeLapse);
                                                    if (textView3 != null) {
                                                        i = C1188R.C1192id.tvVerify;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvVerify);
                                                        if (textView4 != null) {
                                                            return new FragmentOtpVerificationBinding((RelativeLayout) view2, editText, editText2, editText3, editText4, editText5, editText6, editText7, progressBar2, linearLayout, textView, textView2, textView3, textView4);
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
