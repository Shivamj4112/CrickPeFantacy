package com.crickpe.view.detail.fragments.player_reward_fragment.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Teams;", "", "_id", "", "name", "code", "teamIconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getCode", "getName", "getTeamIconUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Teams.kt */
public final class Teams {
    private final String _id;
    private final String code;
    private final String name;
    private final String teamIconUrl;

    public static /* synthetic */ Teams copy$default(Teams teams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teams._id;
        }
        if ((i & 2) != 0) {
            str2 = teams.name;
        }
        if ((i & 4) != 0) {
            str3 = teams.code;
        }
        if ((i & 8) != 0) {
            str4 = teams.teamIconUrl;
        }
        return teams.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.teamIconUrl;
    }

    public final Teams copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "teamIconUrl");
        return new Teams(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Teams)) {
            return false;
        }
        Teams teams = (Teams) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) teams._id) && Intrinsics.areEqual((Object) this.name, (Object) teams.name) && Intrinsics.areEqual((Object) this.code, (Object) teams.code) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) teams.teamIconUrl);
    }

    public int hashCode() {
        return (((((this._id.hashCode() * 31) + this.name.hashCode()) * 31) + this.code.hashCode()) * 31) + this.teamIconUrl.hashCode();
    }

    public String toString() {
        return "Teams(_id=" + this._id + ", name=" + this.name + ", code=" + this.code + ", teamIconUrl=" + this.teamIconUrl + ')';
    }

    public Teams(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "teamIconUrl");
        this._id = str;
        this.name = str2;
        this.code = str3;
        this.teamIconUrl = str4;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getTeamIconUrl() {
        return this.teamIconUrl;
    }
}
