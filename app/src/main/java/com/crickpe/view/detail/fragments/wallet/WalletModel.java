package com.crickpe.view.detail.fragments.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014¢\u0006\u0002\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0010HÆ\u0003J\u0019\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0014HÆ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0006HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R&\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006>"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/WalletModel;", "Landroid/os/Parcelable;", "_id", "", "userId", "__v", "", "cashbackAmount", "createdAt", "isDeleted", "", "joiningBonusAmount", "totalAmount", "updatedAt", "walletAmount", "winningAmount", "", "transactionsInfo", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/wallet/TransactionsInfo;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ZIILjava/lang/String;IFLjava/util/ArrayList;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getCashbackAmount", "getCreatedAt", "()Z", "getJoiningBonusAmount", "getTotalAmount", "getTransactionsInfo", "()Ljava/util/ArrayList;", "getUpdatedAt", "getUserId", "getWalletAmount", "getWinningAmount", "()F", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WalletModel.kt */
public final class WalletModel implements Parcelable {
    public static final Parcelable.Creator<WalletModel> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("cashbackAmount")
    private final int cashbackAmount;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("joiningBonusAmount")
    private final int joiningBonusAmount;
    @SerializedName("totalAmount")
    private final int totalAmount;
    @SerializedName("transactionsInfo")
    private final ArrayList<TransactionsInfo> transactionsInfo;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("userId")
    private final String userId;
    @SerializedName("walletAmount")
    private final int walletAmount;
    @SerializedName("winningAmount")
    private final float winningAmount;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WalletModel.kt */
    public static final class Creator implements Parcelable.Creator<WalletModel> {
        public final WalletModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            String readString4 = parcel.readString();
            int readInt5 = parcel.readInt();
            float readFloat = parcel.readFloat();
            int readInt6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt6);
            for (int i = 0; i != readInt6; i++) {
                arrayList.add(TransactionsInfo.CREATOR.createFromParcel(parcel2));
            }
            return new WalletModel(readString, readString2, readInt, readInt2, readString3, z, readInt3, readInt4, readString4, readInt5, readFloat, arrayList);
        }

        public final WalletModel[] newArray(int i) {
            return new WalletModel[i];
        }
    }

    public static /* synthetic */ WalletModel copy$default(WalletModel walletModel, String str, String str2, int i, int i2, String str3, boolean z, int i3, int i4, String str4, int i5, float f, ArrayList arrayList, int i6, Object obj) {
        WalletModel walletModel2 = walletModel;
        int i7 = i6;
        return walletModel.copy((i7 & 1) != 0 ? walletModel2._id : str, (i7 & 2) != 0 ? walletModel2.userId : str2, (i7 & 4) != 0 ? walletModel2.__v : i, (i7 & 8) != 0 ? walletModel2.cashbackAmount : i2, (i7 & 16) != 0 ? walletModel2.createdAt : str3, (i7 & 32) != 0 ? walletModel2.isDeleted : z, (i7 & 64) != 0 ? walletModel2.joiningBonusAmount : i3, (i7 & 128) != 0 ? walletModel2.totalAmount : i4, (i7 & 256) != 0 ? walletModel2.updatedAt : str4, (i7 & 512) != 0 ? walletModel2.walletAmount : i5, (i7 & 1024) != 0 ? walletModel2.winningAmount : f, (i7 & 2048) != 0 ? walletModel2.transactionsInfo : arrayList);
    }

    public final String component1() {
        return this._id;
    }

    public final int component10() {
        return this.walletAmount;
    }

    public final float component11() {
        return this.winningAmount;
    }

    public final ArrayList<TransactionsInfo> component12() {
        return this.transactionsInfo;
    }

    public final String component2() {
        return this.userId;
    }

    public final int component3() {
        return this.__v;
    }

    public final int component4() {
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

    public final int component8() {
        return this.totalAmount;
    }

    public final String component9() {
        return this.updatedAt;
    }

    public final WalletModel copy(String str, String str2, int i, int i2, String str3, boolean z, int i3, int i4, String str4, int i5, float f, ArrayList<TransactionsInfo> arrayList) {
        Intrinsics.checkNotNullParameter(str, "_id");
        String str5 = str2;
        Intrinsics.checkNotNullParameter(str5, "userId");
        String str6 = str3;
        Intrinsics.checkNotNullParameter(str6, "createdAt");
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "updatedAt");
        ArrayList<TransactionsInfo> arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList2, "transactionsInfo");
        return new WalletModel(str, str5, i, i2, str6, z, i3, i4, str7, i5, f, arrayList2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletModel)) {
            return false;
        }
        WalletModel walletModel = (WalletModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) walletModel._id) && Intrinsics.areEqual((Object) this.userId, (Object) walletModel.userId) && this.__v == walletModel.__v && this.cashbackAmount == walletModel.cashbackAmount && Intrinsics.areEqual((Object) this.createdAt, (Object) walletModel.createdAt) && this.isDeleted == walletModel.isDeleted && this.joiningBonusAmount == walletModel.joiningBonusAmount && this.totalAmount == walletModel.totalAmount && Intrinsics.areEqual((Object) this.updatedAt, (Object) walletModel.updatedAt) && this.walletAmount == walletModel.walletAmount && Intrinsics.areEqual((Object) Float.valueOf(this.winningAmount), (Object) Float.valueOf(walletModel.winningAmount)) && Intrinsics.areEqual((Object) this.transactionsInfo, (Object) walletModel.transactionsInfo);
    }

    public int hashCode() {
        int hashCode = ((((((((this._id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.__v) * 31) + this.cashbackAmount) * 31) + this.createdAt.hashCode()) * 31;
        boolean z = this.isDeleted;
        if (z) {
            z = true;
        }
        return ((((((((((((hashCode + (z ? 1 : 0)) * 31) + this.joiningBonusAmount) * 31) + this.totalAmount) * 31) + this.updatedAt.hashCode()) * 31) + this.walletAmount) * 31) + Float.floatToIntBits(this.winningAmount)) * 31) + this.transactionsInfo.hashCode();
    }

    public String toString() {
        return "WalletModel(_id=" + this._id + ", userId=" + this.userId + ", __v=" + this.__v + ", cashbackAmount=" + this.cashbackAmount + ", createdAt=" + this.createdAt + ", isDeleted=" + this.isDeleted + ", joiningBonusAmount=" + this.joiningBonusAmount + ", totalAmount=" + this.totalAmount + ", updatedAt=" + this.updatedAt + ", walletAmount=" + this.walletAmount + ", winningAmount=" + this.winningAmount + ", transactionsInfo=" + this.transactionsInfo + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.userId);
        parcel.writeInt(this.__v);
        parcel.writeInt(this.cashbackAmount);
        parcel.writeString(this.createdAt);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeInt(this.joiningBonusAmount);
        parcel.writeInt(this.totalAmount);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.walletAmount);
        parcel.writeFloat(this.winningAmount);
        ArrayList<TransactionsInfo> arrayList = this.transactionsInfo;
        parcel.writeInt(arrayList.size());
        Iterator<TransactionsInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public WalletModel(String str, String str2, int i, int i2, String str3, boolean z, int i3, int i4, String str4, int i5, float f, ArrayList<TransactionsInfo> arrayList) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(str4, "updatedAt");
        Intrinsics.checkNotNullParameter(arrayList, "transactionsInfo");
        this._id = str;
        this.userId = str2;
        this.__v = i;
        this.cashbackAmount = i2;
        this.createdAt = str3;
        this.isDeleted = z;
        this.joiningBonusAmount = i3;
        this.totalAmount = i4;
        this.updatedAt = str4;
        this.walletAmount = i5;
        this.winningAmount = f;
        this.transactionsInfo = arrayList;
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

    public final int getCashbackAmount() {
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

    public final int getTotalAmount() {
        return this.totalAmount;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getWalletAmount() {
        return this.walletAmount;
    }

    public final float getWinningAmount() {
        return this.winningAmount;
    }

    public final ArrayList<TransactionsInfo> getTransactionsInfo() {
        return this.transactionsInfo;
    }
}
