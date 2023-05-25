package com.crickpe.p015di;

import android.content.Context;
import com.crickpe.utils.ImageUtility;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* renamed from: com.crickpe.di.ProductionModule_ProvideImageUtilityFactory */
public final class ProductionModule_ProvideImageUtilityFactory implements Factory<ImageUtility> {
    private final Provider<Context> appContextProvider;

    public ProductionModule_ProvideImageUtilityFactory(Provider<Context> provider) {
        this.appContextProvider = provider;
    }

    public ImageUtility get() {
        return provideImageUtility(this.appContextProvider.get());
    }

    public static ProductionModule_ProvideImageUtilityFactory create(Provider<Context> provider) {
        return new ProductionModule_ProvideImageUtilityFactory(provider);
    }

    public static ImageUtility provideImageUtility(Context context) {
        return (ImageUtility) Preconditions.checkNotNullFromProvides(ProductionModule.INSTANCE.provideImageUtility(context));
    }
}
