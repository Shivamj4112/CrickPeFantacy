package com.crickpe.utils;

import android.content.Context;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ImageUtility_Factory implements Factory<ImageUtility> {
    private final Provider<Context> contextProvider;

    public ImageUtility_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public ImageUtility get() {
        return newInstance(this.contextProvider.get());
    }

    public static ImageUtility_Factory create(Provider<Context> provider) {
        return new ImageUtility_Factory(provider);
    }

    public static ImageUtility newInstance(Context context) {
        return new ImageUtility(context);
    }
}
