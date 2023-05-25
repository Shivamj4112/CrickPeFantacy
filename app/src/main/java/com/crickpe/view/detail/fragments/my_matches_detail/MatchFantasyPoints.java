package com.crickpe.view.detail.fragments.my_matches_detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/MatchFantasyPoints;", "Landroid/os/Parcelable;", "matchId", "", "playerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getMatchId", "()Ljava/lang/String;", "getPlayerId", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersPotModel.kt */
public final class MatchFantasyPoints implements Parcelable {
    public static final Parcelable.Creator<MatchFantasyPoints> CREATOR = new Creator();
    @SerializedName("matchId")
    private final String matchId;
    @SerializedName("playerId")
    private final String playerId;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersPotModel.kt */
    public static final class Creator implements Parcelable.Creator<MatchFantasyPoints> {
        public final MatchFantasyPoints createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MatchFantasyPoints(parcel.readString(), parcel.readString());
        }

        public final MatchFantasyPoints[] newArray(int i) {
            return new MatchFantasyPoints[i];
        }
    }

    public static /* synthetic */ MatchFantasyPoints copy$default(MatchFantasyPoints matchFantasyPoints, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchFantasyPoints.matchId;
        }
        if ((i & 2) != 0) {
            str2 = matchFantasyPoints.playerId;
        }
        return matchFantasyPoints.copy(str, str2);
    }

    public final String component1() {
        return this.matchId;
    }

    public final String component2() {
        return this.playerId;
    }

    public final MatchFantasyPoints copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        return new MatchFantasyPoints(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchFantasyPoints)) {
            return false;
        }
        MatchFantasyPoints matchFantasyPoints = (MatchFantasyPoints) obj;
        return Intrinsics.areEqual((Object) this.matchId, (Object) matchFantasyPoints.matchId) && Intrinsics.areEqual((Object) this.playerId, (Object) matchFantasyPoints.playerId);
    }

    public int hashCode() {
        return (this.matchId.hashCode() * 31) + this.playerId.hashCode();
    }

    public String toString() {
        return "MatchFantasyPoints(matchId=" + this.matchId + ", playerId=" + this.playerId + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.matchId);
        parcel.writeString(this.playerId);
    }

    public MatchFantasyPoints(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        this.matchId = str;
        this.playerId = str2;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }
}
