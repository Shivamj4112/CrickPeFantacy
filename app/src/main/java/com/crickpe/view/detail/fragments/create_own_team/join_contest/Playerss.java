package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Playerss;", "Landroid/os/Parcelable;", "playerId", "", "isFantasyCaptain", "", "isFantasyViceCaptain", "_id", "(Ljava/lang/String;ZZLjava/lang/String;)V", "get_id", "()Ljava/lang/String;", "()Z", "getPlayerId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopContestModel.kt */
public final class Playerss implements Parcelable {
    public static final Parcelable.Creator<Playerss> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("isFantasyCaptain")
    private final boolean isFantasyCaptain;
    @SerializedName("isFantasyViceCaptain")
    private final boolean isFantasyViceCaptain;
    @SerializedName("playerId")
    private final String playerId;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopContestModel.kt */
    public static final class Creator implements Parcelable.Creator<Playerss> {
        public final Playerss createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = true;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new Playerss(readString, z2, z, parcel.readString());
        }

        public final Playerss[] newArray(int i) {
            return new Playerss[i];
        }
    }

    public static /* synthetic */ Playerss copy$default(Playerss playerss, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playerss.playerId;
        }
        if ((i & 2) != 0) {
            z = playerss.isFantasyCaptain;
        }
        if ((i & 4) != 0) {
            z2 = playerss.isFantasyViceCaptain;
        }
        if ((i & 8) != 0) {
            str2 = playerss._id;
        }
        return playerss.copy(str, z, z2, str2);
    }

    public final String component1() {
        return this.playerId;
    }

    public final boolean component2() {
        return this.isFantasyCaptain;
    }

    public final boolean component3() {
        return this.isFantasyViceCaptain;
    }

    public final String component4() {
        return this._id;
    }

    public final Playerss copy(String str, boolean z, boolean z2, String str2) {
        Intrinsics.checkNotNullParameter(str, "playerId");
        Intrinsics.checkNotNullParameter(str2, "_id");
        return new Playerss(str, z, z2, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Playerss)) {
            return false;
        }
        Playerss playerss = (Playerss) obj;
        return Intrinsics.areEqual((Object) this.playerId, (Object) playerss.playerId) && this.isFantasyCaptain == playerss.isFantasyCaptain && this.isFantasyViceCaptain == playerss.isFantasyViceCaptain && Intrinsics.areEqual((Object) this._id, (Object) playerss._id);
    }

    public int hashCode() {
        int hashCode = this.playerId.hashCode() * 31;
        boolean z = this.isFantasyCaptain;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isFantasyViceCaptain;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this._id.hashCode();
    }

    public String toString() {
        return "Playerss(playerId=" + this.playerId + ", isFantasyCaptain=" + this.isFantasyCaptain + ", isFantasyViceCaptain=" + this.isFantasyViceCaptain + ", _id=" + this._id + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.playerId);
        parcel.writeInt(this.isFantasyCaptain ? 1 : 0);
        parcel.writeInt(this.isFantasyViceCaptain ? 1 : 0);
        parcel.writeString(this._id);
    }

    public Playerss(String str, boolean z, boolean z2, String str2) {
        Intrinsics.checkNotNullParameter(str, "playerId");
        Intrinsics.checkNotNullParameter(str2, "_id");
        this.playerId = str;
        this.isFantasyCaptain = z;
        this.isFantasyViceCaptain = z2;
        this._id = str2;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final boolean isFantasyCaptain() {
        return this.isFantasyCaptain;
    }

    public final boolean isFantasyViceCaptain() {
        return this.isFantasyViceCaptain;
    }

    public final String get_id() {
        return this._id;
    }
}
