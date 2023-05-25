package com.crickpe.push;

import dagger.internal.Factory;

public final class MessagingService_Factory implements Factory<MessagingService> {
    public MessagingService get() {
        return newInstance();
    }

    public static MessagingService_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MessagingService newInstance() {
        return new MessagingService();
    }

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final MessagingService_Factory INSTANCE = new MessagingService_Factory();

        private InstanceHolder() {
        }
    }
}
