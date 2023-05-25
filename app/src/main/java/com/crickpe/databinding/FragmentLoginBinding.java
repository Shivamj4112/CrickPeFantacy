package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentLoginBinding implements ViewBinding {
    public final CheckBox ageCheck;
    public final CheckBox checkbox;
    public final EditText etMobileNumber;
    public final ImageView ivFlag;
    public final ProgressBar progressBar;
    private final NestedScrollView rootView;
    public final TextView tvCode;
    public final TextView tvContinue;
    public final TextView tvTerms;

    private FragmentLoginBinding(NestedScrollView nestedScrollView, CheckBox checkBox, CheckBox checkBox2, EditText editText, ImageView imageView, ProgressBar progressBar2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = nestedScrollView;
        this.ageCheck = checkBox;
        this.checkbox = checkBox2;
        this.etMobileNumber = editText;
        this.ivFlag = imageView;
        this.progressBar = progressBar2;
        this.tvCode = textView;
        this.tvContinue = textView2;
        this.tvTerms = textView3;
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_login, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentLoginBinding bind(View view) {
        int i = C1188R.C1192id.ageCheck;
        CheckBox checkBox = (CheckBox) ViewBindings.findChildViewById(view, C1188R.C1192id.ageCheck);
        if (checkBox != null) {
            i = C1188R.C1192id.checkbox;
            CheckBox checkBox2 = (CheckBox) ViewBindings.findChildViewById(view, C1188R.C1192id.checkbox);
            if (checkBox2 != null) {
                i = C1188R.C1192id.etMobileNumber;
                EditText editText = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etMobileNumber);
                if (editText != null) {
                    i = C1188R.C1192id.ivFlag;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivFlag);
                    if (imageView != null) {
                        i = C1188R.C1192id.progressBar;
                        ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
                        if (progressBar2 != null) {
                            i = C1188R.C1192id.tvCode;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvCode);
                            if (textView != null) {
                                i = C1188R.C1192id.tvContinue;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvContinue);
                                if (textView2 != null) {
                                    i = C1188R.C1192id.tvTerms;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvTerms);
                                    if (textView3 != null) {
                                        return new FragmentLoginBinding((NestedScrollView) view, checkBox, checkBox2, editText, imageView, progressBar2, textView, textView2, textView3);
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
