package com.crickpe.view.detail.fragments.wallet.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006'"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/models/Transactions;", "Landroid/os/Parcelable;", "_id", "", "winningAmount", "", "topUpAmount", "withdrawAmount", "cashBackAmount", "rewardAmount", "(IDDDDD)V", "get_id", "()I", "getCashBackAmount", "()D", "getRewardAmount", "getTopUpAmount", "getWinningAmount", "getWithdrawAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Transactions.kt */
public final class Transactions implements Parcelable {
    public static final Parcelable.Creator<Transactions> CREATOR = new Creator();
    private final int _id;
    private final double cashBackAmount;
    private final double rewardAmount;
    private final double topUpAmount;
    private final double winningAmount;
    private final double withdrawAmount;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: Transactions.kt */
    public static final class Creator implements Parcelable.Creator<Transactions> {
        public final Transactions createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Transactions(parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        public final Transactions[] newArray(int i) {
            return new Transactions[i];
        }
    }

    public static /* synthetic */ Transactions copy$default(Transactions transactions, int i, double d, double d2, double d3, double d4, double d5, int i2, Object obj) {
        Transactions transactions2 = transactions;
        return transactions.copy((i2 & 1) != 0 ? transactions2._id : i, (i2 & 2) != 0 ? transactions2.winningAmount : d, (i2 & 4) != 0 ? transactions2.topUpAmount : d2, (i2 & 8) != 0 ? transactions2.withdrawAmount : d3, (i2 & 16) != 0 ? transactions2.cashBackAmount : d4, (i2 & 32) != 0 ? transactions2.rewardAmount : d5);
    }

    public final int component1() {
        return this._id;
    }

    public final double component2() {
        return this.winningAmount;
    }

    public final double component3() {
        return this.topUpAmount;
    }

    public final double component4() {
        return this.withdrawAmount;
    }

    public final double component5() {
        return this.cashBackAmount;
    }

    public final double component6() {
        return this.rewardAmount;
    }

    public final Transactions copy(int i, double d, double d2, double d3, double d4, double d5) {
        return new Transactions(i, d, d2, d3, d4, d5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transactions)) {
            return false;
        }
        Transactions transactions = (Transactions) obj;
        return this._id == transactions._id && Intrinsics.areEqual((Object) Double.valueOf(this.winningAmount), (Object) Double.valueOf(transactions.winningAmount)) && Intrinsics.areEqual((Object) Double.valueOf(this.topUpAmount), (Object) Double.valueOf(transactions.topUpAmount)) && Intrinsics.areEqual((Object) Double.valueOf(this.withdrawAmount), (Object) Double.valueOf(transactions.withdrawAmount)) && Intrinsics.areEqual((Object) Double.valueOf(this.cashBackAmount), (Object) Double.valueOf(transactions.cashBackAmount)) && Intrinsics.areEqual((Object) Double.valueOf(this.rewardAmount), (Object) Double.valueOf(transactions.rewardAmount));
    }

    public int hashCode() {
        return (((((((((this._id * 31) + Double.doubleToLongBits(this.winningAmount)) * 31) + Double.doubleToLongBits(this.topUpAmount)) * 31) + Double.doubleToLongBits(this.withdrawAmount)) * 31) + Double.doubleToLongBits(this.cashBackAmount)) * 31) + Double.doubleToLongBits(this.rewardAmount);
    }

    public String toString() {
        return "Transactions(_id=" + this._id + ", winningAmount=" + this.winningAmount + ", topUpAmount=" + this.topUpAmount + ", withdrawAmount=" + this.withdrawAmount + ", cashBackAmount=" + this.cashBackAmount + ", rewardAmount=" + this.rewardAmount + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this._id);
        parcel.writeDouble(this.winningAmount);
        parcel.writeDouble(this.topUpAmount);
        parcel.writeDouble(this.withdrawAmount);
        parcel.writeDouble(this.cashBackAmount);
        parcel.writeDouble(this.rewardAmount);
    }

    public Transactions(int i, double d, double d2, double d3, double d4, double d5) {
        this._id = i;
        this.winningAmount = d;
        this.topUpAmount = d2;
        this.withdrawAmount = d3;
        this.cashBackAmount = d4;
        this.rewardAmount = d5;
    }

    public final int get_id() {
        return this._id;
    }

    public final double getWinningAmount() {
        return this.winningAmount;
    }

    public final double getTopUpAmount() {
        return this.topUpAmount;
    }

    public final double getWithdrawAmount() {
        return this.withdrawAmount;
    }

    public final double getCashBackAmount() {
        return this.cashBackAmount;
    }

    public final double getRewardAmount() {
        return this.rewardAmount;
    }
}
