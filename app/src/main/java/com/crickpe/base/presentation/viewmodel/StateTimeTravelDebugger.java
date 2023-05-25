package com.crickpe.base.presentation.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J \u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\u0016\u0010\u0019\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\bH\u0002J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0006\u0010\u001c\u001a\u00020\u0011J\u0006\u0010\u001d\u001a\u00020\u0011R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo48222d2 = {"Lcom/crickpe/base/presentation/viewmodel/StateTimeTravelDebugger;", "", "viewClassName", "", "(Ljava/lang/String;)V", "lastViewAction", "Lcom/crickpe/base/presentation/viewmodel/BaseAction;", "propertyNames", "", "getPropertyNames", "()Ljava/util/List;", "propertyNames$delegate", "Lkotlin/Lazy;", "stateTimeline", "", "Lcom/crickpe/base/presentation/viewmodel/StateTimeTravelDebugger$StateTransition;", "addAction", "", "viewAction", "addStateTransition", "oldState", "Lcom/crickpe/base/presentation/viewmodel/BaseViewState;", "newState", "getLogLine", "propertyName", "getMessage", "getPropertyValue", "baseViewState", "logAll", "logLast", "StateTransition", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: StateTimeTravelDebugger.kt */
public final class StateTimeTravelDebugger {
    private BaseAction lastViewAction;
    private final Lazy propertyNames$delegate = LazyKt.lazy(new StateTimeTravelDebugger$propertyNames$2(this));
    /* access modifiers changed from: private */
    public final List<StateTransition> stateTimeline = new ArrayList();
    private final String viewClassName;

    public final void logAll() {
    }

    public StateTimeTravelDebugger(String str) {
        Intrinsics.checkNotNullParameter(str, "viewClassName");
        this.viewClassName = str;
    }

    public final void addAction(BaseAction baseAction) {
        Intrinsics.checkNotNullParameter(baseAction, "viewAction");
        this.lastViewAction = baseAction;
    }

    public final void addStateTransition(BaseViewState baseViewState, BaseViewState baseViewState2) {
        Intrinsics.checkNotNullParameter(baseViewState, "oldState");
        Intrinsics.checkNotNullParameter(baseViewState2, "newState");
        BaseAction baseAction = this.lastViewAction;
        if (baseAction != null) {
            this.stateTimeline.add(new StateTransition(baseViewState, baseAction, baseViewState2));
            this.lastViewAction = null;
            return;
        }
        throw new IllegalStateException("lastViewAction is null. Please log action before logging state transition".toString());
    }

    private final String getMessage() {
        return getMessage(this.stateTimeline);
    }

    private final String getMessage(List<StateTransition> list) {
        if (list.isEmpty()) {
            return this.viewClassName + " has no state transitions \n";
        }
        String str = "";
        for (StateTransition stateTransition : list) {
            str = str + "Action: " + this.viewClassName + '.' + stateTransition.getAction().getClass().getSimpleName() + ":\n";
            for (String logLine : getPropertyNames()) {
                str = str + getLogLine(stateTransition.getOldState(), stateTransition.getNewState(), logLine);
            }
        }
        return str;
    }

    public final void logLast() {
        CollectionsKt.listOf(CollectionsKt.last(this.stateTimeline));
    }

    private final String getLogLine(BaseViewState baseViewState, BaseViewState baseViewState2, String str) {
        String propertyValue = getPropertyValue(baseViewState, str);
        String propertyValue2 = getPropertyValue(baseViewState2, str);
        if (!Intrinsics.areEqual((Object) propertyValue, (Object) propertyValue2)) {
            return "\t" + '*' + str + ": " + propertyValue + " -> " + propertyValue2 + 10;
        }
        return "\t" + str + ": " + propertyValue2 + 10;
    }

    private final List<String> getPropertyNames() {
        return (List) this.propertyNames$delegate.getValue();
    }

    private final String getPropertyValue(BaseViewState baseViewState, String str) {
        for (KProperty1 kProperty1 : KClasses.getMemberProperties(Reflection.getOrCreateKotlinClass(baseViewState.getClass()))) {
            if (Intrinsics.areEqual((Object) str, (Object) kProperty1.getName())) {
                String valueOf = String.valueOf(kProperty1.getGetter().call(baseViewState));
                return StringsKt.isBlank(valueOf) ? "\"\"" : valueOf;
            }
        }
        return "";
    }

    @Metadata(mo48221d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/base/presentation/viewmodel/StateTimeTravelDebugger$StateTransition;", "", "oldState", "Lcom/crickpe/base/presentation/viewmodel/BaseViewState;", "action", "Lcom/crickpe/base/presentation/viewmodel/BaseAction;", "newState", "(Lcom/crickpe/base/presentation/viewmodel/BaseViewState;Lcom/crickpe/base/presentation/viewmodel/BaseAction;Lcom/crickpe/base/presentation/viewmodel/BaseViewState;)V", "getAction", "()Lcom/crickpe/base/presentation/viewmodel/BaseAction;", "getNewState", "()Lcom/crickpe/base/presentation/viewmodel/BaseViewState;", "getOldState", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: StateTimeTravelDebugger.kt */
    private static final class StateTransition {
        private final BaseAction action;
        private final BaseViewState newState;
        private final BaseViewState oldState;

        public static /* synthetic */ StateTransition copy$default(StateTransition stateTransition, BaseViewState baseViewState, BaseAction baseAction, BaseViewState baseViewState2, int i, Object obj) {
            if ((i & 1) != 0) {
                baseViewState = stateTransition.oldState;
            }
            if ((i & 2) != 0) {
                baseAction = stateTransition.action;
            }
            if ((i & 4) != 0) {
                baseViewState2 = stateTransition.newState;
            }
            return stateTransition.copy(baseViewState, baseAction, baseViewState2);
        }

        public final BaseViewState component1() {
            return this.oldState;
        }

        public final BaseAction component2() {
            return this.action;
        }

        public final BaseViewState component3() {
            return this.newState;
        }

        public final StateTransition copy(BaseViewState baseViewState, BaseAction baseAction, BaseViewState baseViewState2) {
            Intrinsics.checkNotNullParameter(baseViewState, "oldState");
            Intrinsics.checkNotNullParameter(baseAction, "action");
            Intrinsics.checkNotNullParameter(baseViewState2, "newState");
            return new StateTransition(baseViewState, baseAction, baseViewState2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateTransition)) {
                return false;
            }
            StateTransition stateTransition = (StateTransition) obj;
            return Intrinsics.areEqual((Object) this.oldState, (Object) stateTransition.oldState) && Intrinsics.areEqual((Object) this.action, (Object) stateTransition.action) && Intrinsics.areEqual((Object) this.newState, (Object) stateTransition.newState);
        }

        public int hashCode() {
            return (((this.oldState.hashCode() * 31) + this.action.hashCode()) * 31) + this.newState.hashCode();
        }

        public String toString() {
            return "StateTransition(oldState=" + this.oldState + ", action=" + this.action + ", newState=" + this.newState + ')';
        }

        public StateTransition(BaseViewState baseViewState, BaseAction baseAction, BaseViewState baseViewState2) {
            Intrinsics.checkNotNullParameter(baseViewState, "oldState");
            Intrinsics.checkNotNullParameter(baseAction, "action");
            Intrinsics.checkNotNullParameter(baseViewState2, "newState");
            this.oldState = baseViewState;
            this.action = baseAction;
            this.newState = baseViewState2;
        }

        public final BaseViewState getOldState() {
            return this.oldState;
        }

        public final BaseAction getAction() {
            return this.action;
        }

        public final BaseViewState getNewState() {
            return this.newState;
        }
    }
}
