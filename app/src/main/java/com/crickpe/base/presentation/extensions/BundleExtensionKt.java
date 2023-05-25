package com.crickpe.base.presentation.extensions;

import android.os.Bundle;
import androidx.core.p004os.BundleKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, mo48222d2 = {"putAny", "", "Landroid/os/Bundle;", "key", "", "value", "", "app_release"}, mo48223k = 2, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BundleExtension.kt */
public final class BundleExtensionKt {
    public static final void putAny(Bundle bundle, String str, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(str, "key");
        bundle.putAll(BundleKt.bundleOf(TuplesKt.m276to(str, obj)));
    }
}
