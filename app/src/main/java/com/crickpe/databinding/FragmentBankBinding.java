package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentBankBinding implements ViewBinding {
    public final EditText etAccountNumber;
    public final EditText etIfscNumber;
    public final ProgressBar progressBar;
    public final RelativeLayout rlBankProgress;
    private final NestedScrollView rootView;
    public final TextView tvContinue;

    private FragmentBankBinding(NestedScrollView nestedScrollView, EditText editText, EditText editText2, ProgressBar progressBar2, RelativeLayout relativeLayout, TextView textView) {
        this.rootView = nestedScrollView;
        this.etAccountNumber = editText;
        this.etIfscNumber = editText2;
        this.progressBar = progressBar2;
        this.rlBankProgress = relativeLayout;
        this.tvContinue = textView;
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentBankBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentBankBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentBankBinding bind(View view) {
        int i = C1188R.C1192id.etAccountNumber;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etAccountNumber);
        if (editText != null) {
            i = C1188R.C1192id.etIfscNumber;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etIfscNumber);
            if (editText2 != null) {
                i = C1188R.C1192id.progressBar;
                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
                if (progressBar2 != null) {
                    i = C1188R.C1192id.rlBankProgress;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlBankProgress);
                    if (relativeLayout != null) {
                        i = C1188R.C1192id.tvContinue;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvContinue);
                        if (textView != null) {
                            return new FragmentBankBinding((NestedScrollView) view, editText, editText2, progressBar2, relativeLayout, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
