package com.crickpe.utils.apiHandling;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u00102\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010 \u001a\u00020!8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b\"\u0010#R#\u0010%\u001a\n '*\u0004\u0018\u00010&0&8BX\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020,8FX\u0002¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b-\u0010.R\u0016\u00100\u001a\n '*\u0004\u0018\u00010101X\u000e¢\u0006\u0002\n\u0000¨\u00063"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/RetrofitClient;", "", "()V", "APP_CON", "", "getAPP_CON", "()Ljava/lang/String;", "setAPP_CON", "(Ljava/lang/String;)V", "BASE_URL_DEV", "getBASE_URL_DEV", "setBASE_URL_DEV", "BASE_URL_PRODUCTION", "getBASE_URL_PRODUCTION", "setBASE_URL_PRODUCTION", "BASE_URL_STAGE", "getBASE_URL_STAGE", "setBASE_URL_STAGE", "END_POINT", "getEND_POINT", "setEND_POINT", "LOGGING_INTERCEPTOR", "Lokhttp3/logging/HttpLoggingInterceptor;", "getLOGGING_INTERCEPTOR", "()Lokhttp3/logging/HttpLoggingInterceptor;", "LOGGING_INTERCEPTOR$delegate", "Lkotlin/Lazy;", "NETWORK_INTERCEPTOR", "Lokhttp3/Interceptor;", "getNETWORK_INTERCEPTOR", "()Lokhttp3/Interceptor;", "NETWORK_INTERCEPTOR$delegate", "OK_HTTP_CLIENT", "Lokhttp3/OkHttpClient;", "getOK_HTTP_CLIENT", "()Lokhttp3/OkHttpClient;", "OK_HTTP_CLIENT$delegate", "RETROFIT", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getRETROFIT", "()Lretrofit2/Retrofit;", "RETROFIT$delegate", "auctionApi", "Lcom/crickpe/utils/apiHandling/AuctionAppApi;", "getAuctionApi", "()Lcom/crickpe/utils/apiHandling/AuctionAppApi;", "auctionApi$delegate", "gson", "Lcom/google/gson/Gson;", "getBaseUrl", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RetrofitClient.kt */
public final class RetrofitClient {
    private static String APP_CON = "3";
    private static String BASE_URL_DEV = "https://api-dev.crickpe.org/";
    private static String BASE_URL_PRODUCTION = "https://app-api.crickpe.org/";
    private static String BASE_URL_STAGE = "https://api-stage.crickpe.org/";
    private static String END_POINT = "api/v1/";
    public static final RetrofitClient INSTANCE = new RetrofitClient();
    private static final Lazy LOGGING_INTERCEPTOR$delegate = LazyKt.lazy(RetrofitClient$LOGGING_INTERCEPTOR$2.INSTANCE);
    private static final Lazy NETWORK_INTERCEPTOR$delegate = LazyKt.lazy(RetrofitClient$NETWORK_INTERCEPTOR$2.INSTANCE);
    private static final Lazy OK_HTTP_CLIENT$delegate = LazyKt.lazy(RetrofitClient$OK_HTTP_CLIENT$2.INSTANCE);
    private static final Lazy RETROFIT$delegate = LazyKt.lazy(RetrofitClient$RETROFIT$2.INSTANCE);
    private static final Lazy auctionApi$delegate = LazyKt.lazy(RetrofitClient$auctionApi$2.INSTANCE);
    /* access modifiers changed from: private */
    public static Gson gson = new GsonBuilder().setLenient().create();

    private RetrofitClient() {
    }

    public final String getBASE_URL_STAGE() {
        return BASE_URL_STAGE;
    }

    public final void setBASE_URL_STAGE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        BASE_URL_STAGE = str;
    }

    public final String getBASE_URL_PRODUCTION() {
        return BASE_URL_PRODUCTION;
    }

    public final void setBASE_URL_PRODUCTION(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        BASE_URL_PRODUCTION = str;
    }

    public final String getBASE_URL_DEV() {
        return BASE_URL_DEV;
    }

    public final void setBASE_URL_DEV(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        BASE_URL_DEV = str;
    }

    public final String getEND_POINT() {
        return END_POINT;
    }

    public final void setEND_POINT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        END_POINT = str;
    }

    public final String getAPP_CON() {
        return APP_CON;
    }

    public final void setAPP_CON(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        APP_CON = str;
    }

    public final AuctionAppApi getAuctionApi() {
        Object value = auctionApi$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-auctionApi>(...)");
        return (AuctionAppApi) value;
    }

    public final String getBaseUrl() {
        String str = APP_CON;
        if (Intrinsics.areEqual((Object) str, (Object) "3")) {
            return BASE_URL_PRODUCTION;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "1")) {
            return BASE_URL_STAGE;
        }
        return BASE_URL_DEV;
    }

    /* access modifiers changed from: private */
    public final HttpLoggingInterceptor getLOGGING_INTERCEPTOR() {
        return (HttpLoggingInterceptor) LOGGING_INTERCEPTOR$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Interceptor getNETWORK_INTERCEPTOR() {
        return (Interceptor) NETWORK_INTERCEPTOR$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final OkHttpClient getOK_HTTP_CLIENT() {
        return (OkHttpClient) OK_HTTP_CLIENT$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final Retrofit getRETROFIT() {
        return (Retrofit) RETROFIT$delegate.getValue();
    }
}
