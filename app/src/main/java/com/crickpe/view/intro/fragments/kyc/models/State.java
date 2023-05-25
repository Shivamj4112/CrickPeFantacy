package com.crickpe.view.intro.fragments.kyc.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/kyc/models/State;", "Landroid/os/Parcelable;", "stateId", "", "stateName", "state", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "getStateId", "getStateName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: State.kt */
public final class State implements Parcelable {
    public static final Parcelable.Creator<State> CREATOR = new Creator();
    @SerializedName("state")
    private final String state;
    @SerializedName("stateId")
    private final String stateId;
    @SerializedName("stateName")
    private final String stateName;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: State.kt */
    public static final class Creator implements Parcelable.Creator<State> {
        public final State createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new State(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final State[] newArray(int i) {
            return new State[i];
        }
    }

    public State() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ State copy$default(State state2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = state2.stateId;
        }
        if ((i & 2) != 0) {
            str2 = state2.stateName;
        }
        if ((i & 4) != 0) {
            str3 = state2.state;
        }
        return state2.copy(str, str2, str3);
    }

    public final String component1() {
        return this.stateId;
    }

    public final String component2() {
        return this.stateName;
    }

    public final String component3() {
        return this.state;
    }

    public final State copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "stateId");
        Intrinsics.checkNotNullParameter(str2, "stateName");
        Intrinsics.checkNotNullParameter(str3, "state");
        return new State(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state2 = (State) obj;
        return Intrinsics.areEqual((Object) this.stateId, (Object) state2.stateId) && Intrinsics.areEqual((Object) this.stateName, (Object) state2.stateName) && Intrinsics.areEqual((Object) this.state, (Object) state2.state);
    }

    public int hashCode() {
        return (((this.stateId.hashCode() * 31) + this.stateName.hashCode()) * 31) + this.state.hashCode();
    }

    public String toString() {
        return "State(stateId=" + this.stateId + ", stateName=" + this.stateName + ", state=" + this.state + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.stateId);
        parcel.writeString(this.stateName);
        parcel.writeString(this.state);
    }

    public State(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "stateId");
        Intrinsics.checkNotNullParameter(str2, "stateName");
        Intrinsics.checkNotNullParameter(str3, "state");
        this.stateId = str;
        this.stateName = str2;
        this.state = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ State(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    public final String getStateId() {
        return this.stateId;
    }

    public final String getStateName() {
        return this.stateName;
    }

    public final String getState() {
        return this.state;
    }
}
