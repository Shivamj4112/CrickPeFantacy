package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.crickpe.view.intro.fragments.User;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B½\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` \u0012\u0006\u0010!\u001a\u00020\u000b¢\u0006\u0002\u0010\"J\t\u0010>\u001a\u00020\u0004HÆ\u0003J\t\u0010?\u001a\u00020\u000fHÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0013HÆ\u0003J\t\u0010C\u001a\u00020\u0004HÆ\u0003J\t\u0010D\u001a\u00020\u0004HÆ\u0003J\t\u0010E\u001a\u00020\u000bHÆ\u0003J\t\u0010F\u001a\u00020\u0013HÆ\u0003J\t\u0010G\u001a\u00020\u001aHÆ\u0003J\t\u0010H\u001a\u00020\u001cHÆ\u0003J\t\u0010I\u001a\u00020\u0004HÆ\u0003J\u0019\u0010J\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` HÆ\u0003J\t\u0010K\u001a\u00020\u000bHÆ\u0003J\t\u0010L\u001a\u00020\u0004HÆ\u0003J\t\u0010M\u001a\u00020\u0004HÆ\u0003J\t\u0010N\u001a\u00020\tHÆ\u0003J\t\u0010O\u001a\u00020\u000bHÆ\u0003J\t\u0010P\u001a\u00020\u000bHÆ\u0003J\t\u0010Q\u001a\u00020\u000bHÆ\u0003J\t\u0010R\u001a\u00020\u000fHÆ\u0003Jë\u0001\u0010S\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0018\b\u0002\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 2\b\b\u0002\u0010!\u001a\u00020\u000bHÆ\u0001J\t\u0010T\u001a\u00020\u000bHÖ\u0001J\u0013\u0010U\u001a\u00020\u00132\b\u0010V\u001a\u0004\u0018\u00010WHÖ\u0003J\t\u0010X\u001a\u00020\u000bHÖ\u0001J\t\u0010Y\u001a\u00020\u0004HÖ\u0001J\u0019\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020\u000bHÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0018\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0016\u0010\u0017\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010,R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010&R\u0016\u0010\u0014\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010&R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010$R\u0016\u0010!\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010$R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010<¨\u0006_"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "_id", "", "matchId", "createdBy", "name", "contestType", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestTypee;", "totalSpots", "", "joinedUserCount", "entryFee", "winningAmount", "", "winningPercentage", "firstWinnerAmount", "isGuaranteed", "", "isMultipleTeam", "referalCode", "contestUrl", "createdByType", "canJoinContest", "match", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;", "user", "Lcom/crickpe/view/intro/fragments/User;", "fantasyTeams", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/FantasyTeams;", "Lkotlin/collections/ArrayList;", "rank", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestTypee;IIIFFIZZLjava/lang/String;Ljava/lang/String;IZLcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;Lcom/crickpe/view/intro/fragments/User;Ljava/util/ArrayList;I)V", "get_id", "()Ljava/lang/String;", "getCanJoinContest", "()Z", "getContestType", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestTypee;", "getContestUrl", "getCreatedBy", "getCreatedByType", "()I", "getEntryFee", "getFantasyTeams", "()Ljava/util/ArrayList;", "getFirstWinnerAmount", "getJoinedUserCount", "getMatch", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;", "getMatchId", "getName", "getRank", "getReferalCode", "getTotalSpots", "getUser", "()Lcom/crickpe/view/intro/fragments/User;", "getWinningAmount", "()F", "getWinningPercentage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopContestModel.kt */
public final class TopContestModel extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<TopContestModel> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("canJoinContest")
    private final boolean canJoinContest;
    @SerializedName("contestType")
    private final ContestTypee contestType;
    @SerializedName("contestUrl")
    private final String contestUrl;
    @SerializedName("createdBy")
    private final String createdBy;
    @SerializedName("createdByType")
    private final int createdByType;
    @SerializedName("entryFee")
    private final int entryFee;
    @SerializedName("fantasyTeams")
    private final ArrayList<FantasyTeams> fantasyTeams;
    @SerializedName("firstWinnerAmount")
    private final int firstWinnerAmount;
    @SerializedName("isGuaranteed")
    private final boolean isGuaranteed;
    @SerializedName("isMultipleTeam")
    private final boolean isMultipleTeam;
    @SerializedName("joinedUserCount")
    private final int joinedUserCount;
    @SerializedName("match")
    private final Match match;
    @SerializedName("matchId")
    private final String matchId;
    @SerializedName("name")
    private final String name;
    @SerializedName("rank")
    private final int rank;
    @SerializedName("referalCode")
    private final String referalCode;
    @SerializedName("totalSpots")
    private final int totalSpots;
    @SerializedName("user")
    private final User user;
    @SerializedName("winningAmount")
    private final float winningAmount;
    @SerializedName("winningPercentage")
    private final float winningPercentage;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopContestModel.kt */
    public static final class Creator implements Parcelable.Creator<TopContestModel> {
        public final TopContestModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ContestTypee createFromParcel = ContestTypee.CREATOR.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt4 = parcel.readInt();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt5 = parcel.readInt();
            boolean z3 = parcel.readInt() != 0;
            Match createFromParcel2 = Match.CREATOR.createFromParcel(parcel2);
            User createFromParcel3 = User.CREATOR.createFromParcel(parcel2);
            int readInt6 = parcel.readInt();
            boolean z4 = z2;
            ArrayList arrayList = new ArrayList(readInt6);
            while (i != readInt6) {
                arrayList.add(FantasyTeams.CREATOR.createFromParcel(parcel2));
                i++;
                readInt6 = readInt6;
            }
            return new TopContestModel(readString, readString2, readString3, readString4, createFromParcel, readInt, readInt2, readInt3, readFloat, readFloat2, readInt4, z, z4, readString5, readString6, readInt5, z3, createFromParcel2, createFromParcel3, arrayList, parcel.readInt());
        }

        public final TopContestModel[] newArray(int i) {
            return new TopContestModel[i];
        }
    }

    public static /* synthetic */ TopContestModel copy$default(TopContestModel topContestModel, String str, String str2, String str3, String str4, ContestTypee contestTypee, int i, int i2, int i3, float f, float f2, int i4, boolean z, boolean z2, String str5, String str6, int i5, boolean z3, Match match2, User user2, ArrayList arrayList, int i6, int i7, Object obj) {
        TopContestModel topContestModel2 = topContestModel;
        int i8 = i7;
        return topContestModel.copy((i8 & 1) != 0 ? topContestModel2._id : str, (i8 & 2) != 0 ? topContestModel2.matchId : str2, (i8 & 4) != 0 ? topContestModel2.createdBy : str3, (i8 & 8) != 0 ? topContestModel2.name : str4, (i8 & 16) != 0 ? topContestModel2.contestType : contestTypee, (i8 & 32) != 0 ? topContestModel2.totalSpots : i, (i8 & 64) != 0 ? topContestModel2.joinedUserCount : i2, (i8 & 128) != 0 ? topContestModel2.entryFee : i3, (i8 & 256) != 0 ? topContestModel2.winningAmount : f, (i8 & 512) != 0 ? topContestModel2.winningPercentage : f2, (i8 & 1024) != 0 ? topContestModel2.firstWinnerAmount : i4, (i8 & 2048) != 0 ? topContestModel2.isGuaranteed : z, (i8 & 4096) != 0 ? topContestModel2.isMultipleTeam : z2, (i8 & 8192) != 0 ? topContestModel2.referalCode : str5, (i8 & 16384) != 0 ? topContestModel2.contestUrl : str6, (i8 & 32768) != 0 ? topContestModel2.createdByType : i5, (i8 & 65536) != 0 ? topContestModel2.canJoinContest : z3, (i8 & 131072) != 0 ? topContestModel2.match : match2, (i8 & 262144) != 0 ? topContestModel2.user : user2, (i8 & 524288) != 0 ? topContestModel2.fantasyTeams : arrayList, (i8 & 1048576) != 0 ? topContestModel2.rank : i6);
    }

    public final String component1() {
        return this._id;
    }

    public final float component10() {
        return this.winningPercentage;
    }

    public final int component11() {
        return this.firstWinnerAmount;
    }

    public final boolean component12() {
        return this.isGuaranteed;
    }

    public final boolean component13() {
        return this.isMultipleTeam;
    }

    public final String component14() {
        return this.referalCode;
    }

    public final String component15() {
        return this.contestUrl;
    }

    public final int component16() {
        return this.createdByType;
    }

    public final boolean component17() {
        return this.canJoinContest;
    }

    public final Match component18() {
        return this.match;
    }

    public final User component19() {
        return this.user;
    }

    public final String component2() {
        return this.matchId;
    }

    public final ArrayList<FantasyTeams> component20() {
        return this.fantasyTeams;
    }

    public final int component21() {
        return this.rank;
    }

    public final String component3() {
        return this.createdBy;
    }

    public final String component4() {
        return this.name;
    }

    public final ContestTypee component5() {
        return this.contestType;
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

    public final TopContestModel copy(String str, String str2, String str3, String str4, ContestTypee contestTypee, int i, int i2, int i3, float f, float f2, int i4, boolean z, boolean z2, String str5, String str6, int i5, boolean z3, Match match2, User user2, ArrayList<FantasyTeams> arrayList, int i6) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(str3, "createdBy");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(contestTypee, "contestType");
        Intrinsics.checkNotNullParameter(str5, "referalCode");
        Intrinsics.checkNotNullParameter(str6, "contestUrl");
        Intrinsics.checkNotNullParameter(match2, "match");
        Intrinsics.checkNotNullParameter(user2, "user");
        Intrinsics.checkNotNullParameter(arrayList, "fantasyTeams");
        return new TopContestModel(str7, str2, str3, str4, contestTypee, i, i2, i3, f, f2, i4, z, z2, str5, str6, i5, z3, match2, user2, arrayList, i6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopContestModel)) {
            return false;
        }
        TopContestModel topContestModel = (TopContestModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) topContestModel._id) && Intrinsics.areEqual((Object) this.matchId, (Object) topContestModel.matchId) && Intrinsics.areEqual((Object) this.createdBy, (Object) topContestModel.createdBy) && Intrinsics.areEqual((Object) this.name, (Object) topContestModel.name) && Intrinsics.areEqual((Object) this.contestType, (Object) topContestModel.contestType) && this.totalSpots == topContestModel.totalSpots && this.joinedUserCount == topContestModel.joinedUserCount && this.entryFee == topContestModel.entryFee && Intrinsics.areEqual((Object) Float.valueOf(this.winningAmount), (Object) Float.valueOf(topContestModel.winningAmount)) && Intrinsics.areEqual((Object) Float.valueOf(this.winningPercentage), (Object) Float.valueOf(topContestModel.winningPercentage)) && this.firstWinnerAmount == topContestModel.firstWinnerAmount && this.isGuaranteed == topContestModel.isGuaranteed && this.isMultipleTeam == topContestModel.isMultipleTeam && Intrinsics.areEqual((Object) this.referalCode, (Object) topContestModel.referalCode) && Intrinsics.areEqual((Object) this.contestUrl, (Object) topContestModel.contestUrl) && this.createdByType == topContestModel.createdByType && this.canJoinContest == topContestModel.canJoinContest && Intrinsics.areEqual((Object) this.match, (Object) topContestModel.match) && Intrinsics.areEqual((Object) this.user, (Object) topContestModel.user) && Intrinsics.areEqual((Object) this.fantasyTeams, (Object) topContestModel.fantasyTeams) && this.rank == topContestModel.rank;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this._id.hashCode() * 31) + this.matchId.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.name.hashCode()) * 31) + this.contestType.hashCode()) * 31) + this.totalSpots) * 31) + this.joinedUserCount) * 31) + this.entryFee) * 31) + Float.floatToIntBits(this.winningAmount)) * 31) + Float.floatToIntBits(this.winningPercentage)) * 31) + this.firstWinnerAmount) * 31;
        boolean z = this.isGuaranteed;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isMultipleTeam;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = (((((((i + (z3 ? 1 : 0)) * 31) + this.referalCode.hashCode()) * 31) + this.contestUrl.hashCode()) * 31) + this.createdByType) * 31;
        boolean z4 = this.canJoinContest;
        if (!z4) {
            z2 = z4;
        }
        return ((((((((hashCode2 + (z2 ? 1 : 0)) * 31) + this.match.hashCode()) * 31) + this.user.hashCode()) * 31) + this.fantasyTeams.hashCode()) * 31) + this.rank;
    }

    public String toString() {
        return "TopContestModel(_id=" + this._id + ", matchId=" + this.matchId + ", createdBy=" + this.createdBy + ", name=" + this.name + ", contestType=" + this.contestType + ", totalSpots=" + this.totalSpots + ", joinedUserCount=" + this.joinedUserCount + ", entryFee=" + this.entryFee + ", winningAmount=" + this.winningAmount + ", winningPercentage=" + this.winningPercentage + ", firstWinnerAmount=" + this.firstWinnerAmount + ", isGuaranteed=" + this.isGuaranteed + ", isMultipleTeam=" + this.isMultipleTeam + ", referalCode=" + this.referalCode + ", contestUrl=" + this.contestUrl + ", createdByType=" + this.createdByType + ", canJoinContest=" + this.canJoinContest + ", match=" + this.match + ", user=" + this.user + ", fantasyTeams=" + this.fantasyTeams + ", rank=" + this.rank + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.matchId);
        parcel.writeString(this.createdBy);
        parcel.writeString(this.name);
        this.contestType.writeToParcel(parcel, i);
        parcel.writeInt(this.totalSpots);
        parcel.writeInt(this.joinedUserCount);
        parcel.writeInt(this.entryFee);
        parcel.writeFloat(this.winningAmount);
        parcel.writeFloat(this.winningPercentage);
        parcel.writeInt(this.firstWinnerAmount);
        parcel.writeInt(this.isGuaranteed ? 1 : 0);
        parcel.writeInt(this.isMultipleTeam ? 1 : 0);
        parcel.writeString(this.referalCode);
        parcel.writeString(this.contestUrl);
        parcel.writeInt(this.createdByType);
        parcel.writeInt(this.canJoinContest ? 1 : 0);
        this.match.writeToParcel(parcel, i);
        this.user.writeToParcel(parcel, i);
        ArrayList<FantasyTeams> arrayList = this.fantasyTeams;
        parcel.writeInt(arrayList.size());
        Iterator<FantasyTeams> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.rank);
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

    public final ContestTypee getContestType() {
        return this.contestType;
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

    public final float getWinningPercentage() {
        return this.winningPercentage;
    }

    public final int getFirstWinnerAmount() {
        return this.firstWinnerAmount;
    }

    public final boolean isGuaranteed() {
        return this.isGuaranteed;
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

    public final boolean getCanJoinContest() {
        return this.canJoinContest;
    }

    public final Match getMatch() {
        return this.match;
    }

    public final User getUser() {
        return this.user;
    }

    public final ArrayList<FantasyTeams> getFantasyTeams() {
        return this.fantasyTeams;
    }

    public final int getRank() {
        return this.rank;
    }

    public TopContestModel(String str, String str2, String str3, String str4, ContestTypee contestTypee, int i, int i2, int i3, float f, float f2, int i4, boolean z, boolean z2, String str5, String str6, int i5, boolean z3, Match match2, User user2, ArrayList<FantasyTeams> arrayList, int i6) {
        String str7 = str4;
        ContestTypee contestTypee2 = contestTypee;
        String str8 = str5;
        String str9 = str6;
        Match match3 = match2;
        User user3 = user2;
        ArrayList<FantasyTeams> arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(str3, "createdBy");
        Intrinsics.checkNotNullParameter(str7, "name");
        Intrinsics.checkNotNullParameter(contestTypee2, "contestType");
        Intrinsics.checkNotNullParameter(str8, "referalCode");
        Intrinsics.checkNotNullParameter(str9, "contestUrl");
        Intrinsics.checkNotNullParameter(match3, "match");
        Intrinsics.checkNotNullParameter(user3, "user");
        Intrinsics.checkNotNullParameter(arrayList2, "fantasyTeams");
        this._id = str;
        this.matchId = str2;
        this.createdBy = str3;
        this.name = str7;
        this.contestType = contestTypee2;
        this.totalSpots = i;
        this.joinedUserCount = i2;
        this.entryFee = i3;
        this.winningAmount = f;
        this.winningPercentage = f2;
        this.firstWinnerAmount = i4;
        this.isGuaranteed = z;
        this.isMultipleTeam = z2;
        this.referalCode = str8;
        this.contestUrl = str9;
        this.createdByType = i5;
        this.canJoinContest = z3;
        this.match = match3;
        this.user = user3;
        this.fantasyTeams = arrayList2;
        this.rank = i6;
    }
}
