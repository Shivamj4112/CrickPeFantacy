package com.crickpe.view.detail.fragments.top_players.models;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\u0002\u0010\bJ\u0019\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0003J=\u0010\u000e\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayersModel;", "", "result", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/top_players/models/Result;", "Lkotlin/collections/ArrayList;", "topPlayerFilters", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayerFilter;", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getResult", "()Ljava/util/ArrayList;", "getTopPlayerFilters", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopPlayersModel.kt */
public final class TopPlayersModel {
    private final ArrayList<Result> result;
    private final ArrayList<TopPlayerFilter> topPlayerFilters;

    public static /* synthetic */ TopPlayersModel copy$default(TopPlayersModel topPlayersModel, ArrayList<Result> arrayList, ArrayList<TopPlayerFilter> arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = topPlayersModel.result;
        }
        if ((i & 2) != 0) {
            arrayList2 = topPlayersModel.topPlayerFilters;
        }
        return topPlayersModel.copy(arrayList, arrayList2);
    }

    public final ArrayList<Result> component1() {
        return this.result;
    }

    public final ArrayList<TopPlayerFilter> component2() {
        return this.topPlayerFilters;
    }

    public final TopPlayersModel copy(ArrayList<Result> arrayList, ArrayList<TopPlayerFilter> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "result");
        Intrinsics.checkNotNullParameter(arrayList2, "topPlayerFilters");
        return new TopPlayersModel(arrayList, arrayList2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopPlayersModel)) {
            return false;
        }
        TopPlayersModel topPlayersModel = (TopPlayersModel) obj;
        return Intrinsics.areEqual((Object) this.result, (Object) topPlayersModel.result) && Intrinsics.areEqual((Object) this.topPlayerFilters, (Object) topPlayersModel.topPlayerFilters);
    }

    public int hashCode() {
        return (this.result.hashCode() * 31) + this.topPlayerFilters.hashCode();
    }

    public String toString() {
        return "TopPlayersModel(result=" + this.result + ", topPlayerFilters=" + this.topPlayerFilters + ')';
    }

    public TopPlayersModel(ArrayList<Result> arrayList, ArrayList<TopPlayerFilter> arrayList2) {
        Intrinsics.checkNotNullParameter(arrayList, "result");
        Intrinsics.checkNotNullParameter(arrayList2, "topPlayerFilters");
        this.result = arrayList;
        this.topPlayerFilters = arrayList2;
    }

    public final ArrayList<Result> getResult() {
        return this.result;
    }

    public final ArrayList<TopPlayerFilter> getTopPlayerFilters() {
        return this.topPlayerFilters;
    }
}
