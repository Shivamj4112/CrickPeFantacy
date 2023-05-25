package com.crickpe.p015di;

import com.crickpe.data.network.AuthenticationInterceptor;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* renamed from: com.crickpe.di.NetworkModule_ProvidesOkHttpClientFactory */
public final class NetworkModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
    private final Provider<AuthenticationInterceptor> authenticationInterceptorProvider;
    private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

    public NetworkModule_ProvidesOkHttpClientFactory(Provider<HttpLoggingInterceptor> provider, Provider<AuthenticationInterceptor> provider2) {
        this.loggingInterceptorProvider = provider;
        this.authenticationInterceptorProvider = provider2;
    }

    public OkHttpClient get() {
        return providesOkHttpClient(this.loggingInterceptorProvider.get(), this.authenticationInterceptorProvider.get());
    }

    public static NetworkModule_ProvidesOkHttpClientFactory create(Provider<HttpLoggingInterceptor> provider, Provider<AuthenticationInterceptor> provider2) {
        return new NetworkModule_ProvidesOkHttpClientFactory(provider, provider2);
    }

    public static OkHttpClient providesOkHttpClient(HttpLoggingInterceptor httpLoggingInterceptor, AuthenticationInterceptor authenticationInterceptor) {
        return (OkHttpClient) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesOkHttpClient(httpLoggingInterceptor, authenticationInterceptor));
    }
}
