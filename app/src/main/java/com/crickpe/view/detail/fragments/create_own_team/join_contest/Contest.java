package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BÅ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0002\u0010!J\t\u0010<\u001a\u00020\u0004HÆ\u0003J\t\u0010=\u001a\u00020\u0011HÆ\u0003J\t\u0010>\u001a\u00020\u000fHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u0011HÆ\u0003J\t\u0010A\u001a\u00020\u0011HÆ\u0003J\t\u0010B\u001a\u00020\u0011HÆ\u0003J\t\u0010C\u001a\u00020\u0011HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u000bHÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u000bHÆ\u0003J\t\u0010K\u001a\u00020\u001fHÆ\u0003J\t\u0010L\u001a\u00020\u001fHÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u0006HÆ\u0003J\t\u0010O\u001a\u00020\u0006HÆ\u0003J\t\u0010P\u001a\u00020\u000bHÆ\u0003J\t\u0010Q\u001a\u00020\u000bHÆ\u0003J\t\u0010R\u001a\u00020\u000bHÆ\u0003J\t\u0010S\u001a\u00020\u000fHÆ\u0003Jù\u0001\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u001fHÆ\u0001J\t\u0010U\u001a\u00020\u000bHÖ\u0001J\u0013\u0010V\u001a\u00020\u00112\b\u0010W\u001a\u0004\u0018\u00010XHÖ\u0003J\t\u0010Y\u001a\u00020\u000bHÖ\u0001J\t\u0010Z\u001a\u00020\u0006HÖ\u0001J\u0019\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u001d\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0019\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0016\u0010\u001b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0016\u0010\u001a\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0016\u0010\u0013\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0016\u0010\u0015\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010'R\u0016\u0010\u0016\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010'R\u0016\u0010\u0014\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010'R\u0016\u0010\u0017\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010'R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010%R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0016\u0010\u0018\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0016\u0010\u001c\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0016\u0010\u001e\u001a\u00020\u001f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0016\u0010 \u001a\u00020\u001f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00107R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u0012\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:¨\u0006`"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "contestType", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestType;", "_id", "", "matchId", "createdBy", "name", "totalSpots", "", "joinedUserCount", "entryFee", "winningAmount", "", "canJoinContest", "", "winningPercentage", "firstWinnerAmount", "isGuaranteed", "isBlocked", "isDeleted", "isMultipleTeam", "referalCode", "contestUrl", "createdByType", "createdAt", "updatedAt", "__v", "user", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Users;", "users", "(Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIFZFIZZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILcom/crickpe/view/detail/fragments/create_own_team/join_contest/Users;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Users;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getCanJoinContest", "()Z", "getContestType", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestType;", "getContestUrl", "getCreatedAt", "getCreatedBy", "getCreatedByType", "getEntryFee", "getFirstWinnerAmount", "getJoinedUserCount", "getMatchId", "getName", "getReferalCode", "getTotalSpots", "getUpdatedAt", "getUser", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Users;", "getUsers", "getWinningAmount", "()F", "getWinningPercentage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailModel.kt */
public final class Contest extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<Contest> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("canJoinContest")
    private final boolean canJoinContest;
    @SerializedName("contestType")
    private final ContestType contestType;
    @SerializedName("contestUrl")
    private final String contestUrl;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("createdBy")
    private final String createdBy;
    @SerializedName("createdByType")
    private final int createdByType;
    @SerializedName("entryFee")
    private final int entryFee;
    @SerializedName("firstWinnerAmount")
    private final int firstWinnerAmount;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("isGuaranteed")
    private final boolean isGuaranteed;
    @SerializedName("isMultipleTeam")
    private final boolean isMultipleTeam;
    @SerializedName("joinedUserCount")
    private final int joinedUserCount;
    @SerializedName("matchId")
    private final String matchId;
    @SerializedName("name")
    private final String name;
    @SerializedName("referalCode")
    private final String referalCode;
    @SerializedName("totalSpots")
    private final int totalSpots;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("user")
    private final Users user;
    @SerializedName("users")
    private final Users users;
    @SerializedName("winningAmount")
    private final float winningAmount;
    @SerializedName("winningPercentage")
    private final float winningPercentage;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestDetailModel.kt */
    public static final class Creator implements Parcelable.Creator<Contest> {
        public final Contest createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            return new Contest(ContestType.CREATOR.createFromParcel(parcel2), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0, parcel.readFloat(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), Users.CREATOR.createFromParcel(parcel2), Users.CREATOR.createFromParcel(parcel2));
        }

        public final Contest[] newArray(int i) {
            return new Contest[i];
        }
    }

    public static /* synthetic */ Contest copy$default(Contest contest, ContestType contestType2, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, boolean z, float f2, int i4, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, int i5, String str7, String str8, int i6, Users users2, Users users3, int i7, Object obj) {
        Contest contest2 = contest;
        int i8 = i7;
        return contest.copy((i8 & 1) != 0 ? contest2.contestType : contestType2, (i8 & 2) != 0 ? contest2._id : str, (i8 & 4) != 0 ? contest2.matchId : str2, (i8 & 8) != 0 ? contest2.createdBy : str3, (i8 & 16) != 0 ? contest2.name : str4, (i8 & 32) != 0 ? contest2.totalSpots : i, (i8 & 64) != 0 ? contest2.joinedUserCount : i2, (i8 & 128) != 0 ? contest2.entryFee : i3, (i8 & 256) != 0 ? contest2.winningAmount : f, (i8 & 512) != 0 ? contest2.canJoinContest : z, (i8 & 1024) != 0 ? contest2.winningPercentage : f2, (i8 & 2048) != 0 ? contest2.firstWinnerAmount : i4, (i8 & 4096) != 0 ? contest2.isGuaranteed : z2, (i8 & 8192) != 0 ? contest2.isBlocked : z3, (i8 & 16384) != 0 ? contest2.isDeleted : z4, (i8 & 32768) != 0 ? contest2.isMultipleTeam : z5, (i8 & 65536) != 0 ? contest2.referalCode : str5, (i8 & 131072) != 0 ? contest2.contestUrl : str6, (i8 & 262144) != 0 ? contest2.createdByType : i5, (i8 & 524288) != 0 ? contest2.createdAt : str7, (i8 & 1048576) != 0 ? contest2.updatedAt : str8, (i8 & 2097152) != 0 ? contest2.__v : i6, (i8 & 4194304) != 0 ? contest2.user : users2, (i8 & 8388608) != 0 ? contest2.users : users3);
    }

    public final ContestType component1() {
        return this.contestType;
    }

    public final boolean component10() {
        return this.canJoinContest;
    }

    public final float component11() {
        return this.winningPercentage;
    }

    public final int component12() {
        return this.firstWinnerAmount;
    }

    public final boolean component13() {
        return this.isGuaranteed;
    }

    public final boolean component14() {
        return this.isBlocked;
    }

    public final boolean component15() {
        return this.isDeleted;
    }

    public final boolean component16() {
        return this.isMultipleTeam;
    }

    public final String component17() {
        return this.referalCode;
    }

    public final String component18() {
        return this.contestUrl;
    }

    public final int component19() {
        return this.createdByType;
    }

    public final String component2() {
        return this._id;
    }

    public final String component20() {
        return this.createdAt;
    }

    public final String component21() {
        return this.updatedAt;
    }

    public final int component22() {
        return this.__v;
    }

    public final Users component23() {
        return this.user;
    }

    public final Users component24() {
        return this.users;
    }

    public final String component3() {
        return this.matchId;
    }

    public final String component4() {
        return this.createdBy;
    }

    public final String component5() {
        return this.name;
    }

    public final int component6() {
        return this.totalSpots;
    }

    public final int component7() {
        return this.joinedUserCount;
    }

    public final int component8() {
        return this.entryFee;
    }

    public final float component9() {
        return this.winningAmount;
    }

    public final Contest copy(ContestType contestType2, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, boolean z, float f2, int i4, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, int i5, String str7, String str8, int i6, Users users2, Users users3) {
        ContestType contestType3 = contestType2;
        Intrinsics.checkNotNullParameter(contestType3, "contestType");
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(str3, "createdBy");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "referalCode");
        Intrinsics.checkNotNullParameter(str6, "contestUrl");
        Intrinsics.checkNotNullParameter(str7, "createdAt");
        Intrinsics.checkNotNullParameter(str8, "updatedAt");
        Intrinsics.checkNotNullParameter(users2, "user");
        Intrinsics.checkNotNullParameter(users3, "users");
        return new Contest(contestType3, str, str2, str3, str4, i, i2, i3, f, z, f2, i4, z2, z3, z4, z5, str5, str6, i5, str7, str8, i6, users2, users3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contest)) {
            return false;
        }
        Contest contest = (Contest) obj;
        return Intrinsics.areEqual((Object) this.contestType, (Object) contest.contestType) && Intrinsics.areEqual((Object) this._id, (Object) contest._id) && Intrinsics.areEqual((Object) this.matchId, (Object) contest.matchId) && Intrinsics.areEqual((Object) this.createdBy, (Object) contest.createdBy) && Intrinsics.areEqual((Object) this.name, (Object) contest.name) && this.totalSpots == contest.totalSpots && this.joinedUserCount == contest.joinedUserCount && this.entryFee == contest.entryFee && Intrinsics.areEqual((Object) Float.valueOf(this.winningAmount), (Object) Float.valueOf(contest.winningAmount)) && this.canJoinContest == contest.canJoinContest && Intrinsics.areEqual((Object) Float.valueOf(this.winningPercentage), (Object) Float.valueOf(contest.winningPercentage)) && this.firstWinnerAmount == contest.firstWinnerAmount && this.isGuaranteed == contest.isGuaranteed && this.isBlocked == contest.isBlocked && this.isDeleted == contest.isDeleted && this.isMultipleTeam == contest.isMultipleTeam && Intrinsics.areEqual((Object) this.referalCode, (Object) contest.referalCode) && Intrinsics.areEqual((Object) this.contestUrl, (Object) contest.contestUrl) && this.createdByType == contest.createdByType && Intrinsics.areEqual((Object) this.createdAt, (Object) contest.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) contest.updatedAt) && this.__v == contest.__v && Intrinsics.areEqual((Object) this.user, (Object) contest.user) && Intrinsics.areEqual((Object) this.users, (Object) contest.users);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.contestType.hashCode() * 31) + this._id.hashCode()) * 31) + this.matchId.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.name.hashCode()) * 31) + this.totalSpots) * 31) + this.joinedUserCount) * 31) + this.entryFee) * 31) + Float.floatToIntBits(this.winningAmount)) * 31;
        boolean z = this.canJoinContest;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int floatToIntBits = (((((hashCode + (z ? 1 : 0)) * 31) + Float.floatToIntBits(this.winningPercentage)) * 31) + this.firstWinnerAmount) * 31;
        boolean z3 = this.isGuaranteed;
        if (z3) {
            z3 = true;
        }
        int i = (floatToIntBits + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isBlocked;
        if (z4) {
            z4 = true;
        }
        int i2 = (i + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isDeleted;
        if (z5) {
            z5 = true;
        }
        int i3 = (i2 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.isMultipleTeam;
        if (!z6) {
            z2 = z6;
        }
        return ((((((((((((((((i3 + (z2 ? 1 : 0)) * 31) + this.referalCode.hashCode()) * 31) + this.contestUrl.hashCode()) * 31) + this.createdByType) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.user.hashCode()) * 31) + this.users.hashCode();
    }

    public String toString() {
        return "Contest(contestType=" + this.contestType + ", _id=" + this._id + ", matchId=" + this.matchId + ", createdBy=" + this.createdBy + ", name=" + this.name + ", totalSpots=" + this.totalSpots + ", joinedUserCount=" + this.joinedUserCount + ", entryFee=" + this.entryFee + ", winningAmount=" + this.winningAmount + ", canJoinContest=" + this.canJoinContest + ", winningPercentage=" + this.winningPercentage + ", firstWinnerAmount=" + this.firstWinnerAmount + ", isGuaranteed=" + this.isGuaranteed + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", isMultipleTeam=" + this.isMultipleTeam + ", referalCode=" + this.referalCode + ", contestUrl=" + this.contestUrl + ", createdByType=" + this.createdByType + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", user=" + this.user + ", users=" + this.users + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.contestType.writeToParcel(parcel, i);
        parcel.writeString(this._id);
        parcel.writeString(this.matchId);
        parcel.writeString(this.createdBy);
        parcel.writeString(this.name);
        parcel.writeInt(this.totalSpots);
        parcel.writeInt(this.joinedUserCount);
        parcel.writeInt(this.entryFee);
        parcel.writeFloat(this.winningAmount);
        parcel.writeInt(this.canJoinContest ? 1 : 0);
        parcel.writeFloat(this.winningPercentage);
        parcel.writeInt(this.firstWinnerAmount);
        parcel.writeInt(this.isGuaranteed ? 1 : 0);
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeInt(this.isMultipleTeam ? 1 : 0);
        parcel.writeString(this.referalCode);
        parcel.writeString(this.contestUrl);
        parcel.writeInt(this.createdByType);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
        this.user.writeToParcel(parcel, i);
        this.users.writeToParcel(parcel, i);
    }

    public final ContestType getContestType() {
        return this.contestType;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTotalSpots() {
        return this.totalSpots;
    }

    public final int getJoinedUserCount() {
        return this.joinedUserCount;
    }

    public final int getEntryFee() {
        return this.entryFee;
    }

    public final float getWinningAmount() {
        return this.winningAmount;
    }

    public final boolean getCanJoinContest() {
        return this.canJoinContest;
    }

    public final float getWinningPercentage() {
        return this.winningPercentage;
    }

    public final int getFirstWinnerAmount() {
        return this.firstWinnerAmount;
    }

    public final boolean isGuaranteed() {
        return this.isGuaranteed;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isMultipleTeam() {
        return this.isMultipleTeam;
    }

    public final String getReferalCode() {
        return this.referalCode;
    }

    public final String getContestUrl() {
        return this.contestUrl;
    }

    public final int getCreatedByType() {
        return this.createdByType;
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

    public final Users getUser() {
        return this.user;
    }

    public final Users getUsers() {
        return this.users;
    }

    public Contest(ContestType contestType2, String str, String str2, String str3, String str4, int i, int i2, int i3, float f, boolean z, float f2, int i4, boolean z2, boolean z3, boolean z4, boolean z5, String str5, String str6, int i5, String str7, String str8, int i6, Users users2, Users users3) {
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        Users users4 = users2;
        Users users5 = users3;
        Intrinsics.checkNotNullParameter(contestType2, "contestType");
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str9, "matchId");
        Intrinsics.checkNotNullParameter(str10, "createdBy");
        Intrinsics.checkNotNullParameter(str11, "name");
        Intrinsics.checkNotNullParameter(str12, "referalCode");
        Intrinsics.checkNotNullParameter(str13, "contestUrl");
        Intrinsics.checkNotNullParameter(str14, "createdAt");
        Intrinsics.checkNotNullParameter(str15, "updatedAt");
        Intrinsics.checkNotNullParameter(users4, "user");
        Intrinsics.checkNotNullParameter(users5, "users");
        this.contestType = contestType2;
        this._id = str;
        this.matchId = str9;
        this.createdBy = str10;
        this.name = str11;
        this.totalSpots = i;
        this.joinedUserCount = i2;
        this.entryFee = i3;
        this.winningAmount = f;
        this.canJoinContest = z;
        this.winningPercentage = f2;
        this.firstWinnerAmount = i4;
        this.isGuaranteed = z2;
        this.isBlocked = z3;
        this.isDeleted = z4;
        this.isMultipleTeam = z5;
        this.referalCode = str12;
        this.contestUrl = str13;
        this.createdByType = i5;
        this.createdAt = str14;
        this.updatedAt = str15;
        this.__v = i6;
        this.user = users4;
        this.users = users5;
    }
}
