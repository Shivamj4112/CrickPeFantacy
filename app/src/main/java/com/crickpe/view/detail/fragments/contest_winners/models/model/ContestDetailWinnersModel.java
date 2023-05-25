package com.crickpe.view.detail.fragments.contest_winners.models.model;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_winners/models/model/ContestDetailWinnersModel;", "", "winners", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/Winners;", "winnerFilters", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnerFilter;", "Lkotlin/collections/ArrayList;", "(Lcom/crickpe/view/detail/fragments/contest_winners/models/model/Winners;Ljava/util/ArrayList;)V", "getWinnerFilters", "()Ljava/util/ArrayList;", "getWinners", "()Lcom/crickpe/view/detail/fragments/contest_winners/models/model/Winners;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailWinnersModel.kt */
public final class ContestDetailWinnersModel {
    private final ArrayList<WinnerFilter> winnerFilters;
    private final Winners winners;

    public static /* synthetic */ ContestDetailWinnersModel copy$default(ContestDetailWinnersModel contestDetailWinnersModel, Winners winners2, ArrayList<WinnerFilter> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            winners2 = contestDetailWinnersModel.winners;
        }
        if ((i & 2) != 0) {
            arrayList = contestDetailWinnersModel.winnerFilters;
        }
        return contestDetailWinnersModel.copy(winners2, arrayList);
    }

    public final Winners component1() {
        return this.winners;
    }

    public final ArrayList<WinnerFilter> component2() {
        return this.winnerFilters;
    }

    public final ContestDetailWinnersModel copy(Winners winners2, ArrayList<WinnerFilter> arrayList) {
        Intrinsics.checkNotNullParameter(winners2, "winners");
        Intrinsics.checkNotNullParameter(arrayList, "winnerFilters");
        return new ContestDetailWinnersModel(winners2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContestDetailWinnersModel)) {
            return false;
        }
        ContestDetailWinnersModel contestDetailWinnersModel = (ContestDetailWinnersModel) obj;
        return Intrinsics.areEqual((Object) this.winners, (Object) contestDetailWinnersModel.winners) && Intrinsics.areEqual((Object) this.winnerFilters, (Object) contestDetailWinnersModel.winnerFilters);
    }

    public int hashCode() {
        return (this.winners.hashCode() * 31) + this.winnerFilters.hashCode();
    }

    public String toString() {
        return "ContestDetailWinnersModel(winners=" + this.winners + ", winnerFilters=" + this.winnerFilters + ')';
    }

    public ContestDetailWinnersModel(Winners winners2, ArrayList<WinnerFilter> arrayList) {
        Intrinsics.checkNotNullParameter(winners2, "winners");
        Intrinsics.checkNotNullParameter(arrayList, "winnerFilters");
        this.winners = winners2;
        this.winnerFilters = arrayList;
    }

    public final Winners getWinners() {
        return this.winners;
    }

    public final ArrayList<WinnerFilter> getWinnerFilters() {
        return this.winnerFilters;
    }
}
