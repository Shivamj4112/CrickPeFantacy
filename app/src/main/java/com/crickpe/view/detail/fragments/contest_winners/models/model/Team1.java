package com.crickpe.view.detail.fragments.contest_winners.models.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_winners/models/model/Team1;", "", "teamId", "", "teamIndex", "key", "teamName", "code", "countryCode", "teamIconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCountryCode", "getKey", "getTeamIconUrl", "getTeamId", "getTeamIndex", "getTeamName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Team1.kt */
public final class Team1 {
    private final String code;
    private final String countryCode;
    private final String key;
    private final String teamIconUrl;
    private final String teamId;
    private final String teamIndex;
    private final String teamName;

    public static /* synthetic */ Team1 copy$default(Team1 team1, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = team1.teamId;
        }
        if ((i & 2) != 0) {
            str2 = team1.teamIndex;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = team1.key;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = team1.teamName;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = team1.code;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = team1.countryCode;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = team1.teamIconUrl;
        }
        return team1.copy(str, str8, str9, str10, str11, str12, str7);
    }

    public final String component1() {
        return this.teamId;
    }

    public final String component2() {
        return this.teamIndex;
    }

    public final String component3() {
        return this.key;
    }

    public final String component4() {
        return this.teamName;
    }

    public final String component5() {
        return this.code;
    }

    public final String component6() {
        return this.countryCode;
    }

    public final String component7() {
        return this.teamIconUrl;
    }

    public final Team1 copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str2, "teamIndex");
        Intrinsics.checkNotNullParameter(str3, "key");
        Intrinsics.checkNotNullParameter(str4, "teamName");
        Intrinsics.checkNotNullParameter(str5, "code");
        Intrinsics.checkNotNullParameter(str6, "countryCode");
        String str8 = str7;
        Intrinsics.checkNotNullParameter(str8, "teamIconUrl");
        return new Team1(str, str2, str3, str4, str5, str6, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team1)) {
            return false;
        }
        Team1 team1 = (Team1) obj;
        return Intrinsics.areEqual((Object) this.teamId, (Object) team1.teamId) && Intrinsics.areEqual((Object) this.teamIndex, (Object) team1.teamIndex) && Intrinsics.areEqual((Object) this.key, (Object) team1.key) && Intrinsics.areEqual((Object) this.teamName, (Object) team1.teamName) && Intrinsics.areEqual((Object) this.code, (Object) team1.code) && Intrinsics.areEqual((Object) this.countryCode, (Object) team1.countryCode) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) team1.teamIconUrl);
    }

    public int hashCode() {
        return (((((((((((this.teamId.hashCode() * 31) + this.teamIndex.hashCode()) * 31) + this.key.hashCode()) * 31) + this.teamName.hashCode()) * 31) + this.code.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.teamIconUrl.hashCode();
    }

    public String toString() {
        return "Team1(teamId=" + this.teamId + ", teamIndex=" + this.teamIndex + ", key=" + this.key + ", teamName=" + this.teamName + ", code=" + this.code + ", countryCode=" + this.countryCode + ", teamIconUrl=" + this.teamIconUrl + ')';
    }

    public Team1(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str2, "teamIndex");
        Intrinsics.checkNotNullParameter(str3, "key");
        Intrinsics.checkNotNullParameter(str4, "teamName");
        Intrinsics.checkNotNullParameter(str5, "code");
        Intrinsics.checkNotNullParameter(str6, "countryCode");
        Intrinsics.checkNotNullParameter(str7, "teamIconUrl");
        this.teamId = str;
        this.teamIndex = str2;
        this.key = str3;
        this.teamName = str4;
        this.code = str5;
        this.countryCode = str6;
        this.teamIconUrl = str7;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getTeamIndex() {
        return this.teamIndex;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getTeamIconUrl() {
        return this.teamIconUrl;
    }
}
