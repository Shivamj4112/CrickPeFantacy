package com.crickpe.view.detail.fragments.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003Jc\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\u0013\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\u0019\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006/"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/TransactionsInfo;", "Landroid/os/Parcelable;", "_id", "", "userId", "transactionType", "", "type", "amount", "isDeleted", "", "createdAt", "updatedAt", "__v", "(Ljava/lang/String;Ljava/lang/String;IIIZLjava/lang/String;Ljava/lang/String;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getAmount", "getCreatedAt", "()Z", "getTransactionType", "getType", "getUpdatedAt", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WalletModel.kt */
public final class TransactionsInfo implements Parcelable {
    public static final Parcelable.Creator<TransactionsInfo> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("amount")
    private final int amount;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("transactionType")
    private final int transactionType;
    @SerializedName("type")
    private final int type;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("userId")
    private final String userId;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WalletModel.kt */
    public static final class Creator implements Parcelable.Creator<TransactionsInfo> {
        public final TransactionsInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransactionsInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final TransactionsInfo[] newArray(int i) {
            return new TransactionsInfo[i];
        }
    }

    public static /* synthetic */ TransactionsInfo copy$default(TransactionsInfo transactionsInfo, String str, String str2, int i, int i2, int i3, boolean z, String str3, String str4, int i4, int i5, Object obj) {
        TransactionsInfo transactionsInfo2 = transactionsInfo;
        int i6 = i5;
        return transactionsInfo.copy((i6 & 1) != 0 ? transactionsInfo2._id : str, (i6 & 2) != 0 ? transactionsInfo2.userId : str2, (i6 & 4) != 0 ? transactionsInfo2.transactionType : i, (i6 & 8) != 0 ? transactionsInfo2.type : i2, (i6 & 16) != 0 ? transactionsInfo2.amount : i3, (i6 & 32) != 0 ? transactionsInfo2.isDeleted : z, (i6 & 64) != 0 ? transactionsInfo2.createdAt : str3, (i6 & 128) != 0 ? transactionsInfo2.updatedAt : str4, (i6 & 256) != 0 ? transactionsInfo2.__v : i4);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.transactionType;
    }

    public final int component4() {
        return this.type;
    }

    public final int component5() {
        return this.amount;
    }

    public final boolean component6() {
        return this.isDeleted;
    }

    public final String component7() {
        return this.createdAt;
    }

    public final String component8() {
        return this.updatedAt;
    }

    public final int component9() {
        return this.__v;
    }

    public final TransactionsInfo copy(String str, String str2, int i, int i2, int i3, boolean z, String str3, String str4, int i4) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        String str5 = str3;
        Intrinsics.checkNotNullParameter(str5, "createdAt");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "updatedAt");
        return new TransactionsInfo(str, str2, i, i2, i3, z, str5, str6, i4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionsInfo)) {
            return false;
        }
        TransactionsInfo transactionsInfo = (TransactionsInfo) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) transactionsInfo._id) && Intrinsics.areEqual((Object) this.userId, (Object) transactionsInfo.userId) && this.transactionType == transactionsInfo.transactionType && this.type == transactionsInfo.type && this.amount == transactionsInfo.amount && this.isDeleted == transactionsInfo.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) transactionsInfo.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) transactionsInfo.updatedAt) && this.__v == transactionsInfo.__v;
    }

    public int hashCode() {
        int hashCode = ((((((((this._id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.transactionType) * 31) + this.type) * 31) + this.amount) * 31;
        boolean z = this.isDeleted;
        if (z) {
            z = true;
        }
        return ((((((hashCode + (z ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v;
    }

    public String toString() {
        return "TransactionsInfo(_id=" + this._id + ", userId=" + this.userId + ", transactionType=" + this.transactionType + ", type=" + this.type + ", amount=" + this.amount + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.userId);
        parcel.writeInt(this.transactionType);
        parcel.writeInt(this.type);
        parcel.writeInt(this.amount);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
    }

    public TransactionsInfo(String str, String str2, int i, int i2, int i3, boolean z, String str3, String str4, int i4) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(str4, "updatedAt");
        this._id = str;
        this.userId = str2;
        this.transactionType = i;
        this.type = i2;
        this.amount = i3;
        this.isDeleted = z;
        this.createdAt = str3;
        this.updatedAt = str4;
        this.__v = i4;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getTransactionType() {
        return this.transactionType;
    }

    public final int getType() {
        return this.type;
    }

    public final int getAmount() {
        return this.amount;
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
