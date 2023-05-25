package com.crickpe.p015di;

import android.content.Context;
import com.crickpe.utils.ImageUtility;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, mo48222d2 = {"Lcom/crickpe/di/ProductionModule;", "", "()V", "provideImageUtility", "Lcom/crickpe/utils/ImageUtility;", "appContext", "Landroid/content/Context;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@Module
/* renamed from: com.crickpe.di.ProductionModule */
/* compiled from: ProductionModule.kt */
public final class ProductionModule {
    public static final ProductionModule INSTANCE = new ProductionModule();

    private ProductionModule() {
    }

    @Singleton
    @Provides
    public final ImageUtility provideImageUtility(@ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(context, "appContext");
        return new ImageUtility(context);
    }
}
