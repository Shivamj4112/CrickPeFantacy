package com.crickpe.view.detail.fragments.settings.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b-\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\bHÆ\u0003J\t\u00106\u001a\u00020\u0015HÆ\u0003J\t\u00107\u001a\u00020\u0015HÆ\u0003J\t\u00108\u001a\u00020\u0015HÆ\u0003J\t\u00109\u001a\u00020\u0019HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u001cHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\u000fHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003Jµ\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0013\u0010E\u001a\u00020\u00152\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0006HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010-R\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010-R\u0011\u0010\u0017\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!¨\u0006I"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/LivescoresInfo;", "", "_id", "", "matchId", "__v", "", "balls", "", "Lcom/crickpe/view/detail/fragments/settings/models/Ball;", "batsmanNonStriker", "Lcom/crickpe/view/detail/fragments/settings/models/BatsmanNonStriker;", "batsmanStriker", "Lcom/crickpe/view/detail/fragments/settings/models/BatsmanStriker;", "bowler", "Lcom/crickpe/view/detail/fragments/settings/models/Bowler;", "createdAt", "currentInning", "innings", "Lcom/crickpe/view/detail/fragments/settings/models/Inning;", "isBlocked", "", "isDeleted", "isResult", "overNumber", "", "updatedAt", "result", "Lcom/crickpe/view/detail/fragments/settings/models/ResultX;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/crickpe/view/detail/fragments/settings/models/BatsmanNonStriker;Lcom/crickpe/view/detail/fragments/settings/models/BatsmanStriker;Lcom/crickpe/view/detail/fragments/settings/models/Bowler;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZDLjava/lang/String;Lcom/crickpe/view/detail/fragments/settings/models/ResultX;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getBalls", "()Ljava/util/List;", "getBatsmanNonStriker", "()Lcom/crickpe/view/detail/fragments/settings/models/BatsmanNonStriker;", "getBatsmanStriker", "()Lcom/crickpe/view/detail/fragments/settings/models/BatsmanStriker;", "getBowler", "()Lcom/crickpe/view/detail/fragments/settings/models/Bowler;", "getCreatedAt", "getCurrentInning", "getInnings", "()Z", "getMatchId", "getOverNumber", "()D", "getResult", "()Lcom/crickpe/view/detail/fragments/settings/models/ResultX;", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LivescoresInfo.kt */
public final class LivescoresInfo {
    private final int __v;
    private final String _id;
    private final List<Ball> balls;
    private final BatsmanNonStriker batsmanNonStriker;
    private final BatsmanStriker batsmanStriker;
    private final Bowler bowler;
    private final String createdAt;
    private final String currentInning;
    private final List<Inning> innings;
    private final boolean isBlocked;
    private final boolean isDeleted;
    private final boolean isResult;
    private final String matchId;
    private final double overNumber;
    private final ResultX result;
    private final String updatedAt;

    public static /* synthetic */ LivescoresInfo copy$default(LivescoresInfo livescoresInfo, String str, String str2, int i, List list, BatsmanNonStriker batsmanNonStriker2, BatsmanStriker batsmanStriker2, Bowler bowler2, String str3, String str4, List list2, boolean z, boolean z2, boolean z3, double d, String str5, ResultX resultX, int i2, Object obj) {
        LivescoresInfo livescoresInfo2 = livescoresInfo;
        int i3 = i2;
        return livescoresInfo.copy((i3 & 1) != 0 ? livescoresInfo2._id : str, (i3 & 2) != 0 ? livescoresInfo2.matchId : str2, (i3 & 4) != 0 ? livescoresInfo2.__v : i, (i3 & 8) != 0 ? livescoresInfo2.balls : list, (i3 & 16) != 0 ? livescoresInfo2.batsmanNonStriker : batsmanNonStriker2, (i3 & 32) != 0 ? livescoresInfo2.batsmanStriker : batsmanStriker2, (i3 & 64) != 0 ? livescoresInfo2.bowler : bowler2, (i3 & 128) != 0 ? livescoresInfo2.createdAt : str3, (i3 & 256) != 0 ? livescoresInfo2.currentInning : str4, (i3 & 512) != 0 ? livescoresInfo2.innings : list2, (i3 & 1024) != 0 ? livescoresInfo2.isBlocked : z, (i3 & 2048) != 0 ? livescoresInfo2.isDeleted : z2, (i3 & 4096) != 0 ? livescoresInfo2.isResult : z3, (i3 & 8192) != 0 ? livescoresInfo2.overNumber : d, (i3 & 16384) != 0 ? livescoresInfo2.updatedAt : str5, (i3 & 32768) != 0 ? livescoresInfo2.result : resultX);
    }

    public final String component1() {
        return this._id;
    }

    public final List<Inning> component10() {
        return this.innings;
    }

    public final boolean component11() {
        return this.isBlocked;
    }

    public final boolean component12() {
        return this.isDeleted;
    }

    public final boolean component13() {
        return this.isResult;
    }

    public final double component14() {
        return this.overNumber;
    }

    public final String component15() {
        return this.updatedAt;
    }

    public final ResultX component16() {
        return this.result;
    }

    public final String component2() {
        return this.matchId;
    }

    public final int component3() {
        return this.__v;
    }

    public final List<Ball> component4() {
        return this.balls;
    }

    public final BatsmanNonStriker component5() {
        return this.batsmanNonStriker;
    }

    public final BatsmanStriker component6() {
        return this.batsmanStriker;
    }

    public final Bowler component7() {
        return this.bowler;
    }

    public final String component8() {
        return this.createdAt;
    }

    public final String component9() {
        return this.currentInning;
    }

    public final LivescoresInfo copy(String str, String str2, int i, List<Ball> list, BatsmanNonStriker batsmanNonStriker2, BatsmanStriker batsmanStriker2, Bowler bowler2, String str3, String str4, List<Inning> list2, boolean z, boolean z2, boolean z3, double d, String str5, ResultX resultX) {
        String str6 = str;
        Intrinsics.checkNotNullParameter(str6, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(list, "balls");
        Intrinsics.checkNotNullParameter(batsmanNonStriker2, "batsmanNonStriker");
        Intrinsics.checkNotNullParameter(batsmanStriker2, "batsmanStriker");
        Intrinsics.checkNotNullParameter(bowler2, "bowler");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(str4, "currentInning");
        Intrinsics.checkNotNullParameter(list2, "innings");
        Intrinsics.checkNotNullParameter(str5, "updatedAt");
        Intrinsics.checkNotNullParameter(resultX, "result");
        return new LivescoresInfo(str6, str2, i, list, batsmanNonStriker2, batsmanStriker2, bowler2, str3, str4, list2, z, z2, z3, d, str5, resultX);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivescoresInfo)) {
            return false;
        }
        LivescoresInfo livescoresInfo = (LivescoresInfo) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) livescoresInfo._id) && Intrinsics.areEqual((Object) this.matchId, (Object) livescoresInfo.matchId) && this.__v == livescoresInfo.__v && Intrinsics.areEqual((Object) this.balls, (Object) livescoresInfo.balls) && Intrinsics.areEqual((Object) this.batsmanNonStriker, (Object) livescoresInfo.batsmanNonStriker) && Intrinsics.areEqual((Object) this.batsmanStriker, (Object) livescoresInfo.batsmanStriker) && Intrinsics.areEqual((Object) this.bowler, (Object) livescoresInfo.bowler) && Intrinsics.areEqual((Object) this.createdAt, (Object) livescoresInfo.createdAt) && Intrinsics.areEqual((Object) this.currentInning, (Object) livescoresInfo.currentInning) && Intrinsics.areEqual((Object) this.innings, (Object) livescoresInfo.innings) && this.isBlocked == livescoresInfo.isBlocked && this.isDeleted == livescoresInfo.isDeleted && this.isResult == livescoresInfo.isResult && Intrinsics.areEqual((Object) Double.valueOf(this.overNumber), (Object) Double.valueOf(livescoresInfo.overNumber)) && Intrinsics.areEqual((Object) this.updatedAt, (Object) livescoresInfo.updatedAt) && Intrinsics.areEqual((Object) this.result, (Object) livescoresInfo.result);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this._id.hashCode() * 31) + this.matchId.hashCode()) * 31) + this.__v) * 31) + this.balls.hashCode()) * 31) + this.batsmanNonStriker.hashCode()) * 31) + this.batsmanStriker.hashCode()) * 31) + this.bowler.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.currentInning.hashCode()) * 31) + this.innings.hashCode()) * 31;
        boolean z = this.isBlocked;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isDeleted;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isResult;
        if (!z4) {
            z2 = z4;
        }
        return ((((((i2 + (z2 ? 1 : 0)) * 31) + Double.doubleToLongBits(this.overNumber)) * 31) + this.updatedAt.hashCode()) * 31) + this.result.hashCode();
    }

    public String toString() {
        return "LivescoresInfo(_id=" + this._id + ", matchId=" + this.matchId + ", __v=" + this.__v + ", balls=" + this.balls + ", batsmanNonStriker=" + this.batsmanNonStriker + ", batsmanStriker=" + this.batsmanStriker + ", bowler=" + this.bowler + ", createdAt=" + this.createdAt + ", currentInning=" + this.currentInning + ", innings=" + this.innings + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", isResult=" + this.isResult + ", overNumber=" + this.overNumber + ", updatedAt=" + this.updatedAt + ", result=" + this.result + ')';
    }

    public LivescoresInfo(String str, String str2, int i, List<Ball> list, BatsmanNonStriker batsmanNonStriker2, BatsmanStriker batsmanStriker2, Bowler bowler2, String str3, String str4, List<Inning> list2, boolean z, boolean z2, boolean z3, double d, String str5, ResultX resultX) {
        List<Ball> list3 = list;
        BatsmanNonStriker batsmanNonStriker3 = batsmanNonStriker2;
        BatsmanStriker batsmanStriker3 = batsmanStriker2;
        Bowler bowler3 = bowler2;
        String str6 = str3;
        String str7 = str4;
        List<Inning> list4 = list2;
        String str8 = str5;
        ResultX resultX2 = resultX;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(list3, "balls");
        Intrinsics.checkNotNullParameter(batsmanNonStriker3, "batsmanNonStriker");
        Intrinsics.checkNotNullParameter(batsmanStriker3, "batsmanStriker");
        Intrinsics.checkNotNullParameter(bowler3, "bowler");
        Intrinsics.checkNotNullParameter(str6, "createdAt");
        Intrinsics.checkNotNullParameter(str7, "currentInning");
        Intrinsics.checkNotNullParameter(list4, "innings");
        Intrinsics.checkNotNullParameter(str8, "updatedAt");
        Intrinsics.checkNotNullParameter(resultX2, "result");
        this._id = str;
        this.matchId = str2;
        this.__v = i;
        this.balls = list3;
        this.batsmanNonStriker = batsmanNonStriker3;
        this.batsmanStriker = batsmanStriker3;
        this.bowler = bowler3;
        this.createdAt = str6;
        this.currentInning = str7;
        this.innings = list4;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.isResult = z3;
        this.overNumber = d;
        this.updatedAt = str8;
        this.result = resultX2;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final int get__v() {
        return this.__v;
    }

    public final List<Ball> getBalls() {
        return this.balls;
    }

    public final BatsmanNonStriker getBatsmanNonStriker() {
        return this.batsmanNonStriker;
    }

    public final BatsmanStriker getBatsmanStriker() {
        return this.batsmanStriker;
    }

    public final Bowler getBowler() {
        return this.bowler;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrentInning() {
        return this.currentInning;
    }

    public final List<Inning> getInnings() {
        return this.innings;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isResult() {
        return this.isResult;
    }

    public final double getOverNumber() {
        return this.overNumber;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final ResultX getResult() {
        return this.result;
    }
}
