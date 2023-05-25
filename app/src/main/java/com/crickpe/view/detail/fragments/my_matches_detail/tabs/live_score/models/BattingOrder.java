package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BattingOrder;", "", "battingScore", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BattingScore;", "playerName", "", "_id", "(Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BattingScore;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getBattingScore", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BattingScore;", "getPlayerName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BattingOrder.kt */
public final class BattingOrder {
    private final String _id;
    private final BattingScore battingScore;
    private final String playerName;

    public static /* synthetic */ BattingOrder copy$default(BattingOrder battingOrder, BattingScore battingScore2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            battingScore2 = battingOrder.battingScore;
        }
        if ((i & 2) != 0) {
            str = battingOrder.playerName;
        }
        if ((i & 4) != 0) {
            str2 = battingOrder._id;
        }
        return battingOrder.copy(battingScore2, str, str2);
    }

    public final BattingScore component1() {
        return this.battingScore;
    }

    public final String component2() {
        return this.playerName;
    }

    public final String component3() {
        return this._id;
    }

    public final BattingOrder copy(BattingScore battingScore2, String str, String str2) {
        Intrinsics.checkNotNullParameter(battingScore2, "battingScore");
        Intrinsics.checkNotNullParameter(str, "playerName");
        Intrinsics.checkNotNullParameter(str2, "_id");
        return new BattingOrder(battingScore2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BattingOrder)) {
            return false;
        }
        BattingOrder battingOrder = (BattingOrder) obj;
        return Intrinsics.areEqual((Object) this.battingScore, (Object) battingOrder.battingScore) && Intrinsics.areEqual((Object) this.playerName, (Object) battingOrder.playerName) && Intrinsics.areEqual((Object) this._id, (Object) battingOrder._id);
    }

    public int hashCode() {
        return (((this.battingScore.hashCode() * 31) + this.playerName.hashCode()) * 31) + this._id.hashCode();
    }

    public String toString() {
        return "BattingOrder(battingScore=" + this.battingScore + ", playerName=" + this.playerName + ", _id=" + this._id + ')';
    }

    public BattingOrder(BattingScore battingScore2, String str, String str2) {
        Intrinsics.checkNotNullParameter(battingScore2, "battingScore");
        Intrinsics.checkNotNullParameter(str, "playerName");
        Intrinsics.checkNotNullParameter(str2, "_id");
        this.battingScore = battingScore2;
        this.playerName = str;
        this._id = str2;
    }

    public final BattingScore getBattingScore() {
        return this.battingScore;
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final String get_id() {
        return this._id;
    }
}
