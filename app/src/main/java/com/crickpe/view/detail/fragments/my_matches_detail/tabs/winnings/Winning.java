package com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\u0019\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006."}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/Winning;", "Landroid/os/Parcelable;", "_id", "", "contestId", "rankStart", "", "rankEnd", "amount", "", "createdAt", "updatedAt", "__v", "(Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;Ljava/lang/String;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getAmount", "()D", "getContestId", "getCreatedAt", "getRankEnd", "getRankStart", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestWinningsModel.kt */
public final class Winning implements Parcelable {
    public static final Parcelable.Creator<Winning> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("amount")
    private final double amount;
    @SerializedName("contestId")
    private final String contestId;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("rankEnd")
    private final int rankEnd;
    @SerializedName("rankStart")
    private final int rankStart;
    @SerializedName("updatedAt")
    private final String updatedAt;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestWinningsModel.kt */
    public static final class Creator implements Parcelable.Creator<Winning> {
        public final Winning createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Winning(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final Winning[] newArray(int i) {
            return new Winning[i];
        }
    }

    public static /* synthetic */ Winning copy$default(Winning winning, String str, String str2, int i, int i2, double d, String str3, String str4, int i3, int i4, Object obj) {
        Winning winning2 = winning;
        int i5 = i4;
        return winning.copy((i5 & 1) != 0 ? winning2._id : str, (i5 & 2) != 0 ? winning2.contestId : str2, (i5 & 4) != 0 ? winning2.rankStart : i, (i5 & 8) != 0 ? winning2.rankEnd : i2, (i5 & 16) != 0 ? winning2.amount : d, (i5 & 32) != 0 ? winning2.createdAt : str3, (i5 & 64) != 0 ? winning2.updatedAt : str4, (i5 & 128) != 0 ? winning2.__v : i3);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.contestId;
    }

    public final int component3() {
        return this.rankStart;
    }

    public final int component4() {
        return this.rankEnd;
    }

    public final double component5() {
        return this.amount;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final String component7() {
        return this.updatedAt;
    }

    public final int component8() {
        return this.__v;
    }

    public final Winning copy(String str, String str2, int i, int i2, double d, String str3, String str4, int i3) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "contestId");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "createdAt");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "updatedAt");
        return new Winning(str, str2, i, i2, d, str5, str6, i3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Winning)) {
            return false;
        }
        Winning winning = (Winning) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) winning._id) && Intrinsics.areEqual((Object) this.contestId, (Object) winning.contestId) && this.rankStart == winning.rankStart && this.rankEnd == winning.rankEnd && Intrinsics.areEqual((Object) Double.valueOf(this.amount), (Object) Double.valueOf(winning.amount)) && Intrinsics.areEqual((Object) this.createdAt, (Object) winning.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) winning.updatedAt) && this.__v == winning.__v;
    }

    public int hashCode() {
        return (((((((((((((this._id.hashCode() * 31) + this.contestId.hashCode()) * 31) + this.rankStart) * 31) + this.rankEnd) * 31) + Double.doubleToLongBits(this.amount)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v;
    }

    public String toString() {
        return "Winning(_id=" + this._id + ", contestId=" + this.contestId + ", rankStart=" + this.rankStart + ", rankEnd=" + this.rankEnd + ", amount=" + this.amount + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.contestId);
        parcel.writeInt(this.rankStart);
        parcel.writeInt(this.rankEnd);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
    }

    public Winning(String str, String str2, int i, int i2, double d, String str3, String str4, int i3) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "contestId");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(str4, "updatedAt");
        this._id = str;
        this.contestId = str2;
        this.rankStart = i;
        this.rankEnd = i2;
        this.amount = d;
        this.createdAt = str3;
        this.updatedAt = str4;
        this.__v = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Winning(String str, String str2, int i, int i2, double d, String str3, String str4, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i4 & 8) != 0 ? 0 : i2, d, str3, str4, i3);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final int getRankStart() {
        return this.rankStart;
    }

    public final int getRankEnd() {
        return this.rankEnd;
    }

    public final double getAmount() {
        return this.amount;
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
