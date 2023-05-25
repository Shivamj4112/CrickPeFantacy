package com.crickpe.view.detail.fragments.player_reward_fragment.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerStat;", "", "_id", "", "amount", "", "fantasyPoints", "", "rank", "", "match", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Match;", "(Ljava/lang/String;DFILcom/crickpe/view/detail/fragments/player_reward_fragment/models/Match;)V", "get_id", "()Ljava/lang/String;", "getAmount", "()D", "getFantasyPoints", "()F", "getMatch", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Match;", "getRank", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayerStat.kt */
public final class PlayerStat {
    private final String _id;
    private final double amount;
    private final float fantasyPoints;
    private final Match match;
    private final int rank;

    public static /* synthetic */ PlayerStat copy$default(PlayerStat playerStat, String str, double d, float f, int i, Match match2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = playerStat._id;
        }
        if ((i2 & 2) != 0) {
            d = playerStat.amount;
        }
        double d2 = d;
        if ((i2 & 4) != 0) {
            f = playerStat.fantasyPoints;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            i = playerStat.rank;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            match2 = playerStat.match;
        }
        return playerStat.copy(str, d2, f2, i3, match2);
    }

    public final String component1() {
        return this._id;
    }

    public final double component2() {
        return this.amount;
    }

    public final float component3() {
        return this.fantasyPoints;
    }

    public final int component4() {
        return this.rank;
    }

    public final Match component5() {
        return this.match;
    }

    public final PlayerStat copy(String str, double d, float f, int i, Match match2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(match2, "match");
        return new PlayerStat(str, d, f, i, match2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerStat)) {
            return false;
        }
        PlayerStat playerStat = (PlayerStat) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) playerStat._id) && Intrinsics.areEqual((Object) Double.valueOf(this.amount), (Object) Double.valueOf(playerStat.amount)) && Intrinsics.areEqual((Object) Float.valueOf(this.fantasyPoints), (Object) Float.valueOf(playerStat.fantasyPoints)) && this.rank == playerStat.rank && Intrinsics.areEqual((Object) this.match, (Object) playerStat.match);
    }

    public int hashCode() {
        return (((((((this._id.hashCode() * 31) + Double.doubleToLongBits(this.amount)) * 31) + Float.floatToIntBits(this.fantasyPoints)) * 31) + this.rank) * 31) + this.match.hashCode();
    }

    public String toString() {
        return "PlayerStat(_id=" + this._id + ", amount=" + this.amount + ", fantasyPoints=" + this.fantasyPoints + ", rank=" + this.rank + ", match=" + this.match + ')';
    }

    public PlayerStat(String str, double d, float f, int i, Match match2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(match2, "match");
        this._id = str;
        this.amount = d;
        this.fantasyPoints = f;
        this.rank = i;
        this.match = match2;
    }

    public final String get_id() {
        return this._id;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final float getFantasyPoints() {
        return this.fantasyPoints;
    }

    public final int getRank() {
        return this.rank;
    }

    public final Match getMatch() {
        return this.match;
    }
}
