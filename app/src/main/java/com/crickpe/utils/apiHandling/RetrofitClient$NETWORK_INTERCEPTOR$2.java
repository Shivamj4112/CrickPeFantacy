package com.crickpe.utils.apiHandling;

import com.crickpe.utils.local.UserManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Interceptor;
import okhttp3.Response;

@Metadata(mo48221d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo48222d2 = {"<anonymous>", "Lokhttp3/Interceptor;", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RetrofitClient.kt */
final class RetrofitClient$NETWORK_INTERCEPTOR$2 extends Lambda implements Function0<Interceptor> {
    public static final RetrofitClient$NETWORK_INTERCEPTOR$2 INSTANCE = new RetrofitClient$NETWORK_INTERCEPTOR$2();

    RetrofitClient$NETWORK_INTERCEPTOR$2() {
        super(0);
    }

    public final Interceptor invoke() {
        return new RetrofitClient$NETWORK_INTERCEPTOR$2$$ExternalSyntheticLambda0();
    }

    /* access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final Response m3423invoke$lambda0(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request().newBuilder().addHeader("Accept", "application/json").addHeader("Authorization", UserManager.getAccessToken()).build());
    }
}
