package com.crickpe.view.detail.fragments.contest_winners.models.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_winners/models/model/Winners;", "", "_id", "", "winningAmount", "", "match", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/Match;", "winnersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnersList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;ILcom/crickpe/view/detail/fragments/contest_winners/models/model/Match;Ljava/util/ArrayList;)V", "get_id", "()Ljava/lang/String;", "getMatch", "()Lcom/crickpe/view/detail/fragments/contest_winners/models/model/Match;", "getWinnersList", "()Ljava/util/ArrayList;", "getWinningAmount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Winners.kt */
public final class Winners {
    private final String _id;
    private final Match match;
    private final ArrayList<WinnersList> winnersList;
    private final int winningAmount;

    public static /* synthetic */ Winners copy$default(Winners winners, String str, int i, Match match2, ArrayList<WinnersList> arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = winners._id;
        }
        if ((i2 & 2) != 0) {
            i = winners.winningAmount;
        }
        if ((i2 & 4) != 0) {
            match2 = winners.match;
        }
        if ((i2 & 8) != 0) {
            arrayList = winners.winnersList;
        }
        return winners.copy(str, i, match2, arrayList);
    }

    public final String component1() {
        return this._id;
    }

    public final int component2() {
        return this.winningAmount;
    }

    public final Match component3() {
        return this.match;
    }

    public final ArrayList<WinnersList> component4() {
        return this.winnersList;
    }

    public final Winners copy(String str, int i, Match match2, ArrayList<WinnersList> arrayList) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(match2, "match");
        Intrinsics.checkNotNullParameter(arrayList, "winnersList");
        return new Winners(str, i, match2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Winners)) {
            return false;
        }
        Winners winners = (Winners) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) winners._id) && this.winningAmount == winners.winningAmount && Intrinsics.areEqual((Object) this.match, (Object) winners.match) && Intrinsics.areEqual((Object) this.winnersList, (Object) winners.winnersList);
    }

    public int hashCode() {
        return (((((this._id.hashCode() * 31) + this.winningAmount) * 31) + this.match.hashCode()) * 31) + this.winnersList.hashCode();
    }

    public String toString() {
        return "Winners(_id=" + this._id + ", winningAmount=" + this.winningAmount + ", match=" + this.match + ", winnersList=" + this.winnersList + ')';
    }

    public Winners(String str, int i, Match match2, ArrayList<WinnersList> arrayList) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(match2, "match");
        Intrinsics.checkNotNullParameter(arrayList, "winnersList");
        this._id = str;
        this.winningAmount = i;
        this.match = match2;
        this.winnersList = arrayList;
    }

    public final String get_id() {
        return this._id;
    }

    public final int getWinningAmount() {
        return this.winningAmount;
    }

    public final Match getMatch() {
        return this.match;
    }

    public final ArrayList<WinnersList> getWinnersList() {
        return this.winnersList;
    }
}
