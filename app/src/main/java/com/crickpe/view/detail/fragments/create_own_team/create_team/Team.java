package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000eHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\t\u0010&\u001a\u00020\u000eHÖ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u000eHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u00061"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;", "Landroid/os/Parcelable;", "_id", "", "name", "code", "countryCode", "teamIconUrl", "isBlocked", "", "isDeleted", "createdAt", "updatedAt", "__v", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getCode", "getCountryCode", "getCreatedAt", "()Z", "getName", "getTeamIconUrl", "getUpdatedAt", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersModel.kt */
public final class Team implements Parcelable {
    public static final Parcelable.Creator<Team> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("code")
    private final String code;
    @SerializedName("countryCode")
    private final String countryCode;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("name")
    private final String name;
    @SerializedName("teamIconUrl")
    private final String teamIconUrl;
    @SerializedName("updatedAt")
    private final String updatedAt;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersModel.kt */
    public static final class Creator implements Parcelable.Creator<Team> {
        public final Team createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new Team(readString, readString2, readString3, readString4, readString5, z2, z, parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final Team[] newArray(int i) {
            return new Team[i];
        }
    }

    public static /* synthetic */ Team copy$default(Team team, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, int i, int i2, Object obj) {
        Team team2 = team;
        int i3 = i2;
        return team.copy((i3 & 1) != 0 ? team2._id : str, (i3 & 2) != 0 ? team2.name : str2, (i3 & 4) != 0 ? team2.code : str3, (i3 & 8) != 0 ? team2.countryCode : str4, (i3 & 16) != 0 ? team2.teamIconUrl : str5, (i3 & 32) != 0 ? team2.isBlocked : z, (i3 & 64) != 0 ? team2.isDeleted : z2, (i3 & 128) != 0 ? team2.createdAt : str6, (i3 & 256) != 0 ? team2.updatedAt : str7, (i3 & 512) != 0 ? team2.__v : i);
    }

    public final String component1() {
        return this._id;
    }

    public final int component10() {
        return this.__v;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.countryCode;
    }

    public final String component5() {
        return this.teamIconUrl;
    }

    public final boolean component6() {
        return this.isBlocked;
    }

    public final boolean component7() {
        return this.isDeleted;
    }

    public final String component8() {
        return this.createdAt;
    }

    public final String component9() {
        return this.updatedAt;
    }

    public final Team copy(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, int i) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "code");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "countryCode");
        String str9 = str5;
        Intrinsics.checkNotNullParameter(str9, "teamIconUrl");
        String str10 = str6;
        Intrinsics.checkNotNullParameter(str10, "createdAt");
        String str11 = str7;
        Intrinsics.checkNotNullParameter(str11, "updatedAt");
        return new Team(str, str2, str3, str8, str9, z, z2, str10, str11, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team)) {
            return false;
        }
        Team team = (Team) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) team._id) && Intrinsics.areEqual((Object) this.name, (Object) team.name) && Intrinsics.areEqual((Object) this.code, (Object) team.code) && Intrinsics.areEqual((Object) this.countryCode, (Object) team.countryCode) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) team.teamIconUrl) && this.isBlocked == team.isBlocked && this.isDeleted == team.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) team.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) team.updatedAt) && this.__v == team.__v;
    }

    public int hashCode() {
        int hashCode = ((((((((this._id.hashCode() * 31) + this.name.hashCode()) * 31) + this.code.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.teamIconUrl.hashCode()) * 31;
        boolean z = this.isBlocked;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isDeleted;
        if (!z3) {
            z2 = z3;
        }
        return ((((((i + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v;
    }

    public String toString() {
        return "Team(_id=" + this._id + ", name=" + this.name + ", code=" + this.code + ", countryCode=" + this.countryCode + ", teamIconUrl=" + this.teamIconUrl + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.name);
        parcel.writeString(this.code);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.teamIconUrl);
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
    }

    public Team(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, String str7, int i) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "countryCode");
        Intrinsics.checkNotNullParameter(str5, "teamIconUrl");
        Intrinsics.checkNotNullParameter(str6, "createdAt");
        Intrinsics.checkNotNullParameter(str7, "updatedAt");
        this._id = str;
        this.name = str2;
        this.code = str3;
        this.countryCode = str4;
        this.teamIconUrl = str5;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.createdAt = str6;
        this.updatedAt = str7;
        this.__v = i;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getTeamIconUrl() {
        return this.teamIconUrl;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int get__v() {
        return this.__v;
    }
}
