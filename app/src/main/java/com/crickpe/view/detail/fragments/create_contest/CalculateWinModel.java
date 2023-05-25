package com.crickpe.view.detail.fragments.create_contest;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/CalculateWinModel;", "", "prizePool", "", "totalWin", "teamWinnings", "", "Lcom/crickpe/view/detail/fragments/create_contest/TeamWinnings;", "(IILjava/util/List;)V", "getPrizePool", "()I", "getTeamWinnings", "()Ljava/util/List;", "getTotalWin", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CalculateWinModel.kt */
public final class CalculateWinModel {
    @SerializedName("prizePool")
    private final int prizePool;
    @SerializedName("teamWinnings")
    private final List<TeamWinnings> teamWinnings;
    @SerializedName("totalWin")
    private final int totalWin;

    public static /* synthetic */ CalculateWinModel copy$default(CalculateWinModel calculateWinModel, int i, int i2, List<TeamWinnings> list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = calculateWinModel.prizePool;
        }
        if ((i3 & 2) != 0) {
            i2 = calculateWinModel.totalWin;
        }
        if ((i3 & 4) != 0) {
            list = calculateWinModel.teamWinnings;
        }
        return calculateWinModel.copy(i, i2, list);
    }

    public final int component1() {
        return this.prizePool;
    }

    public final int component2() {
        return this.totalWin;
    }

    public final List<TeamWinnings> component3() {
        return this.teamWinnings;
    }

    public final CalculateWinModel copy(int i, int i2, List<TeamWinnings> list) {
        Intrinsics.checkNotNullParameter(list, "teamWinnings");
        return new CalculateWinModel(i, i2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculateWinModel)) {
            return false;
        }
        CalculateWinModel calculateWinModel = (CalculateWinModel) obj;
        return this.prizePool == calculateWinModel.prizePool && this.totalWin == calculateWinModel.totalWin && Intrinsics.areEqual((Object) this.teamWinnings, (Object) calculateWinModel.teamWinnings);
    }

    public int hashCode() {
        return (((this.prizePool * 31) + this.totalWin) * 31) + this.teamWinnings.hashCode();
    }

    public String toString() {
        return "CalculateWinModel(prizePool=" + this.prizePool + ", totalWin=" + this.totalWin + ", teamWinnings=" + this.teamWinnings + ')';
    }

    public CalculateWinModel(int i, int i2, List<TeamWinnings> list) {
        Intrinsics.checkNotNullParameter(list, "teamWinnings");
        this.prizePool = i;
        this.totalWin = i2;
        this.teamWinnings = list;
    }

    public final int getPrizePool() {
        return this.prizePool;
    }

    public final int getTotalWin() {
        return this.totalWin;
    }

    public final List<TeamWinnings> getTeamWinnings() {
        return this.teamWinnings;
    }
}
