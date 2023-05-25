package com.crickpe.view.detail.fragments.select_team.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/select_team/model/WalletInfoModel;", "", "totalWalletAmount", "", "entryFee", "joiningBonusUsed", "remaingWalletBalance", "(DDDD)V", "getEntryFee", "()D", "getJoiningBonusUsed", "getRemaingWalletBalance", "getTotalWalletAmount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WalletInfoModel.kt */
public final class WalletInfoModel {
    private final double entryFee;
    private final double joiningBonusUsed;
    private final double remaingWalletBalance;
    private final double totalWalletAmount;

    public static /* synthetic */ WalletInfoModel copy$default(WalletInfoModel walletInfoModel, double d, double d2, double d3, double d4, int i, Object obj) {
        WalletInfoModel walletInfoModel2 = walletInfoModel;
        return walletInfoModel.copy((i & 1) != 0 ? walletInfoModel2.totalWalletAmount : d, (i & 2) != 0 ? walletInfoModel2.entryFee : d2, (i & 4) != 0 ? walletInfoModel2.joiningBonusUsed : d3, (i & 8) != 0 ? walletInfoModel2.remaingWalletBalance : d4);
    }

    public final double component1() {
        return this.totalWalletAmount;
    }

    public final double component2() {
        return this.entryFee;
    }

    public final double component3() {
        return this.joiningBonusUsed;
    }

    public final double component4() {
        return this.remaingWalletBalance;
    }

    public final WalletInfoModel copy(double d, double d2, double d3, double d4) {
        return new WalletInfoModel(d, d2, d3, d4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletInfoModel)) {
            return false;
        }
        WalletInfoModel walletInfoModel = (WalletInfoModel) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.totalWalletAmount), (Object) Double.valueOf(walletInfoModel.totalWalletAmount)) && Intrinsics.areEqual((Object) Double.valueOf(this.entryFee), (Object) Double.valueOf(walletInfoModel.entryFee)) && Intrinsics.areEqual((Object) Double.valueOf(this.joiningBonusUsed), (Object) Double.valueOf(walletInfoModel.joiningBonusUsed)) && Intrinsics.areEqual((Object) Double.valueOf(this.remaingWalletBalance), (Object) Double.valueOf(walletInfoModel.remaingWalletBalance));
    }

    public int hashCode() {
        return (((((Double.doubleToLongBits(this.totalWalletAmount) * 31) + Double.doubleToLongBits(this.entryFee)) * 31) + Double.doubleToLongBits(this.joiningBonusUsed)) * 31) + Double.doubleToLongBits(this.remaingWalletBalance);
    }

    public String toString() {
        return "WalletInfoModel(totalWalletAmount=" + this.totalWalletAmount + ", entryFee=" + this.entryFee + ", joiningBonusUsed=" + this.joiningBonusUsed + ", remaingWalletBalance=" + this.remaingWalletBalance + ')';
    }

    public WalletInfoModel(double d, double d2, double d3, double d4) {
        this.totalWalletAmount = d;
        this.entryFee = d2;
        this.joiningBonusUsed = d3;
        this.remaingWalletBalance = d4;
    }

    public final double getTotalWalletAmount() {
        return this.totalWalletAmount;
    }

    public final double getEntryFee() {
        return this.entryFee;
    }

    public final double getJoiningBonusUsed() {
        return this.joiningBonusUsed;
    }

    public final double getRemaingWalletBalance() {
        return this.remaingWalletBalance;
    }
}
