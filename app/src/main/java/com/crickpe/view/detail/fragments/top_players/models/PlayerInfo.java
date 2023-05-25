package com.crickpe.view.detail.fragments.top_players.models;

import com.crickpe.view.detail.fragments.create_own_team.create_team.Role;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/top_players/models/PlayerInfo;", "", "name", "", "imageUrl", "role", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Role;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Role;)V", "getImageUrl", "()Ljava/lang/String;", "getName", "getRole", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Role;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayerInfo.kt */
public final class PlayerInfo {
    private final String imageUrl;
    private final String name;
    private final Role role;

    public static /* synthetic */ PlayerInfo copy$default(PlayerInfo playerInfo, String str, String str2, Role role2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playerInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = playerInfo.imageUrl;
        }
        if ((i & 4) != 0) {
            role2 = playerInfo.role;
        }
        return playerInfo.copy(str, str2, role2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final Role component3() {
        return this.role;
    }

    public final PlayerInfo copy(String str, String str2, Role role2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "imageUrl");
        Intrinsics.checkNotNullParameter(role2, "role");
        return new PlayerInfo(str, str2, role2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerInfo)) {
            return false;
        }
        PlayerInfo playerInfo = (PlayerInfo) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) playerInfo.name) && Intrinsics.areEqual((Object) this.imageUrl, (Object) playerInfo.imageUrl) && Intrinsics.areEqual((Object) this.role, (Object) playerInfo.role);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.role.hashCode();
    }

    public String toString() {
        return "PlayerInfo(name=" + this.name + ", imageUrl=" + this.imageUrl + ", role=" + this.role + ')';
    }

    public PlayerInfo(String str, String str2, Role role2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "imageUrl");
        Intrinsics.checkNotNullParameter(role2, "role");
        this.name = str;
        this.imageUrl = str2;
        this.role = role2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Role getRole() {
        return this.role;
    }
}
