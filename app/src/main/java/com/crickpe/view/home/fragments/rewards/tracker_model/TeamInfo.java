package com.crickpe.view.home.fragments.rewards.tracker_model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/tracker_model/TeamInfo;", "", "_id", "", "name", "code", "teamIconUrl", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getCode", "getImageUrl", "getName", "getTeamIconUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TeamInfo.kt */
public final class TeamInfo {
    private final String _id;
    private final String code;
    private final String imageUrl;
    private final String name;
    private final String teamIconUrl;

    public static /* synthetic */ TeamInfo copy$default(TeamInfo teamInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teamInfo._id;
        }
        if ((i & 2) != 0) {
            str2 = teamInfo.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = teamInfo.code;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = teamInfo.teamIconUrl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = teamInfo.imageUrl;
        }
        return teamInfo.copy(str, str6, str7, str8, str5);
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

    public final String component5() {
        return this.imageUrl;
    }

    public final TeamInfo copy(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "teamIconUrl");
        Intrinsics.checkNotNullParameter(str5, "imageUrl");
        return new TeamInfo(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamInfo)) {
            return false;
        }
        TeamInfo teamInfo = (TeamInfo) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) teamInfo._id) && Intrinsics.areEqual((Object) this.name, (Object) teamInfo.name) && Intrinsics.areEqual((Object) this.code, (Object) teamInfo.code) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) teamInfo.teamIconUrl) && Intrinsics.areEqual((Object) this.imageUrl, (Object) teamInfo.imageUrl);
    }

    public int hashCode() {
        return (((((((this._id.hashCode() * 31) + this.name.hashCode()) * 31) + this.code.hashCode()) * 31) + this.teamIconUrl.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "TeamInfo(_id=" + this._id + ", name=" + this.name + ", code=" + this.code + ", teamIconUrl=" + this.teamIconUrl + ", imageUrl=" + this.imageUrl + ')';
    }

    public TeamInfo(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "teamIconUrl");
        Intrinsics.checkNotNullParameter(str5, "imageUrl");
        this._id = str;
        this.name = str2;
        this.code = str3;
        this.teamIconUrl = str4;
        this.imageUrl = str5;
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

    public final String getImageUrl() {
        return this.imageUrl;
    }
}
