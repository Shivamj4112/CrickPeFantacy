package com.crickpe.utils.apiHandling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.OkHttpClient;

@Metadata(mo48221d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo48222d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RetrofitClient.kt */
final class RetrofitClient$OK_HTTP_CLIENT$2 extends Lambda implements Function0<OkHttpClient> {
    public static final RetrofitClient$OK_HTTP_CLIENT$2 INSTANCE = new RetrofitClient$OK_HTTP_CLIENT$2();

    RetrofitClient$OK_HTTP_CLIENT$2() {
        super(0);
    }

    public final OkHttpClient invoke() {
        return new OkHttpClient.Builder().connectTimeout(60, TimeUnit.SECONDS).readTimeout(60, TimeUnit.SECONDS).addInterceptor(RetrofitClient.INSTANCE.getLOGGING_INTERCEPTOR()).addNetworkInterceptor(RetrofitClient.INSTANCE.getNETWORK_INTERCEPTOR()).build();
    }
}
