package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentWithdrawBinding implements ViewBinding {
    public final TextView currency;
    public final EditText etAmount;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout4;
    private final NestedScrollView rootView;
    public final RecyclerView rvBankAccounts;
    public final TextView tvAddAccount;
    public final TextView tvSubmit;
    public final View view;

    private FragmentWithdrawBinding(NestedScrollView nestedScrollView, TextView textView, EditText editText, ProgressBar progressBar2, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView2, TextView textView3, View view2) {
        this.rootView = nestedScrollView;
        this.currency = textView;
        this.etAmount = editText;
        this.progressBar = progressBar2;
        this.relativeLayout4 = relativeLayout;
        this.rvBankAccounts = recyclerView;
        this.tvAddAccount = textView2;
        this.tvSubmit = textView3;
        this.view = view2;
    }

    public NestedScrollView getRoot() {
        return this.rootView;
    }

    public static FragmentWithdrawBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentWithdrawBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_withdraw, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWithdrawBinding bind(View view2) {
        int i = C1188R.C1192id.currency;
        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.currency);
        if (textView != null) {
            i = C1188R.C1192id.etAmount;
            EditText editText = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.etAmount);
            if (editText != null) {
                i = C1188R.C1192id.progressBar;
                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progressBar);
                if (progressBar2 != null) {
                    i = C1188R.C1192id.relativeLayout4;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.relativeLayout4);
                    if (relativeLayout != null) {
                        i = C1188R.C1192id.rvBankAccounts;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvBankAccounts);
                        if (recyclerView != null) {
                            i = C1188R.C1192id.tvAddAccount;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvAddAccount);
                            if (textView2 != null) {
                                i = C1188R.C1192id.tvSubmit;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvSubmit);
                                if (textView3 != null) {
                                    i = C1188R.C1192id.view;
                                    View findChildViewById = ViewBindings.findChildViewById(view2, C1188R.C1192id.view);
                                    if (findChildViewById != null) {
                                        return new FragmentWithdrawBinding((NestedScrollView) view2, textView, editText, progressBar2, relativeLayout, recyclerView, textView2, textView3, findChildViewById);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
