package com.crickpe.utils.apiHandling;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import okhttp3.logging.HttpLoggingInterceptor;

@Metadata(mo48221d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo48222d2 = {"<anonymous>", "Lokhttp3/logging/HttpLoggingInterceptor;", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RetrofitClient.kt */
final class RetrofitClient$LOGGING_INTERCEPTOR$2 extends Lambda implements Function0<HttpLoggingInterceptor> {
    public static final RetrofitClient$LOGGING_INTERCEPTOR$2 INSTANCE = new RetrofitClient$LOGGING_INTERCEPTOR$2();

    RetrofitClient$LOGGING_INTERCEPTOR$2() {
        super(0);
    }

    public final HttpLoggingInterceptor invoke() {
        return new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null).setLevel(HttpLoggingInterceptor.Level.BODY);
    }
}
