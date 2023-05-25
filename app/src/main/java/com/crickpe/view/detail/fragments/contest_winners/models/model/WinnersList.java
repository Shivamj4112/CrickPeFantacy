package com.crickpe.view.detail.fragments.contest_winners.models.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003JY\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019¨\u0006-"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnersList;", "", "_id", "", "totalFantasyPoint", "", "rank", "", "amount", "", "userType", "userInfo", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/UserInfo;", "fantasyTeamId", "playerInfo", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/PlayerInfo;", "(Ljava/lang/String;FIDILcom/crickpe/view/detail/fragments/contest_winners/models/model/UserInfo;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/contest_winners/models/model/PlayerInfo;)V", "get_id", "()Ljava/lang/String;", "getAmount", "()D", "getFantasyTeamId", "getPlayerInfo", "()Lcom/crickpe/view/detail/fragments/contest_winners/models/model/PlayerInfo;", "getRank", "()I", "getTotalFantasyPoint", "()F", "getUserInfo", "()Lcom/crickpe/view/detail/fragments/contest_winners/models/model/UserInfo;", "getUserType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinnersList.kt */
public final class WinnersList {
    private final String _id;
    private final double amount;
    private final String fantasyTeamId;
    private final PlayerInfo playerInfo;
    private final int rank;
    private final float totalFantasyPoint;
    private final UserInfo userInfo;
    private final int userType;

    public static /* synthetic */ WinnersList copy$default(WinnersList winnersList, String str, float f, int i, double d, int i2, UserInfo userInfo2, String str2, PlayerInfo playerInfo2, int i3, Object obj) {
        WinnersList winnersList2 = winnersList;
        int i4 = i3;
        return winnersList.copy((i4 & 1) != 0 ? winnersList2._id : str, (i4 & 2) != 0 ? winnersList2.totalFantasyPoint : f, (i4 & 4) != 0 ? winnersList2.rank : i, (i4 & 8) != 0 ? winnersList2.amount : d, (i4 & 16) != 0 ? winnersList2.userType : i2, (i4 & 32) != 0 ? winnersList2.userInfo : userInfo2, (i4 & 64) != 0 ? winnersList2.fantasyTeamId : str2, (i4 & 128) != 0 ? winnersList2.playerInfo : playerInfo2);
    }

    public final String component1() {
        return this._id;
    }

    public final float component2() {
        return this.totalFantasyPoint;
    }

    public final int component3() {
        return this.rank;
    }

    public final double component4() {
        return this.amount;
    }

    public final int component5() {
        return this.userType;
    }

    public final UserInfo component6() {
        return this.userInfo;
    }

    public final String component7() {
        return this.fantasyTeamId;
    }

    public final PlayerInfo component8() {
        return this.playerInfo;
    }

    public final WinnersList copy(String str, float f, int i, double d, int i2, UserInfo userInfo2, String str2, PlayerInfo playerInfo2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        UserInfo userInfo3 = userInfo2;
        Intrinsics.checkNotNullParameter(userInfo3, "userInfo");
        String str3 = str2;
        Intrinsics.checkNotNullParameter(str3, "fantasyTeamId");
        PlayerInfo playerInfo3 = playerInfo2;
        Intrinsics.checkNotNullParameter(playerInfo3, "playerInfo");
        return new WinnersList(str, f, i, d, i2, userInfo3, str3, playerInfo3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinnersList)) {
            return false;
        }
        WinnersList winnersList = (WinnersList) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) winnersList._id) && Intrinsics.areEqual((Object) Float.valueOf(this.totalFantasyPoint), (Object) Float.valueOf(winnersList.totalFantasyPoint)) && this.rank == winnersList.rank && Intrinsics.areEqual((Object) Double.valueOf(this.amount), (Object) Double.valueOf(winnersList.amount)) && this.userType == winnersList.userType && Intrinsics.areEqual((Object) this.userInfo, (Object) winnersList.userInfo) && Intrinsics.areEqual((Object) this.fantasyTeamId, (Object) winnersList.fantasyTeamId) && Intrinsics.areEqual((Object) this.playerInfo, (Object) winnersList.playerInfo);
    }

    public int hashCode() {
        return (((((((((((((this._id.hashCode() * 31) + Float.floatToIntBits(this.totalFantasyPoint)) * 31) + this.rank) * 31) + Double.doubleToLongBits(this.amount)) * 31) + this.userType) * 31) + this.userInfo.hashCode()) * 31) + this.fantasyTeamId.hashCode()) * 31) + this.playerInfo.hashCode();
    }

    public String toString() {
        return "WinnersList(_id=" + this._id + ", totalFantasyPoint=" + this.totalFantasyPoint + ", rank=" + this.rank + ", amount=" + this.amount + ", userType=" + this.userType + ", userInfo=" + this.userInfo + ", fantasyTeamId=" + this.fantasyTeamId + ", playerInfo=" + this.playerInfo + ')';
    }

    public WinnersList(String str, float f, int i, double d, int i2, UserInfo userInfo2, String str2, PlayerInfo playerInfo2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(userInfo2, "userInfo");
        Intrinsics.checkNotNullParameter(str2, "fantasyTeamId");
        Intrinsics.checkNotNullParameter(playerInfo2, "playerInfo");
        this._id = str;
        this.totalFantasyPoint = f;
        this.rank = i;
        this.amount = d;
        this.userType = i2;
        this.userInfo = userInfo2;
        this.fantasyTeamId = str2;
        this.playerInfo = playerInfo2;
    }

    public final String get_id() {
        return this._id;
    }

    public final float getTotalFantasyPoint() {
        return this.totalFantasyPoint;
    }

    public final int getRank() {
        return this.rank;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final int getUserType() {
        return this.userType;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public final PlayerInfo getPlayerInfo() {
        return this.playerInfo;
    }
}
