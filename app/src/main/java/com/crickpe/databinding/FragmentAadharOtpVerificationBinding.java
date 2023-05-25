package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentAadharOtpVerificationBinding implements ViewBinding {
    public final EditText etOTP;
    public final ProgressBar progressBar;
    private final RelativeLayout rootView;
    public final TextView tvResend;
    public final TextView tvVerify;

    private FragmentAadharOtpVerificationBinding(RelativeLayout relativeLayout, EditText editText, ProgressBar progressBar2, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.etOTP = editText;
        this.progressBar = progressBar2;
        this.tvResend = textView;
        this.tvVerify = textView2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAadharOtpVerificationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentAadharOtpVerificationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_aadhar_otp_verification, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAadharOtpVerificationBinding bind(View view) {
        int i = C1188R.C1192id.etOTP;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etOTP);
        if (editText != null) {
            i = C1188R.C1192id.progressBar;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
            if (progressBar2 != null) {
                i = C1188R.C1192id.tvResend;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvResend);
                if (textView != null) {
                    i = C1188R.C1192id.tvVerify;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvVerify);
                    if (textView2 != null) {
                        return new FragmentAadharOtpVerificationBinding((RelativeLayout) view, editText, progressBar2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
