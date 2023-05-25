package com.crickpe.utils.apiHandling;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(mo48221d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo48222d2 = {"<anonymous>", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RetrofitClient.kt */
final class RetrofitClient$RETROFIT$2 extends Lambda implements Function0<Retrofit> {
    public static final RetrofitClient$RETROFIT$2 INSTANCE = new RetrofitClient$RETROFIT$2();

    RetrofitClient$RETROFIT$2() {
        super(0);
    }

    public final Retrofit invoke() {
        Retrofit.Builder builder = new Retrofit.Builder();
        return builder.baseUrl(RetrofitClient.INSTANCE.getBaseUrl() + RetrofitClient.INSTANCE.getEND_POINT()).addConverterFactory(GsonConverterFactory.create(RetrofitClient.gson)).client(RetrofitClient.INSTANCE.getOK_HTTP_CLIENT()).build();
    }
}
