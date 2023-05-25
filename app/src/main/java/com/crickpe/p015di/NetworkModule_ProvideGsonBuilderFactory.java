package com.crickpe.p015di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* renamed from: com.crickpe.di.NetworkModule_ProvideGsonBuilderFactory */
public final class NetworkModule_ProvideGsonBuilderFactory implements Factory<Gson> {
    public Gson get() {
        return provideGsonBuilder();
    }

    public static NetworkModule_ProvideGsonBuilderFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Gson provideGsonBuilder() {
        return (Gson) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideGsonBuilder());
    }

    /* renamed from: com.crickpe.di.NetworkModule_ProvideGsonBuilderFactory$InstanceHolder */
    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final NetworkModule_ProvideGsonBuilderFactory INSTANCE = new NetworkModule_ProvideGsonBuilderFactory();

        private InstanceHolder() {
        }
    }
}
