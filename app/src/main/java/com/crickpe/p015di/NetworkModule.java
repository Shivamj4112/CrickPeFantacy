package com.crickpe.p015di;

import com.crickpe.BuildConfig;
import com.crickpe.data.AppDataManager;
import com.crickpe.data.network.ApiService;
import com.crickpe.data.network.AuthenticationInterceptor;
import com.crickpe.datastore.DataStoreUtil;
import com.crickpe.push.MessagingService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0018\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0014H\u0007¨\u0006\u001c"}, mo48222d2 = {"Lcom/crickpe/di/NetworkModule;", "", "()V", "provideApiService", "Lcom/crickpe/data/network/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideAppManager", "Lcom/crickpe/data/AppDataManager;", "mApiHelper", "provideGsonBuilder", "Lcom/google/gson/Gson;", "provideMessagingService", "Lcom/crickpe/push/MessagingService;", "messagingService", "provideRetrofit", "gson", "okHttpClient", "Lokhttp3/OkHttpClient;", "providedAuthenticationInterceptor", "Lcom/crickpe/data/network/AuthenticationInterceptor;", "dataStoreHelper", "Lcom/crickpe/datastore/DataStoreUtil;", "providersLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "providesOkHttpClient", "loggingInterceptor", "authenticationInterceptor", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@Module
/* renamed from: com.crickpe.di.NetworkModule */
/* compiled from: NetworkModule.kt */
public final class NetworkModule {
    public static final NetworkModule INSTANCE = new NetworkModule();

    private NetworkModule() {
    }

    @Singleton
    @Provides
    public final Gson provideGsonBuilder() {
        Gson create = new GsonBuilder().create();
        Intrinsics.checkNotNullExpressionValue(create, "GsonBuilder()\n            .create()");
        return create;
    }

    @Singleton
    @Provides
    public final HttpLoggingInterceptor providersLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor((HttpLoggingInterceptor.Logger) null, 1, (DefaultConstructorMarker) null);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        return httpLoggingInterceptor;
    }

    @Singleton
    @Provides
    public final AuthenticationInterceptor providedAuthenticationInterceptor(DataStoreUtil dataStoreUtil) {
        Intrinsics.checkNotNullParameter(dataStoreUtil, "dataStoreHelper");
        return new AuthenticationInterceptor();
    }

    @Singleton
    @Provides
    public final MessagingService provideMessagingService(MessagingService messagingService) {
        Intrinsics.checkNotNullParameter(messagingService, "messagingService");
        return new MessagingService();
    }

    @Singleton
    @Provides
    public final OkHttpClient providesOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, AuthenticationInterceptor authenticationInterceptor) {
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor, "loggingInterceptor");
        Intrinsics.checkNotNullParameter(authenticationInterceptor, "authenticationInterceptor");
        return new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).addInterceptor(authenticationInterceptor).readTimeout(240, TimeUnit.SECONDS).connectTimeout(240, TimeUnit.SECONDS).build();
    }

    @Singleton
    @Provides
    public final Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Retrofit build = new Retrofit.Builder().baseUrl(BuildConfig.API_URL).addConverterFactory(GsonConverterFactory.create(gson)).client(okHttpClient).build();
        Intrinsics.checkNotNullExpressionValue(build, "Builder()\n            .b…ent)\n            .build()");
        return build;
    }

    @Singleton
    @Provides
    public final ApiService provideApiService(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(ApiService.class);
        Intrinsics.checkNotNullExpressionValue(create, "retrofit\n            .cr…e(ApiService::class.java)");
        return (ApiService) create;
    }

    @Singleton
    @Provides
    public final AppDataManager provideAppManager(ApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "mApiHelper");
        return new AppDataManager(apiService);
    }
}
