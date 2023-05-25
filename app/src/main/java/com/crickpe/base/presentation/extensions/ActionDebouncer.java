package com.crickpe.base.presentation.extensions;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\b\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, mo48222d2 = {"Lcom/crickpe/base/presentation/extensions/ActionDebouncer;", "", "action", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "lastActionTime", "", "notifyAction", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ViewExtensions.kt */
final class ActionDebouncer {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final long DEBOUNCE_INTERVAL_MILLISECONDS = 600;
    private final Function0<Unit> action;
    private long lastActionTime;

    public ActionDebouncer(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "action");
        this.action = function0;
    }

    @Metadata(mo48221d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo48222d2 = {"Lcom/crickpe/base/presentation/extensions/ActionDebouncer$Companion;", "", "()V", "DEBOUNCE_INTERVAL_MILLISECONDS", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ViewExtensions.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void notifyAction() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = elapsedRealtime - this.lastActionTime > 600;
        this.lastActionTime = elapsedRealtime;
        if (z) {
            this.action.invoke();
        }
    }
}
