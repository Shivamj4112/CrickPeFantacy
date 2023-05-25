package com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/PlayersCountArr;", "Landroid/os/Parcelable;", "count", "", "roleId", "roleName", "", "(IILjava/lang/String;)V", "getCount", "()I", "getRoleId", "getRoleName", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: FantasyTeamListModel.kt */
public final class PlayersCountArr implements Parcelable {
    public static final Parcelable.Creator<PlayersCountArr> CREATOR = new Creator();
    @SerializedName("count")
    private final int count;
    @SerializedName("roleId")
    private final int roleId;
    @SerializedName("roleName")
    private final String roleName;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: FantasyTeamListModel.kt */
    public static final class Creator implements Parcelable.Creator<PlayersCountArr> {
        public final PlayersCountArr createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlayersCountArr(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        public final PlayersCountArr[] newArray(int i) {
            return new PlayersCountArr[i];
        }
    }

    public static /* synthetic */ PlayersCountArr copy$default(PlayersCountArr playersCountArr, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = playersCountArr.count;
        }
        if ((i3 & 2) != 0) {
            i2 = playersCountArr.roleId;
        }
        if ((i3 & 4) != 0) {
            str = playersCountArr.roleName;
        }
        return playersCountArr.copy(i, i2, str);
    }

    public final int component1() {
        return this.count;
    }

    public final int component2() {
        return this.roleId;
    }

    public final String component3() {
        return this.roleName;
    }

    public final PlayersCountArr copy(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "roleName");
        return new PlayersCountArr(i, i2, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayersCountArr)) {
            return false;
        }
        PlayersCountArr playersCountArr = (PlayersCountArr) obj;
        return this.count == playersCountArr.count && this.roleId == playersCountArr.roleId && Intrinsics.areEqual((Object) this.roleName, (Object) playersCountArr.roleName);
    }

    public int hashCode() {
        return (((this.count * 31) + this.roleId) * 31) + this.roleName.hashCode();
    }

    public String toString() {
        return "PlayersCountArr(count=" + this.count + ", roleId=" + this.roleId + ", roleName=" + this.roleName + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.count);
        parcel.writeInt(this.roleId);
        parcel.writeString(this.roleName);
    }

    public PlayersCountArr(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "roleName");
        this.count = i;
        this.roleId = i2;
        this.roleName = str;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getRoleId() {
        return this.roleId;
    }

    public final String getRoleName() {
        return this.roleName;
    }
}
