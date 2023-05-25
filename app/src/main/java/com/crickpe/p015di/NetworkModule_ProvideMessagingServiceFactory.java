package com.crickpe.p015di;

import com.crickpe.push.MessagingService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.crickpe.di.NetworkModule_ProvideMessagingServiceFactory */
public final class NetworkModule_ProvideMessagingServiceFactory implements Factory<MessagingService> {
    private final Provider<MessagingService> messagingServiceProvider;

    public NetworkModule_ProvideMessagingServiceFactory(Provider<MessagingService> provider) {
        this.messagingServiceProvider = provider;
    }

    public MessagingService get() {
        return provideMessagingService(this.messagingServiceProvider.get());
    }

    public static NetworkModule_ProvideMessagingServiceFactory create(Provider<MessagingService> provider) {
        return new NetworkModule_ProvideMessagingServiceFactory(provider);
    }

    public static MessagingService provideMessagingService(MessagingService messagingService) {
        return (MessagingService) Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideMessagingService(messagingService));
    }
}
