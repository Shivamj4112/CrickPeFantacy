package com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamIdsModelItem;", "", "fantasyTeamId", "", "(Ljava/lang/String;)V", "getFantasyTeamId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: FantasyTeamIdsModelItem.kt */
public final class FantasyTeamIdsModelItem {
    private final String fantasyTeamId;

    public static /* synthetic */ FantasyTeamIdsModelItem copy$default(FantasyTeamIdsModelItem fantasyTeamIdsModelItem, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fantasyTeamIdsModelItem.fantasyTeamId;
        }
        return fantasyTeamIdsModelItem.copy(str);
    }

    public final String component1() {
        return this.fantasyTeamId;
    }

    public final FantasyTeamIdsModelItem copy(String str) {
        Intrinsics.checkNotNullParameter(str, "fantasyTeamId");
        return new FantasyTeamIdsModelItem(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FantasyTeamIdsModelItem) && Intrinsics.areEqual((Object) this.fantasyTeamId, (Object) ((FantasyTeamIdsModelItem) obj).fantasyTeamId);
    }

    public int hashCode() {
        return this.fantasyTeamId.hashCode();
    }

    public String toString() {
        return "FantasyTeamIdsModelItem(fantasyTeamId=" + this.fantasyTeamId + ')';
    }

    public FantasyTeamIdsModelItem(String str) {
        Intrinsics.checkNotNullParameter(str, "fantasyTeamId");
        this.fantasyTeamId = str;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }
}
