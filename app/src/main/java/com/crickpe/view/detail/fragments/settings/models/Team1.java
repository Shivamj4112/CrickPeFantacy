package com.crickpe.view.detail.fragments.settings.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/Team1;", "", "teamName", "", "code", "countryCode", "teamIconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCountryCode", "getTeamIconUrl", "getTeamName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Team1.kt */
public final class Team1 {
    private final String code;
    private final String countryCode;
    private final String teamIconUrl;
    private final String teamName;

    public static /* synthetic */ Team1 copy$default(Team1 team1, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = team1.teamName;
        }
        if ((i & 2) != 0) {
            str2 = team1.code;
        }
        if ((i & 4) != 0) {
            str3 = team1.countryCode;
        }
        if ((i & 8) != 0) {
            str4 = team1.teamIconUrl;
        }
        return team1.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.teamName;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.countryCode;
    }

    public final String component4() {
        return this.teamIconUrl;
    }

    public final Team1 copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "teamName");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "countryCode");
        Intrinsics.checkNotNullParameter(str4, "teamIconUrl");
        return new Team1(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team1)) {
            return false;
        }
        Team1 team1 = (Team1) obj;
        return Intrinsics.areEqual((Object) this.teamName, (Object) team1.teamName) && Intrinsics.areEqual((Object) this.code, (Object) team1.code) && Intrinsics.areEqual((Object) this.countryCode, (Object) team1.countryCode) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) team1.teamIconUrl);
    }

    public int hashCode() {
        return (((((this.teamName.hashCode() * 31) + this.code.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.teamIconUrl.hashCode();
    }

    public String toString() {
        return "Team1(teamName=" + this.teamName + ", code=" + this.code + ", countryCode=" + this.countryCode + ", teamIconUrl=" + this.teamIconUrl + ')';
    }

    public Team1(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "teamName");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "countryCode");
        Intrinsics.checkNotNullParameter(str4, "teamIconUrl");
        this.teamName = str;
        this.code = str2;
        this.countryCode = str3;
        this.teamIconUrl = str4;
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
