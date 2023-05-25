package com.crickpe.view.detail.fragments.settings.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006*"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/Inning;", "", "teamIndex", "", "teamName", "code", "countryCode", "teamIconUrl", "runs", "", "wickets", "overs", "", "_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getCode", "getCountryCode", "getOvers", "()D", "getRuns", "()I", "getTeamIconUrl", "getTeamIndex", "getTeamName", "getWickets", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Inning.kt */
public final class Inning {
    private final String _id;
    private final String code;
    private final String countryCode;
    private final double overs;
    private final int runs;
    private final String teamIconUrl;
    private final String teamIndex;
    private final String teamName;
    private final int wickets;

    public static /* synthetic */ Inning copy$default(Inning inning, String str, String str2, String str3, String str4, String str5, int i, int i2, double d, String str6, int i3, Object obj) {
        Inning inning2 = inning;
        int i4 = i3;
        return inning.copy((i4 & 1) != 0 ? inning2.teamIndex : str, (i4 & 2) != 0 ? inning2.teamName : str2, (i4 & 4) != 0 ? inning2.code : str3, (i4 & 8) != 0 ? inning2.countryCode : str4, (i4 & 16) != 0 ? inning2.teamIconUrl : str5, (i4 & 32) != 0 ? inning2.runs : i, (i4 & 64) != 0 ? inning2.wickets : i2, (i4 & 128) != 0 ? inning2.overs : d, (i4 & 256) != 0 ? inning2._id : str6);
    }

    public final String component1() {
        return this.teamIndex;
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

    public final Inning copy(String str, String str2, String str3, String str4, String str5, int i, int i2, double d, String str6) {
        Intrinsics.checkNotNullParameter(str, "teamIndex");
        Intrinsics.checkNotNullParameter(str2, "teamName");
        Intrinsics.checkNotNullParameter(str3, "code");
        String str7 = str4;
        Intrinsics.checkNotNullParameter(str7, "countryCode");
        String str8 = str5;
        Intrinsics.checkNotNullParameter(str8, "teamIconUrl");
        String str9 = str6;
        Intrinsics.checkNotNullParameter(str9, "_id");
        return new Inning(str, str2, str3, str7, str8, i, i2, d, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Inning)) {
            return false;
        }
        Inning inning = (Inning) obj;
        return Intrinsics.areEqual((Object) this.teamIndex, (Object) inning.teamIndex) && Intrinsics.areEqual((Object) this.teamName, (Object) inning.teamName) && Intrinsics.areEqual((Object) this.code, (Object) inning.code) && Intrinsics.areEqual((Object) this.countryCode, (Object) inning.countryCode) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) inning.teamIconUrl) && this.runs == inning.runs && this.wickets == inning.wickets && Intrinsics.areEqual((Object) Double.valueOf(this.overs), (Object) Double.valueOf(inning.overs)) && Intrinsics.areEqual((Object) this._id, (Object) inning._id);
    }

    public int hashCode() {
        return (((((((((((((((this.teamIndex.hashCode() * 31) + this.teamName.hashCode()) * 31) + this.code.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.teamIconUrl.hashCode()) * 31) + this.runs) * 31) + this.wickets) * 31) + Double.doubleToLongBits(this.overs)) * 31) + this._id.hashCode();
    }

    public String toString() {
        return "Inning(teamIndex=" + this.teamIndex + ", teamName=" + this.teamName + ", code=" + this.code + ", countryCode=" + this.countryCode + ", teamIconUrl=" + this.teamIconUrl + ", runs=" + this.runs + ", wickets=" + this.wickets + ", overs=" + this.overs + ", _id=" + this._id + ')';
    }

    public Inning(String str, String str2, String str3, String str4, String str5, int i, int i2, double d, String str6) {
        Intrinsics.checkNotNullParameter(str, "teamIndex");
        Intrinsics.checkNotNullParameter(str2, "teamName");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "countryCode");
        Intrinsics.checkNotNullParameter(str5, "teamIconUrl");
        Intrinsics.checkNotNullParameter(str6, "_id");
        this.teamIndex = str;
        this.teamName = str2;
        this.code = str3;
        this.countryCode = str4;
        this.teamIconUrl = str5;
        this.runs = i;
        this.wickets = i2;
        this.overs = d;
        this._id = str6;
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
}
