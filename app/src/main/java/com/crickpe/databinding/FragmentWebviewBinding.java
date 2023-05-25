package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentWebviewBinding implements ViewBinding {
    public final ProgressBar progressBarWeb;
    private final ConstraintLayout rootView;
    public final WebView webView;

    private FragmentWebviewBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, WebView webView2) {
        this.rootView = constraintLayout;
        this.progressBarWeb = progressBar;
        this.webView = webView2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentWebviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentWebviewBinding bind(View view) {
        int i = C1188R.C1192id.progressBarWeb;
        ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBarWeb);
        if (progressBar != null) {
            i = C1188R.C1192id.webView;
            WebView webView2 = (WebView) ViewBindings.findChildViewById(view, C1188R.C1192id.webView);
            if (webView2 != null) {
                return new FragmentWebviewBinding((ConstraintLayout) view, progressBar, webView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
