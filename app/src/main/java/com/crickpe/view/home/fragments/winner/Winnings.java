package com.crickpe.view.home.fragments.winner;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.intro.fragments.User;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006/"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/winner/Winnings;", "Landroid/os/Parcelable;", "_id", "", "totalFantasyPoint", "", "amount", "", "userType", "", "userInfo", "Lcom/crickpe/view/intro/fragments/User;", "fantasyTeamId", "rank", "(Ljava/lang/String;FDILcom/crickpe/view/intro/fragments/User;Ljava/lang/String;I)V", "get_id", "()Ljava/lang/String;", "getAmount", "()D", "getFantasyTeamId", "getRank", "()I", "getTotalFantasyPoint", "()F", "getUserInfo", "()Lcom/crickpe/view/intro/fragments/User;", "getUserType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MegaWinnerModel.kt */
public final class Winnings implements Parcelable {
    public static final Parcelable.Creator<Winnings> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("amount")
    private final double amount;
    @SerializedName("fantasyTeamId")
    private final String fantasyTeamId;
    @SerializedName("rank")
    private final int rank;
    @SerializedName("totalFantasyPoint")
    private final float totalFantasyPoint;
    @SerializedName("userInfo")
    private final User userInfo;
    @SerializedName("userType")
    private final int userType;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MegaWinnerModel.kt */
    public static final class Creator implements Parcelable.Creator<Winnings> {
        public final Winnings createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Winnings(parcel.readString(), parcel.readFloat(), parcel.readDouble(), parcel.readInt(), User.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt());
        }

        public final Winnings[] newArray(int i) {
            return new Winnings[i];
        }
    }

    public static /* synthetic */ Winnings copy$default(Winnings winnings, String str, float f, double d, int i, User user, String str2, int i2, int i3, Object obj) {
        Winnings winnings2 = winnings;
        return winnings.copy((i3 & 1) != 0 ? winnings2._id : str, (i3 & 2) != 0 ? winnings2.totalFantasyPoint : f, (i3 & 4) != 0 ? winnings2.amount : d, (i3 & 8) != 0 ? winnings2.userType : i, (i3 & 16) != 0 ? winnings2.userInfo : user, (i3 & 32) != 0 ? winnings2.fantasyTeamId : str2, (i3 & 64) != 0 ? winnings2.rank : i2);
    }

    public final String component1() {
        return this._id;
    }

    public final float component2() {
        return this.totalFantasyPoint;
    }

    public final double component3() {
        return this.amount;
    }

    public final int component4() {
        return this.userType;
    }

    public final User component5() {
        return this.userInfo;
    }

    public final String component6() {
        return this.fantasyTeamId;
    }

    public final int component7() {
        return this.rank;
    }

    public final Winnings copy(String str, float f, double d, int i, User user, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        User user2 = user;
        Intrinsics.checkNotNullParameter(user2, "userInfo");
        String str3 = str2;
        Intrinsics.checkNotNullParameter(str3, "fantasyTeamId");
        return new Winnings(str, f, d, i, user2, str3, i2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Winnings)) {
            return false;
        }
        Winnings winnings = (Winnings) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) winnings._id) && Intrinsics.areEqual((Object) Float.valueOf(this.totalFantasyPoint), (Object) Float.valueOf(winnings.totalFantasyPoint)) && Intrinsics.areEqual((Object) Double.valueOf(this.amount), (Object) Double.valueOf(winnings.amount)) && this.userType == winnings.userType && Intrinsics.areEqual((Object) this.userInfo, (Object) winnings.userInfo) && Intrinsics.areEqual((Object) this.fantasyTeamId, (Object) winnings.fantasyTeamId) && this.rank == winnings.rank;
    }

    public int hashCode() {
        return (((((((((((this._id.hashCode() * 31) + Float.floatToIntBits(this.totalFantasyPoint)) * 31) + Double.doubleToLongBits(this.amount)) * 31) + this.userType) * 31) + this.userInfo.hashCode()) * 31) + this.fantasyTeamId.hashCode()) * 31) + this.rank;
    }

    public String toString() {
        return "Winnings(_id=" + this._id + ", totalFantasyPoint=" + this.totalFantasyPoint + ", amount=" + this.amount + ", userType=" + this.userType + ", userInfo=" + this.userInfo + ", fantasyTeamId=" + this.fantasyTeamId + ", rank=" + this.rank + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeFloat(this.totalFantasyPoint);
        parcel.writeDouble(this.amount);
        parcel.writeInt(this.userType);
        this.userInfo.writeToParcel(parcel, i);
        parcel.writeString(this.fantasyTeamId);
        parcel.writeInt(this.rank);
    }

    public Winnings(String str, float f, double d, int i, User user, String str2, int i2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(user, "userInfo");
        Intrinsics.checkNotNullParameter(str2, "fantasyTeamId");
        this._id = str;
        this.totalFantasyPoint = f;
        this.amount = d;
        this.userType = i;
        this.userInfo = user;
        this.fantasyTeamId = str2;
        this.rank = i2;
    }

    public final String get_id() {
        return this._id;
    }

    public final float getTotalFantasyPoint() {
        return this.totalFantasyPoint;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final int getUserType() {
        return this.userType;
    }

    public final User getUserInfo() {
        return this.userInfo;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public final int getRank() {
        return this.rank;
    }
}
