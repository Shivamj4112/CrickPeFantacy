package com.crickpe.view.detail.fragments.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.Constants;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.intro.fragments.kyc.models.SubmitAadharModelX;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u001a\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/WebViewFragment;", "Lcom/crickpe/base/BaseFragment;", "()V", "from", "", "submitKycModel", "Lcom/crickpe/view/intro/fragments/kyc/models/SubmitAadharModelX;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "webUrl", "backHandle", "", "getFragmentLayoutResId", "", "loadWebView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "successBack", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WebViewFragment.kt */
public final class WebViewFragment extends BaseFragment {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public String from = "";
    /* access modifiers changed from: private */
    public SubmitAadharModelX submitKycModel;
    private DetailViewModel viewModel;
    private String webUrl = "";

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getFragmentLayoutResId() {
        return C1188R.C1193layout.fragment_webview;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    private final void successBack() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        Activity activity = requireActivity;
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_discard);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvYes);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvNo);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.tvBody);
                if (findViewById3 != null) {
                    TextView textView3 = (TextView) findViewById3;
                    if (Intrinsics.areEqual((Object) this.from, (Object) "kyc")) {
                        textView3.setText("Are you sure you want to exit\nKYC?");
                    } else {
                        textView3.setText("Are you sure you want to exit\npayment?");
                    }
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    window.setBackgroundDrawableResource(17170445);
                    window.setLayout(-1, -2);
                    textView.setOnClickListener(new WebViewFragment$$ExternalSyntheticLambda0(dialog, this));
                    textView2.setOnClickListener(new WebViewFragment$$ExternalSyntheticLambda1(dialog));
                    dialog.show();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: successBack$lambda-0  reason: not valid java name */
    public static final void m3662successBack$lambda0(Dialog dialog, WebViewFragment webViewFragment, View view) {
        SavedStateHandle savedStateHandle;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(webViewFragment, "this$0");
        dialog.dismiss();
        Fragment fragment = webViewFragment;
        NavBackStackEntry previousBackStackEntry = FragmentKt.findNavController(fragment).getPreviousBackStackEntry();
        if (!(previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null)) {
            savedStateHandle.set(ImagesContract.URL, "");
        }
        FragmentKt.findNavController(fragment).popBackStack();
    }

    /* access modifiers changed from: private */
    /* renamed from: successBack$lambda-1  reason: not valid java name */
    public static final void m3663successBack$lambda1(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void loadWebView() {
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).loadUrl(this.webUrl);
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).setWebViewClient(new WebViewFragment$loadWebView$1(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        if (getArguments() != null) {
            this.webUrl = String.valueOf(requireArguments().getString("web_url"));
            this.from = String.valueOf(requireArguments().getString("from"));
            if (((WebView) _$_findCachedViewById(C1188R.C1192id.webView)) != null) {
                loadWebView();
            }
        }
        if (Intrinsics.areEqual((Object) this.from, (Object) "kyc")) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                String string = getResources().getString(C1188R.string.kyc_verification);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.kyc_verification)");
                ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, false, false);
                this.submitKycModel = (SubmitAadharModelX) new Gson().fromJson(String.valueOf(requireArguments().getString(Constants.IDFY)), SubmitAadharModelX.class);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
            }
        } else {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                String string2 = getResources().getString(C1188R.string.payment);
                Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.payment)");
                ((DetailActivity) activity2).setTopBar(string2, true, false, false, false, false, false, false);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
            }
        }
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).getSettings().setJavaScriptEnabled(true);
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).getSettings().setLoadWithOverviewMode(true);
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).getSettings().setUseWideViewPort(true);
    }

    public final void backHandle() {
        successBack();
    }
}
