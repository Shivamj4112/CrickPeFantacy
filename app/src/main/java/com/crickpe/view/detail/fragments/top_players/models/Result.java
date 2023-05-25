package com.crickpe.view.detail.fragments.top_players.models;

import com.crickpe.view.detail.fragments.player_reward_fragment.models.Teams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JC\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/top_players/models/Result;", "", "_id", "", "playerId", "totalAmount", "", "playerInfo", "Lcom/crickpe/view/detail/fragments/top_players/models/PlayerInfo;", "teams", "", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Teams;", "(Ljava/lang/String;Ljava/lang/String;DLcom/crickpe/view/detail/fragments/top_players/models/PlayerInfo;Ljava/util/List;)V", "get_id", "()Ljava/lang/String;", "getPlayerId", "getPlayerInfo", "()Lcom/crickpe/view/detail/fragments/top_players/models/PlayerInfo;", "getTeams", "()Ljava/util/List;", "getTotalAmount", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Result.kt */
public final class Result {
    private final String _id;
    private final String playerId;
    private final PlayerInfo playerInfo;
    private final List<Teams> teams;
    private final double totalAmount;

    public static /* synthetic */ Result copy$default(Result result, String str, String str2, double d, PlayerInfo playerInfo2, List<Teams> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = result._id;
        }
        if ((i & 2) != 0) {
            str2 = result.playerId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            d = result.totalAmount;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            playerInfo2 = result.playerInfo;
        }
        PlayerInfo playerInfo3 = playerInfo2;
        if ((i & 16) != 0) {
            list = result.teams;
        }
        return result.copy(str, str3, d2, playerInfo3, list);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.playerId;
    }

    public final double component3() {
        return this.totalAmount;
    }

    public final PlayerInfo component4() {
        return this.playerInfo;
    }

    public final List<Teams> component5() {
        return this.teams;
    }

    public final Result copy(String str, String str2, double d, PlayerInfo playerInfo2, List<Teams> list) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(list, "teams");
        return new Result(str, str2, d, playerInfo2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) result._id) && Intrinsics.areEqual((Object) this.playerId, (Object) result.playerId) && Intrinsics.areEqual((Object) Double.valueOf(this.totalAmount), (Object) Double.valueOf(result.totalAmount)) && Intrinsics.areEqual((Object) this.playerInfo, (Object) result.playerInfo) && Intrinsics.areEqual((Object) this.teams, (Object) result.teams);
    }

    public int hashCode() {
        int hashCode = ((((this._id.hashCode() * 31) + this.playerId.hashCode()) * 31) + Double.doubleToLongBits(this.totalAmount)) * 31;
        PlayerInfo playerInfo2 = this.playerInfo;
        return ((hashCode + (playerInfo2 == null ? 0 : playerInfo2.hashCode())) * 31) + this.teams.hashCode();
    }

    public String toString() {
        return "Result(_id=" + this._id + ", playerId=" + this.playerId + ", totalAmount=" + this.totalAmount + ", playerInfo=" + this.playerInfo + ", teams=" + this.teams + ')';
    }

    public Result(String str, String str2, double d, PlayerInfo playerInfo2, List<Teams> list) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(list, "teams");
        this._id = str;
        this.playerId = str2;
        this.totalAmount = d;
        this.playerInfo = playerInfo2;
        this.teams = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Result(String str, String str2, double d, PlayerInfo playerInfo2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, (i & 8) != 0 ? null : playerInfo2, list);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final PlayerInfo getPlayerInfo() {
        return this.playerInfo;
    }

    public final List<Teams> getTeams() {
        return this.teams;
    }
}
