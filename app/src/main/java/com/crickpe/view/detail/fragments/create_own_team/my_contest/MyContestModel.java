package com.crickpe.view.detail.fragments.create_own_team.my_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.intro.fragments.User;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b¢\u0006\u0002\u0010\u001cJ\t\u00103\u001a\u00020\u0006HÖ\u0001J\u0019\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010(R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010(R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0015\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00101¨\u00069"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "Landroid/os/Parcelable;", "_id", "", "name", "totalSpots", "", "rank", "firstWinnerAmount", "contestType", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/ContestType;", "isReject", "", "isGuaranteed", "entryFee", "referalCode", "contestUrl", "createdByType", "winningPercentage", "", "joinedUserCount", "winningAmount", "fantasyTeams", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/FantasyTeams;", "Lkotlin/collections/ArrayList;", "user", "Lcom/crickpe/view/intro/fragments/User;", "(Ljava/lang/String;Ljava/lang/String;IIILcom/crickpe/view/detail/fragments/create_own_team/my_contest/ContestType;ZZILjava/lang/String;Ljava/lang/String;IFIFLjava/util/ArrayList;Lcom/crickpe/view/intro/fragments/User;)V", "get_id", "()Ljava/lang/String;", "getContestType", "()Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/ContestType;", "getContestUrl", "getCreatedByType", "()I", "getEntryFee", "getFantasyTeams", "()Ljava/util/ArrayList;", "getFirstWinnerAmount", "()Z", "getJoinedUserCount", "getName", "getRank", "getReferalCode", "getTotalSpots", "getUser", "()Lcom/crickpe/view/intro/fragments/User;", "getWinningAmount", "()F", "getWinningPercentage", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyContestModel.kt */
public final class MyContestModel implements Parcelable {
    public static final Parcelable.Creator<MyContestModel> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("contestType")
    private final ContestType contestType;
    @SerializedName("contestUrl")
    private final String contestUrl;
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
    @SerializedName("isReject")
    private final boolean isReject;
    @SerializedName("joinedUserCount")
    private final int joinedUserCount;
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
    /* compiled from: MyContestModel.kt */
    public static final class Creator implements Parcelable.Creator<MyContestModel> {
        public final MyContestModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ContestType createFromParcel = ContestType.CREATOR.createFromParcel(parcel2);
            int i = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt4 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt5 = parcel.readInt();
            float readFloat = parcel.readFloat();
            int readInt6 = parcel.readInt();
            float readFloat2 = parcel.readFloat();
            int readInt7 = parcel.readInt();
            float f = readFloat;
            ArrayList arrayList = new ArrayList(readInt7);
            while (i != readInt7) {
                arrayList.add(FantasyTeams.CREATOR.createFromParcel(parcel2));
                i++;
                readInt7 = readInt7;
            }
            return new MyContestModel(readString, readString2, readInt, readInt2, readInt3, createFromParcel, z, z2, readInt4, readString3, readString4, readInt5, f, readInt6, readFloat2, arrayList, User.CREATOR.createFromParcel(parcel2));
        }

        public final MyContestModel[] newArray(int i) {
            return new MyContestModel[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.name);
        parcel.writeInt(this.totalSpots);
        parcel.writeInt(this.rank);
        parcel.writeInt(this.firstWinnerAmount);
        this.contestType.writeToParcel(parcel, i);
        parcel.writeInt(this.isReject ? 1 : 0);
        parcel.writeInt(this.isGuaranteed ? 1 : 0);
        parcel.writeInt(this.entryFee);
        parcel.writeString(this.referalCode);
        parcel.writeString(this.contestUrl);
        parcel.writeInt(this.createdByType);
        parcel.writeFloat(this.winningPercentage);
        parcel.writeInt(this.joinedUserCount);
        parcel.writeFloat(this.winningAmount);
        ArrayList<FantasyTeams> arrayList = this.fantasyTeams;
        parcel.writeInt(arrayList.size());
        Iterator<FantasyTeams> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.user.writeToParcel(parcel, i);
    }

    public MyContestModel(String str, String str2, int i, int i2, int i3, ContestType contestType2, boolean z, boolean z2, int i4, String str3, String str4, int i5, float f, int i6, float f2, ArrayList<FantasyTeams> arrayList, User user2) {
        String str5 = str3;
        String str6 = str4;
        ArrayList<FantasyTeams> arrayList2 = arrayList;
        User user3 = user2;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(contestType2, "contestType");
        Intrinsics.checkNotNullParameter(str5, "referalCode");
        Intrinsics.checkNotNullParameter(str6, "contestUrl");
        Intrinsics.checkNotNullParameter(arrayList2, "fantasyTeams");
        Intrinsics.checkNotNullParameter(user3, "user");
        this._id = str;
        this.name = str2;
        this.totalSpots = i;
        this.rank = i2;
        this.firstWinnerAmount = i3;
        this.contestType = contestType2;
        this.isReject = z;
        this.isGuaranteed = z2;
        this.entryFee = i4;
        this.referalCode = str5;
        this.contestUrl = str6;
        this.createdByType = i5;
        this.winningPercentage = f;
        this.joinedUserCount = i6;
        this.winningAmount = f2;
        this.fantasyTeams = arrayList2;
        this.user = user3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MyContestModel(String str, String str2, int i, int i2, int i3, ContestType contestType2, boolean z, boolean z2, int i4, String str3, String str4, int i5, float f, int i6, float f2, ArrayList arrayList, User user2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, i3, contestType2, z, z2, i4, (i7 & 512) != 0 ? "" : str3, str4, i5, f, i6, f2, arrayList, user2);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getTotalSpots() {
        return this.totalSpots;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getFirstWinnerAmount() {
        return this.firstWinnerAmount;
    }

    public final ContestType getContestType() {
        return this.contestType;
    }

    public final boolean isReject() {
        return this.isReject;
    }

    public final boolean isGuaranteed() {
        return this.isGuaranteed;
    }

    public final int getEntryFee() {
        return this.entryFee;
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

    public final float getWinningPercentage() {
        return this.winningPercentage;
    }

    public final int getJoinedUserCount() {
        return this.joinedUserCount;
    }

    public final float getWinningAmount() {
        return this.winningAmount;
    }

    public final ArrayList<FantasyTeams> getFantasyTeams() {
        return this.fantasyTeams;
    }

    public final User getUser() {
        return this.user;
    }
}
