package com.crickpe.view.detail.fragments.profile;

import com.crickpe.view.detail.fragments.contest_winners.models.model.Match$$ExternalSyntheticBackport0;
import com.crickpe.view.home.fragments.my_matches.LivescoresInfo;
import com.crickpe.view.home.fragments.my_matches.Team1;
import com.crickpe.view.home.fragments.my_matches.Team2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0014HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\u000bHÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u000fHÆ\u0003J\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u000bHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017¨\u0006<"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/profile/RecentlyPlayed;", "", "_id", "", "key", "title", "name", "shortName", "startAtIST", "", "estimatedEndDate", "", "team1", "Lcom/crickpe/view/home/fragments/my_matches/Team1;", "team2", "Lcom/crickpe/view/home/fragments/my_matches/Team2;", "myContestCount", "myFantasyTeamCount", "megaPrize", "livescoresInfo", "Lcom/crickpe/view/home/fragments/my_matches/LivescoresInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILcom/crickpe/view/home/fragments/my_matches/Team1;Lcom/crickpe/view/home/fragments/my_matches/Team2;IIILcom/crickpe/view/home/fragments/my_matches/LivescoresInfo;)V", "get_id", "()Ljava/lang/String;", "getEstimatedEndDate", "()I", "getKey", "getLivescoresInfo", "()Lcom/crickpe/view/home/fragments/my_matches/LivescoresInfo;", "getMegaPrize", "getMyContestCount", "getMyFantasyTeamCount", "getName", "getShortName", "getStartAtIST", "()J", "getTeam1", "()Lcom/crickpe/view/home/fragments/my_matches/Team1;", "getTeam2", "()Lcom/crickpe/view/home/fragments/my_matches/Team2;", "getTitle", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileModel.kt */
public final class RecentlyPlayed {
    private final String _id;
    private final int estimatedEndDate;
    private final String key;
    private final LivescoresInfo livescoresInfo;
    private final int megaPrize;
    private final int myContestCount;
    private final int myFantasyTeamCount;
    private final String name;
    private final String shortName;
    private final long startAtIST;
    private final Team1 team1;
    private final Team2 team2;
    private final String title;

    public static /* synthetic */ RecentlyPlayed copy$default(RecentlyPlayed recentlyPlayed, String str, String str2, String str3, String str4, String str5, long j, int i, Team1 team12, Team2 team22, int i2, int i3, int i4, LivescoresInfo livescoresInfo2, int i5, Object obj) {
        RecentlyPlayed recentlyPlayed2 = recentlyPlayed;
        int i6 = i5;
        return recentlyPlayed.copy((i6 & 1) != 0 ? recentlyPlayed2._id : str, (i6 & 2) != 0 ? recentlyPlayed2.key : str2, (i6 & 4) != 0 ? recentlyPlayed2.title : str3, (i6 & 8) != 0 ? recentlyPlayed2.name : str4, (i6 & 16) != 0 ? recentlyPlayed2.shortName : str5, (i6 & 32) != 0 ? recentlyPlayed2.startAtIST : j, (i6 & 64) != 0 ? recentlyPlayed2.estimatedEndDate : i, (i6 & 128) != 0 ? recentlyPlayed2.team1 : team12, (i6 & 256) != 0 ? recentlyPlayed2.team2 : team22, (i6 & 512) != 0 ? recentlyPlayed2.myContestCount : i2, (i6 & 1024) != 0 ? recentlyPlayed2.myFantasyTeamCount : i3, (i6 & 2048) != 0 ? recentlyPlayed2.megaPrize : i4, (i6 & 4096) != 0 ? recentlyPlayed2.livescoresInfo : livescoresInfo2);
    }

    public final String component1() {
        return this._id;
    }

    public final int component10() {
        return this.myContestCount;
    }

    public final int component11() {
        return this.myFantasyTeamCount;
    }

    public final int component12() {
        return this.megaPrize;
    }

    public final LivescoresInfo component13() {
        return this.livescoresInfo;
    }

    public final String component2() {
        return this.key;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.shortName;
    }

    public final long component6() {
        return this.startAtIST;
    }

    public final int component7() {
        return this.estimatedEndDate;
    }

    public final Team1 component8() {
        return this.team1;
    }

    public final Team2 component9() {
        return this.team2;
    }

    public final RecentlyPlayed copy(String str, String str2, String str3, String str4, String str5, long j, int i, Team1 team12, Team2 team22, int i2, int i3, int i4, LivescoresInfo livescoresInfo2) {
        String str6 = str;
        Intrinsics.checkNotNullParameter(str6, "_id");
        String str7 = str2;
        Intrinsics.checkNotNullParameter(str7, "key");
        String str8 = str3;
        Intrinsics.checkNotNullParameter(str8, "title");
        String str9 = str4;
        Intrinsics.checkNotNullParameter(str9, "name");
        String str10 = str5;
        Intrinsics.checkNotNullParameter(str10, "shortName");
        Team1 team13 = team12;
        Intrinsics.checkNotNullParameter(team13, "team1");
        Team2 team23 = team22;
        Intrinsics.checkNotNullParameter(team23, "team2");
        LivescoresInfo livescoresInfo3 = livescoresInfo2;
        Intrinsics.checkNotNullParameter(livescoresInfo3, "livescoresInfo");
        return new RecentlyPlayed(str6, str7, str8, str9, str10, j, i, team13, team23, i2, i3, i4, livescoresInfo3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyPlayed)) {
            return false;
        }
        RecentlyPlayed recentlyPlayed = (RecentlyPlayed) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) recentlyPlayed._id) && Intrinsics.areEqual((Object) this.key, (Object) recentlyPlayed.key) && Intrinsics.areEqual((Object) this.title, (Object) recentlyPlayed.title) && Intrinsics.areEqual((Object) this.name, (Object) recentlyPlayed.name) && Intrinsics.areEqual((Object) this.shortName, (Object) recentlyPlayed.shortName) && this.startAtIST == recentlyPlayed.startAtIST && this.estimatedEndDate == recentlyPlayed.estimatedEndDate && Intrinsics.areEqual((Object) this.team1, (Object) recentlyPlayed.team1) && Intrinsics.areEqual((Object) this.team2, (Object) recentlyPlayed.team2) && this.myContestCount == recentlyPlayed.myContestCount && this.myFantasyTeamCount == recentlyPlayed.myFantasyTeamCount && this.megaPrize == recentlyPlayed.megaPrize && Intrinsics.areEqual((Object) this.livescoresInfo, (Object) recentlyPlayed.livescoresInfo);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this._id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.name.hashCode()) * 31) + this.shortName.hashCode()) * 31) + Match$$ExternalSyntheticBackport0.m111m(this.startAtIST)) * 31) + this.estimatedEndDate) * 31) + this.team1.hashCode()) * 31) + this.team2.hashCode()) * 31) + this.myContestCount) * 31) + this.myFantasyTeamCount) * 31) + this.megaPrize) * 31) + this.livescoresInfo.hashCode();
    }

    public String toString() {
        return "RecentlyPlayed(_id=" + this._id + ", key=" + this.key + ", title=" + this.title + ", name=" + this.name + ", shortName=" + this.shortName + ", startAtIST=" + this.startAtIST + ", estimatedEndDate=" + this.estimatedEndDate + ", team1=" + this.team1 + ", team2=" + this.team2 + ", myContestCount=" + this.myContestCount + ", myFantasyTeamCount=" + this.myFantasyTeamCount + ", megaPrize=" + this.megaPrize + ", livescoresInfo=" + this.livescoresInfo + ')';
    }

    public RecentlyPlayed(String str, String str2, String str3, String str4, String str5, long j, int i, Team1 team12, Team2 team22, int i2, int i3, int i4, LivescoresInfo livescoresInfo2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "key");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "shortName");
        Intrinsics.checkNotNullParameter(team12, "team1");
        Intrinsics.checkNotNullParameter(team22, "team2");
        Intrinsics.checkNotNullParameter(livescoresInfo2, "livescoresInfo");
        this._id = str;
        this.key = str2;
        this.title = str3;
        this.name = str4;
        this.shortName = str5;
        this.startAtIST = j;
        this.estimatedEndDate = i;
        this.team1 = team12;
        this.team2 = team22;
        this.myContestCount = i2;
        this.myFantasyTeamCount = i3;
        this.megaPrize = i4;
        this.livescoresInfo = livescoresInfo2;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final long getStartAtIST() {
        return this.startAtIST;
    }

    public final int getEstimatedEndDate() {
        return this.estimatedEndDate;
    }

    public final Team1 getTeam1() {
        return this.team1;
    }

    public final Team2 getTeam2() {
        return this.team2;
    }

    public final int getMyContestCount() {
        return this.myContestCount;
    }

    public final int getMyFantasyTeamCount() {
        return this.myFantasyTeamCount;
    }

    public final int getMegaPrize() {
        return this.megaPrize;
    }

    public final LivescoresInfo getLivescoresInfo() {
        return this.livescoresInfo;
    }
}
