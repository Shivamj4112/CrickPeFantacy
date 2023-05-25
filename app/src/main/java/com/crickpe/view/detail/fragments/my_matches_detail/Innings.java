package com.crickpe.view.detail.fragments.my_matches_detail;

import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.ExtraRuns;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.Score;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003J\t\u0010'\u001a\u00020\u0011HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\tHÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001d¨\u00067"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/Innings;", "", "teamIndex", "", "teamName", "code", "countryCode", "teamIconUrl", "runs", "", "wickets", "overs", "", "_id", "score", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/Score;", "extra_runs", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/ExtraRuns;", "score_string", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/Score;Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/ExtraRuns;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getCode", "getCountryCode", "getExtra_runs", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/ExtraRuns;", "getOvers", "()D", "getRuns", "()I", "getScore", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/Score;", "getScore_string", "getTeamIconUrl", "getTeamIndex", "getTeamName", "getWickets", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LiveScoreModel.kt */
public final class Innings {
    private final String _id;
    private final String code;
    private final String countryCode;
    private final ExtraRuns extra_runs;
    private final double overs;
    private final int runs;
    private final Score score;
    private final String score_string;
    private final String teamIconUrl;
    private final String teamIndex;
    private final String teamName;
    private final int wickets;

    public static /* synthetic */ Innings copy$default(Innings innings, String str, String str2, String str3, String str4, String str5, int i, int i2, double d, String str6, Score score2, ExtraRuns extraRuns, String str7, int i3, Object obj) {
        Innings innings2 = innings;
        int i4 = i3;
        return innings.copy((i4 & 1) != 0 ? innings2.teamIndex : str, (i4 & 2) != 0 ? innings2.teamName : str2, (i4 & 4) != 0 ? innings2.code : str3, (i4 & 8) != 0 ? innings2.countryCode : str4, (i4 & 16) != 0 ? innings2.teamIconUrl : str5, (i4 & 32) != 0 ? innings2.runs : i, (i4 & 64) != 0 ? innings2.wickets : i2, (i4 & 128) != 0 ? innings2.overs : d, (i4 & 256) != 0 ? innings2._id : str6, (i4 & 512) != 0 ? innings2.score : score2, (i4 & 1024) != 0 ? innings2.extra_runs : extraRuns, (i4 & 2048) != 0 ? innings2.score_string : str7);
    }

    public final String component1() {
        return this.teamIndex;
    }

    public final Score component10() {
        return this.score;
    }

    public final ExtraRuns component11() {
        return this.extra_runs;
    }

    public final String component12() {
        return this.score_string;
    }

    public final String component2() {
        return this.teamName;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.countryCode;
    }

    public final String component5() {
        return this.teamIconUrl;
    }

    public final int component6() {
        return this.runs;
    }

    public final int component7() {
        return this.wickets;
    }

    public final double component8() {
        return this.overs;
    }

    public final String component9() {
        return this._id;
    }

    public final Innings copy(String str, String str2, String str3, String str4, String str5, int i, int i2, double d, String str6, Score score2, ExtraRuns extraRuns, String str7) {
        String str8 = str;
        Intrinsics.checkNotNullParameter(str8, "teamIndex");
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "teamName");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "code");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "countryCode");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "teamIconUrl");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "_id");
        Score score3 = score2;
        Intrinsics.checkNotNullParameter(score3, FirebaseAnalytics.Param.SCORE);
        ExtraRuns extraRuns2 = extraRuns;
        Intrinsics.checkNotNullParameter(extraRuns2, "extra_runs");
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, "score_string");
        return new Innings(str8, str9, str10, str11, str12, i, i2, d, str13, score3, extraRuns2, str14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Innings)) {
            return false;
        }
        Innings innings = (Innings) obj;
        return Intrinsics.areEqual((Object) this.teamIndex, (Object) innings.teamIndex) && Intrinsics.areEqual((Object) this.teamName, (Object) innings.teamName) && Intrinsics.areEqual((Object) this.code, (Object) innings.code) && Intrinsics.areEqual((Object) this.countryCode, (Object) innings.countryCode) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) innings.teamIconUrl) && this.runs == innings.runs && this.wickets == innings.wickets && Intrinsics.areEqual((Object) Double.valueOf(this.overs), (Object) Double.valueOf(innings.overs)) && Intrinsics.areEqual((Object) this._id, (Object) innings._id) && Intrinsics.areEqual((Object) this.score, (Object) innings.score) && Intrinsics.areEqual((Object) this.extra_runs, (Object) innings.extra_runs) && Intrinsics.areEqual((Object) this.score_string, (Object) innings.score_string);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.teamIndex.hashCode() * 31) + this.teamName.hashCode()) * 31) + this.code.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.teamIconUrl.hashCode()) * 31) + this.runs) * 31) + this.wickets) * 31) + Double.doubleToLongBits(this.overs)) * 31) + this._id.hashCode()) * 31) + this.score.hashCode()) * 31) + this.extra_runs.hashCode()) * 31) + this.score_string.hashCode();
    }

    public String toString() {
        return "Innings(teamIndex=" + this.teamIndex + ", teamName=" + this.teamName + ", code=" + this.code + ", countryCode=" + this.countryCode + ", teamIconUrl=" + this.teamIconUrl + ", runs=" + this.runs + ", wickets=" + this.wickets + ", overs=" + this.overs + ", _id=" + this._id + ", score=" + this.score + ", extra_runs=" + this.extra_runs + ", score_string=" + this.score_string + ')';
    }

    public Innings(String str, String str2, String str3, String str4, String str5, int i, int i2, double d, String str6, Score score2, ExtraRuns extraRuns, String str7) {
        Intrinsics.checkNotNullParameter(str, "teamIndex");
        Intrinsics.checkNotNullParameter(str2, "teamName");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "countryCode");
        Intrinsics.checkNotNullParameter(str5, "teamIconUrl");
        Intrinsics.checkNotNullParameter(str6, "_id");
        Intrinsics.checkNotNullParameter(score2, FirebaseAnalytics.Param.SCORE);
        Intrinsics.checkNotNullParameter(extraRuns, "extra_runs");
        Intrinsics.checkNotNullParameter(str7, "score_string");
        this.teamIndex = str;
        this.teamName = str2;
        this.code = str3;
        this.countryCode = str4;
        this.teamIconUrl = str5;
        this.runs = i;
        this.wickets = i2;
        this.overs = d;
        this._id = str6;
        this.score = score2;
        this.extra_runs = extraRuns;
        this.score_string = str7;
    }

    public final String getTeamIndex() {
        return this.teamIndex;
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

    public final int getRuns() {
        return this.runs;
    }

    public final int getWickets() {
        return this.wickets;
    }

    public final double getOvers() {
        return this.overs;
    }

    public final String get_id() {
        return this._id;
    }

    public final Score getScore() {
        return this.score;
    }

    public final ExtraRuns getExtra_runs() {
        return this.extra_runs;
    }

    public final String getScore_string() {
        return this.score_string;
    }
}
