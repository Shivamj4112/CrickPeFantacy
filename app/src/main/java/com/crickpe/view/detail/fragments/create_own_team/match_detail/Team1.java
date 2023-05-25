package com.crickpe.view.detail.fragments.create_own_team.match_detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/match_detail/Team1;", "", "code", "", "teamIconUrl", "teamId", "teamName", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getTeamIconUrl", "()Ljava/lang/Object;", "getTeamId", "getTeamName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Team1.kt */
public final class Team1 {
    private final String code;
    private final Object teamIconUrl;
    private final String teamId;
    private final String teamName;

    public static /* synthetic */ Team1 copy$default(Team1 team1, String str, Object obj, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = team1.code;
        }
        if ((i & 2) != 0) {
            obj = team1.teamIconUrl;
        }
        if ((i & 4) != 0) {
            str2 = team1.teamId;
        }
        if ((i & 8) != 0) {
            str3 = team1.teamName;
        }
        return team1.copy(str, obj, str2, str3);
    }

    public final String component1() {
        return this.code;
    }

    public final Object component2() {
        return this.teamIconUrl;
    }

    public final String component3() {
        return this.teamId;
    }

    public final String component4() {
        return this.teamName;
    }

    public final Team1 copy(String str, Object obj, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(obj, "teamIconUrl");
        Intrinsics.checkNotNullParameter(str2, "teamId");
        Intrinsics.checkNotNullParameter(str3, "teamName");
        return new Team1(str, obj, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team1)) {
            return false;
        }
        Team1 team1 = (Team1) obj;
        return Intrinsics.areEqual((Object) this.code, (Object) team1.code) && Intrinsics.areEqual(this.teamIconUrl, team1.teamIconUrl) && Intrinsics.areEqual((Object) this.teamId, (Object) team1.teamId) && Intrinsics.areEqual((Object) this.teamName, (Object) team1.teamName);
    }

    public int hashCode() {
        return (((((this.code.hashCode() * 31) + this.teamIconUrl.hashCode()) * 31) + this.teamId.hashCode()) * 31) + this.teamName.hashCode();
    }

    public String toString() {
        return "Team1(code=" + this.code + ", teamIconUrl=" + this.teamIconUrl + ", teamId=" + this.teamId + ", teamName=" + this.teamName + ')';
    }

    public Team1(String str, Object obj, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "code");
        Intrinsics.checkNotNullParameter(obj, "teamIconUrl");
        Intrinsics.checkNotNullParameter(str2, "teamId");
        Intrinsics.checkNotNullParameter(str3, "teamName");
        this.code = str;
        this.teamIconUrl = obj;
        this.teamId = str2;
        this.teamName = str3;
    }

    public final String getCode() {
        return this.code;
    }

    public final Object getTeamIconUrl() {
        return this.teamIconUrl;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getTeamName() {
        return this.teamName;
    }
}
