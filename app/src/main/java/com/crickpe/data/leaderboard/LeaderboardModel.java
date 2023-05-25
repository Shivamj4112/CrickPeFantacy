package com.crickpe.data.leaderboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B]\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0002\u0010\u0014J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0004HÆ\u0003J\t\u0010+\u001a\u00020\u0004HÆ\u0003J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\rHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\u0010HÆ\u0003Jw\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0004HÆ\u0001J\t\u00102\u001a\u00020\rHÖ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\rHÖ\u0001J\b\u00108\u001a\u00020\u0004H\u0016J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 ¨\u0006>"}, mo48222d2 = {"Lcom/crickpe/data/leaderboard/LeaderboardModel;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "_id", "", "totalFantasyPoint", "", "id", "name", "rank", "amount", "", "sequence", "", "userType", "playerInfo", "Lcom/crickpe/data/leaderboard/PlayerInfo;", "userInfo", "Lcom/crickpe/data/leaderboard/UserInfo;", "fantasyTeamId", "(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DIILcom/crickpe/data/leaderboard/PlayerInfo;Lcom/crickpe/data/leaderboard/UserInfo;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getAmount", "()D", "getFantasyTeamId", "getId", "getName", "getPlayerInfo", "()Lcom/crickpe/data/leaderboard/PlayerInfo;", "getRank", "getSequence", "()I", "getTotalFantasyPoint", "()F", "getUserInfo", "()Lcom/crickpe/data/leaderboard/UserInfo;", "getUserType", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LeaderboardModel.kt */
public final class LeaderboardModel extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<LeaderboardModel> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("amount")
    private final double amount;
    @SerializedName("fantasyTeamId")
    private final String fantasyTeamId;
    @SerializedName("id")

    /* renamed from: id */
    private final String f455id;
    @SerializedName("name")
    private final String name;
    @SerializedName("playerInfo")
    private final PlayerInfo playerInfo;
    @SerializedName("rank")
    private final String rank;
    @SerializedName("sequence")
    private final int sequence;
    @SerializedName("totalFantasyPoint")
    private final float totalFantasyPoint;
    @SerializedName("userInfo")
    private final UserInfo userInfo;
    @SerializedName("userType")
    private final int userType;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LeaderboardModel.kt */
    public static final class Creator implements Parcelable.Creator<LeaderboardModel> {
        public final LeaderboardModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LeaderboardModel(parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), PlayerInfo.CREATOR.createFromParcel(parcel), UserInfo.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        public final LeaderboardModel[] newArray(int i) {
            return new LeaderboardModel[i];
        }
    }

    public static /* synthetic */ LeaderboardModel copy$default(LeaderboardModel leaderboardModel, String str, float f, String str2, String str3, String str4, double d, int i, int i2, PlayerInfo playerInfo2, UserInfo userInfo2, String str5, int i3, Object obj) {
        LeaderboardModel leaderboardModel2 = leaderboardModel;
        int i4 = i3;
        return leaderboardModel.copy((i4 & 1) != 0 ? leaderboardModel2._id : str, (i4 & 2) != 0 ? leaderboardModel2.totalFantasyPoint : f, (i4 & 4) != 0 ? leaderboardModel2.f455id : str2, (i4 & 8) != 0 ? leaderboardModel2.name : str3, (i4 & 16) != 0 ? leaderboardModel2.rank : str4, (i4 & 32) != 0 ? leaderboardModel2.amount : d, (i4 & 64) != 0 ? leaderboardModel2.sequence : i, (i4 & 128) != 0 ? leaderboardModel2.userType : i2, (i4 & 256) != 0 ? leaderboardModel2.playerInfo : playerInfo2, (i4 & 512) != 0 ? leaderboardModel2.userInfo : userInfo2, (i4 & 1024) != 0 ? leaderboardModel2.fantasyTeamId : str5);
    }

    public final String component1() {
        return this._id;
    }

    public final UserInfo component10() {
        return this.userInfo;
    }

    public final String component11() {
        return this.fantasyTeamId;
    }

    public final float component2() {
        return this.totalFantasyPoint;
    }

    public final String component3() {
        return this.f455id;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.rank;
    }

    public final double component6() {
        return this.amount;
    }

    public final int component7() {
        return this.sequence;
    }

    public final int component8() {
        return this.userType;
    }

    public final PlayerInfo component9() {
        return this.playerInfo;
    }

    public final LeaderboardModel copy(String str, float f, String str2, String str3, String str4, double d, int i, int i2, PlayerInfo playerInfo2, UserInfo userInfo2, String str5) {
        Intrinsics.checkNotNullParameter(str, "_id");
        String str6 = str2;
        Intrinsics.checkNotNullParameter(str6, CommonProperties.f597ID);
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "name");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "rank");
        PlayerInfo playerInfo3 = playerInfo2;
        Intrinsics.checkNotNullParameter(playerInfo3, "playerInfo");
        UserInfo userInfo3 = userInfo2;
        Intrinsics.checkNotNullParameter(userInfo3, "userInfo");
        String str9 = str5;
        Intrinsics.checkNotNullParameter(str9, "fantasyTeamId");
        return new LeaderboardModel(str, f, str6, str7, str8, d, i, i2, playerInfo3, userInfo3, str9);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaderboardModel)) {
            return false;
        }
        LeaderboardModel leaderboardModel = (LeaderboardModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) leaderboardModel._id) && Intrinsics.areEqual((Object) Float.valueOf(this.totalFantasyPoint), (Object) Float.valueOf(leaderboardModel.totalFantasyPoint)) && Intrinsics.areEqual((Object) this.f455id, (Object) leaderboardModel.f455id) && Intrinsics.areEqual((Object) this.name, (Object) leaderboardModel.name) && Intrinsics.areEqual((Object) this.rank, (Object) leaderboardModel.rank) && Intrinsics.areEqual((Object) Double.valueOf(this.amount), (Object) Double.valueOf(leaderboardModel.amount)) && this.sequence == leaderboardModel.sequence && this.userType == leaderboardModel.userType && Intrinsics.areEqual((Object) this.playerInfo, (Object) leaderboardModel.playerInfo) && Intrinsics.areEqual((Object) this.userInfo, (Object) leaderboardModel.userInfo) && Intrinsics.areEqual((Object) this.fantasyTeamId, (Object) leaderboardModel.fantasyTeamId);
    }

    public int hashCode() {
        return (((((((((((((((((((this._id.hashCode() * 31) + Float.floatToIntBits(this.totalFantasyPoint)) * 31) + this.f455id.hashCode()) * 31) + this.name.hashCode()) * 31) + this.rank.hashCode()) * 31) + Double.doubleToLongBits(this.amount)) * 31) + this.sequence) * 31) + this.userType) * 31) + this.playerInfo.hashCode()) * 31) + this.userInfo.hashCode()) * 31) + this.fantasyTeamId.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeFloat(this.totalFantasyPoint);
        parcel.writeString(this.f455id);
        parcel.writeString(this.name);
        parcel.writeString(this.rank);
        parcel.writeDouble(this.amount);
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.userType);
        this.playerInfo.writeToParcel(parcel, i);
        this.userInfo.writeToParcel(parcel, i);
        parcel.writeString(this.fantasyTeamId);
    }

    public final String get_id() {
        return this._id;
    }

    public final float getTotalFantasyPoint() {
        return this.totalFantasyPoint;
    }

    public final String getId() {
        return this.f455id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRank() {
        return this.rank;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final int getUserType() {
        return this.userType;
    }

    public final PlayerInfo getPlayerInfo() {
        return this.playerInfo;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public LeaderboardModel(String str, float f, String str2, String str3, String str4, double d, int i, int i2, PlayerInfo playerInfo2, UserInfo userInfo2, String str5) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, CommonProperties.f597ID);
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "rank");
        Intrinsics.checkNotNullParameter(playerInfo2, "playerInfo");
        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
        Intrinsics.checkNotNullParameter(str5, "fantasyTeamId");
        this._id = str;
        this.totalFantasyPoint = f;
        this.f455id = str2;
        this.name = str3;
        this.rank = str4;
        this.amount = d;
        this.sequence = i;
        this.userType = i2;
        this.playerInfo = playerInfo2;
        this.userInfo = userInfo2;
        this.fantasyTeamId = str5;
    }

    public String toString() {
        String str = '#' + this.rank;
        return str == null ? "" : str;
    }
}
