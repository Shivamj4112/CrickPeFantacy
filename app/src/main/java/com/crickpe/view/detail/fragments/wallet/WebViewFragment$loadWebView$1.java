package com.crickpe.view.detail.fragments.wallet;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.crickpe.C1188R;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.apiHandling.RetrofitClient;
import com.crickpe.view.intro.fragments.kyc.models.SubmitAadharModelX;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u0012"}, mo48222d2 = {"com/crickpe/view/detail/fragments/wallet/WebViewFragment$loadWebView$1", "Landroid/webkit/WebViewClient;", "onPageFinished", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "shouldOverrideUrlLoading", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WebViewFragment.kt */
public final class WebViewFragment$loadWebView$1 extends WebViewClient {
    final /* synthetic */ WebViewFragment this$0;

    WebViewFragment$loadWebView$1(WebViewFragment webViewFragment) {
        this.this$0 = webViewFragment;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String valueOf = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
        if (webView != null) {
            webView.loadUrl(valueOf);
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        SavedStateHandle savedStateHandle;
        SavedStateHandle savedStateHandle2;
        if (((ProgressBar) this.this$0._$_findCachedViewById(C1188R.C1192id.progressBarWeb)) != null) {
            ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C1188R.C1192id.progressBarWeb);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarWeb");
            CommonMethodsKt.visible(progressBar);
        }
        super.onPageStarted(webView, str, bitmap);
        if (Intrinsics.areEqual((Object) this.this$0.from, (Object) "kyc")) {
            Log.e("RETURN_URL", String.valueOf(str));
            if (this.this$0.submitKycModel != null) {
                SubmitAadharModelX access$getSubmitKycModel$p = this.this$0.submitKycModel;
                Intrinsics.checkNotNull(access$getSubmitKycModel$p);
                int size = access$getSubmitKycModel$p.getIdfySuccess().size();
                for (int i = 0; i < size; i++) {
                    SubmitAadharModelX access$getSubmitKycModel$p2 = this.this$0.submitKycModel;
                    Intrinsics.checkNotNull(access$getSubmitKycModel$p2);
                    Log.e("submitKycModel_S", access$getSubmitKycModel$p2.getIdfySuccess().get(i));
                    Intrinsics.checkNotNull(str);
                    SubmitAadharModelX access$getSubmitKycModel$p3 = this.this$0.submitKycModel;
                    Intrinsics.checkNotNull(access$getSubmitKycModel$p3);
                    String str2 = access$getSubmitKycModel$p3.getIdfySuccess().get(i);
                    Intrinsics.checkNotNullExpressionValue(str2, "submitKycModel!!.idfySuccess[i]");
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null)) {
                        NavBackStackEntry previousBackStackEntry = FragmentKt.findNavController(this.this$0).getPreviousBackStackEntry();
                        if (!(previousBackStackEntry == null || (savedStateHandle2 = previousBackStackEntry.getSavedStateHandle()) == null)) {
                            savedStateHandle2.set(ImagesContract.URL, FirebaseAnalytics.Param.SUCCESS);
                        }
                        FragmentKt.findNavController(this.this$0).popBackStack();
                    }
                }
                SubmitAadharModelX access$getSubmitKycModel$p4 = this.this$0.submitKycModel;
                Intrinsics.checkNotNull(access$getSubmitKycModel$p4);
                int size2 = access$getSubmitKycModel$p4.getIdfyFailure().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    SubmitAadharModelX access$getSubmitKycModel$p5 = this.this$0.submitKycModel;
                    Intrinsics.checkNotNull(access$getSubmitKycModel$p5);
                    Log.e("submitKycModel_F", access$getSubmitKycModel$p5.getIdfyFailure().get(i2));
                    Intrinsics.checkNotNull(str);
                    SubmitAadharModelX access$getSubmitKycModel$p6 = this.this$0.submitKycModel;
                    Intrinsics.checkNotNull(access$getSubmitKycModel$p6);
                    String str3 = access$getSubmitKycModel$p6.getIdfyFailure().get(i2);
                    Intrinsics.checkNotNullExpressionValue(str3, "submitKycModel!!.idfyFailure[i]");
                    if (StringsKt.contains$default((CharSequence) str, (CharSequence) str3, false, 2, (Object) null)) {
                        NavBackStackEntry previousBackStackEntry2 = FragmentKt.findNavController(this.this$0).getPreviousBackStackEntry();
                        if (!(previousBackStackEntry2 == null || (savedStateHandle = previousBackStackEntry2.getSavedStateHandle()) == null)) {
                            savedStateHandle.set(ImagesContract.URL, "failed");
                        }
                        FragmentKt.findNavController(this.this$0).popBackStack();
                    }
                }
                return;
            }
            List split$default = str != null ? StringsKt.split$default((CharSequence) str, new String[]{"?"}, false, 0, 6, (Object) null) : null;
            Intrinsics.checkNotNull(split$default);
            Object obj = split$default.get(0);
            if (Intrinsics.areEqual(obj, (Object) RetrofitClient.INSTANCE.getBaseUrl() + "digiLockerSuccess")) {
                LifecycleOwnerKt.getLifecycleScope(this.this$0).launchWhenResumed(new WebViewFragment$loadWebView$1$onPageStarted$1(this.this$0, str, (Continuation<? super WebViewFragment$loadWebView$1$onPageStarted$1>) null));
                return;
            }
            return;
        }
        if (!Intrinsics.areEqual((Object) str, (Object) "https://app-api.crickpe.org/return")) {
            Boolean valueOf = str != null ? Boolean.valueOf(StringsKt.contains$default((CharSequence) str, (CharSequence) "return", false, 2, (Object) null)) : null;
            Intrinsics.checkNotNull(valueOf);
            if (!valueOf.booleanValue()) {
                return;
            }
        }
        LifecycleOwnerKt.getLifecycleScope(this.this$0).launchWhenResumed(new WebViewFragment$loadWebView$1$onPageStarted$2(this.this$0, (Continuation<? super WebViewFragment$loadWebView$1$onPageStarted$2>) null));
    }

    public void onPageFinished(WebView webView, String str) {
        if (((ProgressBar) this.this$0._$_findCachedViewById(C1188R.C1192id.progressBarWeb)) != null) {
            ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C1188R.C1192id.progressBarWeb);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarWeb");
            CommonMethodsKt.hide(progressBar);
        }
        super.onPageFinished(webView, str);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Intrinsics.checkNotNullParameter(webView, Promotion.ACTION_VIEW);
        Intrinsics.checkNotNullParameter(webResourceRequest, "request");
        Intrinsics.checkNotNullParameter(webResourceError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        try {
            Log.v("ERROR_WEB", ("Got Error! " + webResourceError).toString());
            if (((ProgressBar) this.this$0._$_findCachedViewById(C1188R.C1192id.progressBarWeb)) != null) {
                ProgressBar progressBar = (ProgressBar) this.this$0._$_findCachedViewById(C1188R.C1192id.progressBarWeb);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarWeb");
                CommonMethodsKt.hide(progressBar);
            }
        } catch (Exception e) {
            Log.v("Exception_WEB", e.toString());
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }
}
