package com.crickpe.view.detail.fragments.create_contest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001a"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/TeamWinnings;", "", "amount", "", "rankStart", "", "rankEnd", "percentage", "(DIID)V", "getAmount", "()D", "getPercentage", "getRankEnd", "()I", "getRankStart", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CalculateWinModel.kt */
public final class TeamWinnings {
    @SerializedName("amount")
    private final double amount;
    @SerializedName("percentage")
    private final double percentage;
    @SerializedName("rankEnd")
    private final int rankEnd;
    @SerializedName("rankStart")
    private final int rankStart;

    public static /* synthetic */ TeamWinnings copy$default(TeamWinnings teamWinnings, double d, int i, int i2, double d2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d = teamWinnings.amount;
        }
        double d3 = d;
        if ((i3 & 2) != 0) {
            i = teamWinnings.rankStart;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = teamWinnings.rankEnd;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            d2 = teamWinnings.percentage;
        }
        return teamWinnings.copy(d3, i4, i5, d2);
    }

    public final double component1() {
        return this.amount;
    }

    public final int component2() {
        return this.rankStart;
    }

    public final int component3() {
        return this.rankEnd;
    }

    public final double component4() {
        return this.percentage;
    }

    public final TeamWinnings copy(double d, int i, int i2, double d2) {
        return new TeamWinnings(d, i, i2, d2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamWinnings)) {
            return false;
        }
        TeamWinnings teamWinnings = (TeamWinnings) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.amount), (Object) Double.valueOf(teamWinnings.amount)) && this.rankStart == teamWinnings.rankStart && this.rankEnd == teamWinnings.rankEnd && Intrinsics.areEqual((Object) Double.valueOf(this.percentage), (Object) Double.valueOf(teamWinnings.percentage));
    }

    public int hashCode() {
        return (((((Double.doubleToLongBits(this.amount) * 31) + this.rankStart) * 31) + this.rankEnd) * 31) + Double.doubleToLongBits(this.percentage);
    }

    public String toString() {
        return "TeamWinnings(amount=" + this.amount + ", rankStart=" + this.rankStart + ", rankEnd=" + this.rankEnd + ", percentage=" + this.percentage + ')';
    }

    public TeamWinnings(double d, int i, int i2, double d2) {
        this.amount = d;
        this.rankStart = i;
        this.rankEnd = i2;
        this.percentage = d2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TeamWinnings(double d, int i, int i2, double d2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, i, (i3 & 4) != 0 ? 0 : i2, d2);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final int getRankStart() {
        return this.rankStart;
    }

    public final int getRankEnd() {
        return this.rankEnd;
    }

    public final double getPercentage() {
        return this.percentage;
    }
}
