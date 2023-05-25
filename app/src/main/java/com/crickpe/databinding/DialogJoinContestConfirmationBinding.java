package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogJoinContestConfirmationBinding implements ViewBinding {
    public final RelativeLayout rlTopupNeeded;
    public final RelativeLayout rlWalletBalance;
    private final ConstraintLayout rootView;
    public final TextView textView5;
    public final TextView tvEntryFee;
    public final TextView tvJoinContest;
    public final TextView tvRemainingBal;
    public final TextView tvToPay;
    public final TextView tvWalletBalance;

    private DialogJoinContestConfirmationBinding(ConstraintLayout constraintLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView6, TextView textView7) {
        this.rootView = constraintLayout;
        this.rlTopupNeeded = relativeLayout;
        this.rlWalletBalance = relativeLayout2;
        this.textView5 = textView;
        this.tvEntryFee = textView2;
        this.tvJoinContest = textView3;
        this.tvRemainingBal = textView4;
        this.tvToPay = textView6;
        this.tvWalletBalance = textView7;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogJoinContestConfirmationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogJoinContestConfirmationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_join_contest_confirmation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogJoinContestConfirmationBinding bind(View view) {
        int i = C1188R.C1192id.rlTopupNeeded;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlTopupNeeded);
        if (relativeLayout != null) {
            i = C1188R.C1192id.rlWalletBalance;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlWalletBalance);
            if (relativeLayout2 != null) {
                i = C1188R.C1192id.textView5;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView5);
                if (textView != null) {
                    i = C1188R.C1192id.tvEntryFee;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvEntryFee);
                    if (textView2 != null) {
                        i = C1188R.C1192id.tvJoinContest;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvJoinContest);
                        if (textView3 != null) {
                            i = C1188R.C1192id.tvRemainingBal;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvRemainingBal);
                            if (textView4 != null) {
                                i = C1188R.C1192id.tvToPay;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvToPay);
                                if (textView6 != null) {
                                    i = C1188R.C1192id.tvWalletBalance;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvWalletBalance);
                                    if (textView7 != null) {
                                        return new DialogJoinContestConfirmationBinding((ConstraintLayout) view, relativeLayout, relativeLayout2, textView, textView2, textView3, textView4, textView6, textView7);
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
