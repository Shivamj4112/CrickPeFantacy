package com.crickpe.p015di;

import com.crickpe.data.network.AuthenticationInterceptor;
import com.crickpe.datastore.DataStoreUtil;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.crickpe.di.NetworkModule_ProvidedAuthenticationInterceptorFactory */
public final class NetworkModule_ProvidedAuthenticationInterceptorFactory implements Factory<AuthenticationInterceptor> {
    private final Provider<DataStoreUtil> dataStoreHelperProvider;

    public NetworkModule_ProvidedAuthenticationInterceptorFactory(Provider<DataStoreUtil> provider) {
        this.dataStoreHelperProvider = provider;
    }

    public AuthenticationInterceptor get() {
        return providedAuthenticationInterceptor(this.dataStoreHelperProvider.get());
    }

    public static NetworkModule_ProvidedAuthenticationInterceptorFactory create(Provider<DataStoreUtil> provider) {
        return new NetworkModule_ProvidedAuthenticationInterceptorFactory(provider);
    }

    public static AuthenticationInterceptor providedAuthenticationInterceptor(DataStoreUtil dataStoreUtil) {
        return (AuthenticationInterceptor) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providedAuthenticationInterceptor(dataStoreUtil));
    }
}
