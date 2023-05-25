package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentCreateContestBinding implements ViewBinding {
    public final EditText etContestName;
    public final EditText etEntryFee;
    public final ImageView imageView5;
    public final ImageView ivMultipleUser;
    public final LinearLayout llAllowMultiUserAllow;
    public final ProgressBar progressBar;
    public final RelativeLayout rlProgress;
    private final LinearLayout rootView;
    public final RecyclerView rvPlayersAmounts;
    public final TextView textView13;
    public final TextView textView22;
    public final TextView tvCreateContest;
    public final TextView tvWinning;
    public final TextView tvWinningAmount;
    public final View view;

    private FragmentCreateContestBinding(LinearLayout linearLayout, EditText editText, EditText editText2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout2, ProgressBar progressBar2, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2) {
        this.rootView = linearLayout;
        this.etContestName = editText;
        this.etEntryFee = editText2;
        this.imageView5 = imageView;
        this.ivMultipleUser = imageView2;
        this.llAllowMultiUserAllow = linearLayout2;
        this.progressBar = progressBar2;
        this.rlProgress = relativeLayout;
        this.rvPlayersAmounts = recyclerView;
        this.textView13 = textView;
        this.textView22 = textView2;
        this.tvCreateContest = textView3;
        this.tvWinning = textView4;
        this.tvWinningAmount = textView5;
        this.view = view2;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static FragmentCreateContestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentCreateContestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_create_contest, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentCreateContestBinding bind(View view2) {
        View view3 = view2;
        int i = C1188R.C1192id.etContestName;
        EditText editText = (EditText) ViewBindings.findChildViewById(view3, C1188R.C1192id.etContestName);
        if (editText != null) {
            i = C1188R.C1192id.etEntryFee;
            EditText editText2 = (EditText) ViewBindings.findChildViewById(view3, C1188R.C1192id.etEntryFee);
            if (editText2 != null) {
                i = C1188R.C1192id.imageView5;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.imageView5);
                if (imageView != null) {
                    i = C1188R.C1192id.ivMultipleUser;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivMultipleUser);
                    if (imageView2 != null) {
                        i = C1188R.C1192id.llAllowMultiUserAllow;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.llAllowMultiUserAllow);
                        if (linearLayout != null) {
                            i = C1188R.C1192id.progressBar;
                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view3, C1188R.C1192id.progressBar);
                            if (progressBar2 != null) {
                                i = C1188R.C1192id.rlProgress;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlProgress);
                                if (relativeLayout != null) {
                                    i = C1188R.C1192id.rvPlayersAmounts;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view3, C1188R.C1192id.rvPlayersAmounts);
                                    if (recyclerView != null) {
                                        i = C1188R.C1192id.textView13;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.textView13);
                                        if (textView != null) {
                                            i = C1188R.C1192id.textView22;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.textView22);
                                            if (textView2 != null) {
                                                i = C1188R.C1192id.tvCreateContest;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvCreateContest);
                                                if (textView3 != null) {
                                                    i = C1188R.C1192id.tvWinning;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvWinning);
                                                    if (textView4 != null) {
                                                        i = C1188R.C1192id.tvWinningAmount;
                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvWinningAmount);
                                                        if (textView5 != null) {
                                                            i = C1188R.C1192id.view;
                                                            View findChildViewById = ViewBindings.findChildViewById(view3, C1188R.C1192id.view);
                                                            if (findChildViewById != null) {
                                                                return new FragmentCreateContestBinding((LinearLayout) view3, editText, editText2, imageView, imageView2, linearLayout, progressBar2, relativeLayout, recyclerView, textView, textView2, textView3, textView4, textView5, findChildViewById);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
