package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogJoinContestBinding implements ViewBinding {
    public final EditText etReferCode;
    private final ConstraintLayout rootView;
    public final TextView textView4;
    public final TextView textView5;
    public final TextView tvCreateContest;
    public final TextView tvJoinPool;

    private DialogJoinContestBinding(ConstraintLayout constraintLayout, EditText editText, TextView textView, TextView textView2, TextView textView3, TextView textView6) {
        this.rootView = constraintLayout;
        this.etReferCode = editText;
        this.textView4 = textView;
        this.textView5 = textView2;
        this.tvCreateContest = textView3;
        this.tvJoinPool = textView6;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static DialogJoinContestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogJoinContestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_join_contest, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogJoinContestBinding bind(View view) {
        int i = C1188R.C1192id.etReferCode;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etReferCode);
        if (editText != null) {
            i = C1188R.C1192id.textView4;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView4);
            if (textView != null) {
                i = C1188R.C1192id.textView5;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.textView5);
                if (textView2 != null) {
                    i = C1188R.C1192id.tvCreateContest;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvCreateContest);
                    if (textView3 != null) {
                        i = C1188R.C1192id.tvJoinPool;
                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvJoinPool);
                        if (textView6 != null) {
                            return new DialogJoinContestBinding((ConstraintLayout) view, editText, textView, textView2, textView3, textView6);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
