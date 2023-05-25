package com.crickpe.p015di;

import com.crickpe.data.AppDataManager;
import com.crickpe.data.network.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.crickpe.di.NetworkModule_ProvideAppManagerFactory */
public final class NetworkModule_ProvideAppManagerFactory implements Factory<AppDataManager> {
    private final Provider<ApiService> mApiHelperProvider;

    public NetworkModule_ProvideAppManagerFactory(Provider<ApiService> provider) {
        this.mApiHelperProvider = provider;
    }

    public AppDataManager get() {
        return provideAppManager(this.mApiHelperProvider.get());
    }

    public static NetworkModule_ProvideAppManagerFactory create(Provider<ApiService> provider) {
        return new NetworkModule_ProvideAppManagerFactory(provider);
    }

    public static AppDataManager provideAppManager(ApiService apiService) {
        return (AppDataManager) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideAppManager(apiService));
    }
}
