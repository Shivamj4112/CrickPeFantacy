package com.crickpe.view.home.fragments.rewards.tracker_model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/tracker_model/HighestRewardPlayers;", "", "totalCount", "", "list", "", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/RewardItem;", "(ILjava/util/List;)V", "getList", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HighestRewardPlayers.kt */
public final class HighestRewardPlayers {
    private final List<RewardItem> list;
    private final int totalCount;

    public static /* synthetic */ HighestRewardPlayers copy$default(HighestRewardPlayers highestRewardPlayers, int i, List<RewardItem> list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = highestRewardPlayers.totalCount;
        }
        if ((i2 & 2) != 0) {
            list2 = highestRewardPlayers.list;
        }
        return highestRewardPlayers.copy(i, list2);
    }

    public final int component1() {
        return this.totalCount;
    }

    public final List<RewardItem> component2() {
        return this.list;
    }

    public final HighestRewardPlayers copy(int i, List<RewardItem> list2) {
        Intrinsics.checkNotNullParameter(list2, "list");
        return new HighestRewardPlayers(i, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighestRewardPlayers)) {
            return false;
        }
        HighestRewardPlayers highestRewardPlayers = (HighestRewardPlayers) obj;
        return this.totalCount == highestRewardPlayers.totalCount && Intrinsics.areEqual((Object) this.list, (Object) highestRewardPlayers.list);
    }

    public int hashCode() {
        return (this.totalCount * 31) + this.list.hashCode();
    }

    public String toString() {
        return "HighestRewardPlayers(totalCount=" + this.totalCount + ", list=" + this.list + ')';
    }

    public HighestRewardPlayers(int i, List<RewardItem> list2) {
        Intrinsics.checkNotNullParameter(list2, "list");
        this.totalCount = i;
        this.list = list2;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final List<RewardItem> getList() {
        return this.list;
    }
}
