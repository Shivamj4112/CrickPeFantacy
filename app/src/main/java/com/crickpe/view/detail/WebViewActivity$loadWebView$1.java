package com.crickpe.view.detail;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleOwnerKt;
import com.crickpe.C1188R;
import com.crickpe.utils.ExtensionsKt;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0012"}, mo48222d2 = {"com/crickpe/view/detail/WebViewActivity$loadWebView$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "shouldOverrideUrlLoading", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WebViewActivity.kt */
public final class WebViewActivity$loadWebView$1 extends WebViewClient {
    final /* synthetic */ WebViewActivity this$0;

    WebViewActivity$loadWebView$1(WebViewActivity webViewActivity) {
        this.this$0 = webViewActivity;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (webView != null) {
            webView.loadUrl(valueOf);
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewActivity webViewActivity = this.this$0;
        ProgressBar progressBar = (ProgressBar) webViewActivity._$_findCachedViewById(C1188R.C1192id.progressBarWeb);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarWeb");
        webViewActivity.visible(progressBar);
        super.onPageStarted(webView, str, bitmap);
        Log.v("URLLLL", String.valueOf(str));
        if (Intrinsics.areEqual((Object) str, (Object) "https://api-dev.crickpe.org/digiLockerSuccess")) {
            this.this$0.onBackPressed();
        } else if (Intrinsics.areEqual((Object) str, (Object) "https://api-stage.crickpe.org/digiLockerSuccess")) {
            this.this$0.onBackPressed();
        } else {
            if (!Intrinsics.areEqual((Object) str, (Object) "https://api-dev.crickpe.org/return")) {
                Boolean valueOf = str != null ? Boolean.valueOf(StringsKt.contains$default((CharSequence) str, (CharSequence) "return", false, 2, (Object) null)) : null;
                Intrinsics.checkNotNull(valueOf);
                if (!valueOf.booleanValue()) {
                    return;
                }
            }
            LifecycleOwnerKt.getLifecycleScope(this.this$0).launchWhenResumed(new WebViewActivity$loadWebView$1$onPageStarted$1(this.this$0, (Continuation<? super WebViewActivity$loadWebView$1$onPageStarted$1>) null));
        }
    }

    public void onPageFinished(WebView webView, String str) {
        if (((ProgressBar) this.this$0._$_findCachedViewById(C1188R.C1192id.progressBarWeb)) != null) {
            WebViewActivity webViewActivity = this.this$0;
            ProgressBar progressBar = (ProgressBar) webViewActivity._$_findCachedViewById(C1188R.C1192id.progressBarWeb);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarWeb");
            webViewActivity.hide(progressBar);
        }
        super.onPageFinished(webView, str);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Intrinsics.checkNotNullParameter(webView, Promotion.ACTION_VIEW);
        Intrinsics.checkNotNullParameter(webResourceRequest, "request");
        Intrinsics.checkNotNullParameter(webResourceError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        ExtensionsKt.showToast((Context) this.this$0, (CharSequence) "Got Error! " + webResourceError);
        WebViewActivity webViewActivity = this.this$0;
        ProgressBar progressBar = (ProgressBar) webViewActivity._$_findCachedViewById(C1188R.C1192id.progressBarWeb);
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarWeb");
        webViewActivity.hide(progressBar);
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}
