package com.crickpe.p015di;

import com.crickpe.data.network.ApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

/* renamed from: com.crickpe.di.NetworkModule_ProvideApiServiceFactory */
public final class NetworkModule_ProvideApiServiceFactory implements Factory<ApiService> {
    private final Provider<Retrofit> retrofitProvider;

    public NetworkModule_ProvideApiServiceFactory(Provider<Retrofit> provider) {
        this.retrofitProvider = provider;
    }

    public ApiService get() {
        return provideApiService(this.retrofitProvider.get());
    }

    public static NetworkModule_ProvideApiServiceFactory create(Provider<Retrofit> provider) {
        return new NetworkModule_ProvideApiServiceFactory(provider);
    }

    public static ApiService provideApiService(Retrofit retrofit) {
        return (ApiService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideApiService(retrofit));
    }
}
