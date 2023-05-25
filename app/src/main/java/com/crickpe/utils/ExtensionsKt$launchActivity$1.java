package com.crickpe.utils;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo48221d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo48222d2 = {"<anonymous>", "", "T", "", "Landroid/content/Intent;", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 176)
/* compiled from: Extensions.kt */
public final class ExtensionsKt$launchActivity$1 extends Lambda implements Function1<Intent, Unit> {
    public static final ExtensionsKt$launchActivity$1 INSTANCE = new ExtensionsKt$launchActivity$1();

    public ExtensionsKt$launchActivity$1() {
        super(1);
    }

    public final void invoke(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "$this$null");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Intent) obj);
        return Unit.INSTANCE;
    }
}
