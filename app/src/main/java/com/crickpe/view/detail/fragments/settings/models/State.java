package com.crickpe.view.detail.fragments.settings.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/State;", "", "stateId", "", "stateName", "(Ljava/lang/String;Ljava/lang/String;)V", "getStateId", "()Ljava/lang/String;", "getStateName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: State.kt */
public final class State {
    private final String stateId;
    private final String stateName;

    public static /* synthetic */ State copy$default(State state, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = state.stateId;
        }
        if ((i & 2) != 0) {
            str2 = state.stateName;
        }
        return state.copy(str, str2);
    }

    public final String component1() {
        return this.stateId;
    }

    public final String component2() {
        return this.stateName;
    }

    public final State copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "stateId");
        Intrinsics.checkNotNullParameter(str2, "stateName");
        return new State(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        return Intrinsics.areEqual((Object) this.stateId, (Object) state.stateId) && Intrinsics.areEqual((Object) this.stateName, (Object) state.stateName);
    }

    public int hashCode() {
        return (this.stateId.hashCode() * 31) + this.stateName.hashCode();
    }

    public String toString() {
        return "State(stateId=" + this.stateId + ", stateName=" + this.stateName + ')';
    }

    public State(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "stateId");
        Intrinsics.checkNotNullParameter(str2, "stateName");
        this.stateId = str;
        this.stateName = str2;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public final String getStateName() {
        return this.stateName;
    }
}
