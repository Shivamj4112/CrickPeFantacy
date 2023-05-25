package com.crickpe.utils;

import android.content.res.Resources;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/utils/StaticFunction;", "", "()V", "dpToPx", "", "dp", "", "APP_TYPE", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: StaticFunction.kt */
public final class StaticFunction {
    public static final StaticFunction INSTANCE = new StaticFunction();

    private StaticFunction() {
    }

    public final float dpToPx(int i) {
        return ((float) i) * Resources.getSystem().getDisplayMetrics().density;
    }

    @Metadata(mo48221d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo48222d2 = {"Lcom/crickpe/utils/StaticFunction$APP_TYPE;", "", "()V", "DEV", "", "PRODUCTION", "STAGE", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: StaticFunction.kt */
    public static final class APP_TYPE {
        public static final String DEV = "2";
        public static final APP_TYPE INSTANCE = new APP_TYPE();
        public static final String PRODUCTION = "3";
        public static final String STAGE = "1";

        private APP_TYPE() {
        }
    }
}
