package com.crickpe.view.detail.fragments.my_matches_detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.Bowling_style;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0002\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0015HÆ\u0003J\t\u0010:\u001a\u00020\u0015HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\bHÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010?\u001a\u00020\bHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\bHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\u000f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010G\u001a\u00020\u000fHÆ\u0003JÙ\u0001\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\b2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u001b\u001a\u00020\bHÆ\u0001J\t\u0010I\u001a\u00020\bHÖ\u0001J\u0013\u0010J\u001a\u00020\u00152\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\bHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\u0019\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0019\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010'R\u0016\u0010\u0016\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010'R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0016\u0010\u001b\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001eR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 ¨\u0006T"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/Player;", "Landroid/os/Parcelable;", "_id", "", "key", "jersey_name", "legal_name", "gender", "", "nationality", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Nationality;", "seasonalRole", "roles", "", "bowling_style", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Bowling_style;", "skills", "totalEarning", "creditPoints", "", "isBlocked", "", "isDeleted", "createdAt", "updatedAt", "__v", "teams", "totalRewardEarning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/crickpe/view/detail/fragments/my_matches_detail/Nationality;Ljava/lang/String;Ljava/util/List;Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Bowling_style;Ljava/util/List;IDZZLjava/lang/String;Ljava/lang/String;ILjava/util/List;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getBowling_style", "()Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Bowling_style;", "getCreatedAt", "getCreditPoints", "()D", "getGender", "()Z", "getJersey_name", "getKey", "getLegal_name", "getNationality", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/Nationality;", "getRoles", "()Ljava/util/List;", "getSeasonalRole", "getSkills", "getTeams", "getTotalEarning", "getTotalRewardEarning", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersPotModel.kt */
public final class Player implements Parcelable {
    public static final Parcelable.Creator<Player> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("bowling_style")
    private final Bowling_style bowling_style;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("creditPoints")
    private final double creditPoints;
    @SerializedName("gender")
    private final int gender;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("jersey_name")
    private final String jersey_name;
    @SerializedName("key")
    private final String key;
    @SerializedName("legal_name")
    private final String legal_name;
    @SerializedName("nationality")
    private final Nationality nationality;
    @SerializedName("roles")
    private final List<String> roles;
    @SerializedName("seasonalRole")
    private final String seasonalRole;
    @SerializedName("skills")
    private final List<String> skills;
    @SerializedName("teams")
    private final List<String> teams;
    @SerializedName("totalEarning")
    private final int totalEarning;
    @SerializedName("totalRewardEarning")
    private final int totalRewardEarning;
    @SerializedName("updatedAt")
    private final String updatedAt;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersPotModel.kt */
    public static final class Creator implements Parcelable.Creator<Player> {
        public final Player createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt = parcel.readInt();
            Nationality createFromParcel = Nationality.CREATOR.createFromParcel(parcel2);
            String readString5 = parcel.readString();
            List createStringArrayList = parcel.createStringArrayList();
            Bowling_style createFromParcel2 = Bowling_style.CREATOR.createFromParcel(parcel2);
            List createStringArrayList2 = parcel.createStringArrayList();
            int readInt2 = parcel.readInt();
            double readDouble = parcel.readDouble();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new Player(readString, readString2, readString3, readString4, readInt, createFromParcel, readString5, createStringArrayList, createFromParcel2, createStringArrayList2, readInt2, readDouble, z2, z, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.createStringArrayList(), parcel.readInt());
        }

        public final Player[] newArray(int i) {
            return new Player[i];
        }
    }

    public static /* synthetic */ Player copy$default(Player player, String str, String str2, String str3, String str4, int i, Nationality nationality2, String str5, List list, Bowling_style bowling_style2, List list2, int i2, double d, boolean z, boolean z2, String str6, String str7, int i3, List list3, int i4, int i5, Object obj) {
        Player player2 = player;
        int i6 = i5;
        return player.copy((i6 & 1) != 0 ? player2._id : str, (i6 & 2) != 0 ? player2.key : str2, (i6 & 4) != 0 ? player2.jersey_name : str3, (i6 & 8) != 0 ? player2.legal_name : str4, (i6 & 16) != 0 ? player2.gender : i, (i6 & 32) != 0 ? player2.nationality : nationality2, (i6 & 64) != 0 ? player2.seasonalRole : str5, (i6 & 128) != 0 ? player2.roles : list, (i6 & 256) != 0 ? player2.bowling_style : bowling_style2, (i6 & 512) != 0 ? player2.skills : list2, (i6 & 1024) != 0 ? player2.totalEarning : i2, (i6 & 2048) != 0 ? player2.creditPoints : d, (i6 & 4096) != 0 ? player2.isBlocked : z, (i6 & 8192) != 0 ? player2.isDeleted : z2, (i6 & 16384) != 0 ? player2.createdAt : str6, (i6 & 32768) != 0 ? player2.updatedAt : str7, (i6 & 65536) != 0 ? player2.__v : i3, (i6 & 131072) != 0 ? player2.teams : list3, (i6 & 262144) != 0 ? player2.totalRewardEarning : i4);
    }

    public final String component1() {
        return this._id;
    }

    public final List<String> component10() {
        return this.skills;
    }

    public final int component11() {
        return this.totalEarning;
    }

    public final double component12() {
        return this.creditPoints;
    }

    public final boolean component13() {
        return this.isBlocked;
    }

    public final boolean component14() {
        return this.isDeleted;
    }

    public final String component15() {
        return this.createdAt;
    }

    public final String component16() {
        return this.updatedAt;
    }

    public final int component17() {
        return this.__v;
    }

    public final List<String> component18() {
        return this.teams;
    }

    public final int component19() {
        return this.totalRewardEarning;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.jersey_name;
    }

    public final String component4() {
        return this.legal_name;
    }

    public final int component5() {
        return this.gender;
    }

    public final Nationality component6() {
        return this.nationality;
    }

    public final String component7() {
        return this.seasonalRole;
    }

    public final List<String> component8() {
        return this.roles;
    }

    public final Bowling_style component9() {
        return this.bowling_style;
    }

    public final Player copy(String str, String str2, String str3, String str4, int i, Nationality nationality2, String str5, List<String> list, Bowling_style bowling_style2, List<String> list2, int i2, double d, boolean z, boolean z2, String str6, String str7, int i3, List<String> list3, int i4) {
        String str8 = str;
        Intrinsics.checkNotNullParameter(str8, "_id");
        Intrinsics.checkNotNullParameter(str2, "key");
        Intrinsics.checkNotNullParameter(str3, "jersey_name");
        Intrinsics.checkNotNullParameter(str4, "legal_name");
        Intrinsics.checkNotNullParameter(nationality2, "nationality");
        Intrinsics.checkNotNullParameter(str5, "seasonalRole");
        Intrinsics.checkNotNullParameter(list, "roles");
        Intrinsics.checkNotNullParameter(bowling_style2, "bowling_style");
        Intrinsics.checkNotNullParameter(list2, "skills");
        Intrinsics.checkNotNullParameter(str6, "createdAt");
        Intrinsics.checkNotNullParameter(str7, "updatedAt");
        Intrinsics.checkNotNullParameter(list3, "teams");
        return new Player(str8, str2, str3, str4, i, nationality2, str5, list, bowling_style2, list2, i2, d, z, z2, str6, str7, i3, list3, i4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Player)) {
            return false;
        }
        Player player = (Player) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) player._id) && Intrinsics.areEqual((Object) this.key, (Object) player.key) && Intrinsics.areEqual((Object) this.jersey_name, (Object) player.jersey_name) && Intrinsics.areEqual((Object) this.legal_name, (Object) player.legal_name) && this.gender == player.gender && Intrinsics.areEqual((Object) this.nationality, (Object) player.nationality) && Intrinsics.areEqual((Object) this.seasonalRole, (Object) player.seasonalRole) && Intrinsics.areEqual((Object) this.roles, (Object) player.roles) && Intrinsics.areEqual((Object) this.bowling_style, (Object) player.bowling_style) && Intrinsics.areEqual((Object) this.skills, (Object) player.skills) && this.totalEarning == player.totalEarning && Intrinsics.areEqual((Object) Double.valueOf(this.creditPoints), (Object) Double.valueOf(player.creditPoints)) && this.isBlocked == player.isBlocked && this.isDeleted == player.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) player.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) player.updatedAt) && this.__v == player.__v && Intrinsics.areEqual((Object) this.teams, (Object) player.teams) && this.totalRewardEarning == player.totalRewardEarning;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((this._id.hashCode() * 31) + this.key.hashCode()) * 31) + this.jersey_name.hashCode()) * 31) + this.legal_name.hashCode()) * 31) + this.gender) * 31) + this.nationality.hashCode()) * 31) + this.seasonalRole.hashCode()) * 31) + this.roles.hashCode()) * 31) + this.bowling_style.hashCode()) * 31) + this.skills.hashCode()) * 31) + this.totalEarning) * 31) + Double.doubleToLongBits(this.creditPoints)) * 31;
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
        return ((((((((((i + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.teams.hashCode()) * 31) + this.totalRewardEarning;
    }

    public String toString() {
        return "Player(_id=" + this._id + ", key=" + this.key + ", jersey_name=" + this.jersey_name + ", legal_name=" + this.legal_name + ", gender=" + this.gender + ", nationality=" + this.nationality + ", seasonalRole=" + this.seasonalRole + ", roles=" + this.roles + ", bowling_style=" + this.bowling_style + ", skills=" + this.skills + ", totalEarning=" + this.totalEarning + ", creditPoints=" + this.creditPoints + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", teams=" + this.teams + ", totalRewardEarning=" + this.totalRewardEarning + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.key);
        parcel.writeString(this.jersey_name);
        parcel.writeString(this.legal_name);
        parcel.writeInt(this.gender);
        this.nationality.writeToParcel(parcel, i);
        parcel.writeString(this.seasonalRole);
        parcel.writeStringList(this.roles);
        this.bowling_style.writeToParcel(parcel, i);
        parcel.writeStringList(this.skills);
        parcel.writeInt(this.totalEarning);
        parcel.writeDouble(this.creditPoints);
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
        parcel.writeStringList(this.teams);
        parcel.writeInt(this.totalRewardEarning);
    }

    public Player(String str, String str2, String str3, String str4, int i, Nationality nationality2, String str5, List<String> list, Bowling_style bowling_style2, List<String> list2, int i2, double d, boolean z, boolean z2, String str6, String str7, int i3, List<String> list3, int i4) {
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        Nationality nationality3 = nationality2;
        String str11 = str5;
        List<String> list4 = list;
        Bowling_style bowling_style3 = bowling_style2;
        List<String> list5 = list2;
        String str12 = str6;
        String str13 = str7;
        List<String> list6 = list3;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str8, "key");
        Intrinsics.checkNotNullParameter(str9, "jersey_name");
        Intrinsics.checkNotNullParameter(str10, "legal_name");
        Intrinsics.checkNotNullParameter(nationality3, "nationality");
        Intrinsics.checkNotNullParameter(str11, "seasonalRole");
        Intrinsics.checkNotNullParameter(list4, "roles");
        Intrinsics.checkNotNullParameter(bowling_style3, "bowling_style");
        Intrinsics.checkNotNullParameter(list5, "skills");
        Intrinsics.checkNotNullParameter(str12, "createdAt");
        Intrinsics.checkNotNullParameter(str13, "updatedAt");
        Intrinsics.checkNotNullParameter(list6, "teams");
        this._id = str;
        this.key = str8;
        this.jersey_name = str9;
        this.legal_name = str10;
        this.gender = i;
        this.nationality = nationality3;
        this.seasonalRole = str11;
        this.roles = list4;
        this.bowling_style = bowling_style3;
        this.skills = list5;
        this.totalEarning = i2;
        this.creditPoints = d;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.createdAt = str12;
        this.updatedAt = str13;
        this.__v = i3;
        this.teams = list6;
        this.totalRewardEarning = i4;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getJersey_name() {
        return this.jersey_name;
    }

    public final String getLegal_name() {
        return this.legal_name;
    }

    public final int getGender() {
        return this.gender;
    }

    public final Nationality getNationality() {
        return this.nationality;
    }

    public final String getSeasonalRole() {
        return this.seasonalRole;
    }

    public final List<String> getRoles() {
        return this.roles;
    }

    public final Bowling_style getBowling_style() {
        return this.bowling_style;
    }

    public final List<String> getSkills() {
        return this.skills;
    }

    public final int getTotalEarning() {
        return this.totalEarning;
    }

    public final double getCreditPoints() {
        return this.creditPoints;
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

    public final List<String> getTeams() {
        return this.teams;
    }

    public final int getTotalRewardEarning() {
        return this.totalRewardEarning;
    }
}
