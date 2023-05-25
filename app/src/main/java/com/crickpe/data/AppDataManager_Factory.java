package com.crickpe.data;

import com.crickpe.data.network.ApiService;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AppDataManager_Factory implements Factory<AppDataManager> {
    private final Provider<ApiService> mApiHelperProvider;

    public AppDataManager_Factory(Provider<ApiService> provider) {
        this.mApiHelperProvider = provider;
    }

    public AppDataManager get() {
        return newInstance(this.mApiHelperProvider.get());
    }

    public static AppDataManager_Factory create(Provider<ApiService> provider) {
        return new AppDataManager_Factory(provider);
    }

    public static AppDataManager newInstance(ApiService apiService) {
        return new AppDataManager(apiService);
    }
}
