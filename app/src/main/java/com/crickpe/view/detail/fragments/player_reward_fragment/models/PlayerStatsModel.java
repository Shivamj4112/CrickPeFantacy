package com.crickpe.view.detail.fragments.player_reward_fragment.models;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J1\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerStatsModel;", "", "player", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Player;", "playerStats", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerStat;", "Lkotlin/collections/ArrayList;", "(Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Player;Ljava/util/ArrayList;)V", "getPlayer", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Player;", "getPlayerStats", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayerStatsModel.kt */
public final class PlayerStatsModel {
    private final Player player;
    private final ArrayList<PlayerStat> playerStats;

    public static /* synthetic */ PlayerStatsModel copy$default(PlayerStatsModel playerStatsModel, Player player2, ArrayList<PlayerStat> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            player2 = playerStatsModel.player;
        }
        if ((i & 2) != 0) {
            arrayList = playerStatsModel.playerStats;
        }
        return playerStatsModel.copy(player2, arrayList);
    }

    public final Player component1() {
        return this.player;
    }

    public final ArrayList<PlayerStat> component2() {
        return this.playerStats;
    }

    public final PlayerStatsModel copy(Player player2, ArrayList<PlayerStat> arrayList) {
        Intrinsics.checkNotNullParameter(player2, "player");
        return new PlayerStatsModel(player2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerStatsModel)) {
            return false;
        }
        PlayerStatsModel playerStatsModel = (PlayerStatsModel) obj;
        return Intrinsics.areEqual((Object) this.player, (Object) playerStatsModel.player) && Intrinsics.areEqual((Object) this.playerStats, (Object) playerStatsModel.playerStats);
    }

    public int hashCode() {
        int hashCode = this.player.hashCode() * 31;
        ArrayList<PlayerStat> arrayList = this.playerStats;
        return hashCode + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public String toString() {
        return "PlayerStatsModel(player=" + this.player + ", playerStats=" + this.playerStats + ')';
    }

    public PlayerStatsModel(Player player2, ArrayList<PlayerStat> arrayList) {
        Intrinsics.checkNotNullParameter(player2, "player");
        this.player = player2;
        this.playerStats = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PlayerStatsModel(Player player2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(player2, (i & 2) != 0 ? null : arrayList);
    }

    public final Player getPlayer() {
        return this.player;
    }

    public final ArrayList<PlayerStat> getPlayerStats() {
        return this.playerStats;
    }
}
