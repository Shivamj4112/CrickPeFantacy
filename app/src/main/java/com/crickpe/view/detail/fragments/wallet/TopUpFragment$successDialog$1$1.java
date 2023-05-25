package com.crickpe.view.detail.fragments.wallet;

import android.util.Log;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, mo48222d2 = {"com/crickpe/view/detail/fragments/wallet/TopUpFragment$successDialog$1$1", "Lcom/appsflyer/attribution/AppsFlyerRequestListener;", "onError", "", "errorCode", "", "errorDesc", "", "onSuccess", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopUpFragment.kt */
public final class TopUpFragment$successDialog$1$1 implements AppsFlyerRequestListener {
    TopUpFragment$successDialog$1$1() {
    }

    public void onSuccess() {
        Log.d("AppsFlyer", "Event sent successfully");
    }

    public void onError(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "errorDesc");
        Log.d("AppsFlyer", "Event failed to be sent:\nError code: " + i + "\nError description: " + str);
    }
}
