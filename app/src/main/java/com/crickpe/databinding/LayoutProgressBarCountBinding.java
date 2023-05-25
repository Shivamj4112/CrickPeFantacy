package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class LayoutProgressBarCountBinding implements ViewBinding {
    public final ProgressBar progress1;
    public final ProgressBar progress10;
    public final ProgressBar progress11;
    public final ProgressBar progress2;
    public final ProgressBar progress3;
    public final ProgressBar progress4;
    public final ProgressBar progress5;
    public final ProgressBar progress6;
    public final ProgressBar progress7;
    public final ProgressBar progress8;
    public final ProgressBar progress9;
    private final LinearLayout rootView;
    public final TextView tvCount1;
    public final TextView tvCount10;
    public final TextView tvCount11;
    public final TextView tvCount2;
    public final TextView tvCount3;
    public final TextView tvCount4;
    public final TextView tvCount5;
    public final TextView tvCount6;
    public final TextView tvCount7;
    public final TextView tvCount8;
    public final TextView tvCount9;

    private LayoutProgressBarCountBinding(LinearLayout linearLayout, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ProgressBar progressBar5, ProgressBar progressBar6, ProgressBar progressBar7, ProgressBar progressBar8, ProgressBar progressBar9, ProgressBar progressBar10, ProgressBar progressBar11, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.rootView = linearLayout;
        this.progress1 = progressBar;
        this.progress10 = progressBar2;
        this.progress11 = progressBar3;
        this.progress2 = progressBar4;
        this.progress3 = progressBar5;
        this.progress4 = progressBar6;
        this.progress5 = progressBar7;
        this.progress6 = progressBar8;
        this.progress7 = progressBar9;
        this.progress8 = progressBar10;
        this.progress9 = progressBar11;
        this.tvCount1 = textView;
        this.tvCount10 = textView2;
        this.tvCount11 = textView3;
        this.tvCount2 = textView4;
        this.tvCount3 = textView5;
        this.tvCount4 = textView6;
        this.tvCount5 = textView7;
        this.tvCount6 = textView8;
        this.tvCount7 = textView9;
        this.tvCount8 = textView10;
        this.tvCount9 = textView11;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static LayoutProgressBarCountBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static LayoutProgressBarCountBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.layout_progress_bar_count, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static LayoutProgressBarCountBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.progress1;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress1);
        if (progressBar != null) {
            i = C1188R.C1192id.progress10;
            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress10);
            if (progressBar2 != null) {
                i = C1188R.C1192id.progress11;
                ProgressBar progressBar3 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress11);
                if (progressBar3 != null) {
                    i = C1188R.C1192id.progress2;
                    ProgressBar progressBar4 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress2);
                    if (progressBar4 != null) {
                        i = C1188R.C1192id.progress3;
                        ProgressBar progressBar5 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress3);
                        if (progressBar5 != null) {
                            i = C1188R.C1192id.progress4;
                            ProgressBar progressBar6 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress4);
                            if (progressBar6 != null) {
                                i = C1188R.C1192id.progress5;
                                ProgressBar progressBar7 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress5);
                                if (progressBar7 != null) {
                                    i = C1188R.C1192id.progress6;
                                    ProgressBar progressBar8 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress6);
                                    if (progressBar8 != null) {
                                        i = C1188R.C1192id.progress7;
                                        ProgressBar progressBar9 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress7);
                                        if (progressBar9 != null) {
                                            i = C1188R.C1192id.progress8;
                                            ProgressBar progressBar10 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress8);
                                            if (progressBar10 != null) {
                                                i = C1188R.C1192id.progress9;
                                                ProgressBar progressBar11 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progress9);
                                                if (progressBar11 != null) {
                                                    i = C1188R.C1192id.tvCount1;
                                                    TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount1);
                                                    if (textView != null) {
                                                        i = C1188R.C1192id.tvCount10;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount10);
                                                        if (textView2 != null) {
                                                            i = C1188R.C1192id.tvCount11;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount11);
                                                            if (textView3 != null) {
                                                                i = C1188R.C1192id.tvCount2;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount2);
                                                                if (textView4 != null) {
                                                                    i = C1188R.C1192id.tvCount3;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount3);
                                                                    if (textView5 != null) {
                                                                        i = C1188R.C1192id.tvCount4;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount4);
                                                                        if (textView6 != null) {
                                                                            i = C1188R.C1192id.tvCount5;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount5);
                                                                            if (textView7 != null) {
                                                                                i = C1188R.C1192id.tvCount6;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount6);
                                                                                if (textView8 != null) {
                                                                                    i = C1188R.C1192id.tvCount7;
                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount7);
                                                                                    if (textView9 != null) {
                                                                                        i = C1188R.C1192id.tvCount8;
                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount8);
                                                                                        if (textView10 != null) {
                                                                                            i = C1188R.C1192id.tvCount9;
                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCount9);
                                                                                            if (textView11 != null) {
                                                                                                return new LayoutProgressBarCountBinding((LinearLayout) view2, progressBar, progressBar2, progressBar3, progressBar4, progressBar5, progressBar6, progressBar7, progressBar8, progressBar9, progressBar10, progressBar11, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11);
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
