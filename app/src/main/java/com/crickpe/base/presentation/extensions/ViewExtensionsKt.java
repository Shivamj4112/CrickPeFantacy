package com.crickpe.base.presentation.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0018\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005¨\u0006\u0006"}, mo48222d2 = {"removeOnDebouncedClickListener", "", "Landroid/view/View;", "setOnDebouncedClickListener", "action", "Lkotlin/Function0;", "app_release"}, mo48223k = 2, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ViewExtensions.kt */
public final class ViewExtensionsKt {
    public static final void setOnDebouncedClickListener(View view, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(function0, "action");
        view.setOnClickListener(new ViewExtensionsKt$$ExternalSyntheticLambda0(new ActionDebouncer(function0)));
    }

    /* access modifiers changed from: private */
    /* renamed from: setOnDebouncedClickListener$lambda-0  reason: not valid java name */
    public static final void m3406setOnDebouncedClickListener$lambda0(ActionDebouncer actionDebouncer, View view) {
        Intrinsics.checkNotNullParameter(actionDebouncer, "$actionDebouncer");
        actionDebouncer.notifyAction();
    }

    public static final void removeOnDebouncedClickListener(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOnClickListener((View.OnClickListener) null);
        view.setClickable(false);
    }
}
