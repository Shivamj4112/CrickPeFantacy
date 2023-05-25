package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\u000bHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\tHÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0007HÖ\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006&"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/PlayersInfo;", "Landroid/os/Parcelable;", "players", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "Lkotlin/collections/ArrayList;", "roleId", "", "roleName", "", "teamLimit", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/TeamLimit;", "(Ljava/util/ArrayList;ILjava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/create_team/TeamLimit;)V", "getPlayers", "()Ljava/util/ArrayList;", "getRoleId", "()I", "getRoleName", "()Ljava/lang/String;", "getTeamLimit", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/TeamLimit;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersModel.kt */
public final class PlayersInfo implements Parcelable {
    public static final Parcelable.Creator<PlayersInfo> CREATOR = new Creator();
    @SerializedName("players")
    private final ArrayList<Players> players;
    @SerializedName("roleId")
    private final int roleId;
    @SerializedName("roleName")
    private final String roleName;
    @SerializedName("teamLimit")
    private final TeamLimit teamLimit;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersModel.kt */
    public static final class Creator implements Parcelable.Creator<PlayersInfo> {
        public final PlayersInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Players.CREATOR.createFromParcel(parcel));
            }
            return new PlayersInfo(arrayList, parcel.readInt(), parcel.readString(), TeamLimit.CREATOR.createFromParcel(parcel));
        }

        public final PlayersInfo[] newArray(int i) {
            return new PlayersInfo[i];
        }
    }

    public static /* synthetic */ PlayersInfo copy$default(PlayersInfo playersInfo, ArrayList<Players> arrayList, int i, String str, TeamLimit teamLimit2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            arrayList = playersInfo.players;
        }
        if ((i2 & 2) != 0) {
            i = playersInfo.roleId;
        }
        if ((i2 & 4) != 0) {
            str = playersInfo.roleName;
        }
        if ((i2 & 8) != 0) {
            teamLimit2 = playersInfo.teamLimit;
        }
        return playersInfo.copy(arrayList, i, str, teamLimit2);
    }

    public final ArrayList<Players> component1() {
        return this.players;
    }

    public final int component2() {
        return this.roleId;
    }

    public final String component3() {
        return this.roleName;
    }

    public final TeamLimit component4() {
        return this.teamLimit;
    }

    public final PlayersInfo copy(ArrayList<Players> arrayList, int i, String str, TeamLimit teamLimit2) {
        Intrinsics.checkNotNullParameter(arrayList, "players");
        Intrinsics.checkNotNullParameter(str, "roleName");
        Intrinsics.checkNotNullParameter(teamLimit2, "teamLimit");
        return new PlayersInfo(arrayList, i, str, teamLimit2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayersInfo)) {
            return false;
        }
        PlayersInfo playersInfo = (PlayersInfo) obj;
        return Intrinsics.areEqual((Object) this.players, (Object) playersInfo.players) && this.roleId == playersInfo.roleId && Intrinsics.areEqual((Object) this.roleName, (Object) playersInfo.roleName) && Intrinsics.areEqual((Object) this.teamLimit, (Object) playersInfo.teamLimit);
    }

    public int hashCode() {
        return (((((this.players.hashCode() * 31) + this.roleId) * 31) + this.roleName.hashCode()) * 31) + this.teamLimit.hashCode();
    }

    public String toString() {
        return "PlayersInfo(players=" + this.players + ", roleId=" + this.roleId + ", roleName=" + this.roleName + ", teamLimit=" + this.teamLimit + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ArrayList<Players> arrayList = this.players;
        parcel.writeInt(arrayList.size());
        Iterator<Players> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.roleId);
        parcel.writeString(this.roleName);
        this.teamLimit.writeToParcel(parcel, i);
    }

    public PlayersInfo(ArrayList<Players> arrayList, int i, String str, TeamLimit teamLimit2) {
        Intrinsics.checkNotNullParameter(arrayList, "players");
        Intrinsics.checkNotNullParameter(str, "roleName");
        Intrinsics.checkNotNullParameter(teamLimit2, "teamLimit");
        this.players = arrayList;
        this.roleId = i;
        this.roleName = str;
        this.teamLimit = teamLimit2;
    }

    public final ArrayList<Players> getPlayers() {
        return this.players;
    }

    public final int getRoleId() {
        return this.roleId;
    }

    public final String getRoleName() {
        return this.roleName;
    }

    public final TeamLimit getTeamLimit() {
        return this.teamLimit;
    }
}
