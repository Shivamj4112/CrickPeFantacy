package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001c"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/LastPlayedMatches;", "Landroid/os/Parcelable;", "matchId", "", "isPlaying", "", "_id", "(Ljava/lang/String;ZLjava/lang/String;)V", "get_id", "()Ljava/lang/String;", "()Z", "getMatchId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersModel.kt */
public final class LastPlayedMatches implements Parcelable {
    public static final Parcelable.Creator<LastPlayedMatches> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("isPlaying")
    private final boolean isPlaying;
    @SerializedName("matchId")
    private final String matchId;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersModel.kt */
    public static final class Creator implements Parcelable.Creator<LastPlayedMatches> {
        public final LastPlayedMatches createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LastPlayedMatches(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        public final LastPlayedMatches[] newArray(int i) {
            return new LastPlayedMatches[i];
        }
    }

    public static /* synthetic */ LastPlayedMatches copy$default(LastPlayedMatches lastPlayedMatches, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lastPlayedMatches.matchId;
        }
        if ((i & 2) != 0) {
            z = lastPlayedMatches.isPlaying;
        }
        if ((i & 4) != 0) {
            str2 = lastPlayedMatches._id;
        }
        return lastPlayedMatches.copy(str, z, str2);
    }

    public final String component1() {
        return this.matchId;
    }

    public final boolean component2() {
        return this.isPlaying;
    }

    public final String component3() {
        return this._id;
    }

    public final LastPlayedMatches copy(String str, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        Intrinsics.checkNotNullParameter(str2, "_id");
        return new LastPlayedMatches(str, z, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastPlayedMatches)) {
            return false;
        }
        LastPlayedMatches lastPlayedMatches = (LastPlayedMatches) obj;
        return Intrinsics.areEqual((Object) this.matchId, (Object) lastPlayedMatches.matchId) && this.isPlaying == lastPlayedMatches.isPlaying && Intrinsics.areEqual((Object) this._id, (Object) lastPlayedMatches._id);
    }

    public int hashCode() {
        int hashCode = this.matchId.hashCode() * 31;
        boolean z = this.isPlaying;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + this._id.hashCode();
    }

    public String toString() {
        return "LastPlayedMatches(matchId=" + this.matchId + ", isPlaying=" + this.isPlaying + ", _id=" + this._id + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.matchId);
        parcel.writeInt(this.isPlaying ? 1 : 0);
        parcel.writeString(this._id);
    }

    public LastPlayedMatches(String str, boolean z, String str2) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        Intrinsics.checkNotNullParameter(str2, "_id");
        this.matchId = str;
        this.isPlaying = z;
        this._id = str2;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final String get_id() {
        return this._id;
    }
}
