package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentSelectWinnersBinding implements ViewBinding {
    public final LinearLayout linearLayout10;
    public final LinearLayout linearLayout11;
    public final LinearLayout llBody;
    public final LinearLayout llFewerWinners;
    private final ConstraintLayout rootView;
    public final RecyclerView rvRanks;
    public final RecyclerView rvWinningAmounts;
    public final TextView textView13;
    public final TextView tvContestSize;
    public final TextView tvCreateContest;
    public final TextView tvEntry;
    public final TextView tvFewerWinner;
    public final TextView tvWinningAmount;

    private FragmentSelectWinnersBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.linearLayout10 = linearLayout;
        this.linearLayout11 = linearLayout2;
        this.llBody = linearLayout3;
        this.llFewerWinners = linearLayout4;
        this.rvRanks = recyclerView;
        this.rvWinningAmounts = recyclerView2;
        this.textView13 = textView;
        this.tvContestSize = textView2;
        this.tvCreateContest = textView3;
        this.tvEntry = textView4;
        this.tvFewerWinner = textView5;
        this.tvWinningAmount = textView6;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSelectWinnersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentSelectWinnersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_select_winners, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSelectWinnersBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.linearLayout10;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.linearLayout10);
        if (linearLayout != null) {
            i = C1188R.C1192id.linearLayout11;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.linearLayout11);
            if (linearLayout2 != null) {
                i = C1188R.C1192id.llBody;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llBody);
                if (linearLayout3 != null) {
                    i = C1188R.C1192id.llFewerWinners;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llFewerWinners);
                    if (linearLayout4 != null) {
                        i = C1188R.C1192id.rvRanks;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvRanks);
                        if (recyclerView != null) {
                            i = C1188R.C1192id.rvWinningAmounts;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvWinningAmounts);
                            if (recyclerView2 != null) {
                                i = C1188R.C1192id.textView13;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView13);
                                if (textView != null) {
                                    i = C1188R.C1192id.tvContestSize;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvContestSize);
                                    if (textView2 != null) {
                                        i = C1188R.C1192id.tvCreateContest;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCreateContest);
                                        if (textView3 != null) {
                                            i = C1188R.C1192id.tvEntry;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvEntry);
                                            if (textView4 != null) {
                                                i = C1188R.C1192id.tvFewerWinner;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvFewerWinner);
                                                if (textView5 != null) {
                                                    i = C1188R.C1192id.tvWinningAmount;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvWinningAmount);
                                                    if (textView6 != null) {
                                                        return new FragmentSelectWinnersBinding((ConstraintLayout) view2, linearLayout, linearLayout2, linearLayout3, linearLayout4, recyclerView, recyclerView2, textView, textView2, textView3, textView4, textView5, textView6);
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
