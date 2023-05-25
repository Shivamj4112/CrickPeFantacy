package com.crickpe.p015di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

/* renamed from: com.crickpe.di.NetworkModule_ProvidersLoggingInterceptorFactory */
public final class NetworkModule_ProvidersLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
    public HttpLoggingInterceptor get() {
        return providersLoggingInterceptor();
    }

    public static NetworkModule_ProvidersLoggingInterceptorFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static HttpLoggingInterceptor providersLoggingInterceptor() {
        return (HttpLoggingInterceptor) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providersLoggingInterceptor());
    }

    /* renamed from: com.crickpe.di.NetworkModule_ProvidersLoggingInterceptorFactory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final NetworkModule_ProvidersLoggingInterceptorFactory INSTANCE = new NetworkModule_ProvidersLoggingInterceptorFactory();

        private InstanceHolder() {
        }
    }
}
