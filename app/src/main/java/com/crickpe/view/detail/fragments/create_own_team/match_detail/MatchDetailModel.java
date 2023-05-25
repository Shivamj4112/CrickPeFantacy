package com.crickpe.view.detail.fragments.create_own_team.match_detail;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/match_detail/MatchDetailModel;", "", "_id", "", "format", "name", "shortName", "startAtIST", "", "team1", "Lcom/crickpe/view/detail/fragments/create_own_team/match_detail/Team1;", "team2", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/crickpe/view/detail/fragments/create_own_team/match_detail/Team1;Lcom/crickpe/view/detail/fragments/create_own_team/match_detail/Team1;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getFormat", "getName", "getShortName", "getStartAtIST", "()I", "getTeam1", "()Lcom/crickpe/view/detail/fragments/create_own_team/match_detail/Team1;", "getTeam2", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MatchDetailModel.kt */
public final class MatchDetailModel {
    private final String _id;
    private final String format;
    private final String name;
    private final String shortName;
    private final int startAtIST;
    private final Team1 team1;
    private final Team1 team2;
    private final String title;

    public static /* synthetic */ MatchDetailModel copy$default(MatchDetailModel matchDetailModel, String str, String str2, String str3, String str4, int i, Team1 team12, Team1 team13, String str5, int i2, Object obj) {
        MatchDetailModel matchDetailModel2 = matchDetailModel;
        int i3 = i2;
        return matchDetailModel.copy((i3 & 1) != 0 ? matchDetailModel2._id : str, (i3 & 2) != 0 ? matchDetailModel2.format : str2, (i3 & 4) != 0 ? matchDetailModel2.name : str3, (i3 & 8) != 0 ? matchDetailModel2.shortName : str4, (i3 & 16) != 0 ? matchDetailModel2.startAtIST : i, (i3 & 32) != 0 ? matchDetailModel2.team1 : team12, (i3 & 64) != 0 ? matchDetailModel2.team2 : team13, (i3 & 128) != 0 ? matchDetailModel2.title : str5);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.format;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.shortName;
    }

    public final int component5() {
        return this.startAtIST;
    }

    public final Team1 component6() {
        return this.team1;
    }

    public final Team1 component7() {
        return this.team2;
    }

    public final String component8() {
        return this.title;
    }

    public final MatchDetailModel copy(String str, String str2, String str3, String str4, int i, Team1 team12, Team1 team13, String str5) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "format");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "shortName");
        Team1 team14 = team12;
        Intrinsics.checkNotNullParameter(team14, "team1");
        Team1 team15 = team13;
        Intrinsics.checkNotNullParameter(team15, "team2");
        String str6 = str5;
        Intrinsics.checkNotNullParameter(str6, "title");
        return new MatchDetailModel(str, str2, str3, str4, i, team14, team15, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchDetailModel)) {
            return false;
        }
        MatchDetailModel matchDetailModel = (MatchDetailModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) matchDetailModel._id) && Intrinsics.areEqual((Object) this.format, (Object) matchDetailModel.format) && Intrinsics.areEqual((Object) this.name, (Object) matchDetailModel.name) && Intrinsics.areEqual((Object) this.shortName, (Object) matchDetailModel.shortName) && this.startAtIST == matchDetailModel.startAtIST && Intrinsics.areEqual((Object) this.team1, (Object) matchDetailModel.team1) && Intrinsics.areEqual((Object) this.team2, (Object) matchDetailModel.team2) && Intrinsics.areEqual((Object) this.title, (Object) matchDetailModel.title);
    }

    public int hashCode() {
        return (((((((((((((this._id.hashCode() * 31) + this.format.hashCode()) * 31) + this.name.hashCode()) * 31) + this.shortName.hashCode()) * 31) + this.startAtIST) * 31) + this.team1.hashCode()) * 31) + this.team2.hashCode()) * 31) + this.title.hashCode();
    }

    public String toString() {
        return "MatchDetailModel(_id=" + this._id + ", format=" + this.format + ", name=" + this.name + ", shortName=" + this.shortName + ", startAtIST=" + this.startAtIST + ", team1=" + this.team1 + ", team2=" + this.team2 + ", title=" + this.title + ')';
    }

    public MatchDetailModel(String str, String str2, String str3, String str4, int i, Team1 team12, Team1 team13, String str5) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "format");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "shortName");
        Intrinsics.checkNotNullParameter(team12, "team1");
        Intrinsics.checkNotNullParameter(team13, "team2");
        Intrinsics.checkNotNullParameter(str5, "title");
        this._id = str;
        this.format = str2;
        this.name = str3;
        this.shortName = str4;
        this.startAtIST = i;
        this.team1 = team12;
        this.team2 = team13;
        this.title = str5;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final int getStartAtIST() {
        return this.startAtIST;
    }

    public final Team1 getTeam1() {
        return this.team1;
    }

    public final Team1 getTeam2() {
        return this.team2;
    }

    public final String getTitle() {
        return this.title;
    }
}
