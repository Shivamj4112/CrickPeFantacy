package com.crickpe.p015di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/* renamed from: com.crickpe.di.NetworkModule_ProvideRetrofitFactory */
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
    private final Provider<Gson> gsonProvider;
    private final Provider<OkHttpClient> okHttpClientProvider;

    public NetworkModule_ProvideRetrofitFactory(Provider<Gson> provider, Provider<OkHttpClient> provider2) {
        this.gsonProvider = provider;
        this.okHttpClientProvider = provider2;
    }

    public Retrofit get() {
        return provideRetrofit(this.gsonProvider.get(), this.okHttpClientProvider.get());
    }

    public static NetworkModule_ProvideRetrofitFactory create(Provider<Gson> provider, Provider<OkHttpClient> provider2) {
        return new NetworkModule_ProvideRetrofitFactory(provider, provider2);
    }

    public static Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        return (Retrofit) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRetrofit(gson, okHttpClient));
    }
}
