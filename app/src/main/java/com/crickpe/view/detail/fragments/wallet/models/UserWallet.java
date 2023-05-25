package com.crickpe.view.detail.fragments.wallet.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0002\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\bHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003Jw\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0006HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017¨\u00067"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/models/UserWallet;", "Landroid/os/Parcelable;", "_id", "", "userId", "__v", "", "cashbackAmount", "", "createdAt", "isDeleted", "", "joiningBonusAmount", "totalAmount", "updatedAt", "walletAmount", "winningAmount", "(Ljava/lang/String;Ljava/lang/String;IDLjava/lang/String;ZIDLjava/lang/String;DD)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getCashbackAmount", "()D", "getCreatedAt", "()Z", "getJoiningBonusAmount", "getTotalAmount", "getUpdatedAt", "getUserId", "getWalletAmount", "getWinningAmount", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UserWallet.kt */
public final class UserWallet implements Parcelable {
    public static final Parcelable.Creator<UserWallet> CREATOR = new Creator();
    private final int __v;
    private final String _id;
    private final double cashbackAmount;
    private final String createdAt;
    private final boolean isDeleted;
    private final int joiningBonusAmount;
    private final double totalAmount;
    private final String updatedAt;
    private final String userId;
    private final double walletAmount;
    private final double winningAmount;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: UserWallet.kt */
    public static final class Creator implements Parcelable.Creator<UserWallet> {
        public final UserWallet createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserWallet(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readDouble(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readDouble());
        }

        public final UserWallet[] newArray(int i) {
            return new UserWallet[i];
        }
    }

    public static /* synthetic */ UserWallet copy$default(UserWallet userWallet, String str, String str2, int i, double d, String str3, boolean z, int i2, double d2, String str4, double d3, double d4, int i3, Object obj) {
        UserWallet userWallet2 = userWallet;
        int i4 = i3;
        return userWallet.copy((i4 & 1) != 0 ? userWallet2._id : str, (i4 & 2) != 0 ? userWallet2.userId : str2, (i4 & 4) != 0 ? userWallet2.__v : i, (i4 & 8) != 0 ? userWallet2.cashbackAmount : d, (i4 & 16) != 0 ? userWallet2.createdAt : str3, (i4 & 32) != 0 ? userWallet2.isDeleted : z, (i4 & 64) != 0 ? userWallet2.joiningBonusAmount : i2, (i4 & 128) != 0 ? userWallet2.totalAmount : d2, (i4 & 256) != 0 ? userWallet2.updatedAt : str4, (i4 & 512) != 0 ? userWallet2.walletAmount : d3, (i4 & 1024) != 0 ? userWallet2.winningAmount : d4);
    }

    public final String component1() {
        return this._id;
    }

    public final double component10() {
        return this.walletAmount;
    }

    public final double component11() {
        return this.winningAmount;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.__v;
    }

    public final double component4() {
        return this.cashbackAmount;
    }

    public final String component5() {
        return this.createdAt;
    }

    public final boolean component6() {
        return this.isDeleted;
    }

    public final int component7() {
        return this.joiningBonusAmount;
    }

    public final double component8() {
        return this.totalAmount;
    }

    public final String component9() {
        return this.updatedAt;
    }

    public final UserWallet copy(String str, String str2, int i, double d, String str3, boolean z, int i2, double d2, String str4, double d3, double d4) {
        String str5 = str;
        Intrinsics.checkNotNullParameter(str5, "_id");
        String str6 = str2;
        Intrinsics.checkNotNullParameter(str6, "userId");
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "createdAt");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "updatedAt");
        return new UserWallet(str5, str6, i, d, str7, z, i2, d2, str8, d3, d4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserWallet)) {
            return false;
        }
        UserWallet userWallet = (UserWallet) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) userWallet._id) && Intrinsics.areEqual((Object) this.userId, (Object) userWallet.userId) && this.__v == userWallet.__v && Intrinsics.areEqual((Object) Double.valueOf(this.cashbackAmount), (Object) Double.valueOf(userWallet.cashbackAmount)) && Intrinsics.areEqual((Object) this.createdAt, (Object) userWallet.createdAt) && this.isDeleted == userWallet.isDeleted && this.joiningBonusAmount == userWallet.joiningBonusAmount && Intrinsics.areEqual((Object) Double.valueOf(this.totalAmount), (Object) Double.valueOf(userWallet.totalAmount)) && Intrinsics.areEqual((Object) this.updatedAt, (Object) userWallet.updatedAt) && Intrinsics.areEqual((Object) Double.valueOf(this.walletAmount), (Object) Double.valueOf(userWallet.walletAmount)) && Intrinsics.areEqual((Object) Double.valueOf(this.winningAmount), (Object) Double.valueOf(userWallet.winningAmount));
    }

    public int hashCode() {
        int hashCode = ((((((((this._id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.__v) * 31) + Double.doubleToLongBits(this.cashbackAmount)) * 31) + this.createdAt.hashCode()) * 31;
        boolean z = this.isDeleted;
        if (z) {
            z = true;
        }
        return ((((((((((hashCode + (z ? 1 : 0)) * 31) + this.joiningBonusAmount) * 31) + Double.doubleToLongBits(this.totalAmount)) * 31) + this.updatedAt.hashCode()) * 31) + Double.doubleToLongBits(this.walletAmount)) * 31) + Double.doubleToLongBits(this.winningAmount);
    }

    public String toString() {
        return "UserWallet(_id=" + this._id + ", userId=" + this.userId + ", __v=" + this.__v + ", cashbackAmount=" + this.cashbackAmount + ", createdAt=" + this.createdAt + ", isDeleted=" + this.isDeleted + ", joiningBonusAmount=" + this.joiningBonusAmount + ", totalAmount=" + this.totalAmount + ", updatedAt=" + this.updatedAt + ", walletAmount=" + this.walletAmount + ", winningAmount=" + this.winningAmount + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.userId);
        parcel.writeInt(this.__v);
        parcel.writeDouble(this.cashbackAmount);
        parcel.writeString(this.createdAt);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeInt(this.joiningBonusAmount);
        parcel.writeDouble(this.totalAmount);
        parcel.writeString(this.updatedAt);
        parcel.writeDouble(this.walletAmount);
        parcel.writeDouble(this.winningAmount);
    }

    public UserWallet(String str, String str2, int i, double d, String str3, boolean z, int i2, double d2, String str4, double d3, double d4) {
        String str5 = str4;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(str5, "updatedAt");
        this._id = str;
        this.userId = str2;
        this.__v = i;
        this.cashbackAmount = d;
        this.createdAt = str3;
        this.isDeleted = z;
        this.joiningBonusAmount = i2;
        this.totalAmount = d2;
        this.updatedAt = str5;
        this.walletAmount = d3;
        this.winningAmount = d4;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int get__v() {
        return this.__v;
    }

    public final double getCashbackAmount() {
        return this.cashbackAmount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final int getJoiningBonusAmount() {
        return this.joiningBonusAmount;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final double getWalletAmount() {
        return this.walletAmount;
    }

    public final double getWinningAmount() {
        return this.winningAmount;
    }
}
