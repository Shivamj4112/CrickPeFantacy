package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Players;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "teamId", "", "playerId", "teamKey", "playerKey", "role", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Role;", "_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Role;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getPlayerId", "getPlayerKey", "getRole", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Role;", "getTeamId", "getTeamKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailModel.kt */
public final class Players extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<Players> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("playerId")
    private final String playerId;
    @SerializedName("playerKey")
    private final String playerKey;
    @SerializedName("role")
    private final Role role;
    @SerializedName("teamId")
    private final String teamId;
    @SerializedName("teamKey")
    private final String teamKey;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestDetailModel.kt */
    public static final class Creator implements Parcelable.Creator<Players> {
        public final Players createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Players(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Role.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        public final Players[] newArray(int i) {
            return new Players[i];
        }
    }

    public static /* synthetic */ Players copy$default(Players players, String str, String str2, String str3, String str4, Role role2, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = players.teamId;
        }
        if ((i & 2) != 0) {
            str2 = players.playerId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = players.teamKey;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = players.playerKey;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            role2 = players.role;
        }
        Role role3 = role2;
        if ((i & 32) != 0) {
            str5 = players._id;
        }
        return players.copy(str, str6, str7, str8, role3, str5);
    }

    public final String component1() {
        return this.teamId;
    }

    public final String component2() {
        return this.playerId;
    }

    public final String component3() {
        return this.teamKey;
    }

    public final String component4() {
        return this.playerKey;
    }

    public final Role component5() {
        return this.role;
    }

    public final String component6() {
        return this._id;
    }

    public final Players copy(String str, String str2, String str3, String str4, Role role2, String str5) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(str3, "teamKey");
        Intrinsics.checkNotNullParameter(str4, "playerKey");
        Intrinsics.checkNotNullParameter(role2, "role");
        Intrinsics.checkNotNullParameter(str5, "_id");
        return new Players(str, str2, str3, str4, role2, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Players)) {
            return false;
        }
        Players players = (Players) obj;
        return Intrinsics.areEqual((Object) this.teamId, (Object) players.teamId) && Intrinsics.areEqual((Object) this.playerId, (Object) players.playerId) && Intrinsics.areEqual((Object) this.teamKey, (Object) players.teamKey) && Intrinsics.areEqual((Object) this.playerKey, (Object) players.playerKey) && Intrinsics.areEqual((Object) this.role, (Object) players.role) && Intrinsics.areEqual((Object) this._id, (Object) players._id);
    }

    public int hashCode() {
        return (((((((((this.teamId.hashCode() * 31) + this.playerId.hashCode()) * 31) + this.teamKey.hashCode()) * 31) + this.playerKey.hashCode()) * 31) + this.role.hashCode()) * 31) + this._id.hashCode();
    }

    public String toString() {
        return "Players(teamId=" + this.teamId + ", playerId=" + this.playerId + ", teamKey=" + this.teamKey + ", playerKey=" + this.playerKey + ", role=" + this.role + ", _id=" + this._id + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.teamId);
        parcel.writeString(this.playerId);
        parcel.writeString(this.teamKey);
        parcel.writeString(this.playerKey);
        this.role.writeToParcel(parcel, i);
        parcel.writeString(this._id);
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final String getTeamKey() {
        return this.teamKey;
    }

    public final String getPlayerKey() {
        return this.playerKey;
    }

    public final Role getRole() {
        return this.role;
    }

    public final String get_id() {
        return this._id;
    }

    public Players(String str, String str2, String str3, String str4, Role role2, String str5) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(str3, "teamKey");
        Intrinsics.checkNotNullParameter(str4, "playerKey");
        Intrinsics.checkNotNullParameter(role2, "role");
        Intrinsics.checkNotNullParameter(str5, "_id");
        this.teamId = str;
        this.playerId = str2;
        this.teamKey = str3;
        this.playerKey = str4;
        this.role = role2;
        this._id = str5;
    }
}
