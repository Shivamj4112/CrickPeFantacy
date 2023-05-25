package com.crickpe.data.network;

import dagger.internal.Factory;

public final class AuthenticationInterceptor_Factory implements Factory<AuthenticationInterceptor> {
    public AuthenticationInterceptor get() {
        return newInstance();
    }

    public static AuthenticationInterceptor_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static AuthenticationInterceptor newInstance() {
        return new AuthenticationInterceptor();
    }

    private static final class InstanceHolder {
        /* access modifiers changed from: private */
        public static final AuthenticationInterceptor_Factory INSTANCE = new AuthenticationInterceptor_Factory();

        private InstanceHolder() {
        }
    }
}
