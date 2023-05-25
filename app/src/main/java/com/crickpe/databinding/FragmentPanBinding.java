package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentPanBinding implements ViewBinding {
    public final EditText etPanNumber;
    public final ProgressBar progressBar;
    private final NestedScrollView rootView;
    public final TextView tvContinue;

    private FragmentPanBinding(NestedScrollView nestedScrollView, EditText editText, ProgressBar progressBar2, TextView textView) {
        this.rootView = nestedScrollView;
        this.etPanNumber = editText;
        this.progressBar = progressBar2;
        this.tvContinue = textView;
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentPanBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentPanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_pan, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentPanBinding bind(View view) {
        int i = C1188R.C1192id.etPanNumber;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etPanNumber);
        if (editText != null) {
            i = C1188R.C1192id.progressBar;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
            if (progressBar2 != null) {
                i = C1188R.C1192id.tvContinue;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvContinue);
                if (textView != null) {
                    return new FragmentPanBinding((NestedScrollView) view, editText, progressBar2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
