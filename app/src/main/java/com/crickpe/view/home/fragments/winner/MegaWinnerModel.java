package com.crickpe.view.home.fragments.winner;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.detail.fragments.contest_winners.models.model.Match$$ExternalSyntheticBackport0;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestType;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Match;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\u0012HÆ\u0003J\t\u0010E\u001a\u00020\u0012HÆ\u0003J\t\u0010F\u001a\u00020\u0012HÆ\u0003J\t\u0010G\u001a\u00020\u0012HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\nHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u001bHÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\nHÆ\u0003J\u0019\u0010P\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!HÆ\u0003J\t\u0010Q\u001a\u00020#HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003J\t\u0010X\u001a\u00020\u000eHÆ\u0003J\u0002\u0010Y\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\n2\u0018\b\u0002\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!2\b\b\u0002\u0010\"\u001a\u00020#HÆ\u0001J\t\u0010Z\u001a\u00020\nHÖ\u0001J\u0013\u0010[\u001a\u00020\u00122\b\u0010\\\u001a\u0004\u0018\u00010]HÖ\u0003J\t\u0010^\u001a\u00020\nHÖ\u0001J\t\u0010_\u001a\u00020\u0003HÖ\u0001J\u0019\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020c2\u0006\u0010d\u001a\u00020\nHÖ\u0001R\u0016\u0010\u001d\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0016\u0010\u0018\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0016\u0010\u0010\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010&R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u00101R\u0016\u0010\u0014\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u00101R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00101R\u0016\u0010\u0015\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00101R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010&R\u0016\u0010\"\u001a\u00020#8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0016\u0010\u001c\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010(R&\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?¨\u0006e"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/winner/MegaWinnerModel;", "Landroid/os/Parcelable;", "_id", "", "matchId", "createdBy", "name", "contestType", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestType;", "totalSpots", "", "joinedUserCount", "entryFee", "winningAmount", "", "winningPercentage", "firstWinnerAmount", "isGuaranteed", "", "isBlocked", "isDeleted", "isMultipleTeam", "referalCode", "contestUrl", "createdByType", "createdAt", "startAtIST", "", "updatedAt", "__v", "winning", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/winner/Winnings;", "Lkotlin/collections/ArrayList;", "match", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestType;IIIFFIZZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;JLjava/lang/String;ILjava/util/ArrayList;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getContestType", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestType;", "getContestUrl", "getCreatedAt", "getCreatedBy", "getCreatedByType", "getEntryFee", "getFirstWinnerAmount", "()Z", "getJoinedUserCount", "getMatch", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;", "getMatchId", "getName", "getReferalCode", "getStartAtIST", "()J", "getTotalSpots", "getUpdatedAt", "getWinning", "()Ljava/util/ArrayList;", "getWinningAmount", "()F", "getWinningPercentage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MegaWinnerModel.kt */
public final class MegaWinnerModel implements Parcelable {
    public static final Parcelable.Creator<MegaWinnerModel> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
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
    @SerializedName("match")
    private final Match match;
    @SerializedName("matchId")
    private final String matchId;
    @SerializedName("name")
    private final String name;
    @SerializedName("referalCode")
    private final String referalCode;
    @SerializedName("startAtIST")
    private final long startAtIST;
    @SerializedName("totalSpots")
    private final int totalSpots;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("winnersList")
    private final ArrayList<Winnings> winning;
    @SerializedName("winningAmount")
    private final float winningAmount;
    @SerializedName("winningPercentage")
    private final float winningPercentage;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MegaWinnerModel.kt */
    public static final class Creator implements Parcelable.Creator<MegaWinnerModel> {
        public final MegaWinnerModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ContestType createFromParcel = ContestType.CREATOR.createFromParcel(parcel2);
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            int readInt4 = parcel.readInt();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt5 = parcel.readInt();
            String readString7 = parcel.readString();
            long readLong = parcel.readLong();
            String readString8 = parcel.readString();
            int readInt6 = parcel.readInt();
            int readInt7 = parcel.readInt();
            boolean z5 = z2;
            ArrayList arrayList = new ArrayList(readInt7);
            while (i != readInt7) {
                arrayList.add(Winnings.CREATOR.createFromParcel(parcel2));
                i++;
                readInt7 = readInt7;
            }
            return new MegaWinnerModel(readString, readString2, readString3, readString4, createFromParcel, readInt, readInt2, readInt3, readFloat, readFloat2, readInt4, z, z5, z3, z4, readString5, readString6, readInt5, readString7, readLong, readString8, readInt6, arrayList, Match.CREATOR.createFromParcel(parcel2));
        }

        public final MegaWinnerModel[] newArray(int i) {
            return new MegaWinnerModel[i];
        }
    }

    public static /* synthetic */ MegaWinnerModel copy$default(MegaWinnerModel megaWinnerModel, String str, String str2, String str3, String str4, ContestType contestType2, int i, int i2, int i3, float f, float f2, int i4, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, int i5, String str7, long j, String str8, int i6, ArrayList arrayList, Match match2, int i7, Object obj) {
        MegaWinnerModel megaWinnerModel2 = megaWinnerModel;
        int i8 = i7;
        return megaWinnerModel.copy((i8 & 1) != 0 ? megaWinnerModel2._id : str, (i8 & 2) != 0 ? megaWinnerModel2.matchId : str2, (i8 & 4) != 0 ? megaWinnerModel2.createdBy : str3, (i8 & 8) != 0 ? megaWinnerModel2.name : str4, (i8 & 16) != 0 ? megaWinnerModel2.contestType : contestType2, (i8 & 32) != 0 ? megaWinnerModel2.totalSpots : i, (i8 & 64) != 0 ? megaWinnerModel2.joinedUserCount : i2, (i8 & 128) != 0 ? megaWinnerModel2.entryFee : i3, (i8 & 256) != 0 ? megaWinnerModel2.winningAmount : f, (i8 & 512) != 0 ? megaWinnerModel2.winningPercentage : f2, (i8 & 1024) != 0 ? megaWinnerModel2.firstWinnerAmount : i4, (i8 & 2048) != 0 ? megaWinnerModel2.isGuaranteed : z, (i8 & 4096) != 0 ? megaWinnerModel2.isBlocked : z2, (i8 & 8192) != 0 ? megaWinnerModel2.isDeleted : z3, (i8 & 16384) != 0 ? megaWinnerModel2.isMultipleTeam : z4, (i8 & 32768) != 0 ? megaWinnerModel2.referalCode : str5, (i8 & 65536) != 0 ? megaWinnerModel2.contestUrl : str6, (i8 & 131072) != 0 ? megaWinnerModel2.createdByType : i5, (i8 & 262144) != 0 ? megaWinnerModel2.createdAt : str7, (i8 & 524288) != 0 ? megaWinnerModel2.startAtIST : j, (i8 & 1048576) != 0 ? megaWinnerModel2.updatedAt : str8, (2097152 & i8) != 0 ? megaWinnerModel2.__v : i6, (i8 & 4194304) != 0 ? megaWinnerModel2.winning : arrayList, (i8 & 8388608) != 0 ? megaWinnerModel2.match : match2);
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
        return this.isBlocked;
    }

    public final boolean component14() {
        return this.isDeleted;
    }

    public final boolean component15() {
        return this.isMultipleTeam;
    }

    public final String component16() {
        return this.referalCode;
    }

    public final String component17() {
        return this.contestUrl;
    }

    public final int component18() {
        return this.createdByType;
    }

    public final String component19() {
        return this.createdAt;
    }

    public final String component2() {
        return this.matchId;
    }

    public final long component20() {
        return this.startAtIST;
    }

    public final String component21() {
        return this.updatedAt;
    }

    public final int component22() {
        return this.__v;
    }

    public final ArrayList<Winnings> component23() {
        return this.winning;
    }

    public final Match component24() {
        return this.match;
    }

    public final String component3() {
        return this.createdBy;
    }

    public final String component4() {
        return this.name;
    }

    public final ContestType component5() {
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

    public final MegaWinnerModel copy(String str, String str2, String str3, String str4, ContestType contestType2, int i, int i2, int i3, float f, float f2, int i4, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, int i5, String str7, long j, String str8, int i6, ArrayList<Winnings> arrayList, Match match2) {
        String str9 = str;
        Intrinsics.checkNotNullParameter(str9, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(str3, "createdBy");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(contestType2, "contestType");
        Intrinsics.checkNotNullParameter(str5, "referalCode");
        Intrinsics.checkNotNullParameter(str6, "contestUrl");
        Intrinsics.checkNotNullParameter(str7, "createdAt");
        Intrinsics.checkNotNullParameter(str8, "updatedAt");
        Intrinsics.checkNotNullParameter(arrayList, "winning");
        Intrinsics.checkNotNullParameter(match2, "match");
        return new MegaWinnerModel(str9, str2, str3, str4, contestType2, i, i2, i3, f, f2, i4, z, z2, z3, z4, str5, str6, i5, str7, j, str8, i6, arrayList, match2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MegaWinnerModel)) {
            return false;
        }
        MegaWinnerModel megaWinnerModel = (MegaWinnerModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) megaWinnerModel._id) && Intrinsics.areEqual((Object) this.matchId, (Object) megaWinnerModel.matchId) && Intrinsics.areEqual((Object) this.createdBy, (Object) megaWinnerModel.createdBy) && Intrinsics.areEqual((Object) this.name, (Object) megaWinnerModel.name) && Intrinsics.areEqual((Object) this.contestType, (Object) megaWinnerModel.contestType) && this.totalSpots == megaWinnerModel.totalSpots && this.joinedUserCount == megaWinnerModel.joinedUserCount && this.entryFee == megaWinnerModel.entryFee && Intrinsics.areEqual((Object) Float.valueOf(this.winningAmount), (Object) Float.valueOf(megaWinnerModel.winningAmount)) && Intrinsics.areEqual((Object) Float.valueOf(this.winningPercentage), (Object) Float.valueOf(megaWinnerModel.winningPercentage)) && this.firstWinnerAmount == megaWinnerModel.firstWinnerAmount && this.isGuaranteed == megaWinnerModel.isGuaranteed && this.isBlocked == megaWinnerModel.isBlocked && this.isDeleted == megaWinnerModel.isDeleted && this.isMultipleTeam == megaWinnerModel.isMultipleTeam && Intrinsics.areEqual((Object) this.referalCode, (Object) megaWinnerModel.referalCode) && Intrinsics.areEqual((Object) this.contestUrl, (Object) megaWinnerModel.contestUrl) && this.createdByType == megaWinnerModel.createdByType && Intrinsics.areEqual((Object) this.createdAt, (Object) megaWinnerModel.createdAt) && this.startAtIST == megaWinnerModel.startAtIST && Intrinsics.areEqual((Object) this.updatedAt, (Object) megaWinnerModel.updatedAt) && this.__v == megaWinnerModel.__v && Intrinsics.areEqual((Object) this.winning, (Object) megaWinnerModel.winning) && Intrinsics.areEqual((Object) this.match, (Object) megaWinnerModel.match);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this._id.hashCode() * 31) + this.matchId.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.name.hashCode()) * 31) + this.contestType.hashCode()) * 31) + this.totalSpots) * 31) + this.joinedUserCount) * 31) + this.entryFee) * 31) + Float.floatToIntBits(this.winningAmount)) * 31) + Float.floatToIntBits(this.winningPercentage)) * 31) + this.firstWinnerAmount) * 31;
        boolean z = this.isGuaranteed;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isBlocked;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isDeleted;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isMultipleTeam;
        if (!z5) {
            z2 = z5;
        }
        return ((((((((((((((((((i3 + (z2 ? 1 : 0)) * 31) + this.referalCode.hashCode()) * 31) + this.contestUrl.hashCode()) * 31) + this.createdByType) * 31) + this.createdAt.hashCode()) * 31) + Match$$ExternalSyntheticBackport0.m111m(this.startAtIST)) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.winning.hashCode()) * 31) + this.match.hashCode();
    }

    public String toString() {
        return "MegaWinnerModel(_id=" + this._id + ", matchId=" + this.matchId + ", createdBy=" + this.createdBy + ", name=" + this.name + ", contestType=" + this.contestType + ", totalSpots=" + this.totalSpots + ", joinedUserCount=" + this.joinedUserCount + ", entryFee=" + this.entryFee + ", winningAmount=" + this.winningAmount + ", winningPercentage=" + this.winningPercentage + ", firstWinnerAmount=" + this.firstWinnerAmount + ", isGuaranteed=" + this.isGuaranteed + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", isMultipleTeam=" + this.isMultipleTeam + ", referalCode=" + this.referalCode + ", contestUrl=" + this.contestUrl + ", createdByType=" + this.createdByType + ", createdAt=" + this.createdAt + ", startAtIST=" + this.startAtIST + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", winning=" + this.winning + ", match=" + this.match + ')';
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
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeInt(this.isMultipleTeam ? 1 : 0);
        parcel.writeString(this.referalCode);
        parcel.writeString(this.contestUrl);
        parcel.writeInt(this.createdByType);
        parcel.writeString(this.createdAt);
        parcel.writeLong(this.startAtIST);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
        ArrayList<Winnings> arrayList = this.winning;
        parcel.writeInt(arrayList.size());
        Iterator<Winnings> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.match.writeToParcel(parcel, i);
    }

    public MegaWinnerModel(String str, String str2, String str3, String str4, ContestType contestType2, int i, int i2, int i3, float f, float f2, int i4, boolean z, boolean z2, boolean z3, boolean z4, String str5, String str6, int i5, String str7, long j, String str8, int i6, ArrayList<Winnings> arrayList, Match match2) {
        String str9 = str3;
        String str10 = str4;
        ContestType contestType3 = contestType2;
        String str11 = str5;
        String str12 = str6;
        String str13 = str7;
        String str14 = str8;
        ArrayList<Winnings> arrayList2 = arrayList;
        Match match3 = match2;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(str9, "createdBy");
        Intrinsics.checkNotNullParameter(str10, "name");
        Intrinsics.checkNotNullParameter(contestType3, "contestType");
        Intrinsics.checkNotNullParameter(str11, "referalCode");
        Intrinsics.checkNotNullParameter(str12, "contestUrl");
        Intrinsics.checkNotNullParameter(str13, "createdAt");
        Intrinsics.checkNotNullParameter(str14, "updatedAt");
        Intrinsics.checkNotNullParameter(arrayList2, "winning");
        Intrinsics.checkNotNullParameter(match3, "match");
        this._id = str;
        this.matchId = str2;
        this.createdBy = str9;
        this.name = str10;
        this.contestType = contestType3;
        this.totalSpots = i;
        this.joinedUserCount = i2;
        this.entryFee = i3;
        this.winningAmount = f;
        this.winningPercentage = f2;
        this.firstWinnerAmount = i4;
        this.isGuaranteed = z;
        this.isBlocked = z2;
        this.isDeleted = z3;
        this.isMultipleTeam = z4;
        this.referalCode = str11;
        this.contestUrl = str12;
        this.createdByType = i5;
        this.createdAt = str13;
        this.startAtIST = j;
        this.updatedAt = str14;
        this.__v = i6;
        this.winning = arrayList2;
        this.match = match3;
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

    public final ContestType getContestType() {
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

    public final long getStartAtIST() {
        return this.startAtIST;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int get__v() {
        return this.__v;
    }

    public final ArrayList<Winnings> getWinning() {
        return this.winning;
    }

    public final Match getMatch() {
        return this.match;
    }
}
